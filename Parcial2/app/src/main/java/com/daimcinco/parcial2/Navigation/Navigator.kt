package com.daimcinco.parcial2.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.daimcinco.parcial2.screen.AddedProductsScreen
import com.daimcinco.parcial2.screen.ProductScreen
import com.daimcinco.parcial2.screen.ProductsScreen
import com.daimcinco.parcial2.viewModel.ProductsViewModel

data class NavItem(val route: String, val name: String, val icon: ImageVector)

@Composable
fun Navigator(){
    val navController = rememberNavController()
    val productsViewModel : ProductsViewModel  = viewModel()

    val barOptions = listOf(
        NavItem("HomeScreen", "Home", Icons.Default.Home ),
        NavItem("AddedProductScreen", "My products", Icons.Default.CheckCircle)
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
                barOptions.forEach {
                        option ->
                    NavigationBarItem(
                        selected = currentRoute == option.route,
                        onClick = {
                            if (option.route == "HomeScreen") {
                                navController.navigate("HomeScreen") {
                                    popUpTo(0) { inclusive = true }
                                }
                            }
                            else if (currentRoute !== option.route) {
                                navController.navigate(option.route){
                                    popUpTo(navController.graph.startDestinationId){saveState = true}
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        },
                        icon = { Icon(imageVector = option.icon, contentDescription = option.name) },
                        label = { Text(option.name) }

                    )
                }
            }
        }
    ) {
            innerPadding ->
        NavHost(navController = navController, startDestination = "HomeScreen", modifier = Modifier.padding(innerPadding)){
            composable("HomeScreen"){
                ProductsScreen(productsViewModel,navController)
            }
            composable("ProductScreen/{productId}"){
                backStackEntry ->
                val productID = backStackEntry.arguments?.getString("productId")?.toIntOrNull()
                productID?.let { ProductScreen(it,productsViewModel) }
            }
            composable("AddedProductScreen"){
                AddedProductsScreen(productsViewModel)
            }
        }
    }


}