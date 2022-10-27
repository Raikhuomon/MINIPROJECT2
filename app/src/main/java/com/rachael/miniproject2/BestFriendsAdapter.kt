package com.rachael.miniproject2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BestFriendsAdapter(val context: Context) : RecyclerView.Adapter<BestFriendsAdapter.BFViewHolder>() {
    private val sampleData = SampleData()
    private val bestFriends = sampleData.BEST_FRIENDS

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BFViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.best_friends_layout, parent, false)

        return BFViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BFViewHolder, position: Int) {
        holder.userName.text = bestFriends[position].userName
        holder.status.text = bestFriends[position].status
    }

    override fun getItemCount(): Int {
        return bestFriends.size
    }

    class BFViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val userName: TextView = itemView.findViewById(R.id.userName)
        val status: TextView = itemView.findViewById(R.id.status)
    }
}