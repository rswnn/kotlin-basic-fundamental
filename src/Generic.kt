class UserAdmins <T> (credit: T) {
    init {
        println(credit)
    }
}

fun <T> display (process: T) {
    println(process)
}

fun main(args: Array<String>) {
    var userAdmins = UserAdmins<String>("Riswan")
    var userAdmins2 = UserAdmins<Int>(2000)
    var userAdmins3 = UserAdmins<Double>(3.40)

    display<Int>(234)
    display<String>("Riswan")
}