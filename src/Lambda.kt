val sum = { number1:Int, number2:Int -> number1 + number2}

fun main () {
    var addNumbers = sum(3, 4)
    println("Add numbers  $addNumbers")

    val listOfNumbers = listOf(10,15,20,40)

    listOfNumbers.forEach { number -> println(number) }
}