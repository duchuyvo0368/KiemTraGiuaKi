package com.huyvo.kiemtragiuaki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.huyvo.kiemtragiuaki.databinding.ActivityMainBinding
import com.huyvo.kiemtragiuaki.model.Person

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvList.run {
            layoutManager= LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter=PersonAdapter(Persons)

        }
        binding.btnThem.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, AddPerson::class.java)
            startActivity(intent)
        })
    }
    override fun onResume() {
        super.onResume()
        binding.rvList.adapter?.notifyDataSetChanged()
    }

    companion object {
        val Persons = mutableListOf<Person>()
    }
    }
}