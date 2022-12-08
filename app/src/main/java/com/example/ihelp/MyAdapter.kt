package com.example.ihelp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList: ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent,false)

        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {

        val user : User = userList[position]
        holder.firstname.text = user.firstName
        holder.lastname.text = user.lastName
        holder.email.text = user.email
        holder.amount.text = user.amount.toString()

    }

    override fun getItemCount(): Int {

        return userList.size

    }

    public class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val firstname : TextView = itemView.findViewById(R.id.tvfirstname)
        val lastname : TextView = itemView.findViewById(R.id.tvlastname)
        val email : TextView = itemView.findViewById(R.id.tvemail)
        val amount : TextView = itemView.findViewById(R.id.tvamount)



    }
}