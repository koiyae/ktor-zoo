package com.example.utils

import org.jetbrains.exposed.sql.Database

fun connectDatabase() {
    Database.connect(
        url = "jdbc:mysql://localhost/animals",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "admin"
    )
}