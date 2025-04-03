package com.example.models.classes.reptile.reptiles

import com.example.models.classes.reptile.Reptile
import com.example.models.interfaces.Swimmable
import com.example.models.interfaces.Walkable

class Alligator(
    id: Int,
    name: String,
    specie: String = "Alligator",
    age: Int,
) : Reptile(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "meat"
), Walkable, Swimmable {
    override fun emitSound(): String = "Grrr"

    override fun walk(): String = "$specie $name is walking!"

    override fun swim(): String = "$specie $name is swimming!"

}