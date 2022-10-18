/*O algoritmo deve receber 6 números digitados pelo usuário, armazenando-os em uma matriz 3 X 2. Em 
seguida, deve mostrar qual o maior número digitado.
EM FASE DE ELABORAÇÃO!*/

package VETORES_MATRIZES;

import java.util.Scanner;

public class Matriz1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int i, j;
        int maior = 0;
        int[][] vetor = new int[3][2];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; i++) {
                System.out.println("Digite o número da linha " + i + ", coluna " + j + ":");
                vetor[i][j] = input.nextInt();
                maior = vetor[i][j];
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; i++) {
                if (vetor[i][j] > maior) {
                    maior = vetor[i][j];
                }
            }
        }
        System.out.println(maior);
    }
}
