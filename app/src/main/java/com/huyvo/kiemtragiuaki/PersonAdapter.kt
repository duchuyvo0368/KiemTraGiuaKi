package com.huyvo.kiemtragiuaki

import android.view.LayoutInflater.from
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.huyvo.kiemtragiuaki.model.Person

class PersonAdapter(private val listPerson:List<Person>): RecyclerView.Adapter<PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
       holder.bind(listPerson[position])
    }

    override fun getItemCount(): Int {
        return listPerson.size
    }
}