package com.imregulkurt.apphw1.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserInfo(
    val id: Int,
    val name: String,
    val surname: String,
    val email: String,
    val phone: String
): Parcelable
