import java.util.Scanner;
public class URI1066 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num;
        int par, impar, positivo, negativo;

        par=0;
        impar=0;
        positivo=0;
        negativo=0;
        
        
       for (int contador = 1;contador <= 5;contador++) {
           num = teclado.nextInt();
            if (num%2 == 0) {
               par = par + 1;
            } else {
                impar = impar + 1;
            }
            if (num >= 1) {
               positivo = positivo + 1;
            } else if (num < 0) {
                negativo = negativo + 1;
            }

        } 
        System.out.println(par + " valor(es) par(es)");   
        System.out.println(impar + " valor(es) impar(es)");   
        System.out.println(positivo + " valor(es) positivo(s)");   
        System.out.println(negativo + " valor(es) negativo(s)");   
                  
    }
}