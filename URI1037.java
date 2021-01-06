/*
1 - January
2 - February 
3 - March
4 - April
5 - May
6 - June
7 - July
8 - August
9 - September
10 - October
11 - November
12 - December

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

*/

import java.util.Scanner;
public class URI1037{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float x, y;
        x = teclado.nextFloat();
                
        if (x >= 0 && x <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (x > 25 && x <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (x > 50 && x <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (x > 75 && x <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}