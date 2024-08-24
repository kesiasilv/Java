/*3) Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total 
percorrida pelo automóvel e o total de combustível gasto.*/
import java.util.Scanner;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a distância total percorrida
        System.out.print("Digite a distância total percorrida (em km): ");
        double distancia = scanner.nextDouble();

        // Solicita ao usuário o total de combustível gasto
        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();

        // Verifica se o total de combustível gasto é maior que zero para evitar divisão por zero
        if (combustivel <= 0) {
            System.out.println("O total de combustível gasto deve ser maior que zero.");
        } else {
            // Calcula o consumo médio
            double consumoMedio = distancia / combustivel;

            // Exibe o resultado
            System.out.printf("O consumo médio do automóvel é: %.2f km/l\n", consumoMedio);
        }

        // Fecha o scanner
        scanner.close();
    }
}
