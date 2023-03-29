// Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (π = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.
// f) o perímetro do retângulo que tem lados A e B.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double a = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double b = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double c = sc.nextDouble();

        System.out.println(""); // Quebra de linha no terminal

        System.out.println("Área do Triângulo Retângulo de base " + a + " e altura " +  c + " : " + calcularAreaTrianguloRetangulo(a, c));   // Triangulo
        System.out.println("");

        System.out.println("Área do Cículo de raio " + c + " : " + calcularAreaCirculo(c));   // Circulo
        System.out.println("");

        System.out.println("Área do Trapezio de Base " + a + ", base " + b + " e altura " + c + " : " + calcularAreaTrapezio(a, b, c));   // Trapezio
        System.out.println("");

        System.out.println("Área do Quadrado de lado " + b + " : " + calcularAreaQuadrado(b));   // Quadrado 
        System.out.println("");

        System.out.println("Área do Retângulo de base " + a + " e altura " + b + " : " + calcularAreaRetangulo(a, b));   // Retangulo
        System.out.println("");

        System.out.println("Perímetro do Retângulo de base " + a + " e altura " + b + " : " + calcularPerimetroRetangulo(a, b));   // Perimetro Retangulo

        sc.close();

    }

    static double calcularAreaTrianguloRetangulo(double base, double altura) {  // Triangulo
        return ( (base * altura) / 2 );
    }

    static double calcularAreaCirculo(double raio) {  // Circulo
        return (3.14159 * raio * raio);
    }

    static double calcularAreaTrapezio(double Base, double base, double altura) {  // Trapezio
        return ( ((Base + base) * altura) / 2 );
    }

    static double calcularAreaQuadrado(double lado) {  // Quadrado 
        return (lado * lado);
    }

    static double calcularAreaRetangulo(double base, double altura) {  // Retangulo
        return (base * altura);
    }

    static double calcularPerimetroRetangulo(double base, double altura) {  // Perimetro Retangulo
        return ( (base + altura) * 2 );
    }

}