fun main () {
    for (userID:Int in 1..2) {
        print("$userID - Enter Your name : ")
        val name:String = readLine()!!.toString()
        print("$userID - Where you live : ")
        val livePlace = readLine()!!.toString()
        var petName:String?=""
        print("Enter: number of pets : ")
        val pets = readLine()!!.toInt()
        for (petID:Int in 1..pets step 1) {
            print("Enter Pet $petID : ")
            petName = petName + readLine()!!.toString() + ", "
        }

        println("==========User Info ============")
        println("name : $name")
        println("Live Place: $livePlace")
        println("Pet name : $petName")

        if (petName!!.contains("kucing")) {
            println("Kami mempunyai program untuk kucing")
        }
    }

}