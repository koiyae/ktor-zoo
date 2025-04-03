package com.example.models.classes.amphibian.amphibians

import com.example.models.classes.amphibian.Amphibian
import com.example.models.interfaces.Swimmable
import com.example.models.interfaces.Walkable

class Salamander(
    id: Int,
    name: String,
    specie: String = "Salamander",
    age: Int,
) : Amphibian(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "invertebrates"
), Walkable, Swimmable {
    override fun walk(): String = "$specie $name is walking!"

    override fun swim(): String = "$specie $name is swimming!"
}