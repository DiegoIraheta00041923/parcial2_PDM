package com.daimcinco.parcial2.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.daimcinco.parcial2.model.Products
import com.daimcinco.parcial2.model.productList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProductsViewModel: ViewModel(){
    private val _productsList = MutableStateFlow(productList)
    val productsList: StateFlow<List<Products>> = _productsList

    var searchQuery by mutableStateOf("")
        private set

    fun onSearchQuery(query: String){
        searchQuery = query
        _productsList.value = productList.filter {
            it.name.contains(query.trim(), ignoreCase = true) || it.category.contains(query.trim(), ignoreCase = true)
        }
    }

    fun getProductById(id:Int) : Products{
        return productList.find { it.id == id }
            ?: throw IllegalArgumentException("Product don't exist")
    }

    fun getAddedProducts(): List<Products>{
        return productsList.value.filter { it.addedToCart }
    }
}