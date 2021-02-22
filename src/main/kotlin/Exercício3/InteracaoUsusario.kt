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
        println(programador.getSalario())
        println(programador.reajusteSalarial())
        println(programador.getSalarioAtual())
    }
    if (cargo == "2") {
        var gestor = Gestor(id.toInt(), nome, cpf.toInt(), salario.toDouble())
        println(gestor.getSalario())
        println(gestor.reajusteSalarial())
        println(gestor.getSalario())

    }


}


