package com.example.ppbets.ui.components.detail2

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Domain
import androidx.compose.material.icons.filled.QrCode2
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ppbets.ui.components.dashboard.InformationClass

@Composable
fun DetailClassCard2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        ClassItem2(
            number = 1,
            day = "Jumat, 8 Maret 2024",
            room = "IF-305",
            time = "13.30-15.20",
            status = "HADIR"
        )
        ClassItem2(
            number = 2,
            day = "Jumat, 15 Maret 2024",
            room = "IF-305",
            time = "13.30-15.20",
            status = "HADIR"
        )
        ClassItem2(
            number = 3,
            day = "Jumat, 22 Maret 2024",
            room = "IF-305",
            time = "13.30-15.20",
            status = "HADIR"
        )
        ClassItem2(
            number = 4,
            day = "Jumat, 17 Mei 2024",
            room = "IF-305",
            time = "13.30-15.20",
            status = "HADIR"
        )
    }
}

@Composable
fun ClassItem2(
    modifier: Modifier = Modifier,
    number: Number,
    day: String,
    room: String,
    time: String,
    status: String
) {
    val context = LocalContext.current

    Row(
        modifier = modifier
            .drawBehind {
                val borderSize = 0.5.dp.toPx()
                val y = size.height - borderSize / 2
                drawLine(
                    color = Color.LightGray,
                    start = Offset(0f, y),
                    end = Offset(size.width, y),
                    strokeWidth = borderSize
                )
            }
            .padding(
                top = 10.dp,
                bottom = 10.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$number",
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier.weight(2f)
        ) {
            InformationClass(
                icon = Icons.Default.CalendarToday,
                description = day,
                textSize = 12,
                iconSize = 14
            )
            InformationClass(
                icon = Icons.Default.Domain,
                description = room,
                textSize = 12,
                iconSize = 14
            )
            InformationClass(
                icon = Icons.Default.Schedule,
                description = time,
                textSize = 12,
                iconSize = 14
            )
        }
        Text(
            text = status,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(122, 185, 120)
        )
        Button(
            onClick = {
                Toast.makeText(context, "Anda Telah Mengisi Presensi", Toast.LENGTH_SHORT).show()
            },
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .size(
                    width = 100.dp,
                    height = 30.dp
                )
        ) {
            Icon(
                imageVector = Icons.Default.QrCode2,
                contentDescription = null,
                modifier = Modifier
                    .size(14.dp)
                    .padding(end = 4.dp)
            )
            Text(
                text = "Hadir",
                fontSize = 12.sp
            )
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun DetailClassCard1Preview2() {
    DetailClassCard2()
}