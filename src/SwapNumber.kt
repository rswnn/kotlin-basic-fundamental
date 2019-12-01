fun main () {
    print("Enter number 1 : ")
    var number1:Int = readLine()!!.toInt()
    print("Enter number 2 : ")
    var number2:Int = readLine()!!.toInt()

    val temp:Int = number1
    number1 = number2
    number2 = temp

    print("Tukar nomer -------> Number 1: $number1, nNumber 2 : $number2, temp: $temp")
}