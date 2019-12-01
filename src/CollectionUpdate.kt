fun main () {

    // im-mutable
    val listImmutable = listOf("Jena", "leva")
//    listImmutable[0] = "Riswan"
    for (name:String in listImmutable) {
        println(name)
    }

    //mutable

    var listMutable: MutableList<String> = mutableListOf("Jena", "lava")
    listMutable[0] = "hussein"
    for (name:String in listImmutable) {
        println(name)
    }
}