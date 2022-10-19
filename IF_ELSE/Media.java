/*Faça um algoritmo para calcular a média aritmética 
entre duas notas de um aluno e mostrar sua situação, sendo este aluno aprovado ou reprovado */

package IF_ELSE;

import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite duas notas: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
        input.close();
    }
}
