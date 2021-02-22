package Exerccício3

open class Funcionario(var idFuncionario: Int, var nomeFuncionario: String, var cpfFuncionario: Int, var salarioAtualFuncionario: Double) {

    fun reajusteSalarial(){
        salarioAtualFuncionario = salarioAtualFuncionario * 0.1
    }

}
class Gestor(id: Int, nome: String, cpf: Int, salarioAtual: Double) :Funcionario(id, nome,
    cpf,    salarioAtual){

}
class Programador(id: Int, nome: String, cpf: Int, salarioAtual: Double) :Funcionario(id, nome,
    cpf,    salarioAtual){

}