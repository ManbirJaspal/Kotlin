import java.util.*

/**
 * Created by manbir on 5/31/2017.
 */

fun main(args:Array<String>) {

    //Input
    println("Enter your YOB")
    var YOB:Int = readLine()!!.toInt()

    //Process
    var year = Calendar.getInstance().get(Calendar.YEAR)  //reads the current year from the IDE
    var age = year-YOB


    //Output

    println (" your age is $age years ")


}