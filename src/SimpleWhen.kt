/**
 * Created by manbir on 5/31/2017.
 */

fun main(args:Array<String>) {

    var x = 15

    when (x) {                                   //When is similar to switch case

        1 -> println("Value is 1")
        2 -> println("Value is 2")
        3-> println("Value is 3")
        else -> {                               //else is like default in switch
            println("value out of range")
        }
    }

    when (x) {

        1,2 -> println("value is 1 or 2")       //used for multiple condition
        in 10..30 -> println("valuse is between 10 and 30 range") //in val1..val2 is used for range
        !in 10..30 -> println("value is not in 10 to 30 range")     //!in val1..val2 is used for condition not in range
    }
}