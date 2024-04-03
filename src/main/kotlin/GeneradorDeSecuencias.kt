class GeneradorDeSecuencias(private var consola:IntInputOutput) {

    private lateinit var sec:Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun faseIncremental(numero: Int){
        sec = lineSequence(numero)
        var frase = ""
        sec.forEach {
            frase += if (frase.isEmpty()) it else " $it"
            consola.imprimir(frase)
        }
    }

    fun fraseFinal(numero: Int){
        sec = lineSequence(numero)
        mostarSec()
    }

    fun getSec()=sec.toList().joinToString(" ")

    fun mostarSec(){
        consola.imprimir(getSec())
    }
}