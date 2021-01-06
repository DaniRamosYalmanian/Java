import java.util.Scanner;

public class URI1014{
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int x; // distância;
        float y; // consumo

        float z; // media de consumo

        // entrada
        x = teclado.nextInt();
        y = teclado.nextFloat();
        z = x / y;

        System.out.printf("%.3f km/l%n", z);
    }

}