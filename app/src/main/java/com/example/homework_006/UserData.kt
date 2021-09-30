package com.example.homework_006

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class UserData(
    var name: String = "",
    var lastName: String = "",
    var eMail: String = "",
    var dob: String = "",
    var sex: String = ""
) : Parcelable
