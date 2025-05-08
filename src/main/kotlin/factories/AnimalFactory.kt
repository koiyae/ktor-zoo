package com.example.factories

import com.example.models.classes.amphibian.Amphibian
import com.example.models.classes.amphibian.amphibians.Caecilian
import com.example.models.classes.amphibian.amphibians.Frog
import com.example.models.classes.amphibian.amphibians.Salamander
import com.example.models.classes.bird.Bird
import com.example.models.classes.bird.birds.Chicken
import com.example.models.classes.bird.birds.Duck
import com.example.models.classes.bird.birds.Eagle
import com.example.models.classes.fish.Fish
import com.example.models.classes.fish.fishes.Mudskipper
import com.example.models.classes.fish.fishes.Sardine
import com.example.models.classes.fish.fishes.Shark
import com.example.models.classes.mammal.Mammal
import com.example.models.classes.mammal.mammals.Bat
import com.example.models.classes.mammal.mammals.Lion
import com.example.models.classes.mammal.mammals.Otter
import com.example.models.classes.reptile.Reptile
import com.example.models.classes.reptile.reptiles.Alligator
import com.example.models.classes.reptile.reptiles.Lizard
import com.example.models.classes.reptile.reptiles.Snake

class AnimalFactory {
    companion object {
        fun createMammal(id: Int, name: String, specie: String, age: Int): Mammal {
            return when (specie) {
                "Lion" -> Lion(id, name, specie, age)
                "Bat" -> Bat(id, name, specie, age)
                "Otter" -> Otter(id, name, specie, age)
                else -> throw IllegalArgumentException("Espécie de mamífero não suportada!")
            }
        }

        fun createFish(id: Int, name: String, specie: String, age: Int): Fish {
            return when (specie) {
                "Shark" -> Shark(id, name, specie, age)
                "Sardine" -> Sardine(id, name, specie, age)
                "Mudskipper" -> Mudskipper(id, name, specie, age)
                else -> throw IllegalArgumentException("Espécie de peixe não suportada!")
            }
        }

        fun createReptile(id: Int, name: String, specie: String, age: Int): Reptile {
            return when (specie) {
                "Alligator" -> Alligator(id, name, specie, age)
                "Snake" -> Snake(id, name, specie, age)
                "Lizard" -> Lizard(id, name, specie, age)
                else -> throw IllegalArgumentException("Espécie de réptil não suportada!")
            }
        }

        fun createBird(id: Int, name: String, specie: String, age: Int): Bird {
            return when (specie) {
                "Chicken" -> Chicken(id, name, specie, age)
                "Eagle" -> Eagle(id, name, specie, age)
                "Duck" -> Duck(id, name, specie, age)
                else -> throw IllegalArgumentException("Espécie de peixe não suportada!")
            }
        }

        fun createAmphibian(id: Int, name: String, specie: String, age: Int): Amphibian {
            return when (specie) {
                "Frog" -> Frog(id, name, specie, age)
                "Salamander" -> Salamander(id, name, specie, age)
                "Caecilian" -> Caecilian(id, name, specie, age)
                else -> throw IllegalArgumentException("Espécie de peixe não suportada!")
            }
        }
    }
}