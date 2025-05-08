package com.example.data.database.transactions

import com.example.data.database.tables.AnwimalTable
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

fun readAnimals() {
    transaction {
        AnimalTable.selectAll().forEach() { row ->
            println("Nome: ${row[AnimalTable.name]}, Espécie: ${row[AnimalTable.specie]}")
        }
    }
}