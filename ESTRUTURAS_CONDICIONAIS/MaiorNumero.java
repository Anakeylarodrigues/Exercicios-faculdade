/*Faça um algoritmo que receba dois números e mostre o maior. 
Caso os números sejam iguais, mostrar mensagem. */

package ESTRUTURAS_CONDICIONAIS;

import java.util.Scanner;

public class MaiorNumero {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } else if (n1 > n2) {
            System.out.println("O número maior é: " + n1);
        } else {
            System.out.println("O número maior é: " + n2);
        }
        input.close();
    }
}
