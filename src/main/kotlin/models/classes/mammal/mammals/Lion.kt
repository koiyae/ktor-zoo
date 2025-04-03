package com.example.models.classes.mammal.mammals

import com.example.models.classes.mammal.Mammal
import com.example.models.interfaces.Walkable

class Lion(
    id: Int,
    name: String,
    specie: String = "Lion",
    age: Int,
) : Mammal(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "meat"
), Walkable {
    override fun emitSound(): String = "Roar"

    override fun walk(): String = "$specie $name is walking!"
}