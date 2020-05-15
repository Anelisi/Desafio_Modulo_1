package com.lab_I;

import java.util.Scanner;

public class Cidade {

    //Atributos:
    private int codigo;
    private String nomeCidade;
    private String uf;
    private int totAlunos;

    Scanner sc = new Scanner(System.in);

    public Cidade(int cod, String descricao, String uf) {
        codigo = cod;
        this.nomeCidade = descricao;
        this.uf = uf;
    }

    //Construtor
    public Cidade() {}

    //Métodos
    public int getCodigo() {
        return codigo;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public String getUf() {
        return uf;
    }

    public void setCodigo() {
        System.out.println("Altere o Código da Cidade: ");
        this.codigo = sc.nextInt();
    }
    public void setNomeCidade() {
        System.out.println("Altere o Nome da Cidade: ");
        this.nomeCidade = sc.nextLine();
    }

    public void setUf() {
        System.out.println("Altere o Estado da Cidade: ");
        this.uf = sc.nextLine();
    }
    public void addAluno() {
        totAlunos ++;
    }

    public void exibeDados(){
        System.out.println("================== CIDADE ==================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNomeCidade());
        System.out.println("UF: " + getUf());
        System.out.println("Total de Alunos: " + totAlunos);
        System.out.println("\n============================================");
    }
}
