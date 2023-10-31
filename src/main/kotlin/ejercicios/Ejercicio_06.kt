package ejercicios
/*
 * Enunciado:
 *
 * Crea una lista llamada edades que contenga al menos 7 edades de personas (números enteros).
 *
 * Escribe una función llamada promedioEdades que tome la lista de edades como parámetro y
 * devuelva el promedio de edades como un número decimal.
 *
 * Escribe una función llamada mayorEdad que tome la lista de edades como parámetro y devuelva la edad más alta.
 *
 * Escribe una función llamada menorEdad que tome la lista de edades como parámetro y devuelva la edad más baja.
 *
 * Llama a las tres funciones (promedioEdades, mayorEdad y menorEdad) con la lista edades
 * y muestra los resultados en la consola.
 */

fun main() {
    // Paso 1: Crear la lista de edades
    val ages = listOf(25, 30, 18, 42, 17, 55, 21)

    // Paso 2: Definir la función promedioEdades
    fun averageAge(agesList: List<Int>): Double {
        if (agesList.isEmpty()) {
            return 0.0
        }
        val sumOfAges = agesList.sum()
        return sumOfAges.toDouble() / agesList.size
    }

    // Paso 3: Definir la función mayorEdad
    fun olderAge(agesList: List<Int>): Int {
        return agesList.maxOrNull() ?: 0
    }

    // Paso 4: Definir la función menorEdad
    fun youngerAge(agesList: List<Int>): Int {
        return agesList.minOrNull() ?: 0
    }

    // Paso 5: Llamar a las funciones y mostrar los resultados
    val average = averageAge(ages)
    val older = olderAge(ages)
    val younger = youngerAge(ages)

    println("El promedio de edades es: $average")
    println("La mayor edad es: $older")
    println("La menor edad es: $younger")
}