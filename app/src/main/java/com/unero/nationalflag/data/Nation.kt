package com.unero.nationalflag.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Nation(
    var name: String,
    var flag: Int,
    var language: String,
    var anthem: String,
    var capital: String,
    var map: Int,
    var link: String
): Parcelable
