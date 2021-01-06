import java.util.Scanner;
public class URI1065 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        float num,soma;
        int qtd=0;
        
       for (int contador = 1;contador <= 5;contador++) {
           num = teclado.nextFloat();
           if (num%2 == 0) {
               qtd = qtd + 1;
            }
        } 
         System.out.println(qtd + " valores pares");   
                  
    }
}