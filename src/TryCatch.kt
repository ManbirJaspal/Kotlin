/**
 * Created by manbir on 6/3/2017.
 */

fun main(args:Array<String>) {

  try {
      println("Enter no")
      var n2:Int = readLine()!!.toInt()
      var div = 100/n2
      println("div:$div")

  }
    catch (ex:Exception){
        println(ex.message) //prints the exception
    }

    println("Executed")
}