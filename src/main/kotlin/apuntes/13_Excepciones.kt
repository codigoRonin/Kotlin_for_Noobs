package apuntes

import java.io.FileInputStream

fun main() {

    // LANZAR EXCEPCIONES - THROW

        // en Kotlin, usa la expresión throw seguido de la instanciación del tipo. Al igual que en Java,
        // la declaración del tipo debe tener como supertipo a la interfaz Throwable.

            fun countDigits(userInput: String?): Int {
                if (userInput.isNullOrBlank()) {
                    throw IllegalArgumentException("Entrada inválida, la palabra debe tener al menos un carácter")
                }
                return userInput.count(Char::isDigit)

                // El operador :: se utiliza para obtener una referencia a la función isDigit en lugar de llamarla
                // directamente. Esto permite que la función sea pasada como argumento a otra función
            }

            print("Escribe el texto: ")
            val userInput = readLine()
            println("Cantidad de digitos: ${countDigits(userInput)}")

    // MANEJAR EXCEPCIONES - TRY..CATCH..FINALLY

        // Pon en el bloque try el código que es propenso a lanzar excepciones y luego añade bloques catch
        // que verifiquen la aplicabilidad de un subtipo de excepción.

        // El bloque finally se ejecuta luego de que se aplique o no algún bloque catch.
        // Normalmente aquí liberas los recursos que has tomado del sistema y limpias referencias
        // para evitar fugas de memoria.

        fun String.toDoubleOrDefault(defaultValue: Double): Double {
            return try {
                toDouble()
            } catch (e: NumberFormatException) {
                defaultValue
            }
        }

        // Una función de extensión es una función que extiende las funcionalidades de una clase, con la introducción
        // de un nuevo parámetro llamado: parámetro recibidor -> Este parámetro se incorpora a la sintaxis, declarando
        // su tipo, seguido de un punto y luego el nombre de la función (TipoRecibidor.nombre()).

            println("5.3".toDoubleOrDefault(1.0))
            println("5.".toDoubleOrDefault(1.0))
            println(".3".toDoubleOrDefault(1.0))
            println("dos".toDoubleOrDefault(1.0))

    // EXCEPCIONES MARCADAS

        // Kotlin no diferencia entre excepciones marcadas y no marcadas (checked y unchecked).
        // Las funciones no deben especificar explícitamente que tipo de excepción lanzaran , ni tampoco se te obliga
        // a atrapar excepciones.

        // Esto quiere decir que cuando escribes sentencias que invoquen operaciones que lancen excepciones marcadas
        // desde el SDK de Java, el compilador de Kotlin no te resaltará su uso sin bloque try..catch.

        // Por ejemplo, como intentar abrir un archivo que no existe.
            val stream = FileInputStream("archivo inválido")

        // Aunque este constructor hace explicito que lanzará una excepción marcada del tipo FileNotFoundException,
        // no recibimos como exigencia controlarla. Obviamente al ejecutar esta sentencia tendremos el aviso esperado.

        // Esto no significa que las ignoraremos, el manejo de errores debe seguir siendo parte de tu esquema.
}


