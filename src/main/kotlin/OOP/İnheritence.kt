package OOP

fun main(){
    val car=Carr(color = "Green", model = "bmw")
    println("${car.color} ${car.model}")
    car.speed(100,199)

    val truck=Truck("Yellow","Mercedes")
    truck.speed(80,200)

}

class Truck(color: String, model: String): Carr(color, model){
    override fun speed(minspeed: Int, maxspeed: Int) {
println("min speed is ${minspeed} ,max spees is ${maxspeed}")
    }
}




open class Carr(var color:String,
          var model:String){
 open fun speed(minspeed:Int,maxspeed:Int){
    println("min speed is ${minspeed}, max speed is ${maxspeed} ")
}
}