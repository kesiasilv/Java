/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoanimal;

/**
 *
 * @author kesia.viana
 */

public class Passaro extends Animal {
    // Implementação do método abstrato fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O pássaro faz: Piu piu!");
    }
    
    // Implementação do método abstrato mover
    @Override
    public void mover() {
        if (isDormindo()) {
            System.out.println("O pássaro está dormindo e não pode voar.");
        } else {
            System.out.println("O pássaro está voando.");
        }
    }
}

