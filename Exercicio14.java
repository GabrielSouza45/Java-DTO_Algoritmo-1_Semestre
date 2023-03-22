// Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.


import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double n1 = sc.nextInt();

        System.out.println("Digite outro valor: ");
        double n2 = sc.nextInt();

        boolean n1Maior = verificarMaior(n1, n2);

        if (n1Maior) {

            System.out.println(n1 + " / " + n2 + " = " + n1 / n2);

        }
        else {

            System.out.println(n2 + " / " + n1 + " = " + n2 / n1);

        }

        sc.close();
    }
    static boolean verificarMaior(double n1, double n2){

        return ( n1 > n2 );

    }

}
