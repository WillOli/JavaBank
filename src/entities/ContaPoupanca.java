package entities;

import java.util.Scanner;

public class ContaPoupanca {

    Scanner input = new Scanner(System.in);


    private double SaldoAtualContaPoupanca = 0;

    /* total de saques realizados na conta */
    private double totalSaquesContaPoupanca = 0;
    private double totalSaquesGeral = 0;

    /* total em dinheiro sacado da conta */
    private double totalSacadoContaPoupanca = 0;
    private double totalSacadoGeral = 0;

    /* total em dinheiro depositado na conta */
    private double totalDepositadoContaPoupanca = 0;
    private double totalDepositadoGeral = 0;

    /* total de depositos realizados na conta */
    private double totalDepositosContaPoupanca = 0;

    private double totalDepositosGeral = 0;

    /*metodo depositar conta poupança*/
    public void depositarContaPoupanca() {
        System.out.println("\n\t Quanto depositar na conta poupança: R$ ");
        double depositarContaPoupanca = input.nextDouble();
        if (depositarContaPoupanca <= 0) {
            System.out.println("\n\t Por favor,, digite um valor válido positivo.");
        }
        else {
            System.out.println("\n\t ....Depositar Conta Poupança...");
            this.SaldoAtualContaPoupanca += depositarContaPoupanca;
            this.totalDepositadoGeral++;
            this.totalDepositosContaPoupanca++;
            this.totalDepositadoContaPoupanca += depositarContaPoupanca;
            System.out.println("\n\t Saldo atual conta poupança: R$ " + this.getSaldoAtualContaPoupanca()) ;
        }
    }

    public void sacarContaPoupanca(){
        System.out.println("\n\t Saldo atual da conta poupança: R$ " + this.getSaldoAtualContaPoupanca());
        System.out.println("\n\t Quanto sacar da conta poupança: R$ ");
        double retiraContaPoupanca = input.nextDouble();

        if (retiraContaPoupanca < this.getSaldoAtualContaPoupanca()) {
            System.out.println("\n\t ...Sacando conta corrente....");
            this.SaldoAtualContaPoupanca -= retiraContaPoupanca;
            this.totalSaquesGeral++;
            this.totalSaquesContaPoupanca += retiraContaPoupanca;
            this.totalSacadoGeral += retiraContaPoupanca;
            System.out.println("\n\t Saldo atual conta poupança: R$ " + this.getSaldoAtualContaPoupanca());

        }
        else {
            System.out.println("\n\t Você não possui esse saldo para sque na conta poupança no momento!");
        }
    }


    public double getSaldoAtualContaPoupanca() {
        return SaldoAtualContaPoupanca;
    }

    public double getTotalSaquesContaPoupanca() {
        return totalSaquesContaPoupanca;
    }

    public double getTotalSaquesGeral() {
        return totalSaquesGeral;
    }

    public double getTotalSacadoContaPoupanca() {
        return totalSacadoContaPoupanca;
    }

    public double getTotalSacadoGeral() {
        return totalSacadoGeral;
    }

    public double getTotalDepositadoGeral() {
        return totalDepositadoGeral;
    }

    public double getTotalDepositosContaPoupanca() {
        return totalDepositosContaPoupanca;
    }
    public double getTotalDepositadoContaPoupanca() {
        return totalDepositadoContaPoupanca;
    }

    public double getTotalDepositosGeral() {
        return totalDepositosGeral;
    }
}
