fun main () {
    print("Enter your age : ")
//    val age:Int = readLine()!!.toInt()
//
//    if (age >= 65) {
//        print("saatnya pensiun")
//    }
//
//    if (age < 65) {
//        print("Masih bisa kerja")
//    }

    print ("Enter your grade : ")
    val grade:Int = readLine()!!.toInt()

    if (grade >=90) {
        println("A")
    }

    if (grade in 80..89) {
        println("B")
    }

    if (grade in 50..70) {
        println("C")
    }

}