package com.car.maintin

class Car(var type:String, val model:Int, val price:Double, val milesDrive: Int, val owner:String) {
    init {
        println("This is class")
    }

    fun getSecondPrice():Double {
        return this.price - (this.milesDrive.toDouble() * 10)
    }
}

fun main() {
//    var car1 = Car("BMW",2011, 10000.0, 110, "Riswan")
//    car1.type = "Honda"
//    println(car1.type)
//    println(car1.owner)
//    println(car1.getSecondPrice())
//
//    val car2 = Car("Toyota",2013, 20000.0, 90, "Bella")
//    println(car2.type)
//    println(car2.owner)

    var lisOfCar:ArrayList<Car> = arrayListOf<Car>()
    lisOfCar.add(Car("BMW",2011, 10000.0, 110, "Riswan"))
    lisOfCar.add(Car("Toyota",2013, 20000.0, 90, "Bella"))

//    for (car:Car in lisOfCar) {
//        println(car.owner)
//        println(car.getSecondPrice())
//    }

    lisOfCar.forEach {car -> println(car.owner); println(car.getSecondPrice())}

}