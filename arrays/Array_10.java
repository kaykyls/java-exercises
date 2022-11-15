//Escreva um programa Java contendo um ArrayList de inteiros chamado valores.
//Peça para o usuário informar 5 valores inteiros e adicione-os individualmente no ArrayList. Em
//seguida imprima os elementos do ArrayList, de forma individual, usando o laço for.
package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Array_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ArrayList array = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            array.add(sc.nextInt());
            System.out.println(array.get(i));
        }
    }
}