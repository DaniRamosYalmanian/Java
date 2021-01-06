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
public class URI1052{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int mes;
        mes = teclado.nextInt();
        
        if (mes == 1) {
            System.out.println("January");
        } else if (mes == 2) {
             System.out.println("February");
        } else if (mes == 3) {
            System.out.println("March");
        } else if (mes == 4) {
            System.out.println("April");
        } else if (mes == 5) {
            System.out.println("May");
        } else if (mes == 6) {
            System.out.println("June");
        } else if (mes == 7) {
            System.out.println("July");
        } else if (mes == 8) {
            System.out.println("August");
        } else if (mes == 9) {
            System.out.println("September");
        } else if (mes == 10) {
            System.out.println("October");
        } else if (mes == 11) {
            System.out.println("November");            
        } else if (mes == 12) {
            System.out.println("December");
        }
    }
}