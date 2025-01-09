package com.example.testeskotlin

    //Prática de variáveis mutáveis e imutáveis.
    fun main(){
        //Variável mutável declara com var
        var age: Int = 90;
        age = 78;

        //Variáveis imutáveis (constantes?) declara com val
        val name: String = "Tales";

        val score : Int = 90;
        val price : Double = 9.99;
        val rate: Float = 8f;

        // Kotlin entende implicitamente o tipo da variável
        val pontos = 90;

        //Boolean
        val isValid: Boolean = true

        //Arrays em kotlin - Array<Tipo> = populando com arrayof
        val numbers: Array<Int> = arrayOf(0,1,2,3,4,5)

        //Acessar valores do vetor semelhantes ao java
        numbers[0] = 6

        //Variáveis em Kotlin possuem tipos nulo e não nulo;
        var nullableString : String? = null
        println(nullableString?.length ?: 0)

    }
