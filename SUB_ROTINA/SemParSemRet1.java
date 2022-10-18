/*Faça um algoritmo para calcular as quatro operações básicas entre 
dois números, em que cada operação deve ser realizada em um sub-rotina apropriada
sub-rotinas sem parâmetros e sem retorno*/

package SUB_ROTINA;

import java.util.Scanner;

public class SemParSemRet1 {
    
    static int n1Global, n2Global;

    static void soma() {
        int s = n1Global + n2Global;
        System.out.println("Soma = " + s);
    }
    
    static void subtracao() {
        int sb = n1Global - n2Global;
        System.out.println("Subtração = " + sb);
    } 

    static void multiplicacao() {
        int mult = n1Global * n2Global;
        System.out.println("Multiplicação = " + mult);
    }

    static void divisao() {
        if (n2Global == 0) {
            System.out.println("Impossível dividir");
        } else {
            double div = Double.valueOf(n1Global) / Double.valueOf(n2Global); 
            System.out.println("Divisão = " + div);
        }
    }

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro e segundo número: ");
            n1Global = leitor.nextInt();
            n2Global = leitor.nextInt();
            leitor.close();
        }
        
        soma();
        subtracao();
        multiplicacao();
        divisao();
    }
}
