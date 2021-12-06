import pandas as pd
import tensorflow as tf
import xlearn as xl
import numpy as np
from sqlalchemy import create_engine

tf.get_logger().setLevel('ERROR')  # only show error messages
from sklearn.model_selection import train_test_split


def getData():
    db_connection_str = 'mysql+pymysql://root:fraudIntelligence@localhost:3306/mercadointeligente'
    db_connection = create_engine(db_connection_str)
    rawData = pd.read_sql('''SELECT i.user_id,
       u.gender,
       i.product_id,
       p.categories as category,
       COUNT(CASE
                 WHEN i.interaction = 'CLICK' || 'FIND' THEN 1
                 WHEN i.interaction = 'LIST_ADD' || 'FAVORITE_ADD' THEN 2
                 ELSE 0 END) as afinity,
       MAX(i.buy) as buy
#        IF(i.interaction = 'buy', 1, 0) AS buy
FROM (SELECT it.user_id, it.product_id, it.interaction, IF(it.interaction = 'buy', 1, 0) AS buy
      FROM interactiondto it) i, user u, product_categories p where u.id=i.user_id and p.product_id = i.product_id
GROUP BY user_id, product_id, p.categories''', con=db_connection)
    return rawData


def convert_to_ffm(df, type, numerics, categories, features):
    currentcode = len(numerics)
    catdict = {}
    catcodes = {}

    # Flagging categorical and numerical fields
    for x in numerics:
        catdict[x] = 0
    for x in categories:
        catdict[x] = 1

    nrows = df.shape[0]
    ncolumns = len(features)
    with open(str(type) + "_ffm.txt", "w") as text_file:

        # Looping over rows to convert each row to libffm format
        for n, r in enumerate(range(nrows)):
            datastring = ""
            datarow = df.iloc[r].to_dict()
            datastring += str(int(datarow['buy']))  # Set Target Variable here

            # For numerical fields, we are creating a dummy field here
            for i, x in enumerate(catdict.keys()):
                if (catdict[x] == 0):
                    datastring = datastring + " " + str(i) + ":" + str(i) + ":" + str(datarow[x])
                else:

                    # For a new field appearing in a training example
                    if (x not in catcodes):
                        catcodes[x] = {}
                        currentcode += 1
                        catcodes[x][datarow[x]] = currentcode  # encoding the feature

                    # For already encoded fields
                    elif (datarow[x] not in catcodes[x]):
                        currentcode += 1
                        catcodes[x][datarow[x]] = currentcode  # encoding the feature

                    code = catcodes[x][datarow[x]]
                    datastring = datastring + " " + str(i) + ":" + str(int(code)) + ":1"

            datastring += '\n'
            text_file.write(datastring)


if __name__ == '__main__':
    rawData = getData()

    affinities = [0, 4, 8, 16, 32, 64, np.inf]
    names = ['<4', '4-8', '8-16', '16-32', '32-64', '64+']

    rawData['affinity_range'] = pd.cut(rawData['afinity'], affinities, labels=names)

    print(rawData)
    X_train, X_test = train_test_split(rawData, test_size=0.3, random_state=5)

    convert_to_ffm(X_train, 'Train', [], ['category', 'affinity_range', 'product_id', 'gender', 'user_id'], [])
    convert_to_ffm(X_test, 'Test', [], ['category', 'affinity_range', 'product_id', 'gender', 'user_id'], [])

    ffm_model = xl.create_ffm()
    ffm_model.setTrain("train_ffm.txt")
    param = {'task': 'binary',
             'lr': 0.2,
             'lambda': 0.002,
             'metric': 'acc'}

    ffm_model.fit(param, './model.out')
    ffm_model.cv(param)

    ffm_model.setTest(
        "test_ffm.txt")
    ffm_model.setSigmoid()
    ffm_model.predict("./model.out", "./output.txt")

