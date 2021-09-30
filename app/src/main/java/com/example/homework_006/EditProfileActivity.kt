package com.example.homework_006

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_006.databinding.ActivityEditProfileBinding
import com.example.homework_006.extension.isEmail


class EditProfileActivity : AppCompatActivity() {

    private val binding by lazy { ActivityEditProfileBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val userData = intent.getParcelableExtra<UserData>(MainActivity.USER1)
        binding.eTName.setText(userData?.name)
        binding.eTLastName.setText(userData?.lastName)
        binding.eTeMail.setText(userData?.eMail)
        binding.eTDOB.setText(userData?.dob)
        binding.eTSex.setText(userData?.sex)

        binding.btnSaveProfile.setOnClickListener {

            if (binding.eTeMail.text.toString().isEmail()){
                val userData2 = UserData(
                    name = binding.eTName.text.toString(),
                    lastName = binding.eTLastName.text.toString(),
                    eMail = binding.eTeMail.text.toString(),
                    dob = binding.eTDOB.text.toString(),
                    sex = binding.eTSex.text.toString()
                )

                val intent2 = Intent()
                intent2.putExtra(USER2, userData2)
                setResult(RESULT_OK, intent2)
                finish()
            }else binding.eTeMail.error = getText(R.string.wrong_email)


        }

    }


    companion object {
        const val USER2 = "222"

    }


}

