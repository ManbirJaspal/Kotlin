/**
 * Created by manbir on 6/3/2017.
 */

    class UserAdmin<T> (credit:T){          //<T> is used when you arent sure which datatype
                                            // will be used here, it can be decided while calling the class

    init {
        println(credit)
    }
}

fun main(args:Array<String>) {

    var userAdmin = UserAdmin<String>("manbir")
    var userAdmin2 = UserAdmin<Int>(1994)
    var userAdmin3 = UserAdmin<Double>(24.1994)

}