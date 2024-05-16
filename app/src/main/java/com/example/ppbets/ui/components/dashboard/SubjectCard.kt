package com.example.ppbets.ui.components.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubjectCard() {
    Card() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                text = "EF234601",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(2.dp)
                    )
                    .padding(
                        top = 3.dp,
                        start = 10.dp,
                        bottom = 3.dp,
                        end = 10.dp
                    )
            )
            Text(
                text = "Pemrograman Perangkat Bergerak (F)",
                color = MaterialTheme.colorScheme.primary,
                fontSize = 16.sp,
                modifier = Modifier,
            )
            Row {
                Text(text = "Rabu")
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "IF-305")
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "13:30 - 15:20")
            }
        }
    }
}

@Composable
fun InformationClass(
    @Draw
) {

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SubjectCardPreview() {
    SubjectCard()
}