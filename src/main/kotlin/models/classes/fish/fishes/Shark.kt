package com.example.models.classes.fish.fishes

import com.example.models.classes.fish.Fish

class Shark(
    id: Int,
    name: String,
    specie: String = "Shark",
    age: Int,
) : Fish(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "fish"
) {
    override fun emitSound(): String = "Glub glub"
}