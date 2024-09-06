/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoanimal;

/**
 *
 * @author kesia.viana
 */
public class ProjetoAnimal {

    public static void main(String[] args) {
        // Criar instâncias das subclasses
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal passaro = new Passaro();
        
        // Testar métodos para Cachorro
        System.out.println("Cachorro:");
        cachorro.fazerSom();
        cachorro.mover();
        cachorro.dormir();
        cachorro.mover(); // Deve indicar que o cachorro não pode correr enquanto está dormindo
        cachorro.acordar();
        cachorro.mover(); // Deve indicar que o cachorro pode correr agora
        System.out.println("-------------------------------");
        
        
        // Testar métodos para Gato
        System.out.println("Gato:");
        gato.fazerSom();
        gato.mover();
        gato.dormir();
        gato.mover(); // Deve indicar que o gato não pode se esfregar enquanto está dormindo
        gato.acordar();
        gato.mover(); // Deve indicar que o gato pode se esfregar agora
        System.out.println();
        System.out.println("-------------------------------");
        
        // Testar métodos para Pássaro
        System.out.println("Pássaro:");
        passaro.fazerSom();
        passaro.mover();
        passaro.dormir();
        passaro.mover(); // Deve indicar que o pássaro não pode voar enquanto está dormindo
        passaro.acordar();
        passaro.mover(); // Deve indicar que o pássaro pode voar agora
        System.out.println();
    }
}




