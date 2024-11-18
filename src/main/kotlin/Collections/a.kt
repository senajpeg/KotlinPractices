package Collections

fun main(){

    //listof,mutablelistof
    println("List")
    val myListofNames = listOf("sena","tuğba")
    val myMutableList= mutableListOf(1,2,3,4,5)

    val myNewList= mutableListOf<String>()
    myNewList.add("h")
    myNewList.add("i")
    println(myNewList)

    println("Number of elements :${myMutableList.size}")
    println("Second element : ${myMutableList[1]}")
    println("Index of element \"2\" : ${myMutableList.indexOf(2)}")
    println("**********************************************")
    myMutableList.set(0,6)
    println(myMutableList)
    println("**************************************")
    val a=myMutableList.contains(3)
    println(a)
    println("**************************************")
    myMutableList.replaceAll{it*2}
    println(myMutableList)
    println("**************************************")
    myListofNames.forEach{
        println(it)
    }
    println("**********************")
    for (item in myListofNames){
        println(item)
    }
println("**********************")
    println(myMutableList)
    myMutableList.add(6)
    println("**********************")
    println(myMutableList)
myMutableList.removeAt(0)
    println("**********************")
    println(myMutableList)

// SET
println("SET")
    val mySet= setOf("s","e","n","a")
    val myMutableSet= mutableSetOf(1,2,3,4)
    println(myMutableSet)
myMutableSet.add(3)
println(myMutableSet)
//MAP
    println("MAP")
    val myMap= mapOf("one" to 1,"two" to 2)
    val myMutableMap= mutableMapOf("one" to 1,"two" to 2,"three" to 3)
    if("one" in myMap) println("yes is in")
    if(1 in myMap.values) println("yes is in")
    myMutableMap["four"]=4
    println(myMutableMap)
//FILTER
    println("FILTER")
    val myListOfName= listOf("sena","ahmet","yilmaz","onurhan")
val found = myListOfName.filter {
  //  it.length>4
    it.startsWith("Y", ignoreCase = true) && it.endsWith('z')
}
    println(found)


}