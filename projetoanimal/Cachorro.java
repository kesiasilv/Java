/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoanimal;

/**
 *
 * @author kesia.viana
 */

public class Cachorro extends Animal {
    // Implementação do método abstrato fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au au!");
    }
    
    // Implementação do método abstrato mover
    @Override
    public void mover() {
        if (isDormindo()) {
            System.out.println("O cachorro está dormindo e não pode correr.");
        } else {
            System.out.println("O cachorro está correndo.");
        }
    }
}


    

