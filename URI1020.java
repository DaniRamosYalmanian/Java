import java.util.Scanner;
public class URI1020{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int idadedias, anos, meses, dias,resto;
        
        idadedias = teclado.nextInt();

        anos = idadedias/365;
        resto = idadedias%365;

        meses = resto/30;
        dias = resto%30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
         
    }
}