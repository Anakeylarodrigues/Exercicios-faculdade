package VETORES_MATRIZES;

import java.util.Scanner;

public class VetoresEx {
    
    public static void main(String[] args) {
        int vet = 5;
        int[] vetor = new int[vet];
        int i;

        Scanner input = new Scanner(System.in);
        for (i = 0; i < vet; i++) {
            System.out.println("Digite o " + (i+1) + "° número: ");
            vetor[i] = input.nextInt();
            input.close();
        }

        for (i = 0; i < vet; i++) {
            System.out.println("Conteúdo da posição " + (i+1) + " do vetor = " + vetor[i]);
        }
    }
}
