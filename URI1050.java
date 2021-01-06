/*
61 - Brasilia
71 - Salvador
11 - Sao Paulo
21 - Rio de Janeiro
32 - Juiz de Fora
19 - Campinas
27 - Vitória
31 - Belo Horizonte

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

*/

import java.util.Scanner;
public class URI1050{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int ddd;
        ddd = teclado.nextInt();
        
        if (ddd == 61) {
            System.out.println("Brasilia");
        } else if (ddd == 71) {
             System.out.println("Salvador");
        } else if (ddd == 11) {
            System.out.println("Sao Paulo");
        } else if (ddd == 21) {
            System.out.println("Rio de Janeiro");
        } else if (ddd == 32) {
            System.out.println("Juiz de Fora");
        } else if (ddd == 19) {
            System.out.println("Campinas");
        } else if (ddd == 27) {
            System.out.println("Vitoria");
        } else if (ddd == 31) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}