package com.mycompany.programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
       //cria um objeto teclado para ler a entrada do usuário
       Scanner teclado = new Scanner(System.in);
       //solictando o ano de nascimento e guardando
        System.out.print("Em que ano voce nasceu: ");
        int nasc = teclado.nextInt();
       //calculando a idade e imprimindo
        int i = 2024 - nasc;
        System.out.println("Sua idade e: " + i);
   
        //condicao para imprimir maior ou menor de idade
        if (i >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
