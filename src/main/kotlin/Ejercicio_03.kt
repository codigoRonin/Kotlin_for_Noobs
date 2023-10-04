/* Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje.
   Si le pasamos "Hola mundo" nos retornaría "odnum aloH" */

fun main(){

    val input = "Hola mundo"
    var reversedInput = ""

    for (index in 0 until input.length) {
        reversedInput += input[(input.length -1) - index]
    }

    print(reversedInput)
}