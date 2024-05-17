package com.example.ppbets.ui.components.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ppbets.ui.components.Header

@Composable
fun PresensiApp(
    modifier: Modifier = Modifier,
    onCard1Click: () -> Unit,
    onCard2Click: () -> Unit
) {
    Scaffold(
        topBar = {
            Header {
                HeaderDashboardContent()
            }
        }
    ) { it ->
        Column(
            modifier = modifier.padding(it),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            InformationCard(
                modifier = Modifier.padding(24.dp)
            )
            Text(
                text = "Daftar Kuliah Anda",
                fontSize = 16.sp
            )
            Text(
                text = "Semester Genap 2023/2024",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.size(16.dp))
            SubjectCard(
                modifier = Modifier.padding(
                    top = 8.dp,
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 8.dp
                ),
                onCardClick = onCard1Click,
                name = "Pemrograman Perangkat Bergerak (F)",
                day = "Rabu",
                room = "IF-305",
                time = "13:30 - 15:20"
            )
            SubjectCard(
                modifier = Modifier.padding(
                    top = 8.dp,
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 8.dp
                ),
                onCardClick = onCard2Click,
                name = "Proposal Tugas Akhir (A)",
                day = "Jumat",
                room = "IF-305",
                time = "20:30 - 22:20"
            )
        }
    }
}



@Preview
@Composable
fun PresensiPreview() {
    PresensiApp(onCard1Click = {}, onCard2Click = {})
}
