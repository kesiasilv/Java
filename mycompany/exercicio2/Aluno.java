/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author kesia.viana
 */
    // Aluno.java
public class Aluno {
    private String matricula;
    private double nota;

    // Construtor
    public Aluno(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    // Métodos Getter e Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para determinar o conceito baseado na nota
    public String Conceito() {
        if (nota >= 0.0 && nota <= 4.9) {
            return "D";
        } else if (nota >= 5.0 && nota <= 6.9) {
            return "C";
        } else if (nota >= 7.0 && nota <= 8.9) {
            return "B";
        } else if (nota >= 9.0 && nota <= 10.0) {
            return "A";
        } else {
            return "Nota inválida";
        }
    }
}


