package com.daimcinco.parcial2.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.daimcinco.parcial2.viewModel.ProductsViewModel
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductScreen(productId: Int, productsViewModel: ProductsViewModel){
    val product = productsViewModel.getProductById(productId)
    val context = LocalContext.current
        Column(
        ) {
            TopAppBar(
                title = {product.name}
            )
            GlideImage(
                imageModel = {product.product_IMG},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                imageOptions = ImageOptions(
                    contentScale = ContentScale.Fit
                ),
                loading = {
                    CircularProgressIndicator()
                },
                failure = {
                    Text("Error")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(text = product.name, fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Text(text = product.category, fontSize = 20.sp, color = Color.Gray)
            Text(text = "Price: $${product.price} ", fontSize = 18.sp)

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Description: \n ${product.description}",
                fontSize = 16.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Button(
                onClick = {product.addedToCart = true
                    Toast.makeText(context, "${product.name} Añadido al carrito", Toast.LENGTH_SHORT).show()
                }

            ) {
                Text("Add Product")
            }
        }
}
