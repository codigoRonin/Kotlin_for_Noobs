fun main() {

    println("Inserte el primer número")
    var numero1 = readLine()?.toInt()
    println("Inserte el segundo número")
    var numero2 = readLine()?.toInt()

    if (numero1 !is Int || numero2 !is Int) {
        throw ExceptionInInitializerError("Ambos números deben ser enteros")
        if (numero2 == 0) {
            throw ArithmeticException("No se puede dividir entre 0")
        }

    } else {
        var division = numero1?.div(numero2!!)
        println("La división es division" + division)
    }


}