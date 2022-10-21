/*Faça um algoritmo que recebe duas notas, calcule a média aritmética e 
mostre mensagem de Aprovado ou Reprovado, considerando para aprovação 
média de, no mínimo, 7. */

package ESTRUTURAS_CONDICIONAIS;

import java.util.Scanner;

public class MediaAritmetica2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira e a segunda nota: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Aluno aprovado com média " + media);
        } else {
            System.out.println("Aluno reprovado com média " + media);
        }
        input.close();
    }
}
