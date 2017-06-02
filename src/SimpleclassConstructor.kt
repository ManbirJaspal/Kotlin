/**
 * Created by manbir on 6/2/2017.
 */

class Car1()

{
    var Owner:String? = null
    var Price:Double? = null
    var MilesDrive:Int? = null
    var Model:Int? =null
    var Type:String? = null

    constructor(Type:String, Model:Int, Price:Double, MilesDrive:Int, Owner:String ) : this()
    {                                                   // init is a function that will execute directly when anyone wants to initialize the class
        println("Type:$Type")
        println("Model:$Model")
        println("Price:$Price")
        println("MilesDrive:$MilesDrive")
        println("Owner:$Owner")
        this.Owner= Owner
        this.Price = Price
        this.MilesDrive= MilesDrive
        this.Model= Model
        this.Type = Type
    }

    fun GetPrice():Double? {

        return this.Price!! - (this.MilesDrive!!.toDouble() * 10)

    }

    fun GetOwmer():String? {

        return this.Owner
    }

}


fun main(args:Array<String>) {

    var huCar = Car1("BMW", 2017, 10000.0, 110, "Manbir")   // initializing Car class
    println("Get price:" +huCar.GetPrice())
    println("Get Owner:" +huCar.GetOwmer())

    var jeCar = Car1("Ka", 2017, 20000.02, 10, "Jana")
    println("Get price:" +jeCar.GetPrice())
    println("Get Owner:" +jeCar.GetOwmer())
}
