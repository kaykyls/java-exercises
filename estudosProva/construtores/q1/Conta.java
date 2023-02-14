package estudosProva.construtores.q1;

public class Conta {
    private String conta;
    private String cliente;
    private float saldo;

    public Conta(String conta, String cliente) {
        setSaldo(0);
        setConta(conta);
        setCliente(cliente);
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void deposito(float valor) {
        this.saldo += valor;
    }

    public int saque(float valor) {
        if(valor > this.saldo) {
            return 1;
        }
        this.saldo -= valor;
        return 0;
    }
}
