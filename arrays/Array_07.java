//Faça um programa que preencha uma matriz 20x10 com numeros inteiros, e some
//cada uma das colunas, armazenando o resultado da soma em um vetor. A seguir o programa
//devera multiclar cada elemento da matriz pela soma da coluna e mostrar a matriz resultante.
package arrays;

import java.util.Scanner;

public class Array_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha = 3, coluna = 3;

        int[][] matriz = new int[linha][coluna];
        int[] somaColuna = new int[coluna];
        int[][] matrizMultiplicada = new int[linha][coluna];

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.print("Linha " + (i+1) + ", coluna " + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();

                somaColuna[j] += matriz[i][j];
            }
            System.out.println();
        }

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matrizMultiplicada[i][j] = matriz[i][j] * somaColuna[j];
            }
        }

        System.out.println();

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.print(matrizMultiplicada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
