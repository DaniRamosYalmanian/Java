import java.util.Scanner;
public class URI1017 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int tempo, velocidademedia;
        float distancia, litros;

        tempo = teclado.nextInt();
        velocidademedia = teclado.nextInt();
        distancia = velocidademedia*tempo;
        litros = distancia/12;

        System.out.printf("%.3f%n",litros);
        
    }
}