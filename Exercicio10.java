// Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
// no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
// calcular e imprimir o total a receber no final do mês.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = sc.next();

        System.out.print("Digite o salário fixo de " + nomeVendedor + " : R$");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor total de vendas efetuadas por " + nomeVendedor + " no mês : R$");
        double valorVendas = sc.nextDouble();

        double comissao = 0.15;

        double salarioMes = calcularSalarioMes(salarioFixo, valorVendas, comissao);

        System.out.print("Salário do mês de " + nomeVendedor + " é de : R$ " + salarioMes );

        sc.close();
    }

    public static double calcularSalarioMes(double salarioFixo, double valorVendas, double comissao) {
        return (
            salarioFixo + ( valorVendas * comissao ) 
        );
    }
}
