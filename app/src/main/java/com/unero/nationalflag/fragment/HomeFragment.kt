package com.unero.nationalflag.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.unero.nationalflag.R
import com.unero.nationalflag.adapter.NationAdapter
import com.unero.nationalflag.data.Nation
import com.unero.nationalflag.data.NationData
import com.unero.nationalflag.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var list: ArrayList<Nation> = arrayListOf()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.rv.setHasFixedSize(true)
        list.addAll(NationData.listData)
        setup()
        return binding.root
    }

    fun setup(){
        binding.rv.layoutManager = LinearLayoutManager(context)
        binding.rv.adapter = NationAdapter(list)
    }
}