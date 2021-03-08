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
        "Switzerland",
        "Germany" )

    private val flags = intArrayOf(R.drawable.flag_indonesia,
        R.drawable.flag_malaysia,
        R.drawable.flag_singapore,
        R.drawable.flag_thailand,
        R.drawable.flag_japan,
        R.drawable.flag_australia,
        R.drawable.flag_russia,
        R.drawable.flag_sk,
        R.drawable.flag_swiss,
        R.drawable.flag_germany )

    private val languages = arrayOf("Indonesian", "Malay", "Malay", "Thai", "Japanese", "English",
        "Russian", "Korean", "German, French, Italian", "German",)

    private val anthems = arrayOf("Indonesia Raya", "Negaraku", "Majulah Singapura",
        "Phleng Chat Thai", "Kimigayo", "Advance Australia Fair",
        "Государственный гимн Российской Федерации", "애국가", "Swiss Psalm", "Deutschlandlied")

    private val capitals = arrayOf("Jakarta", "Kuala Lumpur", "Singapore", "Bangkok", "Tokyo",
        "Canberra", "Moscow", "Seoul", "Zürich", "Berlin")

    private val maps = intArrayOf(R.drawable.map_indonesia,
        R.drawable.map_malaysia,
        R.drawable.map_singapore,
        R.drawable.map_thailand,
        R.drawable.map_japan,
        R.drawable.map_australia,
        R.drawable.map_russia,
        R.drawable.map_sk,
        R.drawable.map_swiss,
        R.drawable.map_germany)

    private val links = arrayOf(
        "https://en.wikipedia.org/wiki/Indonesia",
        "https://en.wikipedia.org/wiki/Malaysia",
        "https://en.wikipedia.org/wiki/Singapore",
        "https://en.wikipedia.org/wiki/Thailand",
        "https://en.wikipedia.org/wiki/Japan",
        "https://en.wikipedia.org/wiki/Australia",
        "https://en.wikipedia.org/wiki/Russia",
        "https://en.wikipedia.org/wiki/South_Korea",
        "https://en.wikipedia.org/wiki/Switzerland",
        "https://en.wikipedia.org/wiki/Germany"
    )

    val listData: ArrayList<Nation>
        get() {
            val list = arrayListOf<Nation>()
            for(position in names.indices) {
                val nation = Nation("", 0, "", "", "", 0, "")
                nation.name = names[position]
                nation.flag = flags[position]
                nation.language = languages[position]
                nation.anthem = anthems[position]
                nation.capital = capitals[position]
                nation.map = maps[position]
                nation.link = links[position]
                list.add(nation)
            }
            return list
        }
}