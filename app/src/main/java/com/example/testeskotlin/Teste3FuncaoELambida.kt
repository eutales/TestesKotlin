package com.example.testeskotlin

//Prática de funções e lambda
fun main(){
    val number1 = 10
    val number2 = 20
    //Chamada da função sum() - Dentro da string posso chamar a função utilizando ${funcao()}
    println("A soma de $number1 e $number2 resulta em: ${sum(number1, number2)}")

    //Chamada da função multiply() - Dentro da string posso chamar a função utilizando ${funcao()}
    println("A multiplicação de $number1 e $number2 resulta em: ${multiply(number1, number2)}")

    //Declarar uma variável sum2 e atribuir uma função lambda
    var sum2 = {number1: Int, number2: Int -> number1 + number2}
    println("A soma de $number1 e $number2 resulta em: ${sum2(number1, number2)}")


}

//Função que soma os dois números passador por parâmetro
//O retorno é um inteiro
//fun nome_da_função(parâmetro1: tipo, parâmetro2: tipo): tipo_retorno
fun sum(number1: Int, number2: Int): Int{
    return number1 + number2
}

//Criar função de multiplicação e passando o retorno na mesma linha com o operador = após os parâmetros
fun multiply(number1: Int, number2: Int) = number1 * number2






