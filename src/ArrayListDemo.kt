/**
 * Created by manbir on 6/1/2017.
 */

fun main(args:Array<String>) {

    var arrayList = ArrayList<String>()

    arrayList.add("jena")
    arrayList.add("Laya")
    arrayList.add("manbir")
    arrayList.add("Ahmed")

    println("First name:" + arrayList.get(0))
    arrayList.set(0, " whaddup")


    println("all elements")
    for (item in arrayList) {
        println(item)
    }


    //Search

    if (arrayList.contains("manbir")) {
        println("found")

    } else {
        println("not found")
    }

    println("all elements by index")
    for (index in 0..arrayList.size-1)
        println(arrayList[index])
}
