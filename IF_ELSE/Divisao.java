/*Faça um algoritmo para mostrar o resultado da divisão 
de dois números.*/

package IF_ELSE;

import java.util.Scanner;

public class Divisao {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n2 == 0) {
            System.out.println("Impossível dividir");
        } else {
            double div = Double.valueOf(n1) / Double.valueOf(n2);
            System.out.println(n1 + " / " + n2 + " = " + div);
            input.close();
        }
    }
}
