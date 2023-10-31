package ejercicios
/*
*
* Enunciado:
*
* Escribe una función llamada filtrarNumerosPares que tome una lista de números enteros y
* devuelva una nueva lista que contenga solo los números pares en el mismo orden en que aparecen en la lista original.
*
* No debes modificar la lista original.
*
 */

fun filterEvenNumbers(numbersList: List<Int>): List<Int> {
    // Crea una nueva lista para almacenar los números pares
    val evenNumbers = mutableListOf<Int>()

    // Iteramos a través de la lista original y agregamos los números pares a la nueva lista
        numbersList.forEach {
            if(it % 2 == 0) {
                evenNumbers.add(it)
        }
    }
    // Devuelve la lista de números pares
    return evenNumbers
}

fun main() {
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = filterEvenNumbers(numbersList)
    println("Lista original: $numbersList")
    println("Números pares: $evenNumbers")
}
