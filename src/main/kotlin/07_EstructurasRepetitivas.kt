fun main(){

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

    for (num in 1 ..10)
        println(num)

    for (num in 10 downTo 0 step 2)
        println(num)
}

