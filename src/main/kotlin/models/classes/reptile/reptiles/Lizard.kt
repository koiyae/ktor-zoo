package com.example.models.classes.reptile.reptiles

import com.example.models.classes.reptile.Reptile
import com.example.models.interfaces.Walkable

class Lizard(
    id: Int,
    name: String,
    specie: String = "Lizard",
    age: Int,
) : Reptile(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "invertebrates, rodents etc."
), Walkable {
    override fun emitSound(): String = "Tck tck"

    override fun walk(): String = "$specie $name is walking!"
}