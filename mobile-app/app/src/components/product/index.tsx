import * as React from 'react';
import {Image, StyleSheet, Text, View} from "react-native";
import {FunctionComponent} from "react";
import {ImageContainer} from "./image";

const styles = StyleSheet.create({
    container: {
        display: "flex",
        width: 85
    },
    prices: {
        display: "flex",
        flexDirection: "row",
        justifyContent: 'center'

    },
    newPrice: {
        fontWeight: "bold",
        fontSize: 12,
        textAlign: "center",
        color: 'green',
        marginRight: 2,
        marginLeft: 3
    },
    oldPrice: {
        fontWeight: '300',
        fontSize: 10,
        textAlign: "center",
        textDecorationLine: "line-through",
        textDecorationColor: 'red'
    },
    productInfo: {
        display: "flex",
        flexDirection: "row",
        alignItems: 'center',
        justifyContent: 'center'
    },
    productName: {
        fontWeight: "bold",
        fontSize: 12,
        textAlign: "center",
        margin: 2
    },
    productQuantity: {
        fontWeight: '300',
        fontSize: 10,
        textAlign: "center",
        textAlignVertical: "bottom"
    },
    image: {
        display: "flex",
        flexDirection: "row"
    },
    plus: {
        backgroundColor: 'red',
        borderWidth: 0.5,
        borderColor: 'gray',
        borderStyle: "solid",
        borderRadius: 100,
        height: 40,
        width: 40,
    }

})

interface ProductProps {
    imageUri?: string
    productName?: string
    productQuantity?: string
    oldPrice?: string,
    newPrice: string
}

const Product: FunctionComponent<ProductProps> = ({
                                                      imageUri = 'https://i.imgur.com/KZsmUi2l.jpg',
                                                      productName = 'Monster',
                                                      productQuantity = '350ml',
                                                      oldPrice = 'R$ 9,90',
                                                      newPrice = 'R$ 7,60'
                                                  }) => {
    return <View style={styles.container}>
        <View style={styles.image}>
            <ImageContainer uri={imageUri}/>
        </View>
        <View style={styles.productInfo}>
            <Text style={styles.productName}>{productName}</Text>
            <Text style={styles.productQuantity}>{productQuantity}</Text>
        </View>
        <View style={styles.prices}>
            <Text style={styles.newPrice}>{newPrice}</Text>
            <Text style={styles.oldPrice}>{oldPrice}</Text>
        </View>
    </View>

}


export {Product}