/*A variável identificada por i, receberá, inicialmente, o valor 1, 
os comandos escreval (“valor de i = “,i) e i <- i + 1 serão executados até a condição 
se tornar verdadeira, ou seja, até i > 5 */

public class Repeticao8 {
    
    public static void main(String[] args) {
        
        int i = 1;

        do {
            System.out.println("Valor de i = " + i);
            i+=1;
        } while (i <= 5);
    }
}
