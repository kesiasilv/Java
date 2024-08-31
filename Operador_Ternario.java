package com.mycompany.operadorternario;

public class OperadorTernario {
/*é quando possuui 3 componeentes
**nesse caso os tres componentes são oque esta antes da ? oque ta depois da ?
**e oque esta depois dos : 
**/
    public static void main(String[] args) {
       int n1, n2, r;
       n1 = 14;
       n2 = 18;
       r = (n1>n2)?n1+n2:n1-n2;
       //r recebe o valor de acordo com a condição se ela for verdadeira será n1 + n2, caso contrario sera n1 - n2
        System.out.println(r);//saída esperada -4
    }
}
