import java.util.Scanner;
public class URI1067 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num;
        
        num = teclado.nextInt();

       for (int contador = 1;contador <= num;contador+= 2) {
            System.out.println(contador);  
        } 
                  
    }
}