package com.example.models.classes.bird.birds

import com.example.models.classes.bird.Bird
import com.example.models.interfaces.Flyable
import com.example.models.interfaces.Walkable

class Eagle(
    id: Int,
    name: String,
    specie: String = "Eagle",
    age: Int,
) : Bird(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "meat"
), Walkable, Flyable {
    override fun emitSound(): String = "Ki-aaah"

    override fun walk(): String = "$specie $name is walking!"

    override fun fly(): String = "$specie $name is flying!"
}