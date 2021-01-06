import java.util.Scanner;
public class URI1070 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        int num,qtd;
        
        num = teclado.nextInt();

        qtd = 0;

       for (int contador = num;contador <= num+12;contador++) {
            if (contador%2 != 0 && qtd <6) {
                System.out.println(contador);
                qtd++;  
            }
        } 
                  
    }
}