/*
0 -> 2000 -> Isento
200.01 -> 3000.00 -> 8%
3000.01 -> 4500.00 -> 18%
Acima 4500.01  -> 28%

*/

import java.util.Scanner;
public class URI2087 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int linha, coluna;
        linha = teclado.nextInt();
        coluna = teclado.nextInt();

        if (linha+coluna%2 == 0 ) {
            System.out.printf("1");
        } else {
            System.out.printf("0");
        }
                     
    }
}