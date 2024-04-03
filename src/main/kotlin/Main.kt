fun main() {

    val consola = InputOutput()
    val generador= GeneradorDeSecuencias(consola)
    val pedirnumero = PedirNumero()

    generador.fraseFinal(consola.pedirNumero())
    generador.faseIncremental(consola.pedirNumero())
}