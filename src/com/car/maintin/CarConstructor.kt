package com.car.maintin

open class CarConstructor() {
    var type:String?=null
    var model:Int?=null
   private var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null
    constructor(type: String, model:Int, price: Double, milesDrive: Int, owner:String):this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    open fun getSecondPrice():Double {
        return this.price!! - (this.milesDrive!!.toDouble() * 10)
    }

    fun getPrice (): Double {
        return this.price!!
    }
}

fun main() {
    var car1 = CarConstructor("BMW",2011, 10000.0, 110, "Riswan")
    car1.type = "Honda"
    println(car1.type)
    println(car1.owner)
    println(car1.getSecondPrice())

    val car2 = CarConstructor("Toyota",2013, 20000.0, 90, "Bella")
    println(car2.type)
    println(car2.owner)
    
}