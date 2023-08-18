package com.example.geradordeversiculos.infra

class MotivationConstants private constructor(){
    object KEY {
        // Criando a constante que será usada para digitar a Key USER_NAME para que não aconteça erro de digitação no código
        const val USER_NAME = "USER_NAME"
    }

    object FILTER{
        const val ALL = 1
        const val HAPPY = 2
        const val SUNNY = 3
    }
}