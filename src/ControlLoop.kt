/**
 * Created by manbir on 6/1/2017.
 */
fun main(args:Array<String>){

    loop@ for (count in 1..10) {                            //loop@ - @loop label is used to break from the primary loop

        for (count2 in 1..5){

            println("count:$count")
            if (count2==2) {
                break@loop                          //this will break from the primary loop and go out of it
            }
        }

    }
}