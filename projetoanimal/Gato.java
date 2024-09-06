/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoanimal;

/**
 *
 * @author kesia.viana
 */

public class Gato extends Animal {
    // Implementação do método abstrato fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }
    
    // Implementação do método abstrato mover
    @Override
    public void mover() {
        if (isDormindo()) {
            System.out.println("O gato está dormindo e não pode se esfregar.");
        } else {
            System.out.println("O gato está se esfregando.");
        }
    }
}

