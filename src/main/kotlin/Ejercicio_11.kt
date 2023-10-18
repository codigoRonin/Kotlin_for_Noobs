/*
*
* Enunciado
*
* Supón que estamos creando un juego, donde un avión se mueve en dos dimensiones a lo largo de un límite de [300,300].
* Su posición inicial debe ser [0,0].
*
* El objetivo es modelar dicho avión, junto a su información de coordenadas y permitir modificarlas dependiendo
* de la dirección en que se desplaza.
*
*   Define la clase  con sus métodos para poder moverse hacia arriba, abajo, derechae izquierda.
*   Instancia un objeto  de esa clase.
*   Simula el desplazamiento Derecha > Derecha > Abajo > Arriba > Izquierda de un avión.
*   Imprime su posición final.
*
 */

class Plane {
    var x: Int = 0
        private set
    var y: Int = 0
        private set
    fun moveLeft() {
        x -= if (x == 0) 0 else 1
    }
    fun moveRight() {
        x += if (x == 300) 0 else 1
    }
    fun moveDown() {
        y -= if (y == 0) 0 else 1
    }
    fun moveUp() {
        y += if (y == 300) 0 else 1
    }
}

fun main() {
    val plane = Plane()
    plane.moveRight()
    plane.moveRight()
    plane.moveDown()
    plane.moveUp()
    plane.moveLeft()

    println("Posición actual del avión: (${plane.x},${plane.y})")

}