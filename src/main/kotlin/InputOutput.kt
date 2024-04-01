class InputOutput: IntInputOutput {
    override fun imprimir(mensaje: String,salto:Boolean){
        println(mensaje)
    }
    override fun pedir(mensaje: String):String{
        println(mensaje)
        return readln()
    }
}

