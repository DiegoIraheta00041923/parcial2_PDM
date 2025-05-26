package com.daimcinco.parcial2.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.daimcinco.parcial2.components.AddedProductCard
import com.daimcinco.parcial2.viewModel.ProductsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddedProductsScreen(productsViewModel: ProductsViewModel){
    val AddedProducts = productsViewModel.getAddedProducts()
    Column {
        TopAppBar(title = { Text("My products")})
        if(AddedProducts.isNullOrEmpty()){
            Text("No products")
        }else {
            LazyColumn {
                items(AddedProducts) { product ->
                    AddedProductCard(product)
                }
            }
        }
    }
}