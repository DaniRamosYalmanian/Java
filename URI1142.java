import java.util.Scanner;
public class URI1142 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num, pum;
        
        num = teclado.nextInt();
        pum = 1;
        
       for (int contador = 0;contador < num;contador++) {
            System.out.println((pum++) + " " + (pum++) + " " + (pum++) + " PUM");
            pum++;
        }                   
    }
}