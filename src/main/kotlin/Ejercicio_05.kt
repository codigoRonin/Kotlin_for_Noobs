/*
 * Escribe una función que reciba dos palabras  y retorne verdadero o falso  según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Casos de prueba:
 *
 * Roma - Amor -> true
 * Amor - Amor -> false
 * Amor - Amol -> false
 *
 */

fun main() {
    println(isAnagram("amor", "roma"))
}

private fun isAnagram(wordOne: String, wordTwo: String): Boolean {

    if (wordOne.lowercase() == wordTwo.lowercase()) {
        return false
    }
    return wordOne.lowercase().toCharArray().sortedArray()
        .contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
}