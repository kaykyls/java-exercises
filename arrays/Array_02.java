// Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. Calcule a média de todas elas.
package arrays;

import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, media;

        System.out.print("Insira a quantidade de notas a serem lidas: ");
        int quantidade = sc.nextInt();

        int[] notas = new int[quantidade];

        for(int i = 0; i < quantidade; i++) {
            System.out.print("Insira a " + (i+1) + "ª nota: ");
            notas[i] = sc.nextInt();
            total += notas[i];
        }

        media = total / quantidade;

        System.out.println("A média é: " + media);
    }
}
