class Outer {
    private val name : String ? = null

     class Nested {
        fun show () {
            println(name)
        }
    }
}

fun main(args: Array<String>) {
    var outer = Outer()
    var nested = Outer.Nested()
    nested.show()
}