package com.lab_I;

import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);

    //Atributos:
    private int codigo;
    private String nome;
    private String dataNasc;
    private String email;
    private String senha;
    private Cidade cidade;
    private String novaSenha1;

    //Construtor por parâmetros
    public Aluno(int cod, String nome, String dataNasc, String email, String senha, Cidade cid) {
        codigo = cod;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
        this.senha = senha;
        cidade = cid;
        cidade.addAluno();
    }

    //Construtor vazio
    public Aluno() {}


    //Métodos get e set
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo() {
        System.out.println("Altere o código deste aluno: ");
        this.codigo = scanner.nextInt();
    }

    public void setNome() {
        System.out.println("Altere o nome deste aluno: ");
        this.nome = scanner.nextLine();
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc() {
        System.out.println("Altere a data de nascimento deste alunos: ");
        this.dataNasc = scanner.nextLine();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.println("Altere o e-mail deste aluno: ");
        this.email = scanner.nextLine();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }


    //Método para alterar a senha quando for necessário
    public void alterarSenha() {
        System.out.println("Digite a senha atual: ");
        String senhaAtual = scanner.nextLine();
        if (!senhaAtual.equals(senha)) {
            System.out.println("Senha INCORRETA!\n");

            String erroSenhaAtual = "Senha INCORRETA!";
            int i = 1;
            while (i <= 3 && !senhaAtual.equals(senha)) {

                if (erroSenhaAtual.equals("Senha INCORRETA!")) {
                    System.out.println(i + "º Tentativa de 3\nDigite a senha atual:");
                    String senhaAtual1 = scanner.nextLine();
                    if (i == 2 && !senhaAtual.equals(senha)){
                        System.out.println("       ATENÇÃO!\nPróxima tentativa errada\n BLOQUEARÁ A SEU ACESSO\n");
                    }
                    if (i==3 && !senhaAtual.equals(senha)){

                        System.out.println("TENTATIVAS ESGOTADAS, ACESSO BLOQUEADO!\n Entre em contato com o setor de TI");
                    }
                    i++;
                }
            }

        } else {
            System.out.println("Digite uma nova senha: ");
            String novaSenha1 = scanner.nextLine();
            System.out.println("Repita a nova senha: ");
            String novaSenha2 = scanner.nextLine();
            if (novaSenha1.equals(novaSenha2)) {
                this.setSenha(novaSenha1);
                System.out.println("Senha alterada com SUCESSO!\n");
            } else {
                System.out.println("Erro ao repetir senha nova");

                int tenteNovamente = 1;
                String mensgErroRepetirSenha = "Erro ao repetir senha nova";

                while (tenteNovamente <= 3 && !novaSenha1.equals(novaSenha2)) {
                    if (mensgErroRepetirSenha.equals("Erro ao repetir senha nova")) {
                        System.out.println(tenteNovamente + "º Tentativa de 3\nRepita a nova senha: ");
                        String novaSenha3 = scanner.nextLine();
                        if (tenteNovamente == 2) {
                            System.out.println("       ATENÇÃO!\nPróxima tentativa errada\n BLOQUEARÁ A SUA SENHA\n");
                        }
                        if (tenteNovamente==3 && !novaSenha3.equals(novaSenha1)){

                            System.out.println("TENTATIVAS ESGOTADAS, SENHA BLOQUEADA!\n Para efetuar o desbloqueio entre em contato com o setor de TI");
                        }
                        tenteNovamente++;


                        if (novaSenha1.equals(novaSenha3)) {
                            this.setSenha(novaSenha1);
                            System.out.println("Senha alterada com SUCESSO!\n");
                        }
                    }
                }
            }
        }
    }

    // Método para exibir todos dados do aluno
    public void exibeDados() {
        System.out.println("================== ALUNO ==================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Cidade: " + cidade.getNomeCidade() + "/" + cidade.getUf());
        System.out.println("\n============================================");
    }
}