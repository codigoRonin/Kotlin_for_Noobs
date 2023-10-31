package apuntes

const val FICHERO = "datos.dat"

fun main(){
    // CONSTANTES

    // En Kotlin existen dos tipos de constantes: los valores y las constantes

    // VALORES
    // Los valores se declaran con la palabra val seguida del nombre del valor y su valor asociado.

    val fichero = "datos.dat"

    val xPos: Int = 1 // Asignación junto a declaración
    val yPos: Int   // Declaración
    yPos = 5    // Asignación

    println(xPos)
    println(yPos)

    //yPos= 6 // Kotlin: Val cannot be reassigned
    println(yPos)

    // CONSTANTES
    // Las constantes se declaran anteponiendo const a la construcción anterior.

//  const val FICHERO = "datos.dat" //  deben declararse fuera del ámbito

    // DIFERENCIAS

    // Las constantes (const) deben declararse fuera del ámbito de cualquier actividad.
    // Además, los valores pueden asignarse en tiempo de ejecución,
    // mientras que las constantes deben asignarse en tiempo de compilación.

}