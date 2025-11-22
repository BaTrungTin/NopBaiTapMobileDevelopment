package com.example.productdetail.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.productdetail.R
import com.example.productdetail.ui.theme.Blue
import com.example.productdetail.ui.theme.DarkBlue
import com.example.productdetail.ui.theme.LightBlue
import com.example.productdetail.ui.theme.ProductDetailTheme
import com.example.productdetail.ui.theme.WhiteBlue

@Composable
fun ProductDetailScreen(
    onBackClick: () -> Unit
) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteBlue)
            .padding(24.dp)
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onBackClick,
                modifier = Modifier
                    .background(
                        color = LightBlue,
                        shape = CircleShape
                    )
            ) {
                Icon(
                    painter = painterResource(R.drawable.back),
                    contentDescription = "Back",
                    tint = DarkBlue,
                    modifier = Modifier.size(24.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Product Detail",
                    style = MaterialTheme.typography.titleLarge,
                    color = LightBlue
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "Sp",
            modifier = Modifier
                .size(326.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            "Giày Nike Nam Nữ Chính Hãng - Nike Air Force 1 '07 LV8 - Màu Trắng | JapanSport HF2898-100",
            style = MaterialTheme.typography.titleSmall,
            color = DarkBlue
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            "Giá: 4.000.000₫",
            style = MaterialTheme.typography.titleLarge,
            color = Blue
        )

        
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDetailPreview()
{
    ProductDetailTheme {
        ProductDetailScreen(
            onBackClick = {}
        )
    }
}