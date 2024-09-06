/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoanimal;

/**
 *
 * @author kesia.viana
 */

public abstract class Animal {
    // Atributos privados (encapsulados)
    private boolean dormindo = false;
    
    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void fazerSom();
    
    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void mover();
    
    // Método concreto para dormir
    public void dormir() {
        dormindo = true;
        System.out.println("O animal está dormindo.");
    }
    
    // Método concreto para acordar
    public void acordar() {
        dormindo = false;
        System.out.println("O animal acordou.");
    }
    
    // Verificar se o animal está dormindo
    protected boolean isDormindo() {
        return dormindo;
    }
}
