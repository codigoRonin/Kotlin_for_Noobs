package ejercicios
/*
*
* Enunciado
*
* En este ejercicio crearemos una una jerarquía de clases para modelar animales.
*
* La clase base es "Animal", que tiene propiedades como nombre y edad, así como un método hacerSonido.
*
* Luego, hay una subclase "Mamifero" que hereda de "Animal" y agrega un método amamantar.
*
* Las subclases "Felino" y "Canino" heredan de "Mamifero" y sobrescriben el método hacerSonido
* para que los felinos hagan un rugido y los caninos ladren.
*
* En la función main, creamos instancias de un león y un perro, y llamamos a métodos específicos de cada clase
* para mostrar cómo funcionan "hacerSonido" y "amamantar".
*
 */

open class Animal(val name: String, val age: Int) {
    open fun makeSound() {
        println("El animal hace un sonido.")
    }
}

open class Mammal(name: String, age: Int) : Animal(name, age) {
    open fun nurse() {
        println("$name amamanta a sus crías.")
    }
}

class Feline(name: String, age: Int, val breed: String) : Mammal(name, age) {
    override fun makeSound() {
        println("$name, un felino de la raza $breed, hace un rugido.")
    }
}

class Canine(name: String, age: Int, val breed: String) : Mammal(name, age) {
    override fun makeSound() {
        println("$name, un canino de la raza $breed, ladra.")
    }
}

fun main() {
    val lion = Feline("Simba", 5, "León")
    val dog = Canine("Rex", 3, "Pastor Alemán")

    lion.makeSound()
    lion.nurse()

    dog.makeSound()
    dog.nurse()
}