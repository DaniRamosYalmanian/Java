import java.util.Scanner;
public class URI1019{
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int temposegundos, hora,minuto,segundo,resto;
      
        temposegundos = teclado.nextInt();

        hora = temposegundos/3600;
        resto = temposegundos%3600;

        minuto = resto / 60;
        
        segundo = resto%60; 

        System.out.println(hora + ":" + minuto + ":" + segundo);
        
    }
}