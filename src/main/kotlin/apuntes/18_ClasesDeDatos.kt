package apuntes

fun main (){

    // Una data class es una clase que contiene solamente atributos que queremos guardar, su responsabilidad
    // es solo almacenar valores.

    // DEFINIR UNA DATA CLASS
        data class Superhero(
            var superhero:String,
            var publisher:String,
            var realName:String,
            var photo:String
        )

    // CREAR OBJETOS

        val batman:Superhero = Superhero("Batman", "DC", "Bruce Wayne",
            "https://www.superhero/batman.jpg")

    // TRABAJAR CON OBJETOS DE UNA DATA CLASS

    // Estas clases se generan automáticamente con una serie de funciones útiles:

        //    equals
        //    hashCode
        //    copy
        //    toString
        //    N métodos componentN() que corresponden a cada propiedad en orden de declaración

        val batmanRealName = batman.realName //Recuperamos "Bruce Wayne"
        batman.realName = "Soy Batman" //Cambiamos "Bruce Wayne" por "Soy Batman"
        batman.toString() //Devolverá todos los atributos con su valor

        // Usa el método copy() de una data class para copiar los valores de un objeto en otro.

        val batmanCopy:Superhero = batman.copy()
        val superBatman:Superhero = batman.copy(superhero = "SuperBatman")
        // Ahora si hacemos un toString() veremos que todos los campos son iguales excepto el atributo superhero

        // Por defecto, en cada data class, kotlin nos genera un componentN() para cada uno de los parámetros
        batman.component1() //Batman
        batman.component2() //DC
        batman.component3() //Bruce Wayne
        batman.component4() //https://www.superhero/batman.jpg

    // EJEMPLO CON LISTAS

        val superheros:MutableList<Superhero> = mutableListOf()

        superheros.add(Superhero("Spiderman", "Marvel", "Peter Parker", "https://spiderman.jpg"))
        superheros.add(Superhero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://daredevil.jpg"))
        superheros.add(Superhero("Wolverine", "Marvel", "James Howlett", "https://logan.jpeg"))
        superheros.add(Superhero("Batman", "DC", "Bruce Wayne", "https://batman.jpg"))
        superheros.add(Superhero("Thor", "Marvel", "Thor Odinson", "https://thor.jpg"))
        superheros.add(Superhero("Flash", "DC", "Jay Garrick", "https://flash.png"))
        superheros.add(Superhero("Green Lantern", "DC", "Alan Scott", "https://green-lantern.jpg"))
        superheros.add(Superhero("Wonder Woman", "DC", "Princess Diana", "https://wonder_woman.jpg"))

}