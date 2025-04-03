package com.example.models.classes.reptile.reptiles

import com.example.models.classes.reptile.Reptile
import com.example.models.interfaces.Crawlable

class Snake(
    id: Int,
    name: String,
    specie: String = "Snake",
    age: Int,
) : Reptile(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "rodents"
), Crawlable {
    override fun emitSound(): String = "Sssssss"

    override fun crawl(): String = "$specie $name is crawling!"
}