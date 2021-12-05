import sys

import pymysql
import cryptography
import pandas as pd
import sqlalchemy as sqlalchemy
from sqlalchemy import create_engine

import numpy as np
import datetime
import math
import sys
import os
import scrapbook as sb
from tempfile import TemporaryDirectory
import tensorflow as tf
tf.get_logger().setLevel('ERROR') # only show error messages

from recommenders.utils.constants import SEED
from recommenders.models.deeprec.deeprec_utils import (
    download_deeprec_resources, prepare_hparams
)
from recommenders.models.deeprec.models.xDeepFM import XDeepFMModel
from recommenders.models.deeprec.io.iterator import FFMTextIterator


EPOCHS_FOR_SYNTHETIC_RUN = 15
EPOCHS_FOR_CRITEO_RUN = 10
BATCH_SIZE_SYNTHETIC = 128
BATCH_SIZE_CRITEO = 4096
RANDOM_SEED = SEED  # Set to None for non-deterministic result

db_connection_str = 'mysql+pymysql://root:fraudIntelligence@localhost:3306/mercadointeligente'
db_connection = create_engine(db_connection_str)

data1 = pd.read_sql('SELECT * FROM interactiondto i', con=db_connection)

data2_w = data1.copy()
# BUY, CLICK, LIST_ADD, FIND, FAVORITE_ADD

conditions = [
    data2_w['interaction'] == 'BUY',
    data2_w['interaction'] == 'CLICK',
    data2_w['interaction'] == 'LIST_ADD',
    data2_w['interaction'] == 'FIND',
    data2_w['interaction'] == 'FAVORITE_ADD'
]

choices = [3, 1, 2, 1, 2]

data2_w['Weight'] = np.select(conditions, choices)

# Convert to numeric type.
data2_w['Weight'] = pd.to_numeric(data2_w['Weight'])

data2_wcount = data2_w.groupby(['user_id', 'product_id'])['Weight'].sum().reset_index()
data2_wcount.columns = ['UserId', 'ItemId', 'Affinity']

hparams = prepare_hparams(data2_wcount,
                          FEATURE_COUNT=1000,
                          FIELD_COUNT=10,
                          cross_l2=0.0001,
                          embed_l2=0.0001,
                          learning_rate=0.001,
                          epochs=EPOCHS_FOR_SYNTHETIC_RUN,
                          batch_size=BATCH_SIZE_SYNTHETIC)
# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    # data1 = data1.drop_duplicates()
    print(hparams)

    print(data2_wcount.describe())


# See PyCharm help at https://www.jetbrains.com/help/pycharm/
