package com.unero.nationalflag.fragment

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list.addAll(NationData.listData)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.rv.setHasFixedSize(true)
        setup()
        return binding.root
    }

    fun setup(){
        binding.rv.layoutManager = LinearLayoutManager(context)
        val adapter = NationAdapter(list)
        binding.rv.adapter = adapter

        adapter.setOnItemClickCallback(object : NationAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Nation) {
                val CIA = bundleOf("nation" to data)
                findNavController().navigate(R.id.action_homeFragment_to_detailFragment, CIA)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        return true
    }
}