package com.rachael.miniproject2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BestfriendsFragment : Fragment() {
    private lateinit var bestFriendsRecycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bestfriends, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bestFriendsRecycler = view.findViewById(R.id.bestFriendsRecycler)

        bestFriendsRecycler.adapter = BestFriendsAdapter(requireContext())
        bestFriendsRecycler.layoutManager = LinearLayoutManager(requireContext())
        }
}

