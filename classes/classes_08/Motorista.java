package classes.classes_08;

import java.util.Scanner;

public class Motorista {
    Scanner sc = new Scanner(System.in);

    String nome;
    int idade;
    int numCarteira;
    Carro c1 = new Carro();

    public void dirigir(double velocidadeDesejada) {
        c1.ligar();
        c1.acelerar(velocidadeDesejada);
    }

    public void comprar() {
        System.out.print("Insira a marca do carro: ");
        c1.marca = sc.nextLine();
        System.out.print("Insira a cor do carro: ");
        c1.cor = sc.nextLine();
        System.out.print("Insira a capacidade do tanque do carro: ");
        c1.capacidadeTanque = sc.nextDouble();

        sc.nextLine();
    }

    public void vender() {
        c1.marca = null;
        c1.cor = null;
        c1.capacidadeTanque = 0;
    }

    public void abastecer(double quantidade) {
        for(int i = 0; i < quantidade; i++) {
            if(c1.combustivelAtual < c1.capacidadeTanque) {
                c1.combustivelAtual++;
                System.out.println("Combustível atual: " + c1.combustivelAtual + "L");
            } else {
                System.out.println("Seu tanque já está cheio! " + (quantidade - i) + "L ficaram de fora.");
                break;
            }
        }
    }

    public void frear(double velocidadeDesejada) {
        c1.frear(velocidadeDesejada);
    }
}
