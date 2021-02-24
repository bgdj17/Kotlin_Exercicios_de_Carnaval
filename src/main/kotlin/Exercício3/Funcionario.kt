package Exercício3

open class Funcionario(
    private var idFuncionario: Int,
    private var nomeFuncionario: String,
    private var cpfFuncionario: Int,
    private var salarioFuncionario: Double,
) {

    open fun reajusteSalarial(): Double {
        return 0.0
    }

    open fun getSalario(): Double {
        return salarioFuncionario
    }

    open fun getSalarioAtual(): Double{
        return getSalario() + reajusteSalarial()
    }
    open fun getNome(): String {
        return nomeFuncionario
    }
    open fun getCpf(): String {
        return nomeFuncionario
    }
    open fun getId(): String {
        return nomeFuncionario
    }
    fun exibirInformacoes(){
        println("ID: ${idFuncionario}, Nome: ${nomeFuncionario}, CPF: ${cpfFuncionario}")
    }
}

class Gestor(id: Int, nome: String, cpf: Int, salarioAtual: Double) : Funcionario(id, nome,
    cpf, salarioAtual) {
    override fun reajusteSalarial(): Double {
        var reajuste = getSalario() * 0.1
        return reajuste
    }
}

class Programador(id: Int, nome: String, cpf: Int, salarioAtual: Double) : Funcionario(id, nome,
    cpf, salarioAtual) {
    override fun reajusteSalarial(): Double {
        var reajuste = getSalario() * 0.2
        return reajuste
    }
}