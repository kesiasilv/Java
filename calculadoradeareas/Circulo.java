/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoradeareas;

/**
 *
 * @author kesia.viana
 */
public class Circulo extends FormaGeometrica {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Getter e Setter para o raio
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Implementação do método abstrato calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
