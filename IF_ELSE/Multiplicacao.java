/*Faça um algoritmo para mostrar o resultado da multiplicação de dois números. */

package IF_ELSE;

import java.util.Scanner;

public class Multiplicacao {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int mult = n1 * n2;
        System.out.println(n1 + " x " + n2 + " = " + mult);
        input.close();

    }
}
