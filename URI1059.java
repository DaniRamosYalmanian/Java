/*
0 -> 2000 -> Isento
200.01 -> 3000.00 -> 8%
3000.01 -> 4500.00 -> 18%
Acima 4500.01  -> 28%

*/

import java.util.Scanner;
public class URI1059 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        float num;
        int qtd=0;

       for (int contador = 1;contador <= 6;contador++) {
           num = teclado.nextFloat();
           if (num > 0) {
               qtd = qtd + 1;
           }
        } 
         System.out.println(qtd + "valores positivos");             
    }
}