package com.example.models.classes.fish

import com.example.models.Animal
import com.example.models.interfaces.Swimmable

abstract class Fish(
    id: Int,
    name: String,
    specie: String,
    age: Int,
    diet: String
) : Animal(
    id = id,
    name = name,
    className = "Fish",
    specie = specie,
    age = age,
    diet = diet,
), Swimmable {
    override fun swim(): String = "$specie $name is swimming!"
}