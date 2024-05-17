package com.example.ppbets.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ppbets.R
import com.example.ppbets.ui.components.dashboard.HeaderDashboardContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header(
    modifier: Modifier = Modifier,
    content: @Composable() () -> Unit
) {
    Column(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp)
            )
            .padding(
                top = 20.dp,
                start = 24.dp,
                bottom = 52.dp,
                end = 24.dp
            )
    ){
        Row {
            Image(
                modifier = modifier,
                painter = painterResource(id = R.drawable.mypresensi),
                contentDescription = null
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                modifier = Modifier.size(36.dp),
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.size(32.dp))

        content()

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DashboardHeaderPreview() {
    Header(modifier = Modifier) {
        HeaderDashboardContent()
    }
}