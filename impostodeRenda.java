/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

import java.util.Scanner;

/**
 *
 * @author kesia.viana
 */
public class ImpostodeRenda {
    
        Scanner sc = new Scanner (System.in);

     // Atributos privados (encapsulados)
    public double salario;
    public double imposto;

    // Construtor
    public ImpostodeRenda( double salarioinicial) {
        this.salario = salarioinicial;
    }
    
    // Getter para obter o salario
    public double getSalario() {
        double s = sc.nextDouble();
        return s;
    }

    // Método para depositar dinheiro na conta
    public double calcular(double s) {
        if (s <= 1903.98) {
           System.out.println("insento");
        }
        else if(s <= 2826.65){
            imposto = (s * 0.075) - 142.80;
             System.out.printf("imposto : %.2f", imposto);
        }
         else if(s <= 3751.05){
            imposto = (s * 0.15) - 354.80;
             System.out.printf("\nimposto : %.2f", imposto);
        }
         else if(s <= 4664.68){
            imposto = (s *  0.225) - 636.13;
             System.out.printf("\nimposto : %.2f", imposto);
        }
         else if(s > 4665.68){
            imposto = (s * 0.275) - 869.36;
             System.out.printf("\nimposto : %.2f", imposto);
        }
        return 0;
    }
    
}
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio;

/**
 *
 * @author kesia.viana
 */
public class Exercicio {

    public static void main(String[] args) {
       
        // Criando uma instância de ContaBancaria
         ImpostodeRenda imposto = new ImpostodeRenda(0);

        // Utilizando os métodos públicos para interagir com o objeto
        
        // Obtendo informações encapsuladas
        System.out.println("escreva seu salario ");
        double salarioFinal=imposto.getSalario();
        System.out.println("Salario: R$ " + salarioFinal);
        imposto.calcular(salarioFinal);    
    }
         
}

 
