package com.example.testeskotlin

//Controle de fluxo
fun main(){
    //declarando variável dia da semana
    val diaDaSemana = 3;

    //Testando o controle de fluxo when em kotlin
    //Sintaxe do operador when

    //when(variavel){
    //  caso1 -> ação1
    //  caso2 -> ação2
    //  else -> ação3
    //  }

    val NomediaDaSemana = when(diaDaSemana){
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Dia inválido"

    }

    println("O dia da semana é $NomediaDaSemana")

    //exemplo do while
    /* var contador = 0
    while (contador < 3){
        println("Contador: $contador")
        contador++
    }
     */

    var contador = 0
    while (contador < 3){
        println("Contador: $contador")
        contador++

    }

    val listaDeFrutas = listOf("Maçã", "Banana", "Laranja")
    for (fruta in listaDeFrutas){
        println("Fruta: $fruta")
    }

    //Chamando a função fazerLogin passando os parametros
    println("Usuário logado: ${fazerLogin("admin", "1234")}")
    println("Usuário logado: ${fazerLogin("admi123", "1234")}")



}

//Criando função fazer login passando dois parametros String e definindo o retorno Boolean
fun fazerLogin (usuario: String, senha: String): Boolean{
    if (usuario == "admin" && senha == "1234"){
        return true
    }
    return false
}