fun main () {
    print("Enter Your Grade : ")
    var grade:Int =  readLine()!!.toInt()

    if (grade >= 90) {
        println("A")
    } else if (grade in 80..89) {
        println("B")
    } else if (grade in 70..79) {
        println("C")
    } else if(grade in 50..69) {
        println("D")
    }

    print("END APP")
}