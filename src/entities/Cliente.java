package entities;

import java.util.Scanner;

public class Cliente {

    Scanner input = new Scanner(System.in);
    private String nomecliente;
    private int idadeCliente;
    private char sexoCliente;
    private double RGCliente;
    private double CPFCliente;
    private String nacionalidadeCliente;
    private String cidadeCliente;

    Pessoa pessoa;

    public Cliente(String nomecliente, int idadeCliente, char sexoCliente, double RGCliente, double CPFCliente, String nacionalidadeCliente, String cidadeCliente) {
        this.nomecliente = nomecliente;
        this.idadeCliente = idadeCliente;
        this.sexoCliente = sexoCliente;
        this.RGCliente = RGCliente;
        this.CPFCliente = CPFCliente;
        this.nacionalidadeCliente = nacionalidadeCliente;
        this.cidadeCliente = cidadeCliente;
    }

    public Cliente() {

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
                this.mudarIdadeCliente();
            }
            else if ( operacaoMudarDados == 3) {
                this.mudarRGCliente();
            }
            else if ( operacaoMudarDados == 4) {
                this.mudarCPFCliente();
            }
            else if ( operacaoMudarDados == 5) {
                this.mudarNacionalidadeCliente();
            }
            else if ( operacaoMudarDados == 6) {
                this.mudarCidadeCliente();
            }
            else {
                System.out.println("\n\t Digite uma operação de mudança de dados válidade!");
            }
        }while( operacaoMudarDados !=0);
    }

    public void mudarNomeCliente() {
        System.out.println("\n\t Digite o novo nome do cliente: ");
        String novoNomeCliente = input.nextLine();
        this.setNomecliente( novoNomeCliente );
    }

    public void mudarIdadeCliente() {
        System.out.println("\n\t Digite o nova idade do cliente: ");
        int novoRGCliente = input.nextInt();
        this.setRGCliente( novoRGCliente );
    }

    public void mudarRGCliente() {
        System.out.println("\n\t Digite o novo RG do cliente: ");
        int novoRGCliente = input.nextInt();
        this.setRGCliente( novoRGCliente );
    }

    public void mudarCPFCliente() {
        System.out.println("\n\t Digite o novo CPF do cliente: ");
        int novoCPFCliente = input.nextInt();
        this.setCPFCliente( novoCPFCliente );
    }
    public void mudarNacionalidadeCliente() {
        System.out.println("\n\t Digite a nova nacionadalide do cliente: ");
        String novaNacionalidadeCliente = input.nextLine();
        this.setNacionalidadeCliente(String.valueOf(novaNacionalidadeCliente));
    }

    public void mudarCidadeCliente() {
        System.out.println("\n\t Digite a nova cidade do cliente: ");
        int novaCidadeCliente = input.nextInt();
        this.setIdadeCliente( novaCidadeCliente );
    }



    public String getNomecliente() {
        return this.nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public void setSexoCliente(char sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public void setRGCliente(double RGCliente) {
        this.RGCliente = RGCliente;
    }

    public void setCPFCliente(double CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public void setNacionalidadeCliente(String nacionalidadeCliente) {
        this.nacionalidadeCliente = nacionalidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }
}
