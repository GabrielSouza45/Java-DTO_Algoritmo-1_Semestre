// Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double l = sc.nextDouble();

        System.out.println("A área do quadrado de lado " + l + " = " + calcularAreaQuadrado(l)); 
       

        sc.close();

    }

    static double calcularAreaQuadrado(double lado){

        return ( lado * lado ); 

    }

}