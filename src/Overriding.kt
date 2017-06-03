/**
 * Created by manbir on 6/2/2017.
 */
/**
 * Created by manbir on 6/2/2017.
 */
open class Operations1() {               //open is used here as in public, otherwise every normal class created
                                            //is final and cannot be inherited

    open fun sum(n1:Int, n2:Int):Int {

        return n1+n2
    }

    fun div(n1: Int, n2: Int):Int {

        return n1/n2
    }


}

class MultiOperation1(): Operations1() {    //syntax for inheritance

    override fun sum(n1: Int, n2: Int):Int {

        return n1+n2 * 3
    }

    fun sub(n1: Int,n2: Int):Int {

        return n1-n2
    }

    fun mul(n1: Int,n2: Int):Int {

        return n1*n2
    }
}


fun main(args:Array<String>) {

    var op = Operations1()
    var sum =op.sum(10,15)
    println("sum: $sum")
    var div = op.div(10,2)
    println("div: $div")

    //second

//    var op2 = MultiOperation1()   //OVERRIDING
//    sum = op2.sum(10,15)
//    println("sum: $sum")
//    div = op2.div(10,2)
//    println("div: $div")

    var op2 = MultiOperation1() as Operations1   //This is Casting
    sum = op2.sum(10,15)
    println("sum: $sum")
    div = op2.div(10,2)
    println("div: $div")

}