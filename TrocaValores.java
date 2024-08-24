/*6) Escrever uma programa em que leia dois valores para as variáveis A e B, 
e efetuar as trocas dos valores de forma que a variável A passe a possuir o 
valor da variável B e a variável B passe a possuir o valor da variável A. 
Apresentar os valores trocados.

Lembrando que temos que ter 3 variáveis para que uma haja como variável de armazenamento, 
ou seja, para evitar que o valor original de a se perca é necessário associar a uma outra 
variável (denominada usualmente de variável auxiliar) tal valor, estabelecer uma associação 
de a com o valor em b e, por último, associar b ao valor "salvo" na variável auxiliar.*/

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int A, B, aux;

        // Leitura dos valores das variáveis
        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();

        // Exibindo os valores antes da troca
        System.out.println("Antes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Realizando a troca usando a variável auxiliar
        aux = A;  // Armazena o valor de A em aux
        A = B;    // A recebe o valor de B
        B = aux;  // B recebe o valor armazenado em aux (originalmente A)

        // Exibindo os valores após a troca
        System.out.println("Depois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        scanner.close();
    }
}
