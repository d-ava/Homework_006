package com.example.homework_006.extension

fun String.isEmail():Boolean{

    return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()



}