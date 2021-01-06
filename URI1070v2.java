import java.util.Scanner;
public class URI1070v2 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num;
        
        num = teclado.nextInt();

        if (num%2 == 0) {
            num++
        }
        
       for (int contador = 1;contador <= 6;contador++) {
     
                System.out.println(num);
                num+=2;                  
        
        } 
                  
    }
}