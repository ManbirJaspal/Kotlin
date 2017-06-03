/**
 * Created by manbir on 6/3/2017.
 */

class Outer{

    private val name:String?=null

    inner class Nest{

        fun Show(){
            println(name)
        }
    }
}

fun  main(args:Array<String>) {

    var outer = Outer()
 //   var nested = Outer.Nest() //nested class instance
   // nested.Show()
}