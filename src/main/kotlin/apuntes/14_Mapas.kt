package apuntes

fun main(){

    // Un mapa es una colección que almacena sus elementos (entradas) en forma de pares clave-valor.
    // Esto quiere decir que a cada clave le corresponde un solo valor y
    // será única como si se tratase de un identificador.

    // MAPAS INMUTABLES

        val userSettings: Map<String, String> = mapOf(
            "name" to "Michel",
            "language" to "Español",
            "logo" to "logo.png",
            "website" to "www.site.com"
        )

        println("$userSettings")  // {name=Michel, language=Español, logo=logo.png, website=www.site.com}

     // OPERACIONES DE LECTURA

        println(userSettings.size) // 4
        println(userSettings.entries) // [name=Michel, language=Español, logo=logo.png, website=www.site.com]
        println(userSettings.keys) // [name, language, logo, website]
        println(userSettings.values) // [Michel, Español, logo.png, www.site.com]
        println(userSettings["logo"]) // logo.png
        println(userSettings.get("web")) // null
        println(userSettings.getOrDefault("email", "Sin email")) // Sin email
        println(userSettings.isEmpty()) // false
        println("name" in userSettings) // true
        println("Español" in userSettings.values ) // true

        // Como podeis observar tanto containsKey() como containsValue() pueden reemplazarse con el operador in.

    // MAPAS MUTABLES

        val booksMap = mutableMapOf(
            "Sinsajo" to 2010,
            "Yo, Robot" to 1950,
            "Crimen y castigo" to 1935,
            "Cien años de soledad" to 1991
        )

        println(booksMap) // {Sinsajo=2010, Yo, Robot=1950, Crimen y castigo=1935, Cien años de soledad=1991}

        // Si no inicializo kotlin no puede hacer inferencia de tipos

        val otherBooksMap: Map<Int,Int> = mutableMapOf()

    // OPERACIONES ESCRITURA

        booksMap.put("La máquina del tiempo", 1890)
        booksMap["La máquina del tiempo"] = 1895

        println(booksMap)
        // {Sinsajo=2010, Yo, Robot=1950, Crimen y castigo=1935, Cien años de soledad=1991, La máquina del tiempo=1895}

        booksMap.remove("Sinsajo")
        println(booksMap)

        // {Yo, Robot=1950, Crimen y castigo=1935, Cien años de soledad=1991, La máquina del tiempo=1895}

         println(booksMap.remove("Cien años de soledad", 2015)) // false

    // RECORRER UN MAPA

        val operationsMap = mapOf(
            "Suma" to '+',
            "Resta" to '-',
            "Multiplicación" to 'x',
            "División" to '÷'
        )

        for ((operation, symbol) in operationsMap) {
            println("$operation -> $symbol")
        }

        // Suma -> +
        // Resta -> -
        // Multiplicación -> x
        // División -> ÷

        // Esto también es aplicable para la declaración de lambdas. Es posible expresar como lista de parámetros
        // el par clave-valor. Por ejemplo, si usamos la función forEach() sobre el mapa para imprimir su contenido:

        operationsMap.forEach { (k, v) -> println("$k -> $v") }
}