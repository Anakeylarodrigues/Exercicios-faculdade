/*Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a 
mensagem a seguir (0 |- 3 Reprovado / 3 |- 7 Exame / 7 |-| 10 Aprovado). Aos alunos que ficaram 
para exame, calcule e mostre a nota que deverão tirar para serem aprovados, considerando que a média exigida é 6,0 */

package ESTRUTURAS_CONDICIONAIS;

import java.util.Scanner;

public class MediaAritmetica3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as três notas: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        int media = (n1 + n2 + n3) / 3;

        if (media <= 3) {
            System.out.println("Aluno reprovado com média " + media);
        } else if ( media <= 7) {
            System.out.println("Aluno foi para exame com média = " + media);
            int mediaFinal = 10 - media;
            System.out.println("Nota mínima a ser tirada no exame = " + mediaFinal);
        } else {
            System.out.println("Aluno aprovado com média " + media);
        }
        input.close();
    }
}
