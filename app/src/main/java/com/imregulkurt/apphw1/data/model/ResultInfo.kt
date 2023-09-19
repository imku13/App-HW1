package com.imregulkurt.apphw1.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResultInfo(
    val id: Int,
    val name: String,
    val surname: String,
    val email: String,
    val phone: String,
    val question1: String,
    val question2: String,
    val question3: String
): Parcelable
