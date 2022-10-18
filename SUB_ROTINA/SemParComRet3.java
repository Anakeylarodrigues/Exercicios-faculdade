/*Faça um algoritmo para calcular a área de um quadrado. O cálculo 
deve ser feito em uma função.
sub-rotinas sem parâmetros e com retorno*/

package SUB_ROTINA;

import java.util.Scanner;

public class SemParComRet3 {
    
    public static int ladoGlobal, aGlobal;

    public static int area() {
        int resp = ladoGlobal * ladoGlobal;
        return resp;
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o lado: ");
        ladoGlobal = leitor.nextInt();
        aGlobal = area();
        System.out.println("A área do quadrado é = " + aGlobal);
        leitor.close();
    }
}
