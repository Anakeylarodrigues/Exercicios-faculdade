/*A variável identificada por i, receberá, inicialmente, o valor 0, 
enquanto a condição i <= 5 for verdadeira, os comandos escreval (“estudar”) e i <- i 
+ 1 serão repetidos. */

package WHILE;

public class Repeticao5 {
    
    public static void main(String[] args) {
        
        int i = 0;

        while (i <= 5) {
            System.out.println("Estudar");
            i = i+1;
        }
    }
}
