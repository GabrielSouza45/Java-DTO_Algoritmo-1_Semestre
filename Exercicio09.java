// Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
// o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o
// salário do funcionário

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de cadastro do funcionário: ");
        int numeroCadastro = sc.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor que recebe por hora: ");
        double salarioHora = sc.nextDouble();


        System.out.println("Cadastro do Funcionário : " + numeroCadastro );
        System.out.println("Salário do Funcionário : R$" + calcularSalario(horasTrabalhadas, salarioHora) );

        sc.close();
    }

    public static double calcularSalario(double horasTrabalhadas, double salarioHora) {
        return (
            horasTrabalhadas * salarioHora
        );
    }
}
