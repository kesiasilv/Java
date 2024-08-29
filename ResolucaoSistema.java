package com.mycompany.resolucaosistema;

import java.awt.Dimension;//Importa a classe Dimension do pacote java.awt, que representa a largura e a altura de um componente gráfico.
import java.awt.Toolkit;//Importa a classe Toolkit do pacote java.awt, usada para obter informações sobre o ambiente gráfico.

public class ResolucaoSistema {

    public static void main(String[] args) {
       Toolkit tk = Toolkit.getDefaultToolkit();//Obtém o Toolkit padrão do sistema, que fornece métodos para obter informações sobre o ambiente gráfico.
       Dimension d = tk.getScreenSize();//Obtém um objeto Dimension que contém a largura e a altura da tela do sistema.
       System.out.println("A resolução do seu sistema é: " + d.width + " X " + d.height);//Imprime a resolução da tela, combinando a largura (d.width) e a altura (d.height) obtidas do objeto Dimension
    }
}
