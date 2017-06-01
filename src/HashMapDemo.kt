/**
 * Created by manbir on 6/1/2017.
 */

fun main(args:Array<String>) {

    var map = HashMap<Int,String>()
    map.put(1, "manbir")
    map.put(2,"jena")           //add values using .put
    map.put(3, "laya")

    print(map.get(3))
    map.put(3, "laya manbir")
    for (k in map.keys) {      // .keys gets all the key values
        println(map.get(k))
    }
}