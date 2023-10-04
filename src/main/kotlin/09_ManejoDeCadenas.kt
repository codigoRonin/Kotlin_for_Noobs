fun main(){

   // CARACTERES DE UN STRING

    // Debido a que String implementa la interfaz CharSecuence, es posible interpretar el conjunto
    // como una secuencia de elementos Char.

    // Esto te permitirá leer los caracteres en sus posiciones a través de get() o
    // su operador equivalente de acceso en corchetes string[indice]:

    val name = "Michel Cuartero"

    println(name[5])
    println(name.get(5))

    // También es posible recorrerlos a través del bucle for:

        for(char in name){
            print(char)
        }

    // Incluso usar la propiedad de extensión indices para obtener el rango de índices:

        for (index in name.indices) {
            println(name[index])
        }

    // Si quieres saber el tamaño de la secuencia de caracteres, accede a la propiedad miembro length del string.

        println(name.length) // 15

   // CONCATENAR STRINGS

        // Para crear la combinación de varios valores en un solo String,
        // usa el operador de adición + como herramienta de concatenación.

            val a = "José" + " Monteria"
            val b = "Cantidad de ahorros: " + 536.4
            val c = "Resultado: " + (2 + 4)

        // Puedes usar a combinación de variables o literales si así lo deseas.
        // Incluso puedes usar el operador de asignación y adición en su forma simplificada:

            var d = "Nueva concatenación"
            d += '!'// "Nueva concatenación!"

    // MULTIPLES LINEAS

    // En ocasiones es necesario crear literales de String que posean múltiples líneas y
    // que sean interpretadas en su forma plana (raw strings).

    // Esto puedes lograrlo usando la sintaxis de triple doble comillas (""") para encerrar el conjunto de caracteres.

        // raw string
        val welcomeText = """
            |¡Bienvenido a la guía de Kotlin!
            |En esta serie de tutoriales aprenderás
            |los conceptos básicos sobre el lenguaje
            |y las herramientas necesarias para probarlo
        """.trimMargin()

        println(welcomeText)

}