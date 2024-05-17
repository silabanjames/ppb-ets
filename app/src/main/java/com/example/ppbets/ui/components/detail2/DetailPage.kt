package com.example.ppbets.ui.components.detail2

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ppbets.ui.components.Header

@Composable
fun DetailPage2(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            Header {
                HeaderDetailContent2(onBackClick)
            }
        }
    ) { it ->
        LazyColumn(
            modifier = modifier.padding(it),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Presence2(modifier = Modifier.padding(24.dp))
                DetailClassCard2(modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 24.dp
                ))
            }

        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DetailPagePreview2() {
    DetailPage2{}
}