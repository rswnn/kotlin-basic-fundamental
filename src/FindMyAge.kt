import java.util.*

fun main () {
    print("Enter year of birth : ")
    val yearOfBirth = readLine()!!.toInt()

    val yearDevice = Calendar.getInstance().get(Calendar.YEAR)

    val age = 2019 - yearOfBirth
    val ageDevice = yearDevice - yearOfBirth

    println("Your $age years old")
    println("Your $ageDevice years old on devices")
}