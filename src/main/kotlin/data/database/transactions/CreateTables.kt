package com.example.data.database.transactions

import com.example.data.database.tables.AmphibianTable
import com.example.data.database.tables.AnimalTable
import com.example.data.database.tables.BirdTable
import com.example.data.database.tables.FishTable;
import com.example.data.database.tables.MammalTable
import com.example.data.database.tables.ReptileTable
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun createTables() {
    transaction {
        SchemaUtils.create(
            AnimalTable,
            MammalTable,
            ReptileTable,
            BirdTable,
            FishTable,
            AmphibianTable
        )
    }
}