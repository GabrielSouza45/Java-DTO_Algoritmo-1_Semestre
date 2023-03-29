import java.util.Scanner;

// Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double n3 = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double n4 = sc.nextDouble();

        System.out.println("A média de " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " é : " + calcularMedia(n1, n2, n3, n4));

        sc.close();
    }

    public static double calcularMedia(double n1, double n2, double n3, double n4) {
        return ( (n1 + n2 + n3 + n4) / 4 );
    }
}
