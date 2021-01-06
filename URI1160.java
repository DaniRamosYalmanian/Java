import java.util.Scanner;
public class URI1160 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num,PA,PB,anos;
        double G1,G2;
        
        num = teclado.nextInt();

       for (int contador = 1;contador <= num;contador++) {

            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextDouble();
            G2 = teclado.nextDouble();

           anos = 0;

            while (PA <=PB && anos<100) {
                PA = (int) (PA + PA * G1 /100)
                PB = (int) (PB + PB * G2 /100)
                anos++;
            }


            System.out.println(contador + " " + contador*contador + " " + contador*contador*contador); 
            System.out.println(contador + " " + ((contador*contador)+1) + " " + ((contador*contador*contador)+1)); 
        } 
                  
    }
}