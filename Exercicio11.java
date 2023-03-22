// Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
// mensagem "Numero negativo".


import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero = sc.nextInt();

        boolean verificado = verificacao(numero);

        if (verificado) {
            System.out.println("Número negativo");
        }

        sc.close();
    }
    static boolean verificacao(int numero){
        return (numero < 0);
    }

}
