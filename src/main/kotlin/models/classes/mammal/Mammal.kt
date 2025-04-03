package com.example.models.classes.mammal

import com.example.models.Animal

abstract class Mammal(
    id: Int,
    name: String,
    specie: String,
    age: Int,
    diet: String
) : Animal(
    id = id,
    name = name,
    className = "Mammal",
    specie = specie,
    age = age,
    diet = diet,
) {
    fun nurse(): String = "$specie $name is nursing!"
}