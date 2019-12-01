fun main () {
    print("Enter Name : ")
    val name:String = readLine()!!.toString()
    print("Enter Age : ")
    val age:Int = readLine()!!.toInt();
    print("Enter GPA : ")
    val GPA:Double = readLine()!!.toDouble()

    println("=================User Info ================")
    println("Your Name is : $name")
    println("Your Age : $age")
    println("Your GPA: $GPA")



}