package com.example.movieapp.navigation

enum class MovieScreens{
    HomeScreen,
    DetailsScreen;
    companion object{
        fun fromRoute(route :  String?) : MovieScreens
        = when(route?.substringAfter("/")){
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}