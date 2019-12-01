fun main () {
    println("=====Increment======")
    println("Start App")
    for (i:Int in 1..100 step 2) {
        println("Number is $i")
    }
    println("End app")

    //turun loop

    println("=====Decrement======")

    for (i:Int in 99 downTo 0 step 2) {
        println("Number is $i")
    }

    println("End App")
}