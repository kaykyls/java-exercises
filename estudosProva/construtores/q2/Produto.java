package estudosProva.construtores.q2;

public class Produto {
    private int codigo;
    private String nome;
    private float preco;
    private int estoque;
    private int estoqueMin;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if(this.estoque + estoque > 100) {
            System.out.println("O limite do estoque é 100");
            return;
        }
        this.estoque = estoque;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getSituacao() {
        if(this.estoque >= this.estoqueMin) {
            return 0;
        }
        return 1;
    }

    public void relatorio() {
        System.out.println("codigo: " + codigo + ", nome: '" + nome + '\'' + ", preco: " + preco + ", estoque: " + estoque + ", estoque mínimo: " + estoqueMin);

        if(this.estoque < this.estoqueMin) {
            System.out.println("Você precisa comprar mais produtos");
        }
    }
}
