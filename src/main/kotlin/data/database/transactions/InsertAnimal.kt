package com.example.data.database.transactions

import com.example.data.database.tables.AnimalTable
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

fun insertAnimal(
    name: String,
    className: String,
    specie: String,
    age: Int,
    diet: String
) {
    transaction {
        AnimalTable.insert {
            it[AnimalTable.name] = name
            it[AnimalTable.className] = className
            it[AnimalTable.specie] = specie
            it[AnimalTable.age] = age
            it[AnimalTable.diet] = diet
        }
    }
}