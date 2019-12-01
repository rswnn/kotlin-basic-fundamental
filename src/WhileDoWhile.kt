fun main () {
    println("Foor loop")

    for (i:Int in 1..10 step 1) {
        println("Counter $i")
    }

    println("While loop")
    var i = 0;
    while (i <= 10) {
        println("Counter $i")
        i++
    }

    println("Do While")
    i = 1
    do {
        println("Counter $i")
        i++
    } while (i <=10)
}