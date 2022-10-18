/*O algoritmo deve receber dez números digitados pelo usuário e mostrar qual o menor */

package VETORES_MATRIZES;

import java.util.Scanner;

public class Vetor1 {
    
    public static void main(String[] args) {
        int vet = 10;
        int[] vetor = new int[vet];
        int i, menor = 0;

        try (Scanner input = new Scanner(System.in)) {
            for (i = 0; i < vet; i++) {
                System.out.println("Digite o " + (i+1) + "° número: ");
                vetor[i] = input.nextInt();
                menor = vetor[i];
            }
        }
        for (i = 0; i < vet; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("O menor número é: " + menor);
    }
}
