// Realizar menú bancario (cajero)) que reciba y entregue dinero con las siguientes opciones:
    //1.- Ver saldo
    //2.- Ingresar dinero
    //3.- Sacar dinero
    //4.- Salir

const val VIEW_BALANCE = 1
const val INPUT_MONEY = 2
const val OUTPUT_MONEY = 3
const val EXIT = 4
fun main() {

    println("BIENVENIDO A NUESTRO BANCO ")
    println("Elije una de las opciones")
    println("1.- Ver saldo")
    println("2.- Ingresar dinero")
    println("3.- Sacar dinero")
    println("4.- Salir")

    val option = readlnOrNull()?.toInt()
    var balance = 100.00

    when (option) {
        VIEW_BALANCE -> {
            println("Tu saldo es de ${balance} €")
        }

        INPUT_MONEY -> {
            println("Cuanto dinero vas a ingresar:")
            val inputMoney = readln().toDouble()
            balance += inputMoney
            println("Opracion realizada con exito, tu saldo es: ${balance} € ")
        }

        OUTPUT_MONEY -> {
            println("Cuanto dinero vas a a sacar:")
            val outputMoney = readlnOrNull()!!.toDouble()
            if ((balance - outputMoney) < 0) {
                println("No tienes tanto dinero!!!")
                println("Tu saldo es: $${balance}  ")
            } else {
                balance -= outputMoney
                println("Opracion realizada con exito, tu saldo es: $${balance}  ")
            }
        }

        EXIT -> {
            println("Gracias por usar nuestro cajero. Hasta pronto")
        }

        else -> {
            println("Esta opción no es válida")
        }
    }
}
