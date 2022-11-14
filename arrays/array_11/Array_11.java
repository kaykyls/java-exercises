//Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone. Faça
//um programa para solicitar os dados de vários clientes e armazenar em um ArrayList até que se
//digite um número de ID negativo. Em seguida exiba os dados de todos os clientes via
//SystemOut, formatando cada objeto separado por linhas.
package arrays.array_11;

import java.util.Scanner;
import java.util.ArrayList;

public class Array_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente>clientes = new ArrayList<>();

        int i = 0;
        while(true) {
            System.out.print("Insira o ID do cliente " + (i + 1) + " (insira um valor negativo para parar): ");
            int verificarID = sc.nextInt();
            sc.nextLine();

            if(verificarID >= 0) {
                clientes.add(new Cliente());

                clientes.get(i).id = verificarID;

                System.out.print("Insira o nome do cliente " + (i + 1) + ": ");
                clientes.get(i).nome = sc.nextLine();

                System.out.print("Insira a idade do cliente " + (i + 1) + ": ");
                clientes.get(i).idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Insira o telefone do cliente " + (i + 1) + ": ");
                clientes.get(i).telefone = sc.nextLine();

                System.out.println();
                i++;
            } else {
                break;
            }
        }

        for(i = 0; i < clientes.size(); i++) {
            System.out.println();
            System.out.println("Cliente " + (i+1) + ":");

            System.out.println("ID: " + clientes.get(i).id);
            System.out.println("Nome: " + clientes.get(i).nome);
            System.out.println("Idade: " + clientes.get(i).idade);
            System.out.println("Telefone: " + clientes.get(i).telefone);
        }
    }
}
