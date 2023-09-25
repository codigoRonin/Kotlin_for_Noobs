fun main(){

    // CONVERSIONES EXPLICITAS

    val level: Short = 75
//    val first: Int = level  //Type mismatch: inferred type is Short but Int was expected

    // Podrías esperar una conversión implícita de tipo,
    // ya que Short es un entero más pequeño que Int. Sin embargo no es el caso.
    // En Kotlin los tipos pequeños no son subtipos de los grandes.
    // Por ello el compilador de arrojará un error.

    // MÉTODOS DE CONVERSION

    //    toDouble()
    //    toFloat()
    //    toLong()
    //    toInt()
    //    toChar()
    //    toShort()
    //    toByte

    val level2: Short = 75
    val first2: Int = level2.toInt()

    // Debido a la diferencia de tamaño de bits en cada tipo,
    // las conversiones aplicaran truncados o redondeos necesarios, cuando el tamaño difiera.
}