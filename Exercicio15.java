// Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
//  −𝐵 ± √(𝐵^2 − 4 ∗ 𝐴 ∗ 𝐶)
//          2 ∗ 𝐴
//  Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre
//  a mensagem correspondente “Impossível calcular”.


import java.util.Scanner;

public class Exercicio15{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double a = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double b = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double c = sc.nextDouble();

        if ( a <= 0 || c > 0){
            // 2 * 0 = 0 o que implicaria numa divisão por 0
            // e se c for maior que zero, daria uma raiz quadrada negativa, 25 −4 ∗ 3 ∗ 5 = -35
            // porem 25 -4 * 3 * (-5) = 85 ou ate mesmo 25 -4 * 3 * 0 = 25

            System.out.println("Impossível calcular");

        }
        else {

            double raizMais = calcularRaizPositiva(a, b, c);
            double raizMenos = calcularRaizNegativa(a, b, c);

            System.out.println("Raízes: " + raizMais + " e " + raizMenos);

        }
        sc.close();
    }
    static double calcularRaizPositiva(double a, double b, double c){

        double radicando = ( Math.pow(b, 2) - 4 * a * c );

        if ( radicando >= 0 ) {

            double raiz = ( -b + Math.sqrt( radicando ) );
            return ( raiz / (2 * a) );

        } else {

            return 0;

        }
    }
    static double calcularRaizNegativa(double a, double b, double c){
        double radicando = ( Math.pow(b, 2) - 4 * a * c );

        if ( radicando >= 0 ) {

            double raiz = ( -b - Math.sqrt( radicando ) );
            return ( raiz / (2 * a) );

        } else {

            return 0;

        }
    }

}
