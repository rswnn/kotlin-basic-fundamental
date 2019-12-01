package com.car.maintin


fun ArrayList<Int>.findMax(): Int {
    var maxNumber = 0
    for (item:Int in this) {
        if (item > maxNumber){
            maxNumber = item
        }
    }

    return maxNumber
}

fun main () {
    val lisOfElement = ArrayList<Int>()
    lisOfElement.add(12)
    lisOfElement.add(4)
    lisOfElement.add(3)
    lisOfElement.add(1)

    for (item:Int in lisOfElement) {
        println(item)
    }

    println("Max : ${lisOfElement.findMax()}")
}