
package javaapplication4;


class Expoente {

    static void potencia() {
    LeDados r = new LeDados();
    r.lerValores("Insira o valor da base", "Insira o valor do expoente");
    System.out.println("Potência: "+
            Math.pow(r.valor1, r.valor2));
    
    
    
    
    }
    
}
