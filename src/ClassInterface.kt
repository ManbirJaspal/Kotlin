/**
 * Created by manbir on 6/3/2017.
 */
interface op{                               //By default interface is open, and any method in it is open
    fun sum(n1:Int, n2:Int) { println("sum:"+ n1+n2)}
    fun div(n1: Int, n2: Int) { println("div:"+ n1/n2)}
}

    class UserOp:op {
        override fun sum(n1: Int, n2: Int) {
            println("sum:"+ n1+n2)
        }

        override fun div(n1: Int, n2: Int) {
            println("div:"+ n1/n2)

        }


    }

class AdminOp: op {

    override fun sum(n1: Int, n2: Int) {
        println("sum:"+ n1+n2*2)
    }

    override fun div(n1: Int, n2: Int) {
        println("div:"+ n1/n2*2)
    }
}

class ManagerOp:op {


}

fun main (srgs:Array<String>) {

    var adminop =AdminOp()
    adminop.sum(1,10)
}