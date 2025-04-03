package com.example.models.classes.mammal.mammals

import com.example.models.classes.mammal.Mammal
import com.example.models.interfaces.Swimmable
import com.example.models.interfaces.Walkable

class Otter(
    id: Int,
    name: String,
    specie: String = "Otter",
    age: Int,
) : Mammal(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "fish"
), Walkable, Swimmable {
    override fun emitSound(): String = "Chip Chip"

    override fun walk(): String = "$specie $name is walking!"

    override fun swim(): String = "$specie $name is swimming!"
}
