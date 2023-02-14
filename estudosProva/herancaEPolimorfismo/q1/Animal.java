package estudosProva.herancaEPolimorfismo.q1;

abstract  class Animal {
    public void comer() {
        System.out.println("hmm estou comendo");
    }

    abstract public void comunicar();

    public void andar() {
        System.out.println("Estou andando sai do meio");
    }
}
