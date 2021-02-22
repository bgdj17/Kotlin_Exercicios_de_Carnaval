package Exerccício3

fun  entradasUsusario(){

    println("Digite o id do funcionário:")
    var id = readLine()!!
    println("Digite o nome do funcionário:")
    var nome= readLine()!!
    println("Digite o cpf do funcionário:")
    var cpf = readLine()!!
    println("Digite o Salario do funcionário:")
    var salario = readLine()!!
    println("Cargo: Digite 1 - Progamador, 2-  Gestor")
    var cargo = readLine()!!

    var  funcionario = Programador(id?.toInt(), nome, cpf.toInt(), salario.toDouble())
    var cadastroFuncionario = CadastroFuncionario(funcionario)

    if(cargo == "1"){
      var  programador = Programador(funcionario.idFuncionario, funcionario.nomeFuncionario, funcionario.cpfFuncionario, funcionario.salarioAtualFuncionario)
        print(cadastroFuncionario.salvarFuncionario())
        println(funcionario.reajusteSalarial())

    }
    if(cargo == "2"){
        var  programador = Gestor(funcionario.idFuncionario, funcionario.nomeFuncionario, funcionario.cpfFuncionario, funcionario.salarioAtualFuncionario)
        cadastroFuncionario.salvarFuncionario()
    }





}


