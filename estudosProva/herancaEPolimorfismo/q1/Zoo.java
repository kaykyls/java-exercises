package estudosProva.herancaEPolimorfismo.q1;

public class Zoo {
    public static void main(String[] args) {
        Cachorro scoobyDoo = new Cachorro();
        scoobyDoo.comunicar();

        Gato gatoDeBotas = new Gato();
        gatoDeBotas.comunicar();

        Hipopotamo gloria = new Hipopotamo();
        gloria.comunicar();
    }
}
