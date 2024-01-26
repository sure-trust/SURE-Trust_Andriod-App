package com.suretrustofficial.suretrust.presentation.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast


class Helpers {
    companion object {
        fun Context.copyTextToClipboard(text: String) {
            val clipboard: ClipboardManager? =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager?
            val clip = ClipData.newPlainText("Copies text", text)
            clipboard?.setPrimaryClip(clip)
            Toast.makeText(this, "Copies Successfully", Toast.LENGTH_SHORT).show()
        }
    }
}