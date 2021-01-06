import java.util.Scanner;
public class URI1008 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int funcionario,horatrabalhada;
        float valorhora,salario;

        funcionario = teclado.nextInt();
        horatrabalhada = teclado.nextInt();
        valorhora = teclado.nextFloat();

        salario = horatrabalhada*valorhora;

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        
    }
}