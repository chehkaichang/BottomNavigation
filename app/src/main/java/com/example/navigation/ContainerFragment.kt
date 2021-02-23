package com.example.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_container_record.*

class ContainerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_container_record, container, false)
    }

    override fun onResume() {
        super.onResume()

        recyclerView.layoutManager =
            LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )

        val openDataChooseList = mutableListOf<OpenData>()
        openDataChooseList.add(OpenData("Interaction Reward", "+1.849"))
        openDataChooseList.add(OpenData("Social Reward", "+681.213"))
        openDataChooseList.add(OpenData("Revenue", "+1.793.729"))
        recyclerView.adapter = context?.let { ContainerAdapter(openDataChooseList, it) }
    }
}