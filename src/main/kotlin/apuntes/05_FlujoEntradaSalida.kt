package apuntes

fun main() {

    // MOSTRAR DATOS

//    Usa las funciones print() y println() del paquete kotlin.io,
//    para imprimir el mensaje que desees pasar como parámetro.
//
//    Cabe aclarar que internamente son invocaciones respectivas a los métodos System.out.print()
//    y System.out.println() del JDK.

    val level = "¡Subiste de nivel!"
    println(level)

    // LEER DATOS

    print("Dime tu nombre: ")
    val name = readLine() // o val name = readln()

    print("Dime tu apellido: ")
    val surname = readlnOrNull()

    print("¡Bienvenido $name & $surname")

}