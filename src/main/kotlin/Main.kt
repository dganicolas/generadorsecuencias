fun main(args: Array<String>) {
    val consola = InputOutput()
    val generador= GeneradorDeSecuencias(consola)
    generador.fraseFinal()
    generador.faseIncremental()
}