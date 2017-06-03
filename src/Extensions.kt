/**
 * Created by manbir on 6/3/2017.
 */
fun ArrayList<String>.swap(index1:Int, index2:Int) {  //adding .swap extension

    var temp = this.get(index1)
    this.set(index1,this.get(index2))                   //the swap code for arraylist
    this.set(index2,temp)
}
fun main(args:Array<String>){

    var arrayList = ArrayList<String>()
    arrayList.add("manbir")
    arrayList.add("jena")
    arrayList.add("laya")
    arrayList.swap(0,1)                 //using .swap extension

    println(arrayList)

}