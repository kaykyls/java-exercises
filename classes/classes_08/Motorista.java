package classes.classes_08;

import java.util.Scanner;

public class Motorista {
    Scanner sc = new Scanner(System.in);

    String nome;
    int idade;
    int numCarteira;
    Carro c1 = new Carro();

    public void dirigir(double velocidadeDesejada) {
        this.c1.ligar();
        this.c1.acelerar(velocidadeDesejada);
    }

    public void comprar() {
        System.out.print("Insira a marca do carro: ");
        this.c1.marca = sc.nextLine();
        System.out.print("Insira a cor do carro: ");
        this.c1.cor = sc.nextLine();
        System.out.print("Insira a capacidade do tanque do carro: ");
        this.c1.capacidadeTanque = sc.nextDouble();

        sc.nextLine();
    }

    public void vender() {
        this.c1.marca = null;
        this.c1.cor = null;
        this.c1.capacidadeTanque = 0;
    }

    public void abastecer(double quantidade) {
        for(int i = 0; i < quantidade; i++) {
            if(this.c1.combustivelAtual < this.c1.capacidadeTanque) {
                this.c1.combustivelAtual++;
                System.out.println("Combustível atual: " + this.c1.combustivelAtual + "L");
            } else {
                System.out.println("Seu tanque já está cheio! " + (quantidade - i) + "L ficaram de fora.");
                break;
            }
        }
    }

    public void frear(double velocidadeDesejada) {
        this.c1.frear(velocidadeDesejada);
    }
}
