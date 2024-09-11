/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author kesia.viana
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
// Main.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o número de matrícula do aluno: ");
            String matricula = scanner.nextLine();

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consome o '\n' após o número

            Aluno aluno = new Aluno(matricula, nota);
            alunos.add(aluno);

            System.out.print("Deseja adicionar outro aluno? (s/n): ");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("s");
        }

        System.out.println("\nConceitos Finais dos Alunos:");
        for (Aluno aluno : alunos) {
            System.out.printf("Matrícula: %s, Nota: %.1f, Conceito: %s%n", 
                              aluno.getMatricula(), aluno.getNota(), aluno.Conceito());
        }

        scanner.close();
    }
}


