/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author kesia.viana
 */
public class Caneta {
    String modelo;//ATRIBUTOS
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void Caracteristicas(){//METÓDO
        System.out.println("Modelo: " + this.modelo);// this. Esta referenciando ao prorpio metodo!!
        System.out.println("Uma caneta " + this.cor); // ou seja nesse metodo chamado caracteristicas eu quis dizer, a caracteristica da caneta modelo será ...., a caracteristica da caneta cor sera ..., e assim por diante
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);// tambem é uma caracterisica que logo a baixo foi usado como parametro para determinar se é verdadeiro ou falso nos metodos criados
    }
    void rabiscar(){// a partir da condição determinará sua saida:
        if(this.tampada == true){// se a caracterista tampada for verdadeiro ou seja se for (chamada do seu metodo tampar) nao podera rabiscar
            System.out.println("NÃO posso rabiscar!!");
        }else//se a caracterista tampada for falsa ou seja se ela for chamada do seu metodo destampada Ela podera rabiscar
            System.out.println("Estou Rabiscando!!!"); 
    }
    void tampar(){// metodo criado para reeceber o atributo tampada como verdadeiro
        this.tampada = true;
    }
    void destampar(){// metodo criado para receber o atributo tampada como falso
        this.tampada = false;
    }
    
  }
    

