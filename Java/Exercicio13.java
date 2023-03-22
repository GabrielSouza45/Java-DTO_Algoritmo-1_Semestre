// Fazer um algoritmo que leia três números e imprime o maior deles.


import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3] ;                 // array int que recebera os 3 valores digitados

        int count = 0;
        while ( count <= 2 ){                        // laço de repetição para receber os 3 numeros do usuario
            System.out.println("Digite um valor: ");
            valores [count] = sc.nextInt();          // adiciona o valor digitado na posição count do laço de repetição na array
            count++;                                 // incrementa a variavel count
        }

        int valorMaior = verificarValorMaior(valores);// chama o metodo e passa a array valores como parâmetro

        System.out.println("Maior valor digitado: " + valorMaior);

        sc.close();
    }

    static int verificarValorMaior(int[] valores){   // método para encontrar o maior valor recebendo um array como parametro

        int valorMaior = 0;                         // inicia uma nova variavel
        for( int valor : valores ){                 // le a array de inteiros
            if ( valorMaior < valor ){              // confere se a variavel maiorValor é menor que o valor atual da array
                valorMaior = valor;                 // pega o valorMaior atual e substitui pelo valor atual da array
            }
        }
        return ( valorMaior );                      // retorna a variavel já abastecida com o maior valor

    }

}
