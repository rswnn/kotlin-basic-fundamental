import com.example.cars.*

fun main(args: Array<String>) {
    var myCars = MyCars()
    myCars.showInfo()

    var pertamabahan = Pertamabahan(10,20)
    var tambah = pertamabahan.addAngka()
    println(tambah)
}