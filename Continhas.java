public class Continhas {
    public static void main (String args []) {
        // quero declarar variáveis, ou seja, reservar espaços na memória

        int a, b, c;
        a = 19;
        b = 3;
        c = a+b;

        System.out.println ("Valor do a = "+ a);
        System.out.println ("Valor do b = "+b);
        System.out.println ("Valor da soma = "+c);

        c = a-b;
        System.out.println ("Valor da subtração = "+c);

        c = a*b;
        System.out.println ("Valor da multiplicação = "+c);

        c = a/b;
        System.out.println ("Valor da divisão = "+c);

        c = a%b;
        System.out.println ("Valor do resto da divisão = "+c);

        double x;
        x = 1.0/2;

        System.out.println ("Valor do x (double) = "+x);

    }
}
