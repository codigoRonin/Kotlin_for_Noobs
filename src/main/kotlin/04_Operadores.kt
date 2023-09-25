fun main(){

    var a = 7
    var b = 2
    // OPERADORES ARITMÉTICOS

//    + 	Suma
//    - 	Resta
//    * 	Multiplicación
//    / 	División
//    % 	Resto de división entera
//    ++ 	Auto incremento
//    -- 	Auto decremento

    println("($a + $b)= ${a + b}")
    println("($a - $b)= ${a - b}")
    println("($a x $b)= ${a * b}")
    println("($a / $b)= ${a / b}")
    println("($a % $b)= ${a % b}")

    // OPERADORES LÓGICOS

//    && 	AND o "Y" lógica
//    || 	OR u "O" lógica
//    ! 	NOT o negación (cambio de valor)

    // OPERADORES RELACIONALES

//    > 	Mayor que
//    < 	Menor que
//    >= 	Mayor o igual que
//    <= 	Menor o igual que
//    == 	Igual que
//    != 	Distinto de

    val input = 5
    var result: Boolean

    val greaterThanZero = input > 0
    val isEven = input % 2 == 0

    result = greaterThanZero && isEven
    println("Es mayor que cero y par:$result")

    result = greaterThanZero || isEven
    println("Es mayor que cero o par:$result")

    result = greaterThanZero && !isEven
    println("Es mayor que cero e impar:$result")

    // OPERADORES DE ASIGNACIÓN

//    = 	Asignación simple
//    += 	Autosuma
//    -= 	Autoresta
//    *= 	Automultiplicación
//    /= 	Autodivisión
//    %= 	Autoresto

    a = 10
    b = 20

    a += b
    println("+= $a")
    a -= b
    println("-= $a")
    a *= b
    println("*= $a")
    a /= b
    println("/= $a")
    a %= b
    println("%= $a")
}