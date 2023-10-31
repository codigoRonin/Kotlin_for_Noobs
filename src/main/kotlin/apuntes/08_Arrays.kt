package apuntes

fun main() {

// CREAR ARRAYS

    // Los arrays en Kotlin se declaran con el tipo Array, indicando adicionalmente de qué tipo va a ser.
    // Podemos crearlos de varias formas (arrayOf/arrayOfNulls/emptyArray)

        // Array de 3 reales preestablecidos

        val data = arrayOf<Double>(1.2, 4.5, 7.8)

        // Array de 10 enteros con los valores del 1 al 10

        val numbers = Array<Int>(10) { i -> i + 1 }
        val numbersIt = Array<Int>(10) { it + 1 }

        // Array de 10 enteros negativos con los valores del -1 al -10
        val negativeNumbers = Array(10) { -(it + 1) }

// ACCESO A ELEMENTOS

    //La clase Array te provee operadores set() y get() para asignar y obtener valores en los índices de tus arreglos.
    // Sin embargo, es preferible usar el operador de acceso indexado [ ] para referirte a los elementos.

    val planets = arrayOfNulls<String>(8) // Creamos un array de String e inicializamos a nulos
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"

// RECORRER ARRAYS

    //Una de las formas más convencionales de recorrer arreglos es a través del bucle for a través del operador in
    // junto a la propiedad de extensión indices. Esta contiene el rango válido de los índices del array.

    for (i in planets.indices) {
        println("${planets[i]} está en la posición ${i + 1}")
    }

    // Alternativamente, podemos emplear otra versión de for que recorra desde la primera a la última posición del array,
    // determinada por su propiedad size:

        // Opción 1
        for (i in 0 until numbers.size)
            println(numbers[i])

        // Opción 2
        for (i in 0..numbers.size - 1)
            println(numbers[i])

    // Otra opción, podemos recorrer con for cada elemento del array:

        for(value in negativeNumbers)
            println(value)

    // Otra opción es usar la función de extensión forEachIndexed(),
    // la cual recibe como parámetros el índice y el valor, y te permite imprimir en el cuerpo:

        planets.forEachIndexed { index, value ->
            println("$value está en la posición ${index+1}")
        }

// ARRAYS BIDIMENSIONALES

    // También es posible definir arrays bidimensionales o matrices, que básicamente son arrays de arrays, es decir,
    // arrays donde cada elemento es a su vez otro array y, por tanto, cada "fila" del array puede tener
    // un número diferente de elementos:

    val matriz = arrayOf(
        arrayOf<Int>(1, 2, 3),
        arrayOf<Int>(4, 5),
        arrayOf<Int>(6, 7, 8, 9)
    )

    // Para recorrer estos arrays bidimensionales debemos utilizar un doble bucle anidado, y acceder por separado a las
    // filas y columnas, como en otros lenguajes. La propiedad size de cada dimensión nos dirá respectivamente cuántas
    // filas y columnas hay:

    for(i in 0 until matriz.size)
    {
        for(j in 0 until matriz[i].size)
            print("${matriz[i][j]}")
        println()
    }


}