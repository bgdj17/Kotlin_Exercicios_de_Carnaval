package Exercício3

fun entradasUsusario() {

    println("Digite o id do funcionário:")
    var id = readLine()!!
    println("Digite o nome do funcionário:")
    var nome = readLine()!!
    println("Digite o cpf do funcionário:")
    var cpf = readLine()!!
    println("Digite o Salario do funcionário:")
    var salario = readLine()!!
    println("Cargo: Digite 1 - Progamador, 2-  Gestor")
    var cargo = readLine()!!



    if (cargo == "1") {
        var programador = Programador(id.toInt(), nome, cpf.toInt(), salario.toDouble())
        programador.exibirInformacoes()
        println("Valor do reajuste: ${programador.getSalarioAtual()}")

    }
    if (cargo == "2") {
        var gestor = Gestor(id.toInt(), nome, cpf.toInt(), salario.toDouble())
        gestor.exibirInformacoes()
        gestor.getSalarioAtual()

    }
}
