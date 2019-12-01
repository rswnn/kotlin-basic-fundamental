fun main () {
    print("Choose your food : ")
    val foodID: Int = readLine()!!.toInt()

    when(foodID) {
        1 -> {
          print("Nasi")
            print("Ayam")
        }

        10 -> {
            print("Spageti")
            print("Oncom")
        }
        else -> {
            print("tidak ada pilhan lain")
        }
    }
}