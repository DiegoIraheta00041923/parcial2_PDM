package com.daimcinco.parcial2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.daimcinco.parcial2.model.Products
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun AddedProductCard(products: Products){
    Box(modifier = Modifier.padding(8.dp).background(Color.White).border(shape = RoundedCornerShape(8.dp),color = Color.Black, width = 1.dp).fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            GlideImage(
                imageModel = { products.product_IMG },
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
                imageOptions = ImageOptions(
                    contentScale = ContentScale.Fit,
                ),
                loading = {
                    CircularProgressIndicator()
                },
                failure = {
                    Text("Error")
                }
            )
            Spacer(modifier = Modifier.width(16.dp).padding(8.dp))
            Column {
                Text(products.name, modifier = Modifier, color = Color.Black)
                Text(products.description, modifier = Modifier, color = Color.Black)
            }
        }
    }
}