package com.lab_I;

import java.util.Scanner;
public class Main {
    static int MaxC = 4;
    static int contC = 1;

    static int MaxA = 80;
    static int contA = 1;

    //Método para criar uma Cidade
    public static Cidade criarCidade() {
        int cod = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-- Criando a " + contC + "ª  Cidade --");
        System.out.println("Código da Cidade: " + ++cod);
        System.out.print("Nome da Cidade: ");
        String nomeCidade = sc.nextLine();
        System.out.print("Estado da Cidade: ");
        String uf = sc.nextLine();

        Cidade newCid = new Cidade(cod,nomeCidade,uf);
        return newCid;
    }

    //Método para criar um Aluno
    public static Aluno criarAluno(Cidade c) {
        int codigo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-- Criando o " + contA + "º Aluno--");
        System.out.println("Código do Aluno: " + ++codigo);
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
        int resp, resp1, resp2;

        do{
            city[contC] = criarCidade();
            city[contC].exibeDados();

            do{
                student[contA] = criarAluno(city[contC]);
                student[contA].apresentaDados();
                System.out.println("\nGostaria de alterar seus dados? 1-Sim 2-Não: ");
                resp1 = sc.nextInt();
                if (resp1 == 1){
                    student[contA].confirmaSenha();
                } else {
                student[contA].exibeDados();
                city[contC].exibeDados();
                }
                contA++; //incrementa o índice do array de alunos

                System.out.print("\nDeseja Criar outro Aluno ? 1-Sim 2-Não: ");
                resp = sc.nextInt();
            }while (resp == 1);

            contC++;
        }while (contC < MaxC) ;

        System.out.println("\n\t-- RESUMO DE OBJETOS --");
        for(int c = 1; c<contC; c++){
            city[c].exibeDados();
        }
        for(int a = 1; a<contA; a++){
            student[a].apresentaDados();
        }
    }
}