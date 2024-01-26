package com.suretrustofficial.suretrust.data.local

import splitties.preferences.Preferences

object PreferenceHelper : Preferences("sure_trust_data") {
    var authToken by StringOrNullPref("auth_token", null)
}