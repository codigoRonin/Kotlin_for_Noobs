package ejercicios
/*
 * Enunciado:
 *
 * Escribe un programa en Kotlin que realice lo siguiente:
 *
 * Crea una lista llamada nombres que contenga al menos 5 nombres de personas.
 *
 * Escribe una función llamada longitudPromedio que tome la lista de nombres como parámetro
 * y devuelva la longitud promedio de los nombres en la lista como un número decimal
 * (puede haber nombres de diferentes longitudes en la lista).
 *
 * Llama a la función longitudPromedio con la lista nombres  * y muestra el resultado en la consola.
 */

fun main() {
    // Paso 1: Crear la lista de nombres
    val names = listOf("Ana", "Juan", "María", "Luis", "Elena")

    // Paso 2: Definir la función longitudPromedio
    fun averageLength(namesList: List<String>): Double {
        if (namesList.isEmpty()) {
            return 0.0
        }
        val totalOfCharacters = namesList.sumOf { it.length }
        return totalOfCharacters.toDouble() / namesList.size
    }

    // Paso 3: Llamar a la función longitudPromedio y mostrar el resultado
    val average = averageLength(names)
    println("La longitud promedio de los nombres es: $average")
}
