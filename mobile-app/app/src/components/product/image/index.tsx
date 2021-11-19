import {FunctionComponent} from "react";
import {Image, StyleSheet, View} from "react-native";
import * as React from "react";

const styles = StyleSheet.create({
    imageContainer: {
        height: 85,
        width: 85,
        borderRadius: 85,
        borderColor: 'rgba(197,197,197,0.9)',
        backgroundColor: 'white',
        borderWidth: 2,
        borderStyle: 'solid',
        overflow: 'hidden'
    },
    image: {
        ...StyleSheet.absoluteFillObject,
        resizeMode: 'cover',
        borderRadius: 1,
    }
})

interface ImageProps {
    uri: string
}

export const ImageContainer: FunctionComponent<ImageProps> = ({uri}) => <View style={styles.imageContainer}>
    <Image
        source={{uri}}
        style={styles.image}
    />
</View>