    /**
 * Created by manbir on 6/1/2017.
 */

    fun main(args:Array<String>) {

        var arrayInt = Array<Int>(5) { 0 }
        println("All element by object")

        for (element in arrayInt) {
            println(element)
        }

        println("all elements by index")

        for (index in 0..4) {
            println(arrayInt[index])
        }


        var arrayStr = Array<String>(4) { "" }
        for (index in 0..3) {
            println("Enter value for index:$index")
            arrayStr[index] = readLine()!!
        }

        for (index in 0..3) {

            println("Array[$index] = " + arrayStr[index])

        }
    }