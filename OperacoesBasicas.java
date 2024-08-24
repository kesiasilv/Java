//2) Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcula as operações
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = 0;

        // Verifica se o segundo número não é zero antes de realizar a divisão
        if (num2 != 0) {
            divisao = num1 / num2;
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        // Exibe os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
        }

        // Fecha o scanner
        scanner.close();
    }
}
