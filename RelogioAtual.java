package com.mycompany.primeiroprograma;

import java.util.Date;//Importa a classe Date - usada para trabalhar com datas e horas

public class PrimeiroPrograma { //define a classe publica chamada PrimeiroPrograma

    public static void main(String[] args) {//Define o método main (ponto de entrada do programa)
        
        Date relogio = new Date();//Cria um novo objeto main que representa a data e hora atuais do sistema.
        System.out.println("A hora do sistema é: ");// Imprime a string "A hora do sistema é "
        
        System.out.println(relogio.toString());// Imprime a representação em string da data e hora atuais. O método toString() da classe Date 
    }
}
