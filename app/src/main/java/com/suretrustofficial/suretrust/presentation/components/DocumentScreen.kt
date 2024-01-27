package com.suretrustofficial.suretrust.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.suretrustofficial.suretrust.data.remote.models.Document
import com.suretrustofficial.suretrust.presentation.compose_config.LecendDeca
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBlue
import com.suretrustofficial.suretrust.presentation.compose_config.SlateDark
import com.suretrustofficial.suretrust.presentation.compose_config.White
import com.suretrustofficial.suretrust.presentation.document.DocumentsViewModel

@Composable
fun DocumentScreen(
    documentsViewModel: DocumentsViewModel = hiltViewModel()
) {
    val docsList by documentsViewModel.documentsState.collectAsState()
    val localUriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .padding(horizontal = 16.dp)
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                Spacer(modifier = Modifier.height(48.dp))
            }
            items(docsList) {
                DocumentCard(it, onOpenBtnClick = { docUrl ->
                    openUri(localUriHandler, docUrl)
                })
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
@Preview
fun DocumentCard(
    document: Document = Document(1, "Sample Document", "sample_doc.com"),
    onOpenBtnClick: (String) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .border(width = 1.dp, color = White, shape = RoundedCornerShape(8.dp))
            .background(SlateDark)
            .padding(vertical = 12.dp, horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = document.title,
            fontFamily = LecendDeca,
            fontSize = 16.sp,
            textAlign = TextAlign.Start,
            color = White,
            modifier = Modifier.weight(3f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Open",
            fontFamily = LecendDeca,
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            color = White,
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(8.dp))
                .background(PrimaryBlue)
                .padding(vertical = 8.dp)
                .clickable {
                    onOpenBtnClick(document.file)
                }
        )
    }
}

fun openUri(uriHandler: UriHandler, uri: String) {
    uriHandler.openUri(uri)
}