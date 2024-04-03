interface IntInputOutput{

    fun imprimir(mensaje: String,salto:Boolean=false)

    fun pedir(mensaje: String):Int

}
interface IntMenu{
    fun mostrarMenu()

    fun escogeropcion()
}
interface IntgeneradorDeSecuencias{
    fun lineSequence(limit: Int = Int.MAX_VALUE): Sequence<String>
    fun faseIncremental(numero: Int)
    fun fraseFinal(numero: Int)
    fun mostarSec()
    fun getSec():String
}