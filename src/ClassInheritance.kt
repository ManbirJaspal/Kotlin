/**
 * Created by manbir on 6/2/2017.
 */
open class Operations() {               //open is used here as in public, otherwise every normal class created
                                        //is final and cannot be inherited

    fun sum(n1:Int, n2:Int):Int {

        return n1+n2
    }

    fun div(n1: Int, n2: Int):Int {

        return n1/n2
    }


}

class MultiOperation: Operations() {    //syntax for inheritance

    fun sub(n1: Int,n2: Int):Int {

        return n1-n2
    }

    fun mul(n1: Int,n2: Int):Int {

        return n1*n2
    }
}


fun main(args:Array<String>) {

    var op = Operations()
    var sum =op.sum(10,15)
    println("sum: $sum")
    var div = op.div(10,2)
    println("div: $div")

    //second

    var op2 = MultiOperation()
    sum = op2.sum(10,15)
    println("sum: $sum")
     div = op2.div(10,2)
    println("div: $div")

}