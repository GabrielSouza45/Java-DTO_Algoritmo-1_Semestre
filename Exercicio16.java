// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja
// abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo:
// Hora inicial Hora final Resultado
//          16      2      O JOGO DUROU 10 HORA(S)
//          0       0      O JOGO DUROU 24 HORA(S)
//          2       16     O JOGO DUROU 14 HORA(S)
import java.util.Scanner;

public class Exercicio16{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Duração máxima de jogo: 24 horas.");
        System.out.println("Duração mínima de jogo: 1 hora.");
        System.out.println();

        System.out.println("Digite a hora de início do jogo: ");
        float inicio = sc.nextFloat();

        System.out.println("Digite a hora de término do jogo: ");
        float termino = sc.nextFloat();

        if (inicio > 23.59 || termino > 23.59) {
            System.out.println("Digite uma hora válida. Meia noite = 00");
            System.exit(1);
        }
        float horas = termino - inicio;

        if (horas < 0) {
            horas += 24;

        }
        if (horas == 0) {
            System.out.println("O jogo teve duração de: 24horas");

        } else if (horas < 1 && horas > 0) {
            System.out.println("O jogo deve ter duração mínima de 1 hora");

        } else {
            System.out.println("O jogo teve duração de: " + horas + " horas");
        }

        sc.close();
    }

}