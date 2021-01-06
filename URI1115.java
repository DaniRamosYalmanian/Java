import java.util.Scanner;
public class URI1115 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        float x,y;
        
        
        while (true) {
            x = teclado.nextFloat();
            y = teclado.nextFloat();

            if (x>0 && y>0) { 
                System.out.println("primeiro");
            } else if (x>0 && y<0) { 
                System.out.println("quarto");
            } else if (x<0 && y>0) {
                System.out.println("segundo");
            } else if (x<0 && y<0) {
                System.out.println("terceiro");
            } else if (x==0 || y==0) {
               break;    
                   
            }
        } 

                         
    }
}