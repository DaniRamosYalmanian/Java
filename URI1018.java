import java.util.Scanner;
public class URI1018{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int cedulas;
        int resto, cedulas100, cedulas50, cedulas20,cedulas10,cedulas5,cedulas2,cedulas1;
        
        cedulas = teclado.nextInt();

        cedulas100 = cedulas/100;
        resto = cedulas%100;

        cedulas50 = resto/50;
        resto = resto%50;

        cedulas20 = resto/20;
        resto = resto%20;

        cedulas10 = resto/10;
        resto = resto%10;

        cedulas5 = resto/5;
        resto = resto%5;

        cedulas2 = resto/2;
        resto = resto%2;

        cedulas1 = resto/1;
        resto = resto%1;
        
        System.out.println(cedulas);
        System.out.println(cedulas100 + " nota(s) de R$ 100,00");
        System.out.println(cedulas50 + " nota(s) de R$ 50,00");
        System.out.println(cedulas20 + " nota(s) de R$ 20,00");
        System.out.println(cedulas10 + " nota(s) de R$ 10,00");
        System.out.println(cedulas5 + " nota(s) de R$ 5,00");
        System.out.println(cedulas2 + " nota(s) de R$ 2,00");
        System.out.println(cedulas1 + " nota(s) de R$ 1,00");
    }
}