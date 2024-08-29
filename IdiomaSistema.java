package com.mycompany.idiomasistema;

import java.util.Locale;//Importa a classe Locale do pacote java.util, que fornece informações sobre o idioma

public class IdiomaSistema {

    public static void main(String[] args) {
      Locale loc = Locale.getDefault();//Obtém o Locale padrão do sistema, que representa a configuração regional do sistema (incluindo idioma e região).
        System.out.println("O idioma do Sistema é: ");//Imprime a string "O idioma do sistema é ".
        System.out.println(loc.getDisplayLanguage());//Imprime o idioma configurado no sistema.retorna o nome do idioma (por exemplo, "Português")
    }
}
