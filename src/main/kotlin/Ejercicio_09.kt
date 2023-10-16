/*
* Enunciado
*
* Escribe un programa en Kotlin que solicite al usuario dos números enteros y luego realice la división
* del primer número por el segundo número. Sin embargo, debes manejar la excepción en caso de que el segundo
* número sea igual a cero (división por cero). Debes mostrar un mensaje de error en ese caso. Y controlaremos tambien
* que los dos numeros solicitadas sean numeros enteros.
*
*/

fun main() {
    try {
        print("Introduce el numerador: ")
        val numerator = readLine()!!.toInt()

        print("Introduce el denominador: ")
        val denominator = readLine()!!.toInt()

        if (denominator == 0) {
            throw ArithmeticException("Error: División por 0 no permitida.")
        }

        val result = numerator.toDouble() / denominator.toDouble()
        println("Resultado de la  división: $result")

    } catch (e: NumberFormatException) {
        println("Error: Ingrese números enteros válidos..")
    } catch (e: ArithmeticException) {
        println(e.message)
    }
}