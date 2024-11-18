package Enums

fun main(){
println(CreditCardType.SILVER.color) //Gray çıktı olacak
    // .values() tüm değerleri dizi şeklinde döndürür
  val myConstants:Array<CreditCardType> =CreditCardType.values()
    myConstants.forEach {
        println(it)
    }
//when ile de kullanımı vardır
    val cardType:CreditCardType=CreditCardType.SILVER
    when(cardType){

        CreditCardType.SILVER -> println("Silver!")
        CreditCardType.GOLD -> println("Gold!")
        CreditCardType.PLATINUM -> println("Platinum!")
    }



}

 enum class CreditCardType(val color:String){
     SILVER("gray"),  //ordinal=0     name=SILVER
     GOLD("gold"),    //ordinal=1     name=GOLD
     PLATINUM("black")  //ordinal=2    name=PLATINUM
 }