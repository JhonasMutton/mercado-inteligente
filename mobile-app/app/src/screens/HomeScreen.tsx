import * as React from 'react';
// import styled from "styled-components";
import {SafeAreaView, ScrollView, StyleSheet, Text, View} from "react-native";
import PromoCarousel from '../components/carousel/index'
import stylesCarousel from '../components/carousel/styles/index.style';
import {ENTRIES1} from '../components/carousel/static/entries'
import {SearchBar} from "react-native-elements";
import {Product} from "../components/product";
// const Container = styled.View`

// `
// const Search = styled.View`  grid-area: Search;  `
// const Carousel = styled.View` grid-area: Carousel; `
// const Promotions = styled.View` grid-area: Promotions; `
// const Category = styled.View` grid-area: Category; `
// const Products = styled.View` grid-area: Products; `

const styles = StyleSheet.create({
    searchContainer: {
        backgroundColor: 'white',
        shadowColor: 'white',
        borderBottomColor: 'white',
        borderTopColor: 'white'
    },
    searchBar: {
        backgroundColor: 'rgba(224,224,224,0.9)',
        borderRadius: 10
    },
    promoContainer:{
        display: "flex",
        flexDirection: 'row',
        overflow: 'scroll',
    },
    product:{
        margin: 3
    },
    promoSession: {
        borderBottomColor: 'rgb(220,220,220)',
        borderBottomWidth: 1,
        borderStyle: 'solid',
        paddingBottom: 10
    }

});

const HomeScreen = () => {
    //Entries to be have illustrations

    return (
        <SafeAreaView style={stylesCarousel.safeArea}>
            <SearchBar containerStyle={styles.searchContainer} inputContainerStyle={styles.searchBar}/>
            <PromoCarousel entries={ENTRIES1}/>
            <View style={styles.promoSession}>
                <Text> Exclusivas para você!</Text>
                <ScrollView horizontal style={styles.promoContainer}>
                    <View style={styles.product}>
                        <Product/>
                    </View>
                    <View style={styles.product}>
                        <Product/>
                    </View>
                    <View style={styles.product}>
                        <Product/>
                    </View>
                    <View style={styles.product}>
                        <Product/>
                    </View>
                    <View style={styles.product}>
                        <Product/>
                    </View>
                    <View style={styles.product}>
                        <Product/>
                    </View>
                </ScrollView>
            </View>

        </SafeAreaView>
    );
}

export default HomeScreen;

