package estudosProva.construtores.q2;

public class Q2 {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setNome("Amassador de alho");
        p1.setPreco(40);
        p1.setEstoqueMin(20);
        p1.setEstoque(10);
        p1.setCodigo(3443492);
        p1.relatorio();
    }
}
