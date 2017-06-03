import java.io.FileReader
import java.io.FileWriter

/**
 * Created by manbir on 6/3/2017.
 */

fun main(args:Array<String>) {

    println("1 - read\n 2 - write \n")
    val op = readLine()!!.toInt()   //this is used to read only

    when(op) {
        1 -> ReadFromFile()

        2 -> {
            println("Write to file")
            var str:String = readLine().toString()
            WriteToFile(str)
        }
    }

}

//**************WRITE TO FILE********************

fun WriteToFile(str:String) {
    try {
        val fout = FileWriter("test.txt",true) //open the file // and , true is added here which acts like - "oh if the file already exists, then add to it, dont replace the previos info
        fout.write(str+ "\n")                     //write string to the file // "\n" means write to s new line in the document
        fout.close()
        println("data is saved")//close the file
    }
        catch (ex:Exception) {

            println(ex.message)
        }
}

//*****************READ FROM FILE******************

fun ReadFromFile() {

    try {
         val fin = FileReader("test.txt") //the file you want to read from
        var c:Int?
        do {
            c=fin.read()            //it will read every character(in ACSKEY and
            print(c.toChar())       //to print every character, and using .toChar() to convert the ASKEY to characters
        }while (c!=-1)              //prints till it cant find another character

    }
    catch (ex:Exception) {

        println(ex.message)
    }
}

