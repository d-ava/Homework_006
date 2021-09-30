package com.example.homework_006

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts

import com.example.homework_006.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)


        val userData = UserData(
            name = binding.tVName.text.toString(),
            lastName = binding.tVLastName.text.toString(),
            eMail = binding.tVeMail.text.toString(),
            dob = binding.tVDOB.text.toString(),
            sex = binding.tVSex.text.toString()
        )

        val editProfileLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    val userData2 =
                        result.data?.getParcelableExtra<UserData>(EditProfileActivity.USER2)


                    binding.tVName.text = userData2?.name
                    binding.tVLastName.text = userData2?.lastName
                    binding.tVeMail.text = userData2?.eMail
                    binding.tVDOB.text = userData2?.dob
                    binding.tVSex.text = userData2?.sex


                }
            }

        binding.btnEditProfile.setOnClickListener {


            val intent = Intent(this, EditProfileActivity::class.java)
            intent.putExtra(USER1, userData)
            editProfileLauncher.launch(intent)


        }


    }


    companion object {
        const val USER1 = "111"

    }


}

