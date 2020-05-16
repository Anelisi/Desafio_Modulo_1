package com.lab_I;

import java.util.Scanner;
public class Main {
    static int MaxC = 2;
    static int contC = 1;

    static int MaxA = 4;
    static int contA = 1;

    //Método para criar uma Cidade
    public static Cidade criarCidade() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-- Criando a " + contC + "ª  Cidade --");
        System.out.print("Código da Cidade: ");
        int cod = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome da Cidade: ");
        String nomeCidade = sc.nextLine();
        System.out.print("Estado da Cidade: ");
        String uf = sc.nextLine();

        Cidade newCid = new Cidade(cod,nomeCidade,uf);
        return newCid;
    }

    //Método para criar um Aluno
    public static Aluno criarAluno(Cidade c) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-- Criando o " + contA + "º Aluno--");
        System.out.print("Código do Aluno: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do Aluno: ");
        String nome = sc.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNasc = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Crie uma senha para este Aluno: ");
        String senha = sc.nextLine();

        Aluno newAlu = new Aluno(codigo,nome,dataNasc,email,senha,c);
        return newAlu;
    }


    public static void main(String[] args) {
        Cidade[]city = new Cidade[MaxC];
        Aluno[]student = new Aluno[MaxA];
        Scanner sc = new Scanner(System.in);
        int resp;

        do{
            city[contC] = criarCidade();
            city[contC].exibeDados();

            do{
                student[contA] = criarAluno(city[contC]);
                student[contA].alterarSenha();
                student[contA].exibeDados();
                city[contC].exibeDados();
                contA++; //incrementa o índice do array de alunos

                System.out.print("\nDeseja Criar outro Aluno ? 1-Sim 2-Não: ");
                resp = sc.nextInt();
            }while (resp == 1);

            contC++; //incrementa o índice do array de cidades
        }while (contC < MaxC) ;//limitei a 2 Cidades para poder testar

        System.out.println("\n\t-- RESUMO DE OBJETOS --");
        for(int c = 0; c<contC; c++){
            city[c].exibeDados();
        }
        for(int a = 0; a<contA; a++){
            student[a].exibeDados();
        }
    }
}