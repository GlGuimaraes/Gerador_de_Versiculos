package com.example.geradordeversiculos.infra

class VerseConstants private constructor(){
    object KEY {
        // Criando a constante que será usada para digitar a Key USER_NAME para que não aconteça erro de digitação no código
        const val USER_NAME = "USER_NAME"
    }

    object FILTER{
        const val FORTIFICATION = 1
        const val GRATITUDE = 2
        const val WISDOM = 3
    }
}