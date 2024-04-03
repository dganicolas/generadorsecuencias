class PedirNumero {
    fun pedirNumero(): Int {
        var numero:Int?
        do{
            println("Dime un numero")
            numero = readln().toIntOrNull()
        }while(numero == null)

        return numero
    }
}
