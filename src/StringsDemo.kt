fun main () {
    val message = "Welcome to mobile legends"
    val name = "riswan"
    val allMessage = "$name, $message"
    for (i:Int in 0 until allMessage.length){
        println(allMessage[i])
    }
    println(allMessage.toLowerCase())
    println(allMessage.toUpperCase())
    println(message.trim())
    println(message)

    val tokens:List<String> = message.trim().split(" ")
    for (token:String in tokens) {
        if (!token.contains("to") && !token.contains("is")) {
            println("token : $token")
        }
    }
}