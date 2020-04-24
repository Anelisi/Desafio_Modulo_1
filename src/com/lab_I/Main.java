package com.lab_I;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cidade c1 = new Cidade(1,"Porto Alegre", "RS");

        Aluno a1 = new Aluno(1,"Anelsi","14/04/1987","anelisi@unisinos.com","123456",c1);
        Aluno a2 = new Aluno(2,"Arthur","30/10/1986","arthur@unisinos.com","654321",c1);

        Cidade c2 = new Cidade(2,"São Borja", "RS");
        Aluno a3 = new Aluno(3,"Eliane","10/03/1960","eliane@unisinos.com","456789",c2);
        Aluno a4 = new Aluno(4,"Leides","15/04/1987","leides@unisinos.com","987654",c2);

       System.out.println("Digite o seu código de aluno: ");
        int confereCodigo = sc.nextInt();

        switch (confereCodigo) {
            case 1:
                if (confereCodigo == a1.getCodigo()) {
                    a1.alterarSenha();
                } else {
                    System.out.println("Informação incorreta");
                } a1.exibeDados();
                break;
            case 2:
                if (confereCodigo == a2.getCodigo()) {
                    a2.alterarSenha();
                } else {
                    System.out.println("Informação incorreta");
                } a2.exibeDados();
                break;
            case 3:
                if (confereCodigo == a3.getCodigo()) {
                    a3.alterarSenha();
                } else {
                    System.out.println("Informação incorreta");
                } a3.exibeDados();
                break;
            case 4:
                if (confereCodigo == a4.getCodigo()) {
                    a4.alterarSenha();
                } else {
                    System.out.println("Informação incorreta");
                } a4.exibeDados();
                break;
        }

        c1.exibeDados();
        c2.exibeDados();
    }
}
