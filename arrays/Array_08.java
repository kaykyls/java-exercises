//Crie um método que recebe uma matriz de inteiros positivos e substitui seus
//elementos de valor ímpar por -1 e os pares por +1.
package arrays;

import java.util.Scanner;

public class Array_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tamanho da matriz: ");
        int tamanho = sc.nextInt();
        int[] matriz = new int[tamanho];

        System.out.println();

        for(int i = 0; i < tamanho; i++) {
            System.out.print("Insira o " + (i+1) + "º elemento da matriz: ");
            matriz[i] = sc.nextInt();
        }

        substituirElementos(matriz);

        System.out.println();

        for(int i = 0; i < matriz.length; i++) {
            System.out.println("Elemento " + (i+1) + ": " + matriz[i]);
        }
    }

    public static void substituirElementos(int[] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            if(matriz[i] % 2 == 0) {
                matriz[i] = 1;
            } else {
                matriz[i] = -1;
            }
        }
    }
}
