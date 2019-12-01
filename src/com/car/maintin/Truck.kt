// pewarisan

package com.car.maintin

class Truck: CarConstructor {
    var subType:String?= null
    constructor(type: String, model:Int, price: Double, milesDrive: Int, owner:String, subType: String = "Mobil Sampah") :super(type, model, price, milesDrive, owner) {
       this.subType = subType
    }
    constructor(type: String, model: Int, price: Double, milesDrive: Int, subType: String):
            super(type, model, price, milesDrive, subType) {
        this.subType = subType
    }

    override fun getSecondPrice():Double {
        return this.getPrice()!! - (this.milesDrive!!.toDouble() * 20)
    }

//    fun  getCarPriceWrapper(): Double {
//        return super.getSecondPrice()
//    }
    // super and this
}

fun  Truck.getCarPriceWrapper(): Double {
    return this.getSecondPrice()
}

fun main() {
    var truck = Truck("BMW",2011, 10000.0, 110, "Riswan", "Dump")
    truck.type = "Honda"
    println(truck.type)
    println(truck.owner)
//    println(truck.price)
    println(truck.getSecondPrice())
    println(truck.getCarPriceWrapper())

//    val car2 = CarConstructor("Toyota",2013, 20000.0, 90, "Bella")
//    println(car2.type)
//    println(car2.owner)

}