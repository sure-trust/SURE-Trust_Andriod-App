package com.suretrustapp.suretrust.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.suretrustapp.suretrust.presentation.compose_config.LecendDeca
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustapp.suretrust.presentation.compose_config.White

@Composable
@Preview
fun InternshipProjectList(
    list: List<String> = emptyList()
) {
    LazyRow {
        items(list) {
            InternshipProjectCard(projectName = it)
        }
    }
}

@Composable
@Preview
fun InternshipProjectCard(
    projectName: String = "Project Name"
) {
    Text(
        text = projectName,
        fontFamily = LecendDeca,
        fontSize = 16.sp,
        color = White,
        modifier = Modifier
            .padding(horizontal = 4.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(width = 1.dp, color = White, shape = RoundedCornerShape(8.dp))
            .background(PrimaryBackground)
            .padding(vertical = 12.dp, horizontal = 16.dp)
    )
}