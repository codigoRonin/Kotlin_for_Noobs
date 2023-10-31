package ejercicios
/*
*
* Enunciado
*
* Crea una clase Persona con las siguientes propiedades:
*
*   Propiedades:
*       nombre (String): El nombre de la persona.
*       edad (Int): La edad de la persona.
*       genero (String): El género de la persona.
*
* Crea tres constructores diferentes para la clase Persona:
*       Un constructor que acepte el nombre y la edad.
*       Un constructor que acepte el nombre, la edad y el género.
*       Un constructor que no acepte ningún parámetro.
*
* Para cada constructor, define un método imprimirInformacion() que imprima en la consola la información de la persona
* en el siguiente formato: "Nombre: [nombre], Edad: [edad], Género: [genero]".
*
* En el programa principal, pide al usuario que ingrese información sobre tres personas utilizando
* los diferentes constructores, crea objetos Persona con estos datos y luego imprime la información de cada
* persona utilizando el método imprimirInformacion().
*/

class Person(val name: String, val age: Int) {
    var gender: String = "Desconocido" // valor por defecto

    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
    }

    constructor() : this("Sin nombre", 0)

    fun printInformation() {
        println("Nombre: $name, Edad: $age, Género: $gender")
    }
}

fun main() {

    val people = mutableListOf<Person>()

    for (i in 1..3) {
        println("Introduce la información de la persona $i:")
        print("Nombre: ")
        val name = readlnOrNull() ?: ""
        print("Edad: ")
        val age = readlnOrNull()?.toIntOrNull() ?: 0
        print("Género: ")
        val gender = readlnOrNull() ?: ""

        val person = if (name.isEmpty()) {
            Person()
        } else if (gender.isEmpty()) {
            Person(name, age)
        } else {
            Person(name, age, gender)
        }

//        val person: Person
//        if (name.isEmpty()) {
//            person = Person()
//        } else if (gender.isEmpty()) {
//            person = Person(name, age)
//        } else {
//            person = Person(name, age, gender)
//        }
        people.add(person)
    }

    println("\nInformación de las personas:")
    for ((index, person) in people.withIndex()) {
        println("Persona ${index + 1}:")
        person.printInformation()
    }
}
