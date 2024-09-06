/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inforproduto;

/**
 *
 * @author kesia.viana
 */
  import java.util.Scanner;

public class InforProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //para coletar o nome do produto
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        
        //para coletar o codigo do produto
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        
        //para coletar o preco do produto
        System.out.print("Digite o preço do produto: ");
        double preco;
        preco = scanner.nextDouble();
               
        // Criar uma instância de Produto com as informações fornecidas
        Produto produto = new Produto(nome, codigo, preco);

        // Exibir informações sobre o produto
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Informações do Produto:");
        System.out.println("--------------------------");
       
        System.out.println("Apenas o nome:");
        produto.exibirInformacoes();
        System.out.println("--------------------------");
     
        System.out.println("Nome e código:");
        produto.exibirInformacoes(true);
        System.out.println("--------------------------");
       
        System.out.println("Nome, código e preço:");
        produto.exibirInformacoes(true, true);

        // Fechar o scanner
        scanner.close();
    }
}




