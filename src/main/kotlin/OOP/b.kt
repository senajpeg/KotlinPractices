package OOP

fun main(){
val car=Car(color = "Green", model = "bmw")
    println("${car.color} ${car.model}")
}


class Car(var color:String,
          var model:String){

init{
    color="yellow"
    model="mercedes"
}
}