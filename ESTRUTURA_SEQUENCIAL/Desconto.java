/*Faça um algoritmo para calcular o novo preço de um produto, 
sabendo que o percentual de desconto será informado pelo usuário. */

package ESTRUTURA_SEQUENCIAL;

import java.util.Scanner;

public class Desconto {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço: ");
        double preco = input.nextDouble();

        System.out.println("Digite o percentual: ");
        int percentual = input.nextInt();

        double novoPreco = Double.valueOf(preco) - (Double.valueOf(preco) * percentual/100);

        System.out.println("Novo preço = " + novoPreco);

        input.close();
    }
}
