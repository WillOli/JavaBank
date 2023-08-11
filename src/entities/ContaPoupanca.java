package entities;

public class ContaPoupanca {

    private double SaldoAtualContaPoupança = 0;

    /* total de saques realizados na conta */
    private double totalSaquesContaPoupança = 0;
    private double totalSaquesGeral = 0;

    /* total em dinheiro sacado da conta */
    private double totalSacadoContaPoupança = 0;
    private double totalSacadoGeral = 0;

    /* total em dinheiro depositado na conta */
    private double totalDepositadoContaPoupança = 0;
    private double totalDepositadoGeral = 0;

    /* total de depositos realizados na conta */
    private double totalDepositosContaPoupança = 0;
    private double totalDepositosGeral = 0;



    public double getSaldoAtualContaPoupança() {
        return SaldoAtualContaPoupança;
    }

    public double getTotalSaquesContaPoupança() {
        return totalSaquesContaPoupança;
    }

    public double getTotalSaquesGeral() {
        return totalSaquesGeral;
    }

    public double getTotalSacadoContaPoupança() {
        return totalSacadoContaPoupança;
    }

    public double getTotalSacadoGeral() {
        return totalSacadoGeral;
    }

    public double getTotalDepositadoContaPoupança() {
        return totalDepositadoContaPoupança;
    }

    public double getTotalDepositadoGeral() {
        return totalDepositadoGeral;
    }

    public double getTotalDepositosContaPoupança() {
        return totalDepositosContaPoupança;
    }

    public double getTotalDepositosGeral() {
        return totalDepositosGeral;
    }
}
