package estudosProva.construtores.q3;

public class Q3 {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("29485-4", "Controle bluetooh com fio", 23, 40.5);

        System.out.println(f1.getDescricao());
        System.out.println("Total: " + f1.getTotalFatura());
    }
}