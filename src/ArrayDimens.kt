fun main () {

//    println("Pets App")
//    print("Enter list your pet")
//    val maxSize = readLine()!!.toInt()
//    var listOfPets:Array<String> = Array(maxSize){""}
//
//    for (i:Int in 0 until maxSize) {
//        listOfPets[i] = readLine()!!.toString()
//    }
//
//    println("Your pets are using array")
//    for (i:Int in 0 until maxSize) {
//        println("Pet $i ${listOfPets[i]}")
//    }


    println("Number App")
    print("Enter your have number : ")
    val maxSize:Int = readLine()!!.toInt()

    val listOfNumber:Array<String> = Array(maxSize){""}
    for (i:Int in 0 until maxSize) {
        listOfNumber[i] = readLine()!!.toString()
    }

    println("Your number using array")
    for (i:Int in 0 until maxSize) {
        println("Your number $i : ${listOfNumber[i]}")
    }
}