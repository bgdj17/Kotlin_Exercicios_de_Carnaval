package Exercício2

fun iterarUsuario() {
    var agenda = Agenda()

    do {
        var nomeContato: String = ""
        var telefone: String = ""

        println("1 - Adicionar, 2 - Remover, 3 - Buscar Contato, 4 - Todos contatos ")
        var acao = readLine().toString()

        if (!(acao == "1" || acao == "2" || acao == "3" || acao == "4")) {
            println("Digite um opção válida")
        } else {
            var validarNome = false

            if (acao != "4") {
                println("Digite o nome do contato.")
                nomeContato = readLine()!!

                if (nomeContato.isNotBlank()) {
                    agenda.nome = nomeContato
                    validarNome = true

                } else {
                    println("Digite um nome válido")
                }

                if (acao != "3" && validarNome) {
                    println("Digite o número do telefone")
                    telefone = readLine().toString()
                    agenda.tel = telefone
                }
            }
            if (validarNome) {
                if (acao == "1") {
                    println(agenda.salvarContato())
                }
                if (acao == "2") {
                    println(agenda.deletarContato())
                }
                if (acao == "3") {
                    println(agenda.getContato())
                }
                if (acao == "4") {
                    agenda.getContatos()
                }
            }
        }
        println("Para sair digite E(Exit)")
        var opcao = readLine()

    } while (opcao != "e" && opcao != "E")
}




