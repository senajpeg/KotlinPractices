package Generics

fun main(){
val listOfItems= listOf("sena","ahmet","yılmaz")
    val listOfnumbers= listOf(1,2,3)
    val finder=Finder(list =listOfnumbers )

    finder.findItem(element = 1){
        println("found ${it}")
    }
}
 class Finder<T>(private val list:List<T>){
fun findItem(element:T,fountItem:(element:T?)->Unit){
    val itemFoundList=list.filter {
        it==element
    }
    if(itemFoundList.isNullOrEmpty()) fountItem(null) else
        fountItem(itemFoundList.first())
}
 }