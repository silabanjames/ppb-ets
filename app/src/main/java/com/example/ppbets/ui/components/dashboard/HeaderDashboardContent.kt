package com.example.ppbets.ui.components.dashboard

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderDashboardContent() {
    Text(
        text = "Selamat siang,",
        fontSize = 16.sp
    )
    Text(
        modifier = Modifier.padding(top = 8.dp),
        text = "James Maranata Silaban",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
}