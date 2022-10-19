/*A variável identificada por i, receberá, inicialmente, o valor 
10, os comandos escreval (“valor de i = ”,i) e i ← i + 10 serão executados até a 
condição se tornar verdadeira, ou seja, até i > 50 */

public class Repeticao7 {
    
    public static void main(String[] args) {
        
        int i = 10;

        do {
            System.out.println("Valor de i = " + i);
            i+=10;
        } while (i <= 50);
    }
}
