import java.util.Scanner;
public class URI1064 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        float num,soma;
        int qtd=0;
        soma = 0;

       for (int contador = 1;contador <= 6;contador++) {
           num = teclado.nextFloat();
           if (num > 0) {
               qtd = qtd + 1;
               soma = soma + num;
           }
        } 
         System.out.println(qtd + " valores positivos");    
         System.out.printf("%.1f\n", soma/qtd);           
    }
}