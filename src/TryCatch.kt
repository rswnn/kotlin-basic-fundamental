import java.lang.Exception

fun main(args: Array<String>) {
    try {
        print("N2 : ")
        var n2 = readLine()!!.toInt()
        var div = 100 / n2
        println(div)
    } catch (ex: Exception) {
        println(ex.message)
    }
    println("App Done !")
}