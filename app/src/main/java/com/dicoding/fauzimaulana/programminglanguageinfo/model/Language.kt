package com.dicoding.fauzimaulana.programminglanguageinfo.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Language(
    var logo: Int = 0,
    var name: String = "",
    var release: String = "",
    var designed: String = "",
    var developer: String = "",
    var website: String = "",
    var description: String = ""
) : Parcelable
