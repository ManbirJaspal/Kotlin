import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

/**
 * Created by manbir on 6/3/2017.
 */
abstract class CreditCard() {

    fun CreditId():String {
        return "9871014584Sunny"
    }
}

class GetInfo():CreditCard() {

    fun CreditInfo():String{

        return CreditId()
    }
}




fun main(args:Array<String>){
     var gi = GetInfo()
    var cci = gi.CreditId()
    println(cci)
}