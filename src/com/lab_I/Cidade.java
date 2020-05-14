package com.lab_I;

import java.util.Scanner;
public class Cidade {

    //Atributos:
    private int codigo;
    private String nomeCidade;
    private String uf;
    private int totAlunos;

   /* public Cidade(String descricao, String uf) {
        this.descricao = descricao;
        this.uf = uf;
    }*/

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

    Scanner sc = new Scanner(System.in);

    public void setNomeCidade() {
        System.out.println("Nome da Cidade: ");
        this.nomeCidade = sc.nextLine();
    }

    public void setUf() {
        System.out.println("Estado: ");
        this.uf = sc.nextLine();
    }
    public void addAluno() {
        totAlunos ++;
    }
    Scanner sc2 = new Scanner(System.in);

//Método para criar array de Cidades
    public void criarCidade() {
        System.out.println("Quantas cidades você quer criar?");
        int c = sc.nextInt();
        int n = 1;

        Cidade[]city;
        city = new Cidade[c];
        while (n <= city.length -1) {

            city[n] = new Cidade();
            city[n].codigo = n;

            System.out.println("Nome da cidade: ");
            city[n].nomeCidade = sc2.nextLine();

            System.out.println("Estado: ");
            city[n].uf = sc2.nextLine();
            city[n].exibeDados();
            Aluno aluno = new Aluno();
            aluno.criarAluno();
            n++;
        }
    }

    public void exibeDados(){
        System.out.println("================== CIDADE ==================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNomeCidade());
        System.out.println("UF: " + getUf());
        //System.out.println("Total de Alunos: " + totAlunos);
        System.out.println("\n============================================");
    }
}
