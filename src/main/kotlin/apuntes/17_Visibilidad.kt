package apuntes

fun main(){

    // RESTRICCIONES DE VISIBILIDAD

    // Kotlin nos provee las siguientes palabras claves de modificadores,
    // para restringir la visibilidad de las declaraciones:

    // private: Marca una declaración como visible en la clase o archivo actual
    // protected: Marca una declaración como visible en la clase y subclases de la misma
    // internal: Marca una declaración como visible en el módulo actual
    // public: Marca una declaración como visible en todas partes

    // Si omites el modificador en una declaración, el valor por defecto asignado será public junto a final.


    open class A {
        public var m1 = 10
        internal var m2 = "Propiedad interna"

        private fun m3() = println("Método privado")

        protected open fun m4() = m1 + 10
    }


    class B : A() {
        // m1 es visible pero no se puede sobrescribir

        // m2 es visible pero no se puede sobrescribir

        // m3 no es visible

        // m4 es visible y se puede sobrescribir
        public override fun m4() = m1 + 100
    }
}