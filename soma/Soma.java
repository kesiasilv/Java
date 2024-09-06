/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma;

/**
 *
 * @author kesia.viana
 */

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        double num1;
        double num2;
        

        //Ler o primeiro número
            System.out.print("Digite o primeiro número se for decimal separado por virgula: ");
            num1 = scanner.nextDouble();
              
        // Ler o segundo número
           System.out.print("Digite o segundo número se for decimal separado por virgula: ");
            num2 = scanner.nextDouble();
              
        // Realizar a soma 
            System.out.printf("Resultado da soma: %.2f", calc.soma(num1, num2));
       
        // Fechar o scanner
        scanner.close();
    }
}
