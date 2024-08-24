/*8) Elaborar um programa que efetue a apresentação do valor da conversão em real (R$)
de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar
e também a quantidade de dólares disponíveis com o usuário.*/

import java.util.Scanner;

public class ConversaoDolarParaReal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor da cotação do dólar
        System.out.print("Digite a cotação do dólar (em R$ por US$): ");
        double cotacaoDolar = scanner.nextDouble();

        // Solicita a quantidade de dólares disponíveis
        System.out.print("Digite a quantidade de dólares disponíveis: US$ ");
        double quantidadeDolares = scanner.nextDouble();

        // Calcula o valor em reais
        double valorEmReais = quantidadeDolares * cotacaoDolar;

        // Exibe o valor convertido em reais
        System.out.printf("Valor em reais: R$ %.2f\n", valorEmReais);

        // Fecha o scanner
        scanner.close();
    }
}
