package OOP

import prc1.name


fun main(){
val button=Button(label = "Button")
button.OnClick(message = "This is a Button")

    val superMario=Character(name="SuperMario")
    superMario.OnClick(message = "This is an actor")
}

class Character(val name:String):ClickEvent{
    override fun OnClick(message: String) {
        println("Clicked by ${name} and here is a message ${message}")
    }

}

class Button(val label:String):ClickEvent{
    override fun OnClick(message: String) {
        println("Clicked by ${label} and here is a message ${message}")
    }

}

interface ClickEvent{
    fun OnClick(message:String)
}