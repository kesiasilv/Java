/*4) Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas 
vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.*/

/*a comissão é uma porcentagem do total das vendas realizadas. Por exemplo, se um vendedor realiza vendas no total de R$ 10.000, 
e a comissão é de 15%, então a comissão seria calculada como:

Comissao = Total de Vendas × Taxa de Comissa

Portanto, com uma taxa de 15% e um total de vendas de R$ 10.000, a comissão seria:

Comissão = 10.000 × 0.15 = 1.500reais
*/
import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do vendedor
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        // Solicita o salário fixo do vendedor
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();

        // Solicita o total de vendas efetuadas no mês
        System.out.print("Digite o total de vendas efetuadas no mês: R$ ");
        double totalVendas = scanner.nextDouble();

        // Calcula a comissão (15% das vendas)
        double comissao = totalVendas * 0.15;

        // Calcula o salário final do mês
        double salarioFinal = salarioFixo + comissao;

        // Exibe o nome do vendedor, o salário fixo e o salário final
        System.out.println("\nResumo do Vendedor:");
        System.out.println("Nome: " + nomeVendedor);
        System.out.printf("Salário Fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Salário Final (incluindo comissão): R$ %.2f\n", salarioFinal);

        // Fecha o scanner
        scanner.close();
    }
}
