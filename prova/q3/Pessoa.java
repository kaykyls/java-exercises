package prova.q3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
    int idade;
    int mes;
    int dia;
    int ano;
    String nome;

    public void calculaIdade() {
        GregorianCalendar hoje = new GregorianCalendar();

        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        this.idade = (anoAtual - this.ano) - 1;

        if(mes >= this.mes) {
            if(diaAtual < this.dia && this.mes == mesAtual){
                return;
            }
            this.idade++;
        }
    }

    public void informaIdade() {
       System.out.println(this.idade);
    }

    public void informaNome() {
        System.out.println(this.nome);
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
