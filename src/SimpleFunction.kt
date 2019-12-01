fun main () {
    addNumbers(3.0, 4.0)
    println("Multiple Number")

    var multiNumber = multiNumbers(3.4, 4.2)
    println(multiNumber)

    multiNumber = multiNumbers(10.0)
    println(multiNumber)

    multiNumber = multiNumbers(y = 3.0)
    println(multiNumber)

    multiNumber = multiNumbers(x = 2.5)
    println(multiNumber)

    displayName(names = arrayOf("riswan", "bella", "robbi"))
}

fun addNumbers (x:Double, y:Double) {
    val temp = x + y;
    println(temp)

}

fun multiNumbers (x:Double = 0.0, y:Double = 0.0):Double {
    return  x * y
}

fun displayName ( names: Array<String>) {
//    for (i:Int in 0 until name.size){
//        println("name is ${name[i]}")
//    }

    for (name:String in names) {
        println("name is $name")
    }
}

