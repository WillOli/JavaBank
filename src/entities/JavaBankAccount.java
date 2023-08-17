package entities;

import java.util.Scanner;

public class JavaBankAccount {
    ContaCorrente contaCorrente;
    ContaPoupanca contaPoupanca;
    Pessoa pessoa;

    private int Agencia = 42;

    Scanner input = new Scanner(System.in);
    public void start() {
        System.out.println("\n\t ...Bem vindo ao Java Bank, " + pessoa.getNomePessoa());

        do {
            System.out.println("\n\t Operações:");
            System.out.println("\t Digite [] --> Ver extrato");
            System.out.println("\t Digite [] --> Mudar algum dado da conta.");
            System.out.println("\t Digite [] --> Operações de depositos.");
            System.out.println("\t Digite [] --> Operações de saques.");
            System.out.println("\t Digite [] --> Encerrar sessão no JavaBank");
            System.out.print("\t Opção: ");

            int operacaoJavaBank = input.nextInt();

            if (operacaoJavaBank == 1) {
                this.getExtrato();
            }
            else if ( operacaoJavaBank == 2) {
                this.MudarDados();
            }
            else if ( operacaoJavaBank == 3) {
                this.Depositos();
            }
            else if ( operacaoJavaBank == 4) {
                this.Saques();
            }
            else if ( operacaoJavaBank == 0) {
                break;
            }
            else {
                System.out.println("\t Digite uma operação válida");
            }

        }while(true);
    }
    public void MudarDados() {
        int operacaoMudarDados = 1;

        do {
            System.out.println("\t Mudar dados da conta:");
            System.out.println("\t Digite [1] --> Mudar nome do cliente.");
            System.out.println("\t Digite [2] --> Mudar idade do cliente.");
            System.out.println("\t Digite [3] --> Mudar RG do cliente.");
            System.out.println("\t Digite [4] --> Mudar CPF do cliente.");
            System.out.println("\t Digite [5] --> Mudar nacionalidade do cliente.");
            System.out.println("\t Digite [6] --> Mudade cidade do cliente.");
            System.out.println("\t Digite [0] --> Voltar menu Principal.");
            System.out.println("\t Opção:");

            operacaoMudarDados = input.nextInt();

            if (operacaoMudarDados == 1) {
                this.mudarNomeCliente();
            }
            else if ( operacaoMudarDados == 2) {
                this.mudarIdadeCliente;
            }
            else if ( operacaoMudarDados == 3) {
                this.mudarRGCliente;
            }
            else if ( operacaoMudarDados == 4) {
                this.mudarCPFCliente;
            }
            else if ( operacaoMudarDados == 5) {
                this.mudarNacionalidadeCliente;
            }
            else if ( operacaoMudarDados == 6) {
                this.mudarCidadeCliente;
            }
            else {
                System.out.println("\n\t Digite uma operação de mudança de dados válidade!");
            }
        }while( operacaoMudarDados !=0);
    }

    public void Depositos() {
        do {
            System.out.println("\n\t Operações de Depositos");
            System.out.println("\t Digite [1] --> Depositar dinheiro na conte corrente.");
            System.out.println("\t Digite [2] --> Depositar dinheiro na conta poupança.");
            System.out.println("\t Digite [0] --> Voltar menu principal.");
            System.out.print("\t Opção:");

            int operacaoDeposito = input.nextInt();

            if ( operacaoDeposito == 1) {
                this.depositarContaCorrente();
            }
            else if ( operacaoDeposito == 2) {
                this.depositarContaPoupanca;
            }
            else if ( operacaoDeposito == 0) {
                break;
            }
            else {
                System.out.println("\n\t Digite uma operação de sque válida!");
            }
        }while( true );
    }

    /* metodo imprime extrato dos dados da conta */
    public void getExtrato() {
        System.out.print("\n\t Olá, " + pessoa.getNomePessoa());
        System.out.print("\n\t  Extrato atual da conta... ");
        System.out.print("\n\t Agencia: " + this.getAgencia());
        System.out.print("\n\t Saldo conta corrente: R$" + contaCorrente.getSaldoAtualContaCorrente());
        System.out.print("\n\t Saldo Conta poupança: R$" + contaPoupanca.getSaldoAtualContaPoupanca());
        System.out.print("\n\t Total saques da conta corrente: R$" + contaCorrente.getTotalSaquesContaCorrente());
        System.out.print("\n\t Total saques da conta poupança: R$" + contaPoupanca.getTotalSaquesContaPoupanca());
        //System.out.print("\n\t Total de saques Geral: "); // implementar a regra do saque geral
        System.out.print("\n\t Total sacado conte corrente: R$" + contaCorrente.getTotalSacadoContaCorrente());
        System.out.print("\n\t Total sacado conte poupança: R$" + contaPoupanca.getTotalSacadoContaPoupanca());
        System.out.print("\n\t Total depositos na conta corrente: R$" + contaCorrente.getTotalDepositosContaCorrente());
        System.out.print("\n\t Total depositos na conta poupança: R$" + contaPoupanca.getTotalDepositosContaPoupanca());
        //System.out.print("\n\t Total depositos geral: "); // implementar a regra do depositos geral
        System.out.print("\n\t Total depositado na conta corrente: R$" + contaCorrente.getTotalDepositadoContaCorrente());
        System.out.print("\n\t Total depositado na conta poupança: R$" + contaPoupanca.getTotalDepositadoContaPoupanca());
        //System.out.print("\n\t Total depositado geral R$: "); // implementar a regra do depositado geral
    }

    public int getAgencia() {
        return Agencia;
    }



}
