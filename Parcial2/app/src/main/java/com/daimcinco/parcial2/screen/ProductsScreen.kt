package com.daimcinco.parcial2.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.daimcinco.parcial2.components.ProductCard
import com.daimcinco.parcial2.viewModel.ProductsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsScreen(viewModel: ProductsViewModel, navController: NavController){
    val products by viewModel.productsList.collectAsState()
        Column(
        ) {
            TopAppBar(title = { Text("Products")})
            TextField(
                value = viewModel.searchQuery,
                onValueChange = viewModel::onSearchQuery,
                label = { Text("Search product")}
            )
            LazyColumn {
                items(products){
                    product ->
                    ProductCard(product,navController)
                }
            }
        }
    }