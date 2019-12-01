fun main () {
//    var str: String
//            str = "hello world, welcome to kotlin"
//    print(str)
//    print(str)
//    print(str)

    var str:String
    str = "Welcome to kotlin"
//    println(str)
    val name = "Riswan"
    val age = 25;
    val GPA = 3.8

    println("=================User Info ================")
    println("Name : $name")
    println("Age : $age")
    println("GPA: $GPA")

    var count = 1;
    println(count)

    count = 10;
    println(count)
// val tidak bisa assigned

    var departement:String?
    departement = null
    departement = "Software Engineering"
    print("Departement ${departement!!}")

}