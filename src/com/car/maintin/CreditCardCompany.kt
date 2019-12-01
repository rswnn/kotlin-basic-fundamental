package com.car.maintin

interface CreditCardCompany {
    var cardNumber: String

    fun score(age:Int)
}

class MasterCard(override var cardNumber: String) :CreditCardCompany {

    override fun score(age: Int) {
        if (age > 50) {
            println("positive")
        } else {
            println("Negative")
        }
    }

    fun print() {
        println("Hello World")
    }
}

class Paypall (client:CreditCardCompany):CreditCardCompany by client {
    fun printNumber() {
        println(this.cardNumber)
    }
}

class Visa(override var cardNumber: String) :CreditCardCompany {

    override fun score(age: Int) {
        if (age > 50) {
            println("positive")
        } else {
            println("Negative")
        }
    }
}

fun main() {
    val masterCard = MasterCard("7623462934")
    masterCard.score(40)
    val masterCardPaypall = Paypall(masterCard)
    println(masterCardPaypall.cardNumber)
    masterCardPaypall.printNumber()


    val visa = Visa("928364872346")
    visa.score(40)

    val visaPaypall = Paypall(visa)
    println(visaPaypall.cardNumber)
    visaPaypall.printNumber()


}