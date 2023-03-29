// Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo.
// Para esse caso, considere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴^2 + 𝐵^2
// . Dica: nesse programa, você deve usar a
// função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121)

import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double a = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double b = sc.nextDouble();

        System.out.println("A hipotenusa do triângulo de lados " + a + " e " + b + " = " + calcularRaiz(a, b)); 

        sc.close();

    }

    static double calcularRaiz(double a, double b){

        return ( Math.sqrt( (a * a) + (b * b) ) ); 

    }

}
