/*A variável identificada por i, receberá, inicialmente, o valor 
10; a variável identificada por j, receberá, inicialmente, o valor 100; a variável identificada por cont, receberá, inicialmente, o valor 0. Enquanto a condição i < j for 
verdadeira, os comandos i ← i + 10, j ← j - 10 e cont ← cont + 1 serão repetidos */

package WHILE;

public class Repeticao6 {
    
    public static void main(String[] args) {
        
        int i = 10;
        int j = 100;
        int cont = 0;

        while (i < j) {
           i = i + 10;
           j = j -10;
           cont = cont + 1; 
        }
        System.out.println("Repetições = " + cont);
    }
}
