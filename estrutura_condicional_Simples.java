package com.mycompany.programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
       //cria um objeto teclado para ler a entrada do usuário
       Scanner teclado = new Scanner(System.in);
       //solictando as notas e guardando
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
       
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        //calculando a media e imprimindo
        float m = (n1 + n2)/2;
        System.out.println("Sua media foi " + m);
       
        //condicao para imprimir os parabens caso a sua media seja maior q 9
        if (m > 9){
            System.out.println("Parabens, pequeno gafanhoto!!");
        }
    }
}
