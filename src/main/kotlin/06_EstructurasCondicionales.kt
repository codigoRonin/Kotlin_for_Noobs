fun main() {

    // LA ESTRUCTURA IF

        // La estructura if tiene una sintaxis y funcionamiento similar a otros lenguajes:

        val number = 10

        if (number >= 0) {
            // Código a ejecutar si el número es positivo
        }

    // LA ESTRUCTURA IF-ELSE

        var name = "Michel"

        if (name == ("Michel")) {
            // Código a ejecutar si name es Michel

        } else {
            // Código a ejecutar si name no es Michel
        }

    // ANIDAMIENTO

        if (number >= 0)
        {
            // Código a ejecutar si el número es positivo
        }
        else if (number > -10 && number <= -5)
        {
            // Código a ejecutar si el número está entre -5 y -9 (inclusive)
        }
        else
        {
            // Código a ejecutar en cualquier otro caso
        }

    // ESTRUCTURA WHEN

        // La estructura when equivale en cierto modo a la estructura switch de otros lenguajes

        val month = 3

        when(month)
        {
            1 -> {
                println("Enero")
            }
            2 -> {
                println("Febrero")
            }
               // ...
            else -> {
                println("Mes incorrecto")
            }
        }

        // Adicionalmente, en los diferentes casos internos se pueden hacer agrupaciones y rangos.
        // El siguiente when emite una respuesta si number vale 1 o 2, y otra si está entre 3 y 10:

        when(number)
        {
            1,2 -> {
                println("Uno o dos")
            }
            in 3..10 -> {
                println("Entre 3 y 10")
            }
            is Int ->{
                println(number + 1)
            }
            !in 4..9 ->{
                println("No esta entre 4 y 9")
            }
        }

         // La expresión when no solo soporta números, sino que puede trabajar con textos y expresiones.
    
}