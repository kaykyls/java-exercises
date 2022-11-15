package classes.classes_08;

public class Carro {
    String marca;
    String cor;
    double capacidadeTanque;
    double velocidade;
    int ano;
    private double velocidadeAnterior = 0;
    double combustivelAtual = 0;
    private boolean ligado = false;

    public void ligar() {
        System.out.println("Carro ligado!");
        ligado = true;
    }

    public void desligar() {
        if (ligado) {
            this.parar();
            System.out.println("Carro desligado!");
        } else {
            System.out.println("Seu carro já está desligado!");
        }
    }

    public void acelerar(double velocidadeDesejada) {
        if(ligado) {
            for(double i = velocidadeAnterior; i < velocidadeDesejada; i++) {
                this.velocidade++;
                System.out.println("Velocidade: " + velocidade + "KM/H");
                this.velocidadeAnterior = velocidade;
            }
        } else {
            System.out.println("Para acelerar você deve ligar o carro!");
        }
    }

    public void parar() {
        for (int i = (int)velocidade; i > 0; i--) {
            velocidade = i;
            System.out.println("Parando! " + velocidade + "KM/H");
        }
    }

    public void frear(double velocidadeDesejada) {
        for(int i = (int)velocidade; i > velocidadeDesejada; i--) {
            velocidade--;
            System.out.println("Freando! " + velocidade + "KM/H");
        }
    }
}
