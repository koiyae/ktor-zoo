package com.example.models.classes.amphibian.amphibians

import com.example.models.classes.amphibian.Amphibian
import com.example.models.interfaces.Crawlable

class Caecilian(
    id: Int,
    name: String,
    specie: String = "Caecilian",
    age: Int,
) : Amphibian(
    id = id,
    name = name,
    specie = specie,
    age = age,
    diet = "invertebrates"
), Crawlable {
    override fun crawl(): String = "$specie $name is crawling!"
}