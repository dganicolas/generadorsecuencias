class InputOutput: IntInputOutput {
    override fun imprimir(mensaje: String,salto:Boolean){
        if (salto) print(mensaje)
        else println(mensaje)
    }
    override fun pedir(mensaje: String):String{
        println(mensaje)
        return readln()
    }
}

