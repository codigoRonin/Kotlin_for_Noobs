package apuntes

fun main() {

//    Como ocurre en otros lenguajes, existen tres tipos distintos de estructuras repetitivas
//    o tipos de bucles en Kotlin: while, do..while y for.
//
//    Los bucles while y do..while tienen una sintaxis y funcionamiento similar a Java.

    //    while(condition){
    //
    //    }

    //    do {
    //        /*..*/
    //    }while (condicion)


// BUCLES FOR

    // Declaramos la variable que hará de contador y el rango de valores en que se va a mover.

        for (num in 1..10)
            println(num)

        for (num in 10 downTo 0 step 2)
            println(num)

    // Tambien podedemos recorrer rangos de caracteres:

        // iteración regular
        for (char in 'a'..'f') print(char)

        // iteración con ascendente de 2
        println()
        for (char in 'a'..'f' step 2) print(char)

        println()
        // iteración en descendente
        for (char in 'f' downTo 'a') print(char)

        // iteración excluyendo el límite superior
        println()
        for (char in 'a' until 'f') print(char)

    // Podemos recorrer un String

        for (c in "Michel") {
            println(c)
        }

    // En Kotlin también existen las partículas break y continue para forzar la salida o repetición de un bucle.

    // En el caso de break podemos incluso elegir de qué bucle queremos salir,
    // en el caso de un bucle anidado, mediante anotaciones en los bucles:

        buclePrincipal@ for (num in 1..10) {
            for (num2 in 1..5) {
                if (num == num2)
                    break@buclePrincipal
            }
        }

    // La expresión continue un una expresión de salto que solo se permite dentro de los cuerpos de los bucles.
    // Su funcionalidad es saltar las sentencias de una iteración y pasar a la siguiente.

        for (i in 1..20) {
            if (i % 4 != 0) {
                continue
            }
            println(i)
        }

    // Al igual que break, la expresión continue puede ser usada en una forma etiquetada denotada con continue@etiqueta.

        Loop@ for (i in 1..5) {
            for (j in 1..7) {
                if (i < j) {
                    continue@Loop
                }
                /*Sentencias saltadas*/
            }
            /*Sentencias saltadas*/
        }
}

