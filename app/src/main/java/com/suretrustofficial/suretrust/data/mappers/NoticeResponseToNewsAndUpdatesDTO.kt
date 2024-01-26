package com.suretrustofficial.suretrust.data.mappers

import com.suretrustofficial.suretrust.data.remote.models.NoticeResponse
import com.suretrustofficial.suretrust.domain.models.UpdatesAndNewsDTO

fun NoticeResponse.toNewsAndUpdatesDTO(): UpdatesAndNewsDTO {
    return UpdatesAndNewsDTO(
        id = id, title = title, description = description
    )
}