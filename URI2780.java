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
public class URI2780{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int d;
        d = teclado.nextInt();
        
        if (d<=800) {
            System.out.println("1");
        } else if (d<=1400) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
         
    }
}