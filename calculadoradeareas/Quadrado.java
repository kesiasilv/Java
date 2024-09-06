package com.mycompany.calculadoradeareas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kesia.viana
 */

    public class Quadrado extends FormaGeometrica {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Getter e Setter para o lado
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Implementação do método abstrato calcularArea
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

    
