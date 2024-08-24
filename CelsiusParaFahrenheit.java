/*7) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Converte a temperatura para graus Fahrenheit
        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        // Exibe a temperatura convertida
        System.out.printf("Temperatura em Fahrenheit: %.2f\n", temperaturaFahrenheit);

        // Fecha o scanner
        scanner.close();
    }
}
