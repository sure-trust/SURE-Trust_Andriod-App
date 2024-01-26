package com.suretrustofficial.suretrust.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.suretrustofficial.suretrust.domain.models.UpdatesAndNewsDTO
import com.suretrustofficial.suretrust.presentation.compose_config.LecendDeca
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBlue
import com.suretrustofficial.suretrust.presentation.compose_config.White
import com.suretrustofficial.suretrust.presentation.dialogs.LatestUpdatesViewModel

@Composable

fun NewsAndUpdatesScreen(
    dataList: List<UpdatesAndNewsDTO> = emptyList(),
    onBackPressed: () -> Unit = {},
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .padding(horizontal = 16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(16.dp))
            Icon(
                imageVector = Icons.Filled.Close,
                contentDescription = null,
                tint = White,
                modifier = Modifier
                    .size(20.dp)
                    .clickable {
                        onBackPressed()
                    }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "News & Updates",
                fontFamily = LecendDeca,
                fontSize = 32.sp,
                color = PrimaryBlue,
                textAlign = TextAlign.Start,
            )
            Spacer(modifier = Modifier.height(32.dp))
        }

        items(dataList, key = { it.id }) {
            NewsCardView(headline = it.title, body = it.description)
        }
    }
}

@Composable
@Preview
fun NewsCardView(
    headline: String = "...",
    body: String = "......"
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = headline,
            fontFamily = LecendDeca,
            fontSize = 18.sp,
            color = White,
            textAlign = TextAlign.Start,
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = body,
            fontFamily = LecendDeca,
            fontSize = 14.sp,
            color = White,
            textAlign = TextAlign.Start,
            modifier = Modifier.alpha(0.5f)
        )
        Spacer(modifier = Modifier.height(32.dp))
    }
}

