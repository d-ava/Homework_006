package com.example.homework_006

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_006.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.btnEditProfile.setOnClickListener {

            val intent = Intent(this@MainActivity, EditProfileActivity::class.java)
            startActivity(intent)

        }


        val eName = intent.getStringExtra("name")
        val eLastName = intent.getStringExtra("lastName")
        val eEmail = intent.getStringExtra("email")
        val eDOB = intent.getStringExtra("dob")
        val eSex = intent.getStringExtra("sex")

        if (eName.isNullOrEmpty() && eLastName.isNullOrEmpty() && eEmail.isNullOrEmpty() && eDOB.isNullOrEmpty() && eSex.isNullOrEmpty()) {
            return
        } else {
            binding.tVLastName.text = eLastName
            binding.tVName.text = eName
            binding.tVSex.text = eSex
            binding.tVDOB.text = eDOB
            binding.tVeMail.text = eEmail
        }








    }
}