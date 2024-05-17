package com.example.ppbets

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ppbets.ui.components.dashboard.PresensiApp
import com.example.ppbets.ui.components.detail1.DetailPage
import com.example.ppbets.ui.components.detail2.DetailPage2
import com.example.ppbets.ui.components.login.LoginPage

sealed class Route {
    data class LoginScreen(val name: String = "Login"): Route()
    data class Dashboard(val name: String = "Dashboard"): Route()
    data class Detail1(val name: String = "Detail1"): Route()
    data class Detail2(val name: String = "Detail2"): Route()
}

@Composable
fun MyNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Route.LoginScreen().name
    ) {
        composable(route = Route.LoginScreen().name) {
            LoginPage(
                onLoginClick = {
                    navHostController.navigate(
                        Route.Dashboard().name
                    )
                }
            )
        }

        composable(route = Route.Dashboard().name) {
            PresensiApp(
                onCard1Click = {
                    navHostController.navigate(
                        Route.Detail1().name
                    )
                },
                onCard2Click = {
                    navHostController.navigate(
                        Route.Detail2().name
                    )
                }
            )
        }

        composable(route = Route.Detail1().name) {
            DetailPage {
                navHostController.navigateUp()
            }
        }

        composable(route = Route.Detail2().name) {
            DetailPage2{
                navHostController.navigateUp()
            }
        }
    }
}