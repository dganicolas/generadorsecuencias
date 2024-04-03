class GeneradorDeSecuencias(private var consola:IntInputOutput):IntgeneradorDeSecuencias {

    private lateinit var sec:Sequence<String>

     override fun lineSequence(limit: Int) = generateSequence { readln() }.constrainOnce().take(limit)

    override fun faseIncremental(numero: Int){
        sec = lineSequence(numero)
        var frase = ""
        sec.forEach {
            frase += if (frase.isEmpty()) it else " $it"
            consola.imprimir(frase)
        }
    }

    override fun fraseFinal(numero: Int){
        sec = lineSequence(numero)
        mostarSec()
    }

    override fun getSec()=sec.toList().joinToString(" ")

    override fun mostarSec(){
        consola.imprimir(getSec())
    }
}
