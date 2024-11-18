package OOP

fun main(){

    val person=Person("Sena","Aksoy",23)
    val PersonList= listOf(person, Person("tuğba","aksoy",39))
PersonList.forEach{item ->
println(item)
}
}



data class Person(val name:String,val lastname:String,val age:Int)