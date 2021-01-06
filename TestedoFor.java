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
public class TestedoFor{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int numero;
             
        System.out.println("Digitou o numero da tabuada para calcular:");
        numero = teclado.nextInt();
        
        for (int contador = 1;contador <= 10;contador++) {
            System.out.println("1 x " + contador + "=" + contador * numero);
        } 
    }
}