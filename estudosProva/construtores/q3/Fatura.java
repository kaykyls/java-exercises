package estudosProva.construtores.q3;

public class Fatura {
    String numero;
    String descricao;
    int quantidade;
    double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        setNumero(numero);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotalFatura() {
        if(preco * quantidade < 0) {
            return 0;
        }
        return preco * quantidade;
    }
}