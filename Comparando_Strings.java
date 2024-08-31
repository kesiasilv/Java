package com.mycompany.comparacaostring;

public class ComparacaoString {
    //comparando Strings
    //para objetos em vez do == usa-se .equals
    public static void main(String[] args) {
       String nome1 = "gustavo";
       String nome2 = "gustavo";
       String nome3 = new String("gustavo");
       String res;
       //testes realizados::
       //teste01
       /*res = (nome1 == nome2)? "igual" : "diferente";
        System.out.println(res);//**saida: igual**
       pois sua estrutura e o conteudo sao iguais*/

       //teste02
       /*res = (nome1 == nome3)? "igual" : "diferente";
       System.out.println(res);//**saida: diferente**
       pois apesar do conteudo ser igual o nome3 foi istanciado com clausula new,
       logo sua estrutura é diferente!*/

       //teste03
       /*res = (nome1.equals(nome3))? "igual" : "diferente";
       System.out.println(res);//**saida: igual**
       a verificacão agora foi feita pelo conteudo, isto porque
       o (.equals) verififca o conteudo da string nome1 da string nome3
       e como sao iguais a saida foi igual*/
    }
