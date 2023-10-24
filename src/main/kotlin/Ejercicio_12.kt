/*
* Enunciado
*
* Supongamos que estás diseñando un sistema de gestión de una biblioteca y necesitas modelar libros.
* Crea una clase Libro con las siguientes propiedades y métodos:
*
* Propiedades:
*      titulo (String): El título del libro.
*      autor (String): El autor del libro.
*      anioPublicacion (Int): El año de publicación del libro.
*      genero (String): El género del libro.

* Métodos:
*
*     imprimirDetalles(): Un método que imprime en la consola los detalles del libro en el siguiente formato:
*      "Título: [título], Autor: [autor], Año de Publicación: [anioPublicacion], Género: [genero]".
*
*     esLibroAntiguo(): Un método que devuelve true si el libro fue publicado antes de 2000 y false en caso contrario.
*
* Crea un objeto de la clase Libro y realiza las siguientes operaciones:
*
*   Inicializa el objeto con los siguientes datos:
*      Título: "Cien años de soledad"
*      Autor: "Gabriel García Márquez"
*      Año de Publicación: 1967
*      Género: "Realismo mágico"
*
*   Imprime los detalles del libro llamando al método imprimirDetalles().
*
*   Llama al método esLibroAntiguo() para determinar si el libro es antiguo o no, e imprime el resultado.
 */

class Book(val title: String, val author: String, val publicationYear: Int, val genre: String) {
    fun printDetails() {
        println("Título: $title, Autor: $author, Año de Publicación: $publicationYear, " +
                "Género: $genre")
    }
    fun isOldBook(): Boolean {
        return publicationYear < 2000
    }
}

fun main() {
    val book = Book(
        title = "Cien años de soledad",
        author = "Gabriel García Márquez",
        publicationYear = 1967,
        genre = "Realismo mágico"
    )

    println("Detalles:")
    book.printDetails()

    if (book.isOldBook()) {
        println("Este libro es antiguo.")
    } else {
        println("Este libro no es antiguo.")
    }
}