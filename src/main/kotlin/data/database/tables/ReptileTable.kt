package com.example.data.database.tables

import org.jetbrains.exposed.sql.Table

object ReptileTable : Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 255)
    val specie = varchar("specie", 255)
    val age = integer("age")
    val diet = varchar("diet", 255)
    override val primaryKey = PrimaryKey(id, name = "id")
}