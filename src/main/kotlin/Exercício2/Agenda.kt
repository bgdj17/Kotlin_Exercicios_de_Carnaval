package Exercício2

class Agenda(){
    var agenda = mutableListOf<Contato>()

    fun salvarContato(nome: String, telefone: String): String{
        if(agenda.size <= 1) {
            var buscar = agenda.filter{it.contatoNome == nome && it.contatoTelefone == telefone}
            if(buscar.isEmpty()) {
                var contato = Contato(nome, telefone)
                agenda.add(contato)
                return "Contato Salvo com sucesso!"
            }
            else{
                return "Contato já existente!"
            }
        }
       else{
           return "Agenda está com sua capacidade máxima."
        }
    }
    fun getContatos() {
        for (contato in agenda) {
           println("Nome: ${contato.contatoNome}, telefone: ${contato.contatoTelefone}")
        }
    }
    fun deletarContato(nome: String): String{
       agenda.remove(agenda.filter { it.contatoNome == nome })
        return "Usuário ${nome} deletado com sucesso"
    }
    fun buscarContato(nome: String){
            var buscaContatoCad = agenda.filter { it.contatoNome == nome }
         println(buscaContatoCad.size)

    }
    fun totalContatos(): Int{
        return agenda.size
    }
}






