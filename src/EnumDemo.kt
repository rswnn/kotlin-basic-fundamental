enum class Directions {
    NORTH,SOUTH,EAST,WEST
}

fun main(args: Array<String>) {
    var userDirect = Directions.SOUTH

    if (userDirect == Directions.SOUTH) {
        println("Ini Sama")
    } else {
        println("Ini Berbeda boi")
    }
}