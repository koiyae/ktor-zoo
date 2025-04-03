package com.example.models.classes.bird.birds

import com.example.models.classes.bird.Bird
import com.example.models.interfaces.Flyable
import com.example.models.interfaces.Swimmable
import com.example.models.interfaces.Walkable

class Duck(
    id: Int,
    name: String,
    specie: String = "Duck",
    age: Int,
) : Bird(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "vegetables"
), Walkable, Swimmable, Flyable {
    override fun emitSound(): String = "Quá quá"

    override fun walk(): String = "$specie $name is walking!"

    override fun fly(): String = "$specie $name is flying!"

    override fun swim(): String = "$specie $name is swimming!"
}