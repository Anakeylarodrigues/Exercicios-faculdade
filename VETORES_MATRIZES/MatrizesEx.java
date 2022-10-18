/*EM FASE DE ELABORAÇÃO!*/

package VETORES_MATRIZES;

import java.util.Scanner;

public class MatrizesEx {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int i;
        int linha = 3, coluna = 3;
        int[][] vetor = new int[linha][coluna];

        for (i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o número da linha " + i + ", coluna " + j + ":");
                vetor[i][j] = input.nextInt();
                input.close();
            }
        }
        for (i = 0; i < linha; i++); {
            for (int j = 0; j < coluna; j++) {
                System.out.println(vetor[linha][coluna]);
            }
        }

        /*for (int [] linha : vetor) {
            for (int coluna : linha) {
                System.out.print();
            }
            System.out.println();
        }*/
    }
}
