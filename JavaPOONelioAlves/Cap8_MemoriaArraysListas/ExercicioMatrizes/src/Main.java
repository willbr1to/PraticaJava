import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(Arrays.deepToString(matriz));
    }
}
