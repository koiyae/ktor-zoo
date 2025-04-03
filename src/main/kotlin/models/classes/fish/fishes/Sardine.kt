package com.example.models.classes.fish.fishes

import com.example.models.classes.fish.Fish
import com.example.models.interfaces.Oviparous

class Sardine(
    id: Int,
    name: String,
    specie: String = "Sardine",
    age: Int,
) : Fish(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "planktons"
), Oviparous {
    override fun emitSound(): String = "Glub glub"

    override fun layEggs(): String = "$specie $name laid eggs!"
}