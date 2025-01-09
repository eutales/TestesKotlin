package com.example.testeskotlin

//Criando tipo complexo (data class)
data class Pessoa(val nome : String, val idade: Int)

fun main(){

// Criando lista de pessoas com list explicito de tipos.
    val pessoas: List<Pessoa> = listOf<Pessoa>(
        Pessoa("Lucas", 18),
        Pessoa("Maria", 30),
        Pessoa("Pedro", 40),
        Pessoa("Ana", 12),
        Pessoa("Jose", 60)

            )

    //Filtrar pessoas por idade maior que 25 usando a extensão it?
    // declarando a variável pessoasMaioresDe25 como uma lista de pessoas explicito
    // declaração não explicita: val pessoasMaioresDe25 = pessoas.filter { it.idade > 25 }
    val pessoasMaioresDe25: List<Pessoa> = pessoas.filter { it.idade > 25 }

    //Mostrando na tela as pessoas maiores que 25
    //Usando $ é possível chamar uma variável dentro de uma string.
    println("Pessoas maiores de 25 anos: $pessoasMaioresDe25")

    // Mapear os nomes das pessoas com filtro pelo nome
    val nomesDasPessoas = pessoas.map {it.nome}
    println("Nomes das pessoas: $nomesDasPessoas")

    // Verificar se todoas as pessoas tem idade maior que 10 (verdadeiro e falso)
    val todasPessoasTemIdadeMaiorQue10 = pessoas.all { it.idade > 10 }
    println("Todas as pessoas tem idade maior que 10? $todasPessoasTemIdadeMaiorQue10")

    //Encontrar a primeira pessoa com idade maior que 30
    val primeiraPessoaComIdadeMaiorQue30 = pessoas.find { it.idade > 30 }
    println("Primeira pessoa com idade maior que 30: $primeiraPessoaComIdadeMaiorQue30")

    //Ordenar pessoas por idade (sortedBy)
    val pessoasOrdenadasPorIdade = pessoas.sortedBy { it.idade }
    println("Pessoas ordenadas por idade: $pessoasOrdenadasPorIdade")

    //Verificar se existe alguém chamado "Lucas" na lista das pessoas
    val existeLucas = pessoas.any { it.nome == "Lucas" }
    println("Existe alguém chamado Lucas? $existeLucas")

    //Contar quantas pessoas com idade maior que 30
    val quantidadePessoasComIdadeMaiorQue30 = pessoas.count { it.idade > 30 }
    println("Quantidade de pessoas com idade maior que 30: $quantidadePessoasComIdadeMaiorQue30")

    // Imprimir lista pessoas em uma string separadas por vírgula
    val listaPessoasEmString = pessoas.joinToString(separator = ", ") { it.nome }
    println("Lista de pessoas em uma string separados por vírgula: $listaPessoasEmString")


    //Agrupar pessoas por idade (groupBy)
    val pessoasAgrupadasPorIdade = pessoas.groupBy { it.idade }
    println("Pessoas agrupadas por idade: $pessoasAgrupadasPorIdade")






}