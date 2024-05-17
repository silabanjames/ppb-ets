package com.example.ppbets.ui.components.detail2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun Presence2(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.background(
            color = MaterialTheme.colorScheme.tertiaryContainer,
            shape = RoundedCornerShape(5)
        )
    ) {
        PresenceInfo2(
            label = "HADIR",
            total = 4,
            color = Color(122, 185, 120),
            alignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        )
        PresenceInfo2(
            label = "IZIN",
            total = 0,
            color = Color(3, 174, 210),
            alignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        )
        PresenceInfo2(
            label = "SAKIT",
            total = 0,
            color = Color(255, 138, 8),
            alignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        )
        PresenceInfo2(
            label = "ALPA",
            total = 0,
            color = Color(137, 22, 82),
            alignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        )
        PresenceInfo2(
            label = "TOTAL TATAP MUKA",
            total = 4,
            color = Color.Black,
            alignment = Alignment.End,
            modifier = Modifier.weight(2f)
        )
    }
}

@Composable
fun PresenceInfo2(
    label: String,
    total: Number,
    color: Color,
    alignment: Alignment.Horizontal,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
        ,
        horizontalAlignment = alignment
    ) {
        Text(
            modifier = Modifier
                .padding(),
            text = label,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            color = color
        )
        Text(
            text = "$total",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun KehadiranListPreview2() {
    Presence2()
}