// Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o
// maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos
// seguintes casos, sempre escrevendo uma mensagem adequada:
// ● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
// ● se A2 = B2 + C2
// , apresente a mensagem: TRIÂNGULO RETÂNGULO
// ● se A2 > B2 + C2
// , apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
// ● se A2 < B2 + C2
// , apresente a mensagem: TRIÂNGULO ACUTÂNGULO
// ● se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO
// ● se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES
// Veja abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo:
// Entradas (A, B, C) Saída esperada
// 7.0 5.0 7.0 TRIANGULO ACUTANGULO
// TRIANGULO ISOSCELES
// 6.0 6.0 10.0 TRIANGULO OBTUSANGULO
// TRIANGULO ISOSCELES
// 6.0 6.0 6.0 TRIANGULO ACUTANGULO
// TRIANGULO EQUILATERO
// 5.0 7.0 2.0 NAO FORMA TRIANGULO
// 6.0 8.0 10.0 TRIANGULO RETANGULO


import java.util.*;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 0, b = 0, c = 0, x = 0;
        System.out.println("Digite um valor: ");
        a = sc.nextDouble();
        System.out.println("Digite um valor: ");
        b = sc.nextDouble();
        System.out.println("Digite um valor: ");
        c = sc.nextDouble();

        if (a <= b && a <= c) {
            if (b > c) {
                x = a; // guarda o valor de a para depositar na variável depois
                a = b;
                b = x; // recebe o antigo valor de a
            } else {
                x = a;
                a = c;
                c = x;
            }
        } else if (a < b && a > c) {
            x = a;
            a = b;
            b = x;
        } else if (a < c && a > b) {
            x = a;
            a = c;
            c = x;
        }

        System.out.println(verificarOrdemDecrescente(a, b, c)); // A sempre será o maior número

        System.out.println(verificarTrianguloAoQuadrado(a, b, c));
        System.out.println(verificarTriangulo(a, b, c));

    }

    public static String verificarOrdemDecrescente(double a, double b, double c) {
        if (b > c) {
            return ("Ordem decrescente : a: " + a + ", b: " + b + ", c: " + c);
        } else {
            return ("Ordem decrescente : a: " + a + ", c: " + c + ", b: " + b);
        }
    }

    public static String verificarTrianguloAoQuadrado(double a, double b, double c) {

        double aQuadrado = Math.pow(a, 2);
        double bQuadrado = Math.pow(b, 2);
        double cQuadrado = Math.pow(c, 2);

        if (a >= (b + c)) {
            return ("NÃO FORMA TRIÂNGULO");
        }
        if (aQuadrado == bQuadrado + cQuadrado) {
            return ("TRIÂNGULO RETÂNGULO");
        }
        if (aQuadrado > bQuadrado + cQuadrado) {
            return ("TRIÂNGULO OBTUSÂNGULO");
        }
        if (aQuadrado < bQuadrado + cQuadrado) {
            return ("TRIÂNGULO ACUTÂNGULO");
        }
        if (a == b && b == c) {
            return ("TRIÂNGULO EQUILÁTERO");
        }
        if (a == b || b == c) {
            return ("TRIÂNGULO ISOSCELES");
        }

        return "";
    }

    public static String verificarTriangulo(double a, double b, double c) {


        if (a == b && b == c) {
            return ("TRIÂNGULO EQUILÁTERO");
        }
        if (a == b || b == c || a == c) {
            return ("TRIÂNGULO ISÓSCELES");
        }

        return "";
    }
}
