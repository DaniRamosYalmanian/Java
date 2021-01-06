import java.util.Scanner;
public class URI1143 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num;
        
        num = teclado.nextInt();

       for (int contador = 1;contador <= num;contador++) {
            System.out.println(contador + " " + contador*contador + " " + contador*contador*contador);  
        } 
                  
    }
}