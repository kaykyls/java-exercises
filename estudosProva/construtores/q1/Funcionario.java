package estudosProva.construtores.q1;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private float valorHora;

    public Funcionario(String nome) {
        setNome(nome);
        setHorasTrabalhadas(0);
        setValorHora(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome + ". Horas trabalhadas: " + this.horasTrabalhadas + ". Valor hora: " + this.valorHora + ". Salário: " + this.getSalario());
    }
}
