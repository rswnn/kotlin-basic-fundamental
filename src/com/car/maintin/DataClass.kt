package com.car.maintin

data class Person (val name: String, val age: Int, val gender:String)

fun main () {
    val person = Person("Riswan", 22, "male")
    println("Person.name ${person.name}")
    println("Person.age ${person.age}")
    println("Person.gender ${person.gender}")
}