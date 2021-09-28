package com.example.homework_006

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_006.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private val binding by lazy { ActivityEditProfileBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.btnSaveProfile.setOnClickListener {

            val name: String = binding.eTName.text.toString()
            val lastName: String = binding.eTLastName.text.toString()
            val email: String = binding.eTeMail.text.toString()
            val dob: String = binding.eTDOB.text.toString()
            val sex: String = binding.eTSex.text.toString()

            val intent = Intent(this@EditProfileActivity, MainActivity::class.java)

            intent.putExtra("name", name)
            intent.putExtra("lastName", lastName)
            intent.putExtra("email", email)
            intent.putExtra("dob", dob)
            intent.putExtra("sex", sex)

            startActivity(intent)
        }


    }


}