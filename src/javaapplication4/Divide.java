
package javaapplication4;


class Divide {

    static void dividir() {
    LeDados d = new LeDados();
    d.lerValores("Insira o valor do dividendo", "Insira o valor do divisor");
    System.out.println("Dividir: "+
            (d.valor1 / d.valor2));    
    }
    
}
