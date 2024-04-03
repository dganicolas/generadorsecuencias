fun main() {
    val consola = InputOutput()
    val generador= GeneradorDeSecuencias(consola)
    val pedirnumero = PedirNumero()
    generador.fraseFinal(pedirnumero.pedirNumero())
    generador.faseIncremental(pedirnumero.pedirNumero())
}