package entities;

import java.util.Scanner;

public class ContaCorrente {

    Scanner input = new Scanner(System.in);

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

    /*Metodos depositar conta corrente*/
    public void depositarContaCorrente() {
        System.out.print("\t Quanto depositar na conta corrente: R$ ");
        double depositarContaCorrente = input.nextDouble();
        System.out.println("\t ...Depositando R$ " + depositarContaCorrente + " na Conta Corrente...");
        this.SaldoAtualContaCorrente += depositarContaCorrente;
        this.totalDepositosGeral++;
        this.totalDepositosContaCorrente++;
        this.totalDepositosContaCorrente += depositarContaCorrente;
        this.totalDepositadoGeral += depositarContaCorrente;
        System.out.println("\t Saldo atual conta corrente: R$ " + this.getSaldoAtualContaCorrente());
    }

    /* metodo scar conta corrente*/    public void sacarContaCorrente() {
        System.out.println("\t Saldo atual conta corrente: R$ " + this.getSaldoAtualContaCorrente());
        System.out.println("\t Quanto sacar da conta corrente: R$");

        double retiraContaCorrente = input.nextDouble();
        if (retiraContaCorrente <= this.getSaldoAtualContaCorrente()) {
            System.out.println("\n\t ...Sacando R$ " + retiraContaCorrente + " da Conta Corrente...");
            this.SaldoAtualContaCorrente -= retiraContaCorrente;
            this.totalSaquesGeral++;
            this.totalSaquesContaCorrente++;
            this.totalSacadoContaCorrente += retiraContaCorrente;
            this.totalSacadoGeral += retiraContaCorrente;
            System.out.println("\t Saldo atual conta corrente: R$ " + this.getSaldoAtualContaCorrente());
        }
        else {
            System.out.println("\t Você não possui saldo suficiente para sacar essa quantidade no momento!");
            System.out.println("\t Seu saldo atual é: " + this.getSaldoAtualContaCorrente());
        }
    }


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
