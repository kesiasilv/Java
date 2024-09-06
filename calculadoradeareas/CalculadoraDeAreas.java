/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoradeareas;

/**
 *
 * @author kesia.viana
 */
    import java.util.Scanner;

public class CalculadoraDeAreas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada para o quadrado
        System.out.print("Digite o comprimento do lado do quadrado: ");
        double lado = scanner.nextDouble();
        Quadrado quadrado = new Quadrado(lado);

        // Entrada para o retângulo
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(largura, altura);

        // Entrada para o círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        Circulo circulo = new Circulo(raio);

        // Calculando e exibindo as áreas
        System.out.printf("\nÁrea do quadrado: %.2f", quadrado.calcularArea());
        System.out.printf("\nÁrea do retângulo: %.2f ", retangulo.calcularArea());
        System.out.printf("\nÁrea do círculo: %.2f", circulo.calcularArea());

        // Fechar o scanner
        scanner.close();
    }
}





