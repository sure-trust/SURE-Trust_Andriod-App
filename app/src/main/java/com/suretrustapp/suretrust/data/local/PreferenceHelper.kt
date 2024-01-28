package com.suretrustapp.suretrust.data.local

import splitties.preferences.Preferences

object PreferenceHelper : Preferences("sure_trust_data") {
    var authToken by StringOrNullPref(PreferenceKey.AUTH_TOKEN, null)
}

object PreferenceKey {
    const val AUTH_TOKEN = "auth_token"
}