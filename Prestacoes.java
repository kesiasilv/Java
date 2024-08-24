/*10) A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações 
sem juros. Faça um programa que receba um valor de uma compra e mostre o valor das prestações.*/

import java.util.Scanner;

public class ParcelamentoCompra {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor total da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorTotal = scanner.nextDouble();

        // Número de prestações
        int numeroPrestacoes = 5;

        // Calcula o valor de cada prestação
        double valorPrestacao = valorTotal / numeroPrestacoes;

        // Exibe o valor de cada prestação
        System.out.printf("Valor de cada prestação: R$ %.2f\n", valorPrestacao);

        // Fecha o scanner
        scanner.close();
    }
}
