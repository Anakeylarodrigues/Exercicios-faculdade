/*Faça um algoritmo que receba os três lados de um triângulo e mostre sua classificação - 
triângulo escaleno: três lados diferentes; triângulo isósceles: dois lados iguais; triângulo equilátero: três lados iguais. */

package ESTRUTURAS_CONDICIONAIS;

import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo: ");
        int lado1 = input.nextInt();
        int lado2 = input.nextInt();
        int lado3 = input.nextInt();

        if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.println("Triângulo escaleno");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero");
        } else {
            System.out.println("Triângulo isósceles");
        }
        input.close();
    }
}
