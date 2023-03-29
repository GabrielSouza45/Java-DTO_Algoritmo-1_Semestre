// Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado
// de um número A é representado por A2 = A * A.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n1 = sc.nextInt();

        System.out.println("Digite outro valor: ");
        int n2 = sc.nextInt();

        double novoN1 = calcularPotencia(n1);
        double novoN2 = calcularPotencia(n2);

        double soma = somar(novoN1, novoN2);

        System.out.println("A soma dos quadrados de " + n1 + " e " + n2 + " é : " + soma);

        sc.close();

    }

    static double calcularPotencia(int numero){

        return ( Math.pow(numero, 2) ); 

    }

    static double somar(double n1, double n2){

        return (n1 + n2); 

    }
}
