
package javaapplication4;


class Divide {

    static void dividir() {
    LeDados d = new LeDados();
    d.lerValores();
    System.out.println("Dividir: "+
            (d.valor1 / d.valor2));    
    }
    
}
