package com.suretrustapp.suretrust.data.mappers

import com.suretrustapp.suretrust.data.remote.models.NoticeResponse
import com.suretrustapp.suretrust.domain.models.UpdatesAndNewsDTO

fun NoticeResponse.toNewsAndUpdatesDTO(): UpdatesAndNewsDTO {
    return UpdatesAndNewsDTO(
        id = id, title = title, description = description
    )
}