package apuntes

fun main(){

    //DECLARACIÓN DE FUNCIONES
    
        //  Las funciones en Kotlin se definen con la palabra fun seguida del nombre de la función
        // y, entre paréntesis, los parámetros que necesite, indicando el tipo de cada uno.

        // La siguiente función permite mostrar un mensaje de saludo al nombre que se le pasa como parámetro:

            fun greet(name: String)
            {
                println("Hola, $name")
            }

        // Adicionalmente, algunas funciones pueden devolver un resultado con la cláusula return.
        // En este caso, en la declaración de la función indicamos el tipo de retorno.
        // Esta función devuelve el resultado de la suma de sus dos parámetros:

            fun add(num1: Int, num2: Int): Int
            {
                return num1 + num2
            }

        // En el caso de que una función no devuelva nada, también se puede especificar un tipo de retorno especial,
        // llamado Unit. Así podría quedar la primera función que hemos visto:

            fun greetV2(name: String): Unit
            {
                println("Hola, $name")
            }

    // LLAMADA DE FUNCIONES

        // A la hora de invocar a las funciones, como en otros lenguajes, se especifica su nombre
        // y los valores que les pasamos entre paréntesis:

            greet("Michel")
            val result = add(3, 2)
            println(result)
            println(add(3, 2))

// FUNCIONES CON CUERPO DE EXPRESIÓN

    // Si tu función retorna tan solo una expresión, puedes reducir su sintaxis a una función con cuerpo de expresión.
    // Donde la expresión es ubicada luego del signo = en línea con la firma de la función.

    fun model(x: Int, y: Int, z: Int) = 3 * x - 2 * y + z * z

    fun equalsModel (x: Int, y: Int, z: Int): Int {
        return 3 * x - 2 * y + z * z
    }

    println("f(1,0,5)= ${model(1, 0, 5)}")

}