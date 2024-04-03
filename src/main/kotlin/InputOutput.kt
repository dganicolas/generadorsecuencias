class InputOutput: IntInputOutput {

    override fun imprimir(mensaje: String,salto:Boolean){
        if (salto) print(mensaje)
        else println(mensaje)
    }

    override fun pedir(mensaje: String):Int{
        var numero:Int?

        do{
            print(mensaje)
            numero = readln().toIntOrNull()
        }while(numero == null)

        return numero
    }

}

