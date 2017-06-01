/**
 * Created by manbir on 6/1/2017.
 */

fun main(args:Array<String>){


    var setElement = setOf(1,2,3,4,5,66,77)  //set is immutable
    for (element in setElement) {
        println(element)
    }
    var set1 = mutableSetOf(2,3,4,5,6) //this set is mutable
    set1.add(77)  //can add ot change value here since its mutable
}