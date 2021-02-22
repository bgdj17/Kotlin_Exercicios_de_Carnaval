package Exerccício3

class CadastroFuncionario(var funcionario: Funcionario) {

    var funcionarios = mutableListOf<Funcionario>()

    fun salvarFuncionario(): String {
        funcionarios.add(funcionario)
        return "Funcionário ${funcionario.getNome()} foi salvo com sucesso!"
    }
    fun buscarFuncionario() {
        var busca = funcionarios.filter { it.getId() == funcionario.getId() }
        busca.forEach { println("Nome ${it.getNome()}, Salário ${it.getSalario()}.")}
    }
}

