package ejercicios

/* Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado. */

fun main() {
    thirtyLeapYears(1999)
    thirtyLeapYears(2099)
}

fun thirtyLeapYears(year: Int) {

    var currentYear = year + 1 // porque el enunciado pide los 30 siguientes años

    for (yearCount in 1..30) {
        if (currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0)) {
            println(currentYear)
        }
        currentYear = currentYear.inc() // currentYear = currentYear + 1  || currentYear++

    }
}