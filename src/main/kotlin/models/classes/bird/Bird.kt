package com.example.models.classes.bird

import com.example.models.Animal
import com.example.models.interfaces.Oviparous

abstract class Bird(
    id: Int,
    name: String,
    specie: String,
    age: Int,
    diet: String
) : Animal(
    id = id,
    name = name,
    className = "Bird",
    specie = specie,
    age = age,
    diet = diet,
), Oviparous {
    override fun layEggs(): String = "$specie $name laid eggs!"

    fun peck(): String = "$specie $name is pecking!"
}