
package javaapplication4;


class Multiplica {

    static void multiplicar() {
    LeDados m = new LeDados();
    m.lerValores();
    System.out.println("Multiplicar: "+
            (m.valor1 * m.valor2));    }
    
}
