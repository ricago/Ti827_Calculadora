
package javaapplication4;


class Multiplica {

    static void multiplicar() {
    LeDados m = new LeDados();
    m.lerValores("Insira o valor base", "Insira o valor do multiplicador");
    System.out.println("Multiplicar: "+
            (m.valor1 * m.valor2));    }
    
}
