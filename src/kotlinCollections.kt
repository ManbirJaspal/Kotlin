/**
 * Created by manbir on 6/1/2017.
 */

fun main(args:Array<String>){

    var map = hashMapOf(1 to "manbir", 2 to "jena")
    map.put(3, "laya")
    println(map.get(3))
    //or
    println(map[3])

    var ar = arrayOf(1,10,22,11)   //array of is same as a array
    var list = listOf(11,22,33,22)  // this is a linked list //immutable, i.e. the values cant be changed once assigned.
    for (item in list){
        println(item)
    }

    //can be made mutable

    var arr1 = mutableListOf(22,33,44,55)
    arr1[0] = 55  //no error shown, hence the values inside the linked list can be changed



}

