package com.huyvo.kiemtragiuaki

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.huyvo.kiemtragiuaki.databinding.ActivityItemPersonBinding
import com.huyvo.kiemtragiuaki.model.Person

class PersonViewHolder private constructor(private val binding: ActivityItemPersonBinding) :
    RecyclerView.ViewHolder(binding.root) {
    companion object {
        fun from(parent:ViewGroup):PersonViewHolder{
val binding=ActivityItemPersonBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return PersonViewHolder(binding)
        }
    }

    fun bind(person: Person) {
        binding.tvName.text = person.Name
        binding.tvPhone.text = person.Phone
    }
}