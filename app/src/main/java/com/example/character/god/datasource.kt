package com.example.character.god

import com.example.character.R
import com.example.character.model.Charac

class data(){
    fun a(): List<Charac> {
        return listOf<Charac>(
            Charac(R.string.archon1, R.drawable.venti, /*R.string.a*/),
            Charac(R.string.archon2, R.drawable.zhongli, /*R.string.b*/),
            Charac(R.string.archon3, R.drawable.ei, /*R.string.c*/),
            Charac(R.string.archon4, R.drawable.nahida,/* R.string.d*/),
            Charac(R.string.archon5, R.drawable.furina, /*R.string.e*/)
        )

    }
}