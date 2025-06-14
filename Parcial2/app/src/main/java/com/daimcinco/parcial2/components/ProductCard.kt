package com.daimcinco.parcial2.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.daimcinco.parcial2.model.Products

@Composable
fun ProductCard(product: Products, navController: NavController ){
   Card(
       onClick = {navController.navigate("ProductScreen/${product.id}")},
       modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
       shape = RoundedCornerShape(16.dp),
       colors = CardDefaults.cardColors(
           containerColor = Color.DarkGray
       )
   ) {
       Row(
           modifier = Modifier.padding(8.dp),
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceBetween
       ) {
           Column {
               Text("Name: ${product.name}")
               Text("Category: ${product.category}")
               Text("Description: ${product.description}")
               Text("Price: $${product.price}")
           }
       }
   }
}