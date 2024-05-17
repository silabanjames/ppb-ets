package com.example.ppbets.ui.components.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Domain
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubjectCard(
    name: String,
    day: String,
    room: String,
    time: String,
    modifier: Modifier = Modifier,
    onCardClick: () -> Unit
) {
    Card(
        onClick = onCardClick,
        modifier = modifier,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(
                top=30.dp,
                start = 20.dp,
                bottom=30.dp,
                end = 20.dp
            )
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
                text = name,
                color = MaterialTheme.colorScheme.primary,
                fontSize = 16.sp,
                modifier = Modifier,
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Row {
                InformationClass(icon = Icons.Default.CalendarToday, description = day)
                Spacer(modifier = Modifier.weight(1f))
                InformationClass(icon = Icons.Default.Domain, description = room)
                Spacer(modifier = Modifier.weight(1f))
                InformationClass(icon = Icons.Default.Schedule, description = time)
            }
        }
    }
}

@Composable
fun InformationClass(
    icon: ImageVector,
    description: String,
    textSize: Int = 0,
    iconSize: Int = 0
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(if (iconSize == 0) 18.dp else iconSize.dp)
        )
        Text(
            text = description,
            modifier = Modifier.padding(start=5.dp),
            fontSize = if (textSize == 0)  14.sp else textSize.sp
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SubjectCardPreview() {
    SubjectCard(
        onCardClick = {},
        name = "Pemrograman Perangkat Bergerak (F)",
        day = "Rabu",
        room = "IF-305",
        time = "13:30 - 15:20"
    )
}