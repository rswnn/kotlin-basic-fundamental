fun main(args: Array<String>) {

    var t1 = thread("Thread 1 ")
    t1.start()
    println(" thread is running")

    var t2 = thread("Thread 2")
    t2.start()
    println(" thread 2 is running")

    var t3 = thread("Thread 3")
    t3.start()
    t3.join()
    println(" thread is run")

}

class thread(): Thread()  {
    var Threadname:String?=null
    constructor(Threadname:String):this() {
        this.Threadname = Threadname
        println(this.Threadname + "is Started")
    }
    override fun run() {
        var count = 0;
        while (count < 10) {
            println( this.Threadname + " count :$count")
            count++

            try {
                Thread.sleep(1000)
            } catch (ex:Exception) {
                println(ex.message)
            }
        }
    }
}