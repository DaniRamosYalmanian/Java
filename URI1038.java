/*
1 - Cachorro quente     - 4,00
2 - X-Salada            - 4,50
3 - X-Bacon             - 5,00
4 - Torrada simples     - 2,00
5 - Refrigerante        - 1,50

código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
*/

import java.util.Scanner;
public class URI1038{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int codigo, quantidade;
        double total;
        
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();
        total = 0.00;

        if (codigo == 1) {
            total = 4.00 * quantidade;
        } else if (codigo == 2) {
            total = 4.50 * quantidade;
        } else if (codigo == 3) {
            total = 5.00 * quantidade;
        } else if (codigo == 4) {
            total = 2.00 * quantidade;
        } else if (codigo == 5) {
            total = 1.50 * quantidade;
        }
        System.out.printf("Total: R$ %.2f\n",total);
    }
}