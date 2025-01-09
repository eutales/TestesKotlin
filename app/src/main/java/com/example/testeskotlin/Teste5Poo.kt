package com.example.testeskotlin

//Práticas de POO
//Como declarar uma interface no Kotlin (
interface Alimentavel {
    fun comer() //método abstrato (que precisa ser implementado nas subclasses)

}

//Criando classe abstrata animal, parametro nome que possui uma interface Alimentavel
abstract class Animal (val nome: String) : Alimentavel {
    abstract fun emitirSon() //Método abstrato
}
//Classe Cachorro filha de classe Animal e implementação dos dois métodos.
class Cachorro(nome: String): Animal(nome) {
    override fun emitirSon() { // Método sobrescrito
        println("$nome latiu!")
    }

    override fun comer() {
        println("$nome comeu!")
    }

    fun passear(){
        println("$nome esta passeando com seu dono!")

    }

}

//Classe Gato filha de classe Animal e implementação dos dois métodos.
class Gato(nome: String) : Animal(nome) {
    override fun emitirSon() {
        println("$nome miou!")
    }

    override fun comer() {
        println("$nome comeu!")
    }

}

fun main(){

    //Criando objeto cachorro do tipo Cachorro passando para o construtor o nome.
    val cachorro = Cachorro("Doriana")
    //Chamando o método exclusivo da classe cachorro
    cachorro.passear()

    //Chamando demais métodos herdados.
    cachorro.emitirSon()
    cachorro.comer()

    //Testando exemplos com o Gato.
    val gato = Gato("Jolteon")
    gato.comer()
    gato.emitirSon()


}