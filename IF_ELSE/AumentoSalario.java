/*Faça um algoritmo para calcular o novo salário de um 
funcionário. Sabe-se que os funcionários que possuem salário atual até R$ 
500,00 terão aumento de 20%; os demais terão aumento de 10%.*/

package IF_ELSE;

import java.util.Scanner;

public class AumentoSalario {
    
    public static void main(String[] args) {
        double novoSal = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        int salAtual = input.nextInt();

        if (salAtual <= 500) {
            novoSal = salAtual * 1.2;
        } else {
            novoSal = salAtual * 1.1;
        }
        System.out.println("Novo salário: " + novoSal);
        input.close();
    }
}
