
package javaapplication4;


class Soma {

    static void somar() {
    LeDados s = new LeDados();
    s.lerValores();
    System.out.println("Somar: "+
            (s.valor1 + s.valor2));    }    
}
