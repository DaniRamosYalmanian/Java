/*
0 -> 2000 -> Isento
200.01 -> 3000.00 -> 8%
3000.01 -> 4500.00 -> 18%
Acima 4500.01  -> 28%

*/

import java.util.Scanner;
public class URI1060 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);
        
        int positivo = 0;
        float num;

       for (int contador = 6;numero <= 100;contador += 2) {
           num = teclado.nextFloat();
           if (num > 0) {
               positivo++;
           }
        } 
         System.out.println(positivo + "valores positivos");             
    }
}