// Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C
//com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a
//mensagem "Valores aceitos", senão escrever "Valores não aceitos".
//Veja abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo:
//Entradas (A B C D) Saída esperada
//5 6 7 8 Valores não aceitos
//2 3 2 6 Valores aceitos

/*
b > c && d > a
&&
c+d > a+b
&&
c e d -> +
&&
a mod 2 == 0
aceito
*/


import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int a = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        int b = sc.nextInt();
        System.out.println("Digite um valor para C: ");
        int c = sc.nextInt();
        System.out.println("Digite um valor para D: ");
        int d = sc.nextInt();

        boolean bMaiorCeDMaiorA = verificarMaior(a, b, c, d);

        boolean maiorSoma = verificarMaiorSoma(a, b, c, d);

        boolean positivos = verificarPositivo(c, d);

        boolean aPar = verificarPar(a);

        if ( bMaiorCeDMaiorA && maiorSoma && positivos && aPar){
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores não aceitos");
        }



    }

    public static boolean verificarMaior(int a, int b, int c, int d){
        return (b > c && d > a);
    }

    public static boolean verificarMaiorSoma(int a, int b, int c, int d){
        return ( (c + d) > (a + b));
    }

    public static boolean verificarPositivo(int c, int d){
        return (c >= 0 && d >= 0);
    }

    public static boolean verificarPar(int a) {
        return (a % 2 == 0);
    }

}
