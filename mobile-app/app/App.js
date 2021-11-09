import type {Node} from 'react';
import React from 'react';
import {useColorScheme,} from 'react-native';
import {NativeBaseProvider} from "native-base/src/core/NativeBaseProvider";
import {NavigationContainer} from "@react-navigation/native";
import {createBottomTabNavigator} from "@react-navigation/bottom-tabs";
import ListScreen from "./src/screens/ListScreen";
import WalletScreen from "./src/screens/WalletScreen";
import CuponScreen from "./src/screens/CuponScreen";
import FinderScreen from "./src/screens/FinderScreen";
import HomeScreen from "./src/screens/HomeScreen";
import Ionicons from 'react-native-vector-icons/Ionicons';
import {Container, Image, SimpleGrid} from "native-base";


const App: () => Node = () => {
    const isDarkMode = useColorScheme() === 'dark';
    const Tab = createBottomTabNavigator();

    return (
        <NativeBaseProvider>
            <NavigationContainer>
                <Container style={{color: 'white', height: 50}}>
                    <Ionicons name='menu' size={40} style={{margin: 5}}/>
                </Container>
                <Tab.Navigator
                    screenOptions={({route}) => ({
                        tabBarIcon: ({focused, color, size}) => {
                            let iconName;
                            switch (route.name) {
                                case 'Home':
                                    iconName = focused
                                        ? "home"
                                        : "home-outline";
                                    break;
                                case 'Wallet':
                                    iconName = focused
                                        ? "wallet"
                                        : "wallet-outline";
                                    break;
                                case 'List':
                                    iconName = focused
                                        ? "list"
                                        : "list-outline";
                                    break;
                                case 'Cupons':
                                    iconName = focused
                                        ? "pricetags"
                                        : "pricetags-outline";
                                    break;
                                case 'Finder':
                                    iconName = focused
                                        ? "search"
                                        : "search-outline";
                                    break;

                            }
                            // You can return any component that you like here!
                            return <Ionicons name={iconName} size={size} color={color}/>
                        },
                        tabBarActiveTintColor: 'green',
                        tabBarInactiveTintColor: 'gray',
                    })}>
                    <Tab.Screen name="Home" component={HomeScreen}/>
                    <Tab.Screen name="Cupons" component={CuponScreen}/>
                    <Tab.Screen name="Finder" component={FinderScreen}/>
                    <Tab.Screen name="List" component={ListScreen}/>
                    <Tab.Screen name="Wallet" component={WalletScreen}/>
                </Tab.Navigator>
            </NavigationContainer>
        </NativeBaseProvider>
    );
}
export default App;
