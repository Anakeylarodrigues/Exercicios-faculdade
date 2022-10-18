/*A variável de controle, identificada por i, receberá inicialmente o valor 250 e este será decrementado em 25, devido à instrução [PASSO -25], até atingir o valor 25, logo, o comando escreval (“Número = “, i) será 
repetido dez vezes. */

package FOR;

public class Repeticao4 {
    
    public static void main(String[] args) {
        
        for (int i = 250; i >= 25; i-=25) {
            System.out.println("Número = " + i);   
        }
    }
}
