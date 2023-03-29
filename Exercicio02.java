import java.util.Scanner;

// Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
// expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
// Math.pow(5, 3). Você pode trocar esses números por variáveis.


public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = sc.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = sc.nextInt();


        System.out.println(base + " elevado a " + expoente + " = " + calcularPotencia(base, expoente));

        sc.close();
    }

    static double calcularPotencia(int base, int expoente){

        return ( Math.pow(base, expoente) ); 

    }
}
