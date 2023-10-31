package ejercicios
/*
*
* Enunciado:
*
* Escribe un programa en Kotlin que gestione una lista de contactos.
* El programa debe permitir al usuario realizar las siguientes operaciones:
*
*   Agregar un nuevo contacto con un nombre y un número de teléfono.
*   Buscar un contacto por nombre y mostrar su número de teléfono.
*   Actualizar el número de teléfono de un contacto existente.
*   Eliminar un contacto por nombre.
*   Listar todos los contactos almacenados en la lista.
*   Salir de la aplicación.
*
* El programa debe utilizar un mapa (diccionario) para almacenar los contactos,
* donde el nombre del contacto es la clave y el número de teléfono es el valor.
*
* Debes proporcionar un menú interactivo que permita al usuario seleccionar las operaciones mencionadas anteriormente.
*
*/

fun main() {
    val contacts = mutableMapOf<String, String>()

    var exit = false

    while (!exit) {
        println("\nGestión de Contactos:")
        println("1. Agregar contacto")
        println("2. Buscar contacto")
        println("3. Actualizar contacto")
        println("4. Eliminar contacto")
        println("5. Listar contactos")
        println("6. Salir")
        print("Selecciona una opción: ")

        when (readln()) {
            "1" -> addContact(contacts)
            "2" -> searchContact(contacts)
            "3" -> updateContact(contacts)
            "4" -> deleteContact(contacts)
            "5" -> listContacts(contacts)
            "6" -> exit = true
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
    }
}

fun addContact(contacts: MutableMap<String, String>) {
    print("Nombre del contacto: ")
    val name = readln()
    print("Número de teléfono: ")
    val phoneNumber = readln()
    contacts[name] = phoneNumber
    println("Contacto agregado.")
}

fun searchContact(contacts: Map<String, String>) {
    print("Nombre del contacto a buscar: ")
    val name = readln()
    val phoneNumber = contacts[name]
    if (phoneNumber != null) {
        println("Número de teléfono de $name: $phoneNumber")
    } else {
        println("Contacto no encontrado.")
    }
}

fun updateContact(contacts: MutableMap<String, String>) {
    print("Nombre del contacto a actualizar: ")
    val name = readln()
    if (name in contacts) {
        print("Nuevo número de teléfono: ")
        val phoneNumber = readln()
        contacts[name] = phoneNumber
        println("Contacto actualizado.")
    } else {
        println("Contacto no encontrado.")
    }
}

fun deleteContact(contacts: MutableMap<String, String>) {
    print("Nombre del contacto a eliminar: ")
    val name = readln()
    if (contacts.remove(name) != null) {
        println("Contacto eliminado.")
    } else {
        println("Contacto no encontrado.")
    }
}

fun listContacts(contacts: Map<String, String>) {
    if (contacts.isEmpty()) {
        println("No hay contactos en la lista.")
    } else {
        println("Lista de contactos:")
        for ((name, phoneNumber) in contacts) {
            println("$name: $phoneNumber")
        }
    }
}