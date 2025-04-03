package com.example.models.classes.bird.birds

import com.example.models.classes.bird.Bird
import com.example.models.interfaces.Walkable

class Chicken(
    id: Int,
    name: String,
    specie: String = "Chicken",
    age: Int,
) : Bird(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "everything"
), Walkable {
    override fun emitSound(): String = "Cócó"

    override fun walk(): String = "$specie $name is walking!"
}