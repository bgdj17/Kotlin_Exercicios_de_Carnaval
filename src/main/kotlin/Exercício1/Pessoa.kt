package Exercício1

class Pessoa(private var nome: String, private var dataDeNascimento: String, private var altura: Double){
    fun getNome(): String {
        return nome
    }
    fun getDatadeNascimento(): String{
        return dataDeNascimento
    }
    fun getAltura(): Double{
        return altura
    }
    fun getDados():String {
        return "${nome} nasceu em ${dataDeNascimento}, tem ${calculoIdade()} anos de idade e possui ${altura}."
    }
    fun calculoIdade():Int{
        return 58
    }

}