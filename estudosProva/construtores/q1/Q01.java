package estudosProva.construtores.q1;

public class Q01 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro");
        f1.setHorasTrabalhadas(10);
        f1.setValorHora(50);
        System.out.println(f1.getSalario());

        Conta c1 = new Conta("02434690-3", "João");
        c1.setSaldo(1500);
        System.out.println(c1.saque(1400));
    }

}