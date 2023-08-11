package entities;

public class ContaCorrente {

    /* total de saques realizados na conta */
    private double SaldoAtualContaCorrente = 0;
    private double totalSaquesContaCorrente = 0;
    private double totalSaquesGeral = 0;

    /* total em dinheiro sacado da conta */
    private double totalSacadoContaCorrente = 0;
    private double totalSacadoGeral = 0;

    /* total em dinheiro depositado na conta */
    private double totalDepositadoContaCorrente = 0;
    private double totalDepositadoGeral = 0;

    /* total de depositos realizados na conta */
    private double totalDepositosContaCorrente = 0;
    private double totalDepositosGeral = 0;


    public double getSaldoAtualContaCorrente() {
        return SaldoAtualContaCorrente;
    }

    public double getTotalSaquesContaCorrente() {
        return totalSaquesContaCorrente;
    }

    public double getTotalSaquesGeral() {
        return totalSaquesGeral;
    }

    public double getTotalSacadoContaCorrente() {
        return totalSacadoContaCorrente;
    }

    public double getTotalSacadoGeral() {
        return totalSacadoGeral;
    }

    public double getTotalDepositadoContaCorrente() {
        return totalDepositadoContaCorrente;
    }

    public double getTotalDepositadoGeral() {
        return totalDepositadoGeral;
    }

    public double getTotalDepositosContaCorrente() {
        return totalDepositosContaCorrente;
    }

    public double getTotalDepositosGeral() {
        return totalDepositosGeral;
    }
}
