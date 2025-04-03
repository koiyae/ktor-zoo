package com.example.models.classes.mammal.mammals

import com.example.models.classes.mammal.Mammal
import com.example.models.interfaces.Flyable

class Bat(
    id: Int,
    name: String,
    specie: String = "Bat",
    age: Int,
) : Mammal(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "fruits & Seeds"
), Flyable {
    override fun emitSound(): String = "Ti Ti Ti"

    override fun fly(): String = "$specie $name is flying"
}