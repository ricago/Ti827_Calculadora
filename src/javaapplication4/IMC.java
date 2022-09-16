
package javaapplication4;


class IMC {

    static void calculaIMC() {
    float resultado;
    LeDados i = new LeDados();
    i.lerValores();
    resultado = (i.valor1  /  (i.valor2 * i.valor2));
    System.out.println("Calculo do IMC: "+ resultado); 
    if (resultado < 18.5)
        System.out.println("Abaixo do peso");
    else if (resultado >= 18.5 && resultado < 25)
        System.out.println("Peso normal");
    else if (resultado >= 25 && resultado < 30)
        System.out.println("Peso normal");
    else if (resultado >= 30 && resultado < 35)
        System.out.println("Obesidade grau 1");
    else if (resultado >= 35 && resultado < 40)
        System.out.println("Obesidade grau 2");
    else if (resultado < 40)
        System.out.println("Obesidade grau 3");

    }
    
}
