/*
Salário	Percentual de Reajuste
0 - 400.00 - 15%
400.01 - 800.00 - 12%
800.01 - 1200.00 - 10%
1200.01 - 2000.00 - 7%
Acima de 2000.00 - 4%

*/

import java.util.Scanner;
public class URI1046 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int horaInicial, horaFinal, qtd;
        horaInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();

        qtd = horaFinal - horaInicial;

        if (qtd > 0 ) {
            System.out.printf("O JOGO DUROU " + qtd + " HORA(S)\n");
        } else if (qtd <= 0 ) {
            System.out.printf("O JOGO DUROU " + (qtd + 24)+ " HORA(S)\n");
        }     
    }
}