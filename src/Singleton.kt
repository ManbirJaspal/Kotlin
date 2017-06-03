/**
 * Created by manbir on 6/3/2017.
 */

class Singleton{
    var name:String?=null

  private  constructor() {
        println("instance created")
    }

    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}

fun main(args:Array<String>) {

    var single = Singleton.instance
    single.name = "manbir"
    println(single.name)

    var single2 = Singleton.instance
    println(single2.name)

    var single3 = Singleton.instance
    println(single3.name)
}

