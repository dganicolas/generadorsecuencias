fun main() {

    val consola = InputOutput()
    val generador= GeneradorDeSecuencias(consola)
    val pedirnumero = PedirNumero()

    generador.fraseFinal(consola.pedir("Dime un numero"))
    generador.faseIncremental(consola.pedir("Dime un numero"))
}