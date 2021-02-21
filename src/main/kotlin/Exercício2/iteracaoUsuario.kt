package Exercício2


fun iterarUsuario(){
        var agenda = Agenda()

    do {

        var nomeContato: String = ""
        var telefone: String = ""

        println("1 - Adicionar, 2 - Remover, 3 - Buscar Contato, 4 - Todos contatos " )

        var acao = readLine()

        if(acao !="4") {
            println("Digite o nome do contato.")
            nomeContato = readLine().toString()

            println("Digite o número do telefone")
            telefone = readLine().toString()
        }

        if(acao == "1"){
            println(agenda.salvarContato(nomeContato, telefone))
        }
        if (acao== "2"){
            println(agenda.deletarContato(nomeContato))
        }
        if (acao== "3"){
            println(agenda.buscarContato(nomeContato))
        }
        if(acao =="4"){
            println(agenda.getContatos())
        }

    println("Deseja continuar? Exit(E)")
        var opcao = readLine()

    }while(opcao != "e" && opcao !="E")


}




