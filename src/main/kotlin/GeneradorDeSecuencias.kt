class GeneradorDeSecuencias(private var consola:IntInputOutput) {
    private lateinit var sec:Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun faseIncremental(){
        val numero = consola.pedir("Dime el numero de palabras que tendra la frase").toInt()
        sec = lineSequence(numero)
        var frase = ""
        sec.forEach {
            frase += if (frase.isEmpty()) it else " $it"
            consola.imprimir(frase)
        }
    }

    fun fraseFinal(){
        val numero = consola.pedir("Dime el numero de palabras que tendra la frase").toInt()
        sec = lineSequence(numero)
        var frase = ""
        mostarSec()
    }

    fun getSec()=sec.toList().joinToString(" ")


    fun mostarSec(){
        consola.imprimir(getSec())
    }
}