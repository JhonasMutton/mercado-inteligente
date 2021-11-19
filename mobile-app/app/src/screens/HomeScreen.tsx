import * as React from 'react';
// import styled from "styled-components";
import {SafeAreaView, StyleSheet} from "react-native";
import PromoCarousel from '../components/carousel/index'
import stylesCarousel from '../components/carousel/styles/index.style';
import {ENTRIES1} from '../components/carousel/static/entries'
import {SearchBar} from "react-native-elements";
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
    }
});

const HomeScreen = () => {
    //Entries to be have illustrations

    return (
        <SafeAreaView style={stylesCarousel.safeArea}>
            <SearchBar containerStyle={styles.searchContainer} inputContainerStyle={styles.searchBar}/>
            <PromoCarousel entries={ENTRIES1}/>
        </SafeAreaView>
    );
}

export default HomeScreen;

