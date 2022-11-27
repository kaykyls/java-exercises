//Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
//Após toda a entrada ter sido realizada, leia o valor de um reajuste. Em seguida exiba todos os salários já
//reajustados.
package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Array_04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ArrayList salarios = new ArrayList<>();
        ArrayList salariosReajustados = new ArrayList<>();

        int i = 0;

        while(true) {
            System.out.print("Insira o " + (i+1) + "º salário: ");
            double verificarSalario = sc.nextDouble();
            if (verificarSalario >= 0) {
                salarios.add(verificarSalario);
                i++;
            } else {
                break;
            }
        }

        System.out.print("Insira a porcentagem do reajuste: ");
        double reajuste = sc.nextDouble();

        System.out.println("Salários reajustados:");
        for(i = 0; i < salarios.size(); i++) {
            salariosReajustados.add((double)salarios.get(i) + (double)salarios.get(i) * (reajuste/100));
            System.out.println(salariosReajustados.get(i));
        }
    }
}
