fun main () {
    val isMarried:Boolean = true
    val GPA: Double = 3.8

    val isQualified: Int = if (isMarried && GPA >= 3.8) 1 else 0

    println(isQualified)


    val isGood:Boolean =  when(GPA) {
        3.8 -> true
        else -> false
    }

    println(isGood)
}