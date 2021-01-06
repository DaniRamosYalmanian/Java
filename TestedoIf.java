import java.util.Scanner;
public class TestedoIf{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double n1, n2, media;
        System.out.println("Digite a nota 1: ");
        n1 = teclado.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = teclado.nextDouble();
        media = (n1+n2)/2;

        if (media >= 6.0) {
            System.out.println("Parabéns, você foi aprovado!!!");
        }
        else {
            System.out.println("Eita... até a próxima turma!!!");
        
        }
    }
}