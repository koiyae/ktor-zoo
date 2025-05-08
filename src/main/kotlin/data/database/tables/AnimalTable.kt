package com.example.data.database.tables

import org.jetbrains.exposed.sql.Table

object AnimalTable : Table() {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 255)
    val className = varchar("className", 255)
    val specie = varchar("specie", 255)
    val age = integer("age")
    val diet = varchar("diet", 255)
    override val primaryKey = PrimaryKey(id, name = "id")
}