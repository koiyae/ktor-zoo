package com.example.models.classes.amphibian

import com.example.models.Animal

abstract class Amphibian(
    id: Int,
    name: String,
    specie: String,
    age: Int,
    diet: String
) : Animal(
    id = id,
    name = name,
    className = "Amphibian",
    specie = specie,
    age = age,
    diet = diet,
) {
    fun breatheThroughSkin(): String = "$specie $name is breathing through its skin!"
}