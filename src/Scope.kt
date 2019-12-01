var name:String?=null

fun showUserInfo() {
    name="Welcome $name"
    println(" $name")
}

fun main () {
    name = "Riswan"
    println(" $name")

    showUserInfo()
    println(" $name")
}