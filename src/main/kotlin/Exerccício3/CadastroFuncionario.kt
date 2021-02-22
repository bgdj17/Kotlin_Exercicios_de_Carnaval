package Exerccício3

class CadastroFuncionario(var funcionario: Funcionario) {

    var funcionarios = mutableListOf<Funcionario>()

    fun salvarFuncionario(): String {
        funcionarios.add(funcionario)
        return "Funcionário ${funcionario.nomeFuncionario} foi salvo com sucesso!"
    }
    fun buscarFuncionario(): Double {
        var busca = funcionarios.filter { it.idFuncionario == funcionario.idFuncionario }
        return busca[0].salarioAtualFuncionario
    }
}

