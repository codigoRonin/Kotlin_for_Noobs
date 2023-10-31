package ejercicios

/*
*
* Enunciado
* Vamos a crear una aplicación para administrar contactos telefónicos.
* Cada contacto tiene un nombre, un número de teléfono y una dirección de correo electrónico.
* Para hacer esto, debemos definir una data class llamada "Contacto" que almacene esta información
* y proporcione funcionalidades para administrar una lista de contactos.
*
* Crea una clase Agenda que contenga una lista mutable de Contactos y funciones para agregar, buscar, eliminar y listar
* contactos.
*
* Crear un programa con una instancia de la agenda, agrega dos contactos, listalos, busca uno de ellos,
* intenta buscar uno que no existe, elimina un contacto y finalmente vuele a listar los contactos de la agenda.
*
 */


data class Contact(
    val name: String,
    val phone: String,
    val email: String
)

class AddressBook {
    private val contacts = mutableListOf<Contact>()

    fun addContact(contact: Contact) {
        contacts.add(contact)
    }

    fun removeContact(name: String) {
        val contactToRemove = contacts.find { it.name == name }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove)
            println("Contacto $name eliminado.")
        } else {
            println("Contacto $name no encontrado.")
        }
    }

    fun findContact(name: String) {
        val foundContact = contacts.find { it.name == name }
        if (foundContact != null) {
            println("Nombre: ${foundContact.name}")
            println("Teléfono: ${foundContact.phone}")
            println("Correo: ${foundContact.email}")
        } else {
            println("Contacto $name no encontrado.")
        }
    }

    fun listContacts() {
        if (contacts.isEmpty()) {
            println("La libreta de direcciones está vacía.")
        } else {
            println("Lista de contactos:")
            for (contact in contacts) {
                println("Nombre: ${contact.name}, Teléfono: ${contact.phone}, Correo: ${contact.email}")
            }
        }
    }
}

fun main() {
    val addressBook = AddressBook()

    val contact1 = Contact("Juan", "123-456-7890", "juan@example.com")
    val contact2 = Contact("Maria", "987-654-3210", "maria@example.com")

    addressBook.addContact(contact1)
    addressBook.addContact(contact2)

    addressBook.listContacts()

    addressBook.findContact("Juan")
    addressBook.findContact("Pedro")

    addressBook.removeContact("Maria")
    addressBook.listContacts()
}
