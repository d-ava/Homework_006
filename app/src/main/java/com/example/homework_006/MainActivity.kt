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


        val ename = intent.getStringExtra("name")
        if (ename.isNullOrEmpty()){
            return

        }else binding.tVName.text = ename




    }
}