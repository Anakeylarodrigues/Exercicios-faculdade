/*a variável de controle, identificada por i, receberá, inicialmente, o valor 0 e este será incrementado em 20, devido à instrução [PASSO 20], 
até atingir o valor 100, logo, o comando se (i <> 0), então, escreval (“Múltiplo de 
20 = ”,i), fimse, será testado seis vezes, e o comando escreval (“Múltiplo de 20 = 
”, i) será executado cinco vezes. */

package FOR;

public class Repeticao3 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 100; i+=20) {
            if (i != 0) {
                System.out.println("Múltiplo de 20 é = " + i);
            }
        }
    }
}
