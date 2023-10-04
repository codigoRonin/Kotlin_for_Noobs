fun main (){

    // TIPOS ANULABLES

        //  Kotlin evita que tus tipos acepten el literal constante null (ausencia de valor) como regla general.
        //  Si necesitas un tipo que acepte nulos, defínelo como anulable, ubicando un signo de interrogación
        //  de cierre (?) al final del tipo.

            var noAceptaNull: String
//            noAceptaNull = null

            var aceptaNull: String?
            aceptaNull = null

        //    La variable noAceptaNull es de tipo no anulable, por lo que si intentas asignarle null tendrás el error:
            //    Null can not be a value of a non-null type String
        //    Por el otro lado aceptaNull que ha sido declarado anulable con String?, si permite la asignación.

    // INFERENCIA DE TIPOS NO ANULABLES

        // El compilador de Kotlin tiene la capacidad de inferir si el tipo será anulable o no, dependiendo del contexto.
        // Si inicializas una variable con un valor determinado y no declaras el tipo, implícitamente el tipo será no anulable:

        // Inferencia
             var cardName = "Animal compañero" // :String
        // ...
//              cardName = null // Error

    // VERIFICAR IGUALDAD A NULL -> Igual que la mayoria de lenguajes con un if (variable != null)

    // OPERADOR DE ACCESO SEGURO

        // Otra opción para protegerte contra nulidad, es que uses el operador de acceso seguro.
        // Este se compone del signo de pregunta y un punto (?.) para el acceso.

//        cliente?.nombre // Si el [cliente] no es null, acceder a [nombre]

        // Si el miembro existe, entonces se retorna el contenido, de lo contrario se obtendrá null del recibidor.

    // ASIGNACION DE TIPOS ANULABLES

        // El resultado de variables anulables solo puede ser asignado a otras variables anulables.

            val password: String? = null
            // Obtener password...
 //           val passwordSize = password?.length

        // En el ejemplo anterior, el compilador de Kotlin deduce el tipo como Int? con el fin de soportar un posible valor null.


    // OPERADOR !!

        // También es posible manejar la anulabilidad en Kotlin, usando el operador de aserción not null (!!)
        // o not-null assertion operator.

        // Este convierte cualquier valor a un tipo no anulable. Si no se puede, se lanza una excepción
        // del tipo NullPointerException.

           val counter: Int? = null
            counter!!.dec() // equivalente -> if (counter != null) counter.dec() else throw NullPointerException("Expression 'counter' must not be null")
            // NPE  // Al intentar usar dec() para disminuir el valor, la excepción se disparará.
            print(counter)

    // EL OPERADOR ELVIS

        // El operador Elvis retorna el primer operando (a), si dicho operando es evaluado como true,
        // de lo contrario evalúa y retorna su segundo operando (b).

//        c = a?:b

        // En Kotlin, este operador se reduce para comprobar expresiones anulables.
        // Si el operando de la izquierda es null entonces retornará el de la derecha:

 //       val passwordSize = if (password!=null) password.length else 0
        // Esto equivale a:
        val passwordSize = password?.length ?: 0

        // En el ejemplo anterior el operando a=password?.length y b=0.
        // Si a no es null, entonces retornar length, de lo contrario passwordSize sería igual a cero.
    
}