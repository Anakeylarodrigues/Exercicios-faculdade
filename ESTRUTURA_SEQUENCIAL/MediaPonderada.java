/*Faça um algoritmo para calcular a média ponderada entre duas 
notas, cujos pesos são 2 e 3.*/

package ESTRUTURA_SEQUENCIAL;

import java.util.Scanner;

public class MediaPonderada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira e a segunda nota: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        double mediaPond = (Double.valueOf(n1) * 2 + Double.valueOf(n2) * 3) / 5;

        System.out.println("Média ponderada = " + mediaPond);

        input.close();
    }
}
