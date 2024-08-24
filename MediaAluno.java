/*5) Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).*/
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Solicita as notas das três provas
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média aritmética
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe o nome do aluno e a sua média
        System.out.println("\nNome do aluno: " + nomeAluno);
        System.out.printf("Média das notas: %.2f\n", media);

        // Fecha o scanner
        scanner.close();
    }
}
