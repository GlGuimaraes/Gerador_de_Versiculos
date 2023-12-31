package com.example.geradordeversiculos.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {
    private val security: SharedPreferences =
        context.getSharedPreferences("Verse", Context.MODE_PRIVATE)

    fun storesTRING(key: String, str: String) {
        security.edit().putString(key, str).apply()
    }

    fun getString(key: String): String{
        return security.getString(key, "")?: ""
    }
}