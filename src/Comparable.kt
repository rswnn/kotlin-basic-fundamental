import java.util.*
import kotlin.collections.ArrayList

class Person (val name: String, val age:Int): Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return other.age - this.age
    }
}

fun main(args: Array<String>) {
    var lisOfName = ArrayList<Person>()
    lisOfName.add(Person("Jena",3))
    lisOfName.add(Person("Laya",1))
    lisOfName.add(Person("Hussen", 28))

    println("Before Sort")
    for (person:Person in lisOfName) {
        println("name is ${person.name}")
        println("age is ${person.age}")
    }
    println("After Sort")
    Collections.sort(lisOfName)
    lisOfName.forEach { person -> println(person.name + person.age)}
}