import java.util.*

fun main (){
    println("Pets App")
    var listOfPets = LinkedList<String>()

//    for (i:Int in 0 until maxSize) {
//        listOfPets[i] = readLine()!!.toString()
//    }

    do {
        print("Enter pet name or quit to exit : ")
        val petName:String = readLine()!!.toString()
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    } while (petName != "quit")

    if (listOfPets.size <= 0) {
        println("Thank you")
    } else {
        println("Your pets are using index")
        for (i:Int in 0 until listOfPets.size) {
            println("Pet $i ${listOfPets[i]}")
        }
        println("Your pets are using object")
        for (pet:String in listOfPets) {
            println("pet : $pet")
        }

        if (listOfPets.contains("kucing")){
            println("Disini ada cek kesehatan untuk kucing")
        }
    }

}