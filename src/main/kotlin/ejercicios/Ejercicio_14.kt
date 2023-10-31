package ejercicios
/*
*
* Enunciado
*
* Escribe un programa que defina una clase "Mueble" con las siguientes propiedades protegidas: ancho, alto y largo.
* Un método "imprimir" que saque el volumen del mueble (ancho x alto x largo).
*
* Define una subclase llamada "Mesa" que heredará y añadira como atributo privado el número de patas.
* Sobreescribe el método imprimir para que además del volumen de la mesa, muestre el número de patas.
*
* Crea una mesa de 70(ancho)x80(alto)x120(largo) y haz que muestre su información con el método imprimir.
*
 */

open class Furniture(protected val width: Int, protected val height: Int, protected val lenght: Int) {
     open fun printVolume() = println("Volumen: ${width * height * lenght}")
}

class Table(width: Int, height: Int, lenght: Int, private val legs: Int) : Furniture(width, height, lenght) {
     override fun printVolume() {
        super.printVolume()
        println("Nº de patas: $legs")
    }
}

fun main() {
    val myTable = Table(70, 80, 120, 4)
    myTable.printVolume()
}