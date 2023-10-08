fun main() {

    // TIPOS DE LISTAS

        // Las colecciones se pueden clasificar en dos grandes grupos, las mutables e inmutables.
        // Es decir, las que se pueden editar (mutables) y las que son solo de lectura (inmutable).

    // LA INTERFAZ LIST

        // Una lista es una colección genérica de elementos que se caracteriza por almacenarlos de forma ordenada,
        // donde pueden existir duplicados (incluso un ítem null) y se indexan los elementos con base 0

    // LISTAS INMUTABLES

        // Similar a las variables de solo lectura, una lista de solo lectura (read-only list) puede ser consultada
        // luego de ser inicializada, pero no te permite el uso de comandos para cambiar su estado.

             val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

        // Existen varias funciones útiles para trabajar con ellas.

            readOnly.size                // Muestra el tamaño de la lista
            readOnly.get(3)              // Devuelve el valor de la posición 3
            readOnly[2]                  // Devuelve el valore de la posición 2
            readOnly.first()             // Devuelve el primer valor
            readOnly.last()              // Devuelve el último valor
            readOnly.indexOf("Lunes")    // Devuelve el índice de la primera ocurrencia
            readOnly.lastIndexOf("Jueves")  // Devuelve el índice de la última ocurrencia
            println(readOnly)            // [Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo]

    // LISTA MUTBALES

        // Las listas mutables, que poseen lo anterior, pero también nos da la posibilidad de ir rellenando la lista
        // a medida que lo necesitemos, el único inconveniente es que más ineficiente con la memoria.

            val mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles",
                "Jueves", "Viernes", "Sábado")

            println(readOnly) //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado]

            mutableList.add("domingo")

        // Por defecto los valores se irán añadiendo en la última posición, pero podemos añadir el índice en el que
        // queramos escribir nuestro valor.

            mutableList.add(0, "Semana: ")
            //[Semana: , Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, domingo]

        // Otras operaciones

            val colorsList = mutableListOf("Amarillo", "Azul", "Rojo")

            colorsList.add("Verde") // [Amarillo, Azul, Rojo, Verde]
            colorsList.add(0, "Blanco") // [Blanco, Amarillo, Azul, Rojo, Verde]
            colorsList.removeAt(2) // [Blanco, Amarillo, Rojo, Verde]
            colorsList[1] = "Negro" // [Blanco, Negro, Rojo, Verde]
            colorsList.sortDescending()

            println(colorsList) // [Verde, Rojo, Negro, Blanco]

    // NULOS

        // Ahora tenemos que tener cuidado con una lista mutable por el simple hecho de que podría estar vacía o
        // contener un null. Un null es un valor nulo en una de sus posiciones, que, si acedemos a él e intentamos
        // operar, la aplicación se romperá, nos saltará un crash. Para ello, tenemos algunas funciones que nos
        // permitirá trabajar como una lista inmutable, pero con seguridad.

            mutableList.none() //Nos devuelve un true si está vacía la lista
            mutableList.firstOrNull() //Nos devolverá el primer campo, y si no hay, un null.
            mutableList.elementAtOrNull(2) //El elemento del índice 2, si no hay, devolverá un null
            mutableList.lastOrNull() //Último valor de la lista o null

    // RECORRER LISTAS

        // Esta sería la forma más sencilla, y nos devolvería el contenido de cada uno de los valores de la lista.
            for (item in mutableList) {
                print(item)
            }

        // Si necesitamos saber también la posición de cada uno de los valores podemos usar la función .withIndex
        // que nos permite generar 2 variables, la primera será la posición y la segunda el contenido.

            for ((indice, item) in mutableList.withIndex()) {
                println("La posición $indice contiene $item")
            }

        // Para el último ejemplo, usaremos .forEach, una función que hará que por cada posición haga una cosa,
        // por ejemplo pintar el valor como el for anterior. A diferencia de ellos, no tenemos una variable con el
        //contenido (véase índice e item) sino que accedemos a él con el iterator, en este caso simplemente
        // habría que poner it.


            val newListEmpty: MutableList<String> = mutableListOf()

            mutableList.forEach {
                newListEmpty.add("$it:")
            }

            print(newListEmpty)


}


