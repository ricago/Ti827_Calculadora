
package javaapplication4;


class Soma {

    static void somar() {
    LeDados s = new LeDados();
    s.lerValores("Insira o primeiro valor", "Insira o segundo valor");
    System.out.println("Somar: "+
            (s.valor1 + s.valor2));    }    
}
