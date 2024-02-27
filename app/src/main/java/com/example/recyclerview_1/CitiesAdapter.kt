package com.example.recyclerview_1

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CitiesAdapter(
    private val cities : ArrayList<String>
): RecyclerView.Adapter<CitiesAdapter.CityViewHolder>(){

    class CityViewHolder(val  txtCity:TextView):ViewHolder(txtCity)

    override fun getItemCount(): Int {
        return  cities.size
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val txtCity =TextView(parent.context);
        txtCity.layoutParams=
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT
            )
        txtCity.setTextSize(30F)
        return  CityViewHolder(txtCity)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val  city = cities[position]
        holder.txtCity.setText(city)
    }

}