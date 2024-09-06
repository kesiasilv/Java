/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imposto;

/**
 *
 * @author kesia.viana
 */
import java.util.Scanner;
public class Imposto {
    
    public static void main(String[] args) {
        // Criando uma instância do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o salário bruto
        System.out.print("Digite seu salário bruto: R$ ");
        double salario = scanner.nextDouble();
        System.out.println();

        // Criando uma instância de ImpostodeRenda com o salário fornecido
        CalculadoraImposto imposto = new CalculadoraImposto(salario);

        // Exibindo os resultados
        System.out.println("Salário: R$ " + imposto.getSalario());
        System.out.printf("Imposto: R$ %.2f ", imposto.getImposto());

        // Fechar o scanner
        scanner.close();
    }

}


