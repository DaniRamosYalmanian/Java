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
public class TesteDoWhilev2{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int numero, contador;
             
        System.out.println("Digitou o numero da tabuada para calcular:");
        numero = teclado.nextInt();
        
        contador = 1;

        do {
            System.out.println("1 x " + contador + "=" + contador * numero);
            contador++; //contador = contador + 1;
        }  while (contador <= 10 );
    }
}