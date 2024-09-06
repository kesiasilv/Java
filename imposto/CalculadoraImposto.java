/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imposto;

/**
 *
 * @author kesia.viana
 */
public class CalculadoraImposto {

    // Atributos privados (encapsulados)
    private double salario;
    private double imposto;

    // Construtor
    public CalculadoraImposto(double salarioInicial) {
        this.salario = salarioInicial;
        calcular(); // Calcular imposto ao inicializar
    }

    // Método para calcular o imposto
    private void calcular() {
        if (salario <= 1903.98) {
            imposto = 0.0;
            System.out.println("Isento");
        } else if (salario <= 2826.65) {
            imposto = (salario * 0.075) - 142.80;
         
        } else if (salario <= 3751.05) {
            imposto = (salario * 0.15) - 354.80;
         
        } else if (salario <= 4664.68) {
            imposto = (salario * 0.225) - 636.13;
          
        } else {
            imposto = (salario * 0.275) - 869.36;
          
        }
    }

    // Métodos getter
    public double getSalario() {
        return salario;
    }

    public double getImposto() {
        return imposto;
    }

}

    

