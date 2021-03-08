package com.unero.nationalflag.data

import com.unero.nationalflag.R

object NationData {
    private val names = arrayOf("Indonesia",
        "Malaysia",
        "Singapore",
        "Thailand",
        "Japan",
        "Australia",
        "Russia",
        "South Korea",
        "Switzerland")

    private val flag = intArrayOf(R.drawable.flag_indonesia,
        R.drawable.flag_malaysia,
        R.drawable.flag_singapore,
        R.drawable.flag_thailand,
        R.drawable.flag_japan,
        R.drawable.flag_australia,
        R.drawable.flag_russia,
        R.drawable.flag_sk,
        R.drawable.flag_swiss)

    private val map = intArrayOf(R.drawable.map_indonesia,
        R.drawable.map_malaysia,
        R.drawable.map_singapore,
        R.drawable.map_thailand,
        R.drawable.map_japan,
        R.drawable.map_australia,
        R.drawable.map_russia,
        R.drawable.map_sk,
        R.drawable.map_swiss)

    val listData: ArrayList<Nation>
        get() {
            val list = arrayListOf<Nation>()
            for(position in names.indices) {
                val nation = Nation("", 0, 0)
                nation.name = names[position]
                nation.flag = flag[position]
                nation.map = map[position]
                list.add(nation)
            }
            return list
        }
}