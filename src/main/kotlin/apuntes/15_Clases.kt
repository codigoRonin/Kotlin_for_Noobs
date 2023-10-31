package apuntes

import java.util.*

fun main() {

    // DEFINIR CLASES

            // La definición de una clase comienza con la palabra clave class, seguida de un nombre y un conjunto de llaves.

            class Person {
                // empty body
            }

            //    Una clase consta de tres partes principales:
            //    Métodos.
            //    Propiedades.
            //    Constructores.

    // INSTANCIAR UNA CLASE

            val person = Person()

            // Nota: Cuando defines la variable con la palabra clave val para hacer referencia al objeto,
            // la variable en sí es de solo lectura, pero el objeto de la clase permanece mutable.
            // Esto significa que no puedes reasignar otro objeto a la variable,
            // pero puedes cambiar el estado del objeto cuando actualices los valores de sus propiedades.

    // DEFINIR MÉTODOS

            class SmartDevice {
                fun turnOn() {
                    println("Smart device is turned on.")
                }

                fun turnOff() {
                    println("Smart device is turned off.")
                }
            }

            val smartPhoneDevice = SmartDevice()
            smartPhoneDevice.turnOn()
            smartPhoneDevice.turnOff()

// DEFINIR PROPIEDADES DE LA CLASE

        class SmartDeviceV2 {

                val name = "Android TV"
                val category = "Entertainment"
                var deviceStatus = "online"

                fun turnOn(){
                        println("Smart device is turned on.")
                }

                fun turnOff(){
                        println("Smart device is turned off.")
                }
        }

        val smartTvDevice = SmartDeviceV2()
        println("Device name is: ${smartTvDevice.name}")
        smartTvDevice.turnOn()
        smartTvDevice.turnOff()

        // GETTERS Y SETTERS

        // El compilador genera automáticamente (en segundo plano) las funciones get y set.
        // Cuando declaras una propiedad con val, internamente solo se crea el get.
        // Para var se generan ambos. set() y get()

            // Getter Personalizado
                class Animal(
                    val name: String,
                    var age: Int
                ) {
                    val isOlderThanOne: Boolean
                        get() {
                            return this.age > 1
                        }
                }

                val animal = Animal("Chimpi", 2)
                print(animal.isOlderThanOne)

            // Setter Personalizado
                class AnimalV2(
                    val name: String,
                    var age: Int
                ) {
                    val isOlderThanOne
                        get() = this.age > 1

                    var overWeight = false

                    var weight = 0.0
                        set(value) {
                            field = value
                            overWeight = value > 100
                        }
                }

            // La solución asigna a field el valor nuevo que viene del parámetro value (puedes usar otro nombre si deseas).
            // Y en la segunda sentencia asigna a overWeight el resultado booleano de la expresión value > 100.

                val simone = AnimalV2("Simone", 12)
                // Pesando a Simone...
                simone.weight = 156.32
                // ¿Simone está en sobrepeso?
                print("¿Sobrepeso?:${if (simone.overWeight) "SI" else "NO"}")

    // DEFINIR CONTRUCTORES

        // El objetivo principal del constructor es especificar cómo se crean los objetos de la clase.

        // Existen dos tipos principales de constructores en Kotlin:

        // Constructor primario o principal.

            // Una clase solo puede tener un constructor principal, que se define como parte
            // del encabezado de la clase. Un constructor principal puede ser un constructor predeterminado (sin parametros)
            // o parametrizado.

        // Constructores Secundarios

            // Si la lista de argumentos del constructor primario no satisface la creación de tu objeto
            // en alguna circunstancia, entonces puedes crear un constructor secundario a la medida.
            // Su declaración se realiza a través de constructor al interior de la clase.
            // Si tienes un constructor primario es obligatorio usar la expresión this para delegarle los parámetros que requiera.
            // Luego escribe la lógica de inicialización en el bloque.

//                class Clase{
//                    constructor(parametro1:Tipo, parametro2:Tipo /*,..*/): this(/*parametros*/){
//                        /* Cuerpo de constructor */
//                    }
//                }

        // Ejemplo Constructor Primario

            class Weapon(val attack: Int, val speed: Double) // Constructor Primario Pametrizado

            val weapon1 = Weapon(3, 0.5)
            println("Arma 1 (ataque:${weapon1.attack}, velocidad: ${weapon1.speed})")

        // Ejemplo Constructor Primario y Secundario
            class Contact(var name: String) {
                var id: String

                init {
                    id = UUID.randomUUID().toString()
                }

                constructor(id:String, name: String) : this(name){
                    this.id = id
                }
            }

            Contact("Erika")
            Contact("C-1", "Mauricio")

        // Ejemplo dos Constructores Secundarios

            class ContactV2 {
                var id: String
                var name: String

                constructor(name: String) {
                    this.name = name
                    id = UUID.randomUUID().toString()
                }

                constructor(id: String, name: String){
                    this.id = id
                    this.name = name
                }
            }

            val contacto1 = ContactV2("Erika")
            val contacto2 = ContactV2("C-1", "Mauricio")
}