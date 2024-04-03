fun main() {

    val consola = InputOutput()
    val generador= GeneradorDeSecuencias(consola)
    val menu = Menu(generador,consola)
    menu.escogeropcion()
}