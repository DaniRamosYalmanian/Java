import java.util.Scanner;
public class URI1010 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        int codigopeca1, numeropeca1, codigopeca2,numeropeca2;
        float valorpeca1, valorpeca2, valorpagar;

        codigopeca1 = teclado.nextInt();
        numeropeca1 = teclado.nextInt();
        valorpeca1 = teclado.nextFloat();

        codigopeca2 = teclado.nextInt();
        numeropeca2 = teclado.nextInt();
        valorpeca2 = teclado.nextFloat();
        
        valorpagar = (numeropeca1*valorpeca1)+(numeropeca2*valorpeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorpagar);
    }
}