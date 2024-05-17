package com.example.ppbets.ui.components.detail2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Domain
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.ppbets.ui.components.dashboard.InformationClass

@Composable
fun HeaderDetailContent2(
    onBackClick: () -> Unit
) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(
                    bottom = 12.dp
                )
                .border(2.dp, MaterialTheme.colorScheme.tertiary, RoundedCornerShape(50))
                .padding(
                    start = 12.dp,
                    end = 12.dp,
                    top = 4.dp,
                    bottom = 4.dp
                )
        ) {
            IconButton(
                onClick = onBackClick,
                modifier = Modifier.size(20.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
            }
            Text(
                text = "Kembali",
                fontSize = 14.sp,
                modifier = Modifier
                    .clickable {
                        onBackClick()
                    }
            )
        }
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
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = "Proposal Tugas Akhir (A)",
            color = MaterialTheme.colorScheme.primary,
            fontSize = 16.sp,
            modifier = Modifier,
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Row {
            InformationClass(icon = Icons.Default.CalendarToday, description = "Jumat")
            Spacer(modifier = Modifier.weight(1f))
            InformationClass(icon = Icons.Default.Domain, description = "IF-305")
            Spacer(modifier = Modifier.weight(1f))
            InformationClass(icon = Icons.Default.Schedule, description = "21:30 - 22:20")
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Dosen:",
            fontWeight = FontWeight.Bold
        )
        Text(text = "Wijayanti Nurul Khotimah, S.Kom., M.Sc.")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HeaderDetailContent2Preview() {
    HeaderDetailContent2({})
}