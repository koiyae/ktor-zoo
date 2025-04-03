package com.example.models

import com.example.models.interfaces.AnimalActions

abstract class Animal(
    val id: Int,
    val name: String,
    val className: String,
    val specie: String,
    val age: Int,
    val diet: String,
) : AnimalActions {
    override fun emitSound(): String = "Sound unknown"
    override fun eat(): String = "The $specie $name ate $diet."
}