package OOP

fun main(){
println("Hello Sena, ".append("Miss you"))
    println("This is soo fun" .removeFirstandLastChars())
}

fun String.append(toAppend: String): String {
    return this.plus(toAppend)
}
/*
fun String.append(toAppend: String): String=this.plus(toAppend)
böyle de diyebilirdik tek satırda
 */

fun String.removeFirstandLastChars():String=this.substring(1,this.length-1)