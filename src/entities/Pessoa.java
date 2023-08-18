package entities;

import java.util.Scanner;

public class Pessoa {
    Scanner input = new Scanner(System.in);

    private String nomePessoa;
    private int idadePessoa;
    private char sexoPessoa;
    private double RGPessoa;
    private double CPFPessoa;
    private String nacionalidadePessoa;
    private String cidadePessoa;

    public void start() {
        System.out.println("\n\n\t Cadastro de Pessoa física.");

        System.out.print("\t Digite seu nome: ");
        String nomePessoa = input.nextLine();
        this.setNomePessoa(nomePessoa);

        System.out.print("\t Digite sua idade: ");
        int idadePessoa = input.nextInt();
        this.setIdadePessoa(idadePessoa);

        System.out.print("\t Digite seu sexo (F/M):");
        char sexoPessoa = input.next().charAt(0);
        this.setSexoPessoa(sexoPessoa);

        System.out.print("\t Digite seu RG: ");
        double RGPessoa = input.nextDouble();
        this.setRGPessoa(RGPessoa);

        System.out.print("\t Digite sua Nacionalidade: ");
        String nacionalidadePessoa = input.next();

        this.setNacionalidadePessoa(nacionalidadePessoa);

        System.out.print("\t Digite seu CPF: ");
        double CPFPessoa = input.nextDouble();
        this.setCPFPessoa(CPFPessoa);

        System.out.print("\t Digite sua Cidade de Origem: ");
        input.nextLine();
        String cidadePessoa = input.nextLine();
        this.getCidadePessoa();
    }




    public Pessoa() {

    }

    public Pessoa(String nomePessoa,
                  int idadePessoa,
                  char sexoPessoa,
                  double RGPessoa,
                  double CPFPessoa,
                  String nacionalidadePessoa,
                  String cidadePessoa) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.sexoPessoa = sexoPessoa;
        this.RGPessoa = RGPessoa;
        this.CPFPessoa = CPFPessoa;
        this.nacionalidadePessoa = nacionalidadePessoa;
        this.cidadePessoa = cidadePessoa;

    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public char getSexoPessoa() {
        return sexoPessoa;
    }

    public void setSexoPessoa(char sexoPessoa) {
        this.sexoPessoa = sexoPessoa;
    }

    public double getRGPessoa() {
        return RGPessoa;
    }

    public void setRGPessoa(double RGPessoa) {
        this.RGPessoa = RGPessoa;
    }

    public double getCPFPessoa() {
        return CPFPessoa;
    }

    public void setCPFPessoa(double CPFPessoa) {
        this.CPFPessoa = CPFPessoa;
    }

    public String getNacionalidadePessoa() {
        return nacionalidadePessoa;
    }

    public void setNacionalidadePessoa(String nacionalidadePessoa) {
        this.nacionalidadePessoa = nacionalidadePessoa;
    }

    public String getCidadePessoa() {
        return this.cidadePessoa;
    }

    public void setCidadePessoa(String cidadePessoa) {
        this.cidadePessoa = cidadePessoa;
    }
}
