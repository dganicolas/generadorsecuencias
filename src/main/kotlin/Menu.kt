class Menu(val secuencias: IntgeneradorDeSecuencias, val consolamenu:IntInputOutput):IntMenu {

    override fun mostrarMenu() {
        consolamenu.imprimir("dime que opcion quieres escoger")
        consolamenu.imprimir("1-> Frase incremental.")
        consolamenu.imprimir("2-> Frase completa.")
        consolamenu.imprimir("3-> Salir.")
    }

    override fun escogeropcion() {
        mostrarMenu()
        while (true){
            val opcion = consolamenu.pedir("")
            when (opcion){
                1-> secuencias.faseIncremental(consolamenu.pedir("dame un numero"))
                2-> secuencias.fraseFinal(consolamenu.pedir("dame un numero"))
                3-> break
                else -> consolamenu.imprimir("ERROR-- escoge un error del 1 al 3")
            }
            Thread.sleep(1000)
            mostrarMenu()
        }
    }

}
