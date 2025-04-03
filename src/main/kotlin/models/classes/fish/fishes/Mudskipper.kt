package com.example.models.classes.fish.fishes

import com.example.models.classes.fish.Fish
import com.example.models.interfaces.Oviparous
import com.example.models.interfaces.Walkable

class Mudskipper(
    id: Int,
    name: String,
    specie: String = "Mudskipper",
    age: Int,
) : Fish(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "invertebrates"
), Oviparous, Walkable {
    override fun emitSound(): String = "Splash"

    override fun layEggs(): String = "$specie $name laid eggs!"

    override fun walk(): String = "$specie $name is walking!"
}