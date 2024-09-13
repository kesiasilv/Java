/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02;

/**
 *
 * @author kesia.viana
 */
public class Aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta(); // CRIANDO UMA CANETA (INSTANCIANDO O OBJETO)'c1' A PARTIR DO SEU MODELO(CALSSSE)CANETA!
        c1.modelo = "bic";// argumentos para os atributos da classe 
        c1.cor = "Preta";// ||
        c1.ponta = 0.5f;// ||
        c1.carga = 5;// ||
        
        System.out.println("==== Caneta 1 ==== ");// apenas para dizer que caneta é 
        
        c1.Caracteristicas();// mostra as caracteristicas da caneta com os atributos designados 
        c1.tampar();// A caneta esta tampada, = true
        c1.rabiscar();// Por ela esta tampada nao podera rabiscar entao = false
        // está caneta recebera a seguinte saida: 
        //Modelo: bic
        //Uma caneta Preta
        //Ponta: 0.5
        //Está tampada? false
        //NÃO posso rabiscar
        
        System.out.println("\n");// apenas para separa as duas canetas criadas
        
        //CRIANDO UMA NOVA CANETA PARA COLOCAR NOVOS ATRIBUTOS
        Caneta c2 = new Caneta();
        System.out.println("==== Caneta 2 ====");
        c2.modelo = "HostNet";
        c2.cor = "Rosa";
        c2.ponta = 0.3f;
        c2.carga = 8;
        
        c2.Caracteristicas();
        c2.destampar();
        c2.rabiscar();
        
                
    }

}
