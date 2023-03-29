// Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por
// exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo
// de –9)

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n1 = sc.nextInt();

        System.out.println("Digite outro valor: ");
        int n2 = sc.nextInt();

        // invés de usar um método poderia apenas colocar diretamente o n1 + 1, usei método para diferenciar meus exercícios
        System.out.println("Consecutivo de " + n1 + " = " + calcularConsecutivo(n1)); 
        System.out.println("Consecutivo de " + n2 + " = " + calcularConsecutivo(n2)); 

        sc.close();

    }

    static int calcularConsecutivo(int numero){

        return ( numero + 1 ); 

    }

}
