import java.util.Scanner;
public class URI1074 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num,n;
        
        n = teclado.nextInt();

       for (int contador = 0;contador < n;contador++) {
            num = teclado.nextInt();
            if (num == 0) {
                 System.out.println("NULL");
            } else {
                if (num%2==00) {
                     System.out.print("EVEN "); 
                } else {     
                    System.out.print("ODD ");
                }
                if (num >0) {
                     System.out.println("POSITIVE"); 
                } else {     
                    System.out.println("NEGATIVE");
                }
            }
        } 
                  
    }
}