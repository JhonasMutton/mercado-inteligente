import * as React from "react";
import {FunctionComponent} from "react";
import {Image, StyleSheet, Text, TouchableOpacity, View} from "react-native";


interface CategoryProps {
    text?: string,
    imageUrl?: string,
    onPress?()
}

export const Category: FunctionComponent<CategoryProps> = ({
                                                               text = 'test',
                                                               imageUrl = 'https://i.imgur.com/SsJmZ9jl.jpg',
                                                               onPress
                                                           }) => {

    const styles = StyleSheet.create({
        container: {
            backgroundColor: 'rgb(204,204,204)',
            display: "flex",
            flexDirection: "row",
            flexWrap: 'wrap',
            alignSelf: 'flex-start',
            padding: 4,
            paddingRight: 8,
            paddingLeft: 4,
            borderRadius: 100,
        },
        text: {
            fontSize: 24,
        },
        image: {
            ...StyleSheet.absoluteFillObject,
            resizeMode: 'cover',
            borderRadius: 1,
        },
        imageContainer: {
            height: 32,
            width: 32,
            marginRight: 4,
            borderRadius: 85,
            backgroundColor: 'white',
            overflow: 'hidden'
        },

    })
    return <TouchableOpacity style={styles.container} onPress={onPress}>
        <View style={styles.imageContainer}>
            <Image
                source={{uri: imageUrl}}
                style={styles.image}
            />
        </View>
        <Text style={styles.text}>{text}</Text>
    </TouchableOpacity>

}