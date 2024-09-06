/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inforproduto;

/**
 *
 * @author kesia.viana
 */
public class Produto {
    private String nome;
    private String codigo;
    private double preco;

    // Construtor da classe Produto
    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    // Método para exibir apenas o nome do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }

    // Método para exibir o nome e o código do produto
    public void exibirInformacoes(boolean incluirCodigo) {
        if (incluirCodigo) {
            System.out.println("Nome: " + nome);
            System.out.println("Código: " + codigo);
        } else {
            exibirInformacoes(); // Chama o método que exibe apenas o nome
        }
    }

    // Método para exibir o nome, o código e o preço do produto
    public void exibirInformacoes(boolean incluirCodigo, boolean incluirPreco) {
        if (incluirCodigo && incluirPreco) {
            System.out.println("Nome: " + nome);
            System.out.println("Código: " + codigo);
            System.out.println("Preço: " + preco);
        } else {
            exibirInformacoes(incluirCodigo); // Chama o método que exibe nome e código
        }
    }
}


