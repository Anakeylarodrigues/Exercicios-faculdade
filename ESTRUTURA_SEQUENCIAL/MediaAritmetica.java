package ESTRUTURA_SEQUENCIAL;

import java.util.Scanner;

public class MediaAritmetica {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira e a segunda nota: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        double media = (Double.valueOf(n1) + Double.valueOf(n2)) / 2;

        System.out.println("Média = " + media);

        input.close();
    }
}
