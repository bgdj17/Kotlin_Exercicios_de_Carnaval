package Exercício1

import java.text.SimpleDateFormat
import java.time.*
import java.time.format.DateTimeFormatter

class Pessoa(private var nome: String, private var dataDeNascimento: String, private var altura: Double) {
    fun getNome(): String {
        return nome
    }

    fun getDatadeNascimento(): String {
        return dataDeNascimento
    }

    fun getAltura(): Double {
        return altura
    }

    fun getDados(): String {
        return "${nome} nasceu em ${dataDeNascimento}, tem ${calculoIdade()} anos de idade e possui ${altura}m de altura."
    }

    fun calculoIdade(): Int {
        var formatDate = SimpleDateFormat("dd/MM/yyyy")
        var birthDate = formatDate.parse(dataDeNascimento)
        var formatUs = SimpleDateFormat("yyyy-MM-dd")
        var format = DateTimeFormatter.ISO_LOCAL_DATE
        var convertDate = LocalDate.parse(formatUs.format(birthDate), format)

        return Period.between(convertDate, LocalDate.now()).years
    }
}


