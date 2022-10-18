/*Faça um algoritmo para calcular o novo salário sabendo que este 
tem aumento de 10% e imposto é de 6% já sobre o salário reajustado. Os cálculos 
devem ser feitos em funções.
Sub-rotinas com parâmetros e com retorno*/

package SUB_ROTINA;

import java.util.Scanner;

public class ComParComRet4 {
    
    public static double sGlobal, salGlobal, nsGlobal;

    public static double aumento(Double sal) {
        double aum = salGlobal * 0.1;
        return aum;
    }

    public static double imposto(Double sal) {
        double imp = salGlobal * 0.06;
        return imp;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        salGlobal = leitor.nextDouble();
        sGlobal = salGlobal + aumento(aumento(salGlobal));
        System.out.println("Salário com aumento e sem imposto = " + sGlobal);
        nsGlobal = sGlobal - imposto(imposto(salGlobal));
        System.out.println("Novo salário = " + nsGlobal);
        leitor.close();
    }
}
