
package javaapplication4;


class Subtrai {

    static void subtrair() {
LeDados su = new LeDados();
    su.lerValores("Insira o primeiro valor", "Insira o segundo valor");
    System.out.println("Subtrair: "+
            (su.valor1 - su.valor2));    }   
}
    
