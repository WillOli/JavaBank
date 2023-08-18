/*https://github.com/ropalma/ICMC-USP/tree/master/USP%20-%20Programa%C3%A7%C3%A3o%20Orientado%20a%20Objetos/Exemplos/JavaBank*/

import entities.Cliente;
import entities.JavaBankAccount;
import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t Bem vindo ao Java Bank!\n");
        Scanner input = new Scanner(System.in);
        int continuePrograma;

        do {
            System.out.println("\n\t Digite [1] --> Começar um exemplo.");
            System.out.println("\t Digite [0] --> Encerrar o programa.");
            System.out.print("\t Opção: ");

            continuePrograma = input.nextInt();

            if ( continuePrograma == 1) {
                Pessoa NovoCliente = new Pessoa();
                NovoCliente.start();

                String nomeCliente = NovoCliente.getNomePessoa();
                int idadeCliente = NovoCliente.getIdadePessoa();
                char sexoCliente = NovoCliente.getSexoPessoa();
                double RGCliente = NovoCliente.getRGPessoa();
                double CPFCliente = NovoCliente.getCPFPessoa();
                String nacionalidadeCliente = NovoCliente.getNacionalidadePessoa();
                String cidadeCliente = NovoCliente.getCidadePessoa();

                System.out.println("\t Deposito inicial da conta corrente: ");
                double saldoInicialContaCorrente = input.nextDouble();

                System.out.println("\t Deposito inicial da conta poupança: ");
                double saldoInicialContaPoupança = input.nextDouble();

                Cliente newCliente = new Cliente(
                        nomeCliente,
                        idadeCliente,
                        sexoCliente,
                        RGCliente,
                        CPFCliente,
                        nacionalidadeCliente,
                        cidadeCliente
                );

                JavaBankAccount NewJavaBankAccount = new JavaBankAccount(newCliente);

                NewJavaBankAccount.start();
            }
            else if( continuePrograma == 0) {
                System.out.println("\t ...Encerrando Java Bank... \n\n");
                break;
            }
        }while(true);

    }
}