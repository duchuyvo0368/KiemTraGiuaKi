package com.huyvo.kiemtragiuaki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.huyvo.kiemtragiuaki.databinding.ActivityAddPersonBinding
import com.huyvo.kiemtragiuaki.model.Person

class AddPerson : AppCompatActivity() {
    private lateinit var binding: ActivityAddPersonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSave.setOnClickListener(View.OnClickListener {
            val name=binding.edtName.text.toString()
            val phone=binding.edtPhone.text.toString()
            val person=Person(name,phone)
            MainActivity.Persons.add(person)
            finish()
        })
    }
}