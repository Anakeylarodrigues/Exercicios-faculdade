/*Faça um algoritmo para calcular a diferença entre dois números e 
mostrar a mensagem de resultado POSITIVO, NEGATIVO ou ZERO */

package IF_ELSE;

import java.util.Scanner;

public class Diferenca {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int dif = n1 - n2;

        if (dif >= 1 ) {
            System.out.println("A diferença é positiva ("+ dif+")");
        } else if (dif < 0) {
            System.out.println("A diferença é negativa ("+ dif+")");
        } else {
            System.out.println("A diferença é zero");
        } 
        input.close();
    }
}
