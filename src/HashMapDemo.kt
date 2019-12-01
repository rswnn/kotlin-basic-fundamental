fun main () {
    var listOfUser = HashMap<Int, String>()
    listOfUser[123] = "Riswan"
    listOfUser[234] = "Bella"
    listOfUser[456] = "hafiz"

    listOfUser[123] = "Ardiansah"
    println(listOfUser[123])

    for (key:Int in listOfUser.keys) {
        println("$key adalah : ${listOfUser[key]}")
    }
}