fun main(){

    // HERENCIA
        // La clase Any es la raíz de la jerarquía de clases en Kotlin.
        // Cada clase en el lenguaje derivará de ella si no especificas una superclase.

    // SINTAXIS

        // Añade el modificador open para habilitar su capacidad de herencia
        // Añade dos puntos para expresar en la cabecera, que extiende de otra
        // Añade los paréntesis al final del nombre de la superclase para especificar la llamada a su constructor.
            open class Padre
            class Hijo: Padre()

    // CONSTRUCTOR PRIMARIO
            open class Ancestro(val propiedad:Boolean)
            class Descendiente(propiedad: Boolean) : Ancestro(propiedad)

    // CONSTRUCTOR SECUNDARIO

        open class Weapon(val damage: Int, val speed: Double)

        class Bow : Weapon {
            constructor(damage: Int, speed: Double) : super(damage, speed)
    }

    // SOBREESCRIBIR MÉTODOS

        // Aplicar polimorfismo con la sobrescritura de métodos en Kotlin,
        // requiere habilitar el método con el modificador open.

        // Luego usa el modificador override desde el método polifórmico la subclase.

            open class Character(val name: String) {
                open fun die() = println("Morir")
            }

            class Mage(name: String) : Character(name) {
                override fun die() = println("Mago muriendo")
            }

            val jaina = Mage("Jaina")
            // Sucesos desafortunados...
            jaina.die()

        // SOBREESCRIBIR PROPIEDADES

            // Similar a la sobrecritura de métodos, sobrescribir una propiedad requiere usar el modificador override
            // sobre la propiedad en la subclase.

            // Si la propiedad está declarada con val en la clase padre, es posible reescribirla con var en la clase hija.
            // Sin embargo, lo contrario no es posible.

            open class BaseItem(val name: String) {
                open var quantity = 1
            }

            class PopularItem(name: String) : BaseItem(name) {
                override var quantity = 6
            }


                // Añadir item regular de orden
                val notebook = BaseItem("Cuaderno")

                // Añadir item popular
                val pencil = PopularItem("Lapicero")

                // Mostrar factura
                println("${notebook.name} x ${notebook.quantity}")
                println("${pencil.name} x ${pencil.quantity}")

}