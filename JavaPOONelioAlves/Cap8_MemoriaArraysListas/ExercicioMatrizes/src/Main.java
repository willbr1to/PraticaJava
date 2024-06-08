import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Parte 1 ler dos dados.
        Scanner sc = new Scanner(System.in);
        int N, M = 0;

        System.out.println("Bem vindo ao Programa matrizes");
        System.out.println("Quantas linnhas para a Matriz?"); M = sc.nextInt();
        System.out.println("E Quantas colunas para a Matriz?"); N = sc.nextInt();
        int[][] matriz = new int[M][N];

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < N; j++){
                System.out.println("Digite o elemento da linha "+ (i+1) + " coluna "+ (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        // Parte 2 manipular a matriz e imprimir o resultado.
        System.out.println("Digite o elemento que deseja buscar na matriz: ");
        int x = sc.nextInt();
        int cont = 1;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(matriz[i][j] == x){
                    System.out.printf("Ocorrencia %d do elemento '%d': Pocisao [%d][%d].", cont, x, i, j);
                    System.out.println();
                    try {
                        System.out.println("Elemento a esquerda: "+ matriz[i][j - 1]);

                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    try {
                        System.out.println("Elemento a direita: "+ matriz[i][j + 1]);

                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    try {
                        System.out.println("Elemento a acima: "+ matriz[i - 1][j]);

                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    try {
                        System.out.println("Elemento a abaixo: "+ matriz[i+1][j]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    cont++;
                }
            }
        }
    }
}
