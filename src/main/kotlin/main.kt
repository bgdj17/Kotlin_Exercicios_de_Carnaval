import Exercício1.Pessoa

import java.time.LocalDate
fun main() {

    var alunos = Aluno(nome="Bruna",turma="201A", ra="123")
    var aluno1 = Aluno(nome="Bruna",turma="201A", ra="1234")
    var aluno2 = Aluno(nome = "Isis", turma = "101B", ra="333")
    println("${aluno1.nome}  ${aluno1.turma}")
    aluno1.olaAluno()
    aluno2.olaAluno()


    var pessoa1 = Pessoa("Bruna", "17/01/1986", 1.76)
    println(pessoa1.getDados())
}