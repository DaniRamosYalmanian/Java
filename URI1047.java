import java.util.Scanner;
public class URI1047 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int hI,mI,hF,mF,durI,durF,durT,horT,minT;
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        durI = hI*60+mI;
        durF = hF*60+mF;

        durT = durF - durI;

        if (durT <= 0) {
            durT = durT + 24 * 60;
        }
         
        horT = durT/60;
        minT = durT%60;

        System.out.println("O JOGO DUROU " + horT + " HORA(S) E " + minT + " MINUTO(S)");
        
    }
}