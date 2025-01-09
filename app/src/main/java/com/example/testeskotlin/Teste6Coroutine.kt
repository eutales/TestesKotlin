package com.example.testeskotlin

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Prática de coroutine (fluxo assíncrono)
//Sintaxe de coroutine
//suspend fun nome_da_função(parâmetro1: tipo, parâmetro2: tipo): tipo_retorno

// Criando função assíncrona
suspend fun doSomething (delayTime: Long, message: String){
    delay(delayTime)
    println(message)
}

fun main(){
    //Lembrete CONTEXTO COROUTINE
    //Criando os JOBS
    val job1 = GlobalScope.launch {
        doSomething(3000, "Tarefa 1 concluída")

    }

    val job2 = GlobalScope.launch {
        doSomething(2000, "Tarefa 2 Concluída")

    }

    val job3 = GlobalScope.launch {
        doSomething(1000, "Tarefa 3 Concluída")

    }

    //Criar thread para chamar os jobs
    runBlocking {
        job1.join()
        job2.join()
        job3.join()
    }


}