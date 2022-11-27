//Preencha uma matriz de inteiros com números aleatórios positivos menores que 100.
package arrays;

import java.util.Scanner;

public class Array_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tamanho da linha da matriz: ");
        int l = sc.nextInt();
        System.out.print("Insira o tamanho da coluna da matriz: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
