//
// Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
// de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo".


import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double l = sc.nextDouble();

        System.out.println("Digite o valor do raio do círculo: ");
        double r = sc.nextDouble();

        double areaQuadrado = calcularAreaQuadrado(l);
        double areaCirculo = calcularAreaCirculo(r);

        boolean conferirArea = areaQuadrado < areaCirculo;

        if (conferirArea) {
            System.out.println
                    ("O círculo de raio " + r + " e área " + areaCirculo + " tem área maior que o quadrado de lado " +
                            l + " e área " + areaQuadrado);
        } else {
            System.out.println
                    ("O quadrado de lado " + l + " e área " + areaQuadrado + " tem área maior que o círculo de raio " +
                            r + " e área " + areaCirculo);
        }

        sc.close();
    }
    static double calcularAreaQuadrado(double lado){
        return (Math.pow(lado, 2));
    }
    static double calcularAreaCirculo(double raio){
        return (Math.PI * Math.pow(raio, 2));
    }

}
