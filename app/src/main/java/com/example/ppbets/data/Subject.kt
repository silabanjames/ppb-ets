package com.example.ppbets.data

import androidx.annotation.StringRes
import com.example.ppbets.R

data class Subject(
    @StringRes val code: Int,
    @StringRes val name: Int,
    @StringRes val day: Int,
    @StringRes val room: Int,
    @StringRes val time: Int
)

val subjects = listOf(
    Subject(R.string.subject_code_1, R.string.subject_name_1, R.string.subject_day_1, R.string.subject_room_1, R.string.subject_time_1),
    Subject(R.string.subject_code_2, R.string.subject_name_2, R.string.subject_day_2, R.string.subject_room_2, R.string.subject_time_2),
)