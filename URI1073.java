import java.util.Scanner;
public class URI1073 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num;
        
        num = teclado.nextInt();

       for (int contador = 2;contador <= num;contador+= 2) {
            System.out.println(contador + "^2 = " + contador*contador);  
        } 
                  
    }
}