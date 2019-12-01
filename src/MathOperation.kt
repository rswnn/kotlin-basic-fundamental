fun main () {
    print("Number 1 : ")
    val number1:Int = readLine()!!.toInt();
    print("Number 2 : ")
    val number2:Int = readLine()!!.toInt();

    val sum:Int = number1 + number2

    println("Hasil Pertamabahan: $sum")

    val sub:Int = number2 - number1

    println("Hasil Pengurangan : $sub")

    val mul:Int = number2 * number1

    println("Hasil Pengurangan : $mul")

    val div:Int = number2 / number1

    println("Hasil Pengurangan : $div")
}