/*Faça um algoritmo para calcular o valor do imposto e o valor do 
desconto de um salário. Sabe-se que o imposto de é 7% e o desconto é de 5%, em 
que cada operação deve ser realizada em um sub-rotina apropriada
sub-rotinas com parâmetros e sem retorno*/

package SUB_ROTINA;

import java.util.Scanner;

public class ComParSemRet2 {
    
    public static int salGlobal;

    public static void imposto(int s) {
        int i;
        i = s * 7/100;
        System.out.println("Imposto = " + i);
    }

    public static void desconto(int s) {
        int d;
        d = s * 5/100;
        System.out.println("Desconto = " + d);
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        salGlobal = leitor.nextInt();

        imposto(salGlobal);
        desconto(salGlobal);

        leitor.close();
    }
}
