package prc1

fun main() {
  //Lambda expressions

    println(add(10,16))
    println(calculateCat(2))
    println(catAge(3))
name("Sena")
    message(message = " Hello there,"){
        println(it)
        add(12,12)
    }
}
val add :(Int,Int)->Int={a,b->a+b}
val calculateCat: (Int)->Int={a-> a*7}
val catAge:(Int)->Int={it*7}
val name:(String)->Unit={
    println("Hi,my name is $it")
}

fun message(message:String,funAsParameter: (String)->Int){
    println("$message ${funAsParameter("Hey")}")
}

