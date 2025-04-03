package com.example.models.classes.reptile

import com.example.models.Animal
import com.example.models.interfaces.Oviparous

abstract class Reptile(
    id: Int,
    name: String,
    specie: String,
    age: Int,
    diet: String
) : Animal(
    id = id,
    name = name,
    className = "Reptile",
    specie = specie,
    age = age,
    diet = diet,
), Oviparous {
    override fun layEggs(): String = "$specie $name laid eggs!"

    fun changeSkin(): String = "$specie $name changed its skin!"
}