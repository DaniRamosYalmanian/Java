/*
0 -> 2000 -> Isento
200.01 -> 3000.00 -> 8%
3000.01 -> 4500.00 -> 18%
Acima 4500.01  -> 28%

*/

import java.util.Scanner;
public class URI1048 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float salario, percentual;
        salario = teclado.nextFloat();

        percentual = 0;
                
        if (salario >= 0 && salario <= 400.00) {
            percentual = 15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            percentual = 12;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            percentual = 10;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 7;
        } else if (salario > 2000.00) {
            percentual = 4;
        } 
        System.out.printf("Novo salario: %.2f\n",salario * ((percentual/100f)+1));
        System.out.printf("Reajuste ganho: %.2f\n", (salario * (percentual/100f)));
        System.out.printf("Em percentual: %.0f %%\n", percentual);               
    }
}