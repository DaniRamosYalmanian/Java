import java.util.Scanner;
public class TestedoSwitch {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor;

        valor = teclado.nextInt();
        
        switch(valor) {
            case 1:
                System.out.println("Digitou o numero 1");
                break;
            case 2:
                System.out.println("Digitou o numero 2");
                break;
            case 3:
                System.out.println("Digitou o numero 3");
                break;
            case 4:
                System.out.println("Digitou o numero 4");
                break;
        }
         
    }
}