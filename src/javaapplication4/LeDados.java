
package javaapplication4;


public class LeDados {
    public float valor1, valor2;
    
    public void lerValores(String s1, String s2){
        System.out.println(s1);
        valor1 = JavaApplication4.ler.nextFloat();
        System.out.println(s2);
        valor2 = JavaApplication4.ler.nextFloat();
    }
}
