import java.util.Scanner;
public class URI1134 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int x,alcool, gasolina, diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        
        do {
            x = teclado.nextInt();
          
            switch (x) {
                case 1: 
                    alcool++;
                    break;
                case 2: 
                    gasolina++;
                    break;

                case 3: 
                    diesel++;
                    break;                       
            }            
        } while (x != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+ diesel);
               
    }
}