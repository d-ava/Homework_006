package com.example.homework_006

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_006.databinding.ActivityEditProfileBinding

class EditProfileActivity: AppCompatActivity() {

    private val binding by lazy { ActivityEditProfileBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }


}