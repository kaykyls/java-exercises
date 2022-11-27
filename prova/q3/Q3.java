package prova.q3;

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Pessoa isaacNewton = new Pessoa();
        Pessoa albertEinsten = new Pessoa();

        isaacNewton.ajustaDataDeNascimento(14, 3, 1879);
        isaacNewton.calculaIdade();
        isaacNewton.informaIdade();

        albertEinsten.ajustaDataDeNascimento(4, 1, 1643);
        albertEinsten.calculaIdade();
        albertEinsten.informaIdade();


    }
}