/*a variável de controle, identificada por i, receberá, inicialmente, o valor 5 e este será decrementado em 1, 
devido à instrução [PASSO -1], até atingir o valor 1, logo, o comando escreval (“valor de x = ”,i) será repetido cinco vezes */

package FOR;

public class Repeticao2 {
    
    public static void main(String[] args) {
    
        for (int i = 5; i >= 1; i--) {
            System.out.println("Valor de x = " + i);
        }
    }
}
