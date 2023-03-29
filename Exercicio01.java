import java.util.Scanner;

// Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números. 

public class Exercicio01{

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Para calcular porcentagem é necessario uma variavel double, ex: 23% de 150 = 150 * 0,23 = 34,5
        System.out.println("Digite um valor: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double n2 = sc.nextDouble();

        

        System.out.println(n1 + " * " + n2 + " = " + multiplicar(n1, n2));

        sc.close();
    }


     static double multiplicar(double n1, double n2) {
        return (n1 * n2);
    }

}