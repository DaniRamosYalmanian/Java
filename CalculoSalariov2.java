/*
Salario até 1000 -> Isento de imposto
Salario acima de 1000 até 1800 -> 10% de imposto
Salario acima de 1800 até 2500 -> 15% de imposto
Salario acima de 2500 até 4000 -> 20% de imposto
Salario acima de 4000 -> 1300 fixo

*/

import java.util.Scanner;
public class CalculoSalariov2{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double salario, imposto;
        
        System.out.println("Digite o salário do funcionário: ");
        salario = teclado.nextFloat();
        
        imposto = 0.00;
        
        if (salario <= 1000) {
            imposto = 0;
        } 
        else if ( salario <= 1800){
            imposto = salario * 0.10;
        } else if (salario <= 2500) {
            imposto = salario * 0.15;
        } else if (salario <= 4000) {
            imposto = salario * 0.20;
        } else if (salario > 4000) {
            imposto = 1300.00;
        }
        
        System.out.println(imposto);
        System.out.printf("Salario base: R$ %.2f/n", salario);
        System.out.printf("Valor do imposto: %.2f/n", imposto);
        System.out.printf("Salario liquido: R$ %.2f/n", salario - imposto);
  
    
    }
}