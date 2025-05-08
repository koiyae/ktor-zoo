package com.example

import com.example.data.database.transactions.createTables
import com.example.data.database.transactions.insertAnimal
import com.example.data.database.transactions.readAnimals
import com.example.utils.connectDatabase

fun main() {
    connectDatabase()
    createTables()

    insertAnimal("Bruce", "Mammal", "Bat", 2, "fruits & seeds")
    readAnimals()
}