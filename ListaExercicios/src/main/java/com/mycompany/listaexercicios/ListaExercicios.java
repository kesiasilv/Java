/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;

import java.util.Scanner;

public class ListaExercicios {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double soma = num1 + num2;

        // Exibe o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}
