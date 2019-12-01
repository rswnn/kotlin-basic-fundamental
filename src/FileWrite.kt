import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    println("1. read\n2. write")
    val op = readLine()!!.toInt()
    when(op) {
        1 -> {
            ReadFromFile()
        }
        2 -> {
            print("Tulis untuk file text : " + " ")
            var str = readLine()!!.toString()
            WriteToFile(str)
        }
    }
}

fun WriteToFile (string: String) {
    try {
        var fo = FileWriter("test.txt",true)
        fo.write(string + "\n")
        fo.close()
        println("Data Saved")
    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun ReadFromFile() {
    try {
        var find = FileReader("test.txt")
        var search:Int?
        do {
            search = find.read()
            print(search!!.toChar())
        } while (search != -1)
    } catch (ex: Exception) {
        println(ex.message)
    }
}