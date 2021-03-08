package com.unero.nationalflag.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.unero.nationalflag.R
import com.unero.nationalflag.data.Nation
import com.unero.nationalflag.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        val nation: Nation = arguments?.get("nation") as Nation

        // Workaround hehe
        binding.nationName.text = nation.name
        binding.nationFlag.setImageResource(nation.flag)
        binding.nationLang.text = nation.language
        binding.nationAnthem.text = nation.anthem
        binding.nationCapital.text = nation.capital
        binding.nationMap.setImageResource(nation.map)

        binding.btnLink.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(nation.link))
            startActivity(intent)
        }
        return binding.root
    }
}