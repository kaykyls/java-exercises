// Leia 5 nomes e 5 notas de alunos de uma turma, calcule e exibe a média das notas da turma e
// em seguida exiba a relação de nomes cuja nota é superior a esta média.
package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Array_01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];
        int total = 0, media;
        String[] nomes = new String[5];
        ArrayList<String> nomesMaiorMedia = new ArrayList<>();

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Insira o nome do " + (i+1) + "º aluno: ");
            nomes[i] = sc.nextLine();
            System.out.print("Insira a nota do " + (i+1) + "º aluno: ");
            notas[i] = sc.nextInt();

            total += notas[i];

            sc.nextLine();
        }

        media = total/notas.length;

        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                nomesMaiorMedia.add(nomes[i]);
            }
        }

        System.out.print("Os nomes são: ");
        for(int i = 0; i < nomesMaiorMedia.size(); i++) {
            System.out.print(nomesMaiorMedia.get(i) + ", ");
        }
    }
}
