/*
0 -> 2000 -> Isento
200.01 -> 3000.00 -> 8%
3000.01 -> 4500.00 -> 18%
Acima 4500.01  -> 28%

*/

import java.util.Scanner;
public class URI1051 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double salario, imposto;
        salario = teclado.nextDouble();

        imposto = 0.00;

        if (salario >= 0 && salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario >= 2000.01 && salario <= 3000.00) {
                imposto = (salario - 2000.00)*.08;
            } else if (salario >= 3000.01 && salario <= 4500.00) {
                imposto = (1000*.08) + ((salario - 3000.00)*.18);
            } else if (salario >= 4500.01) {
                imposto = (1000*.08) + (1500*.18) + ((salario - 4500.00)*.28);
            } 
            System.out.printf("R$ %.2f", imposto);
        }         
    }
}