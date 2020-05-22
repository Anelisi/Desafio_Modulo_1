package com.lab_I;

import java.util.Scanner;

public class Aluno {

    //Atributos:
    private int codigo;
    private String nome;
    private String dataNasc;
    private String email;
    private String senha;
    private Cidade cidade;
    private String senhaAtual;
    private String senhaAtual1;
    private String novaSenha1;
    private String novaSenha3;


    //Construtor por parâmetros
    public Aluno(int cod, String nom, String dataNasc, String email, String senha, Cidade cid) {
        codigo = cod;
        this.nome = nom;
        this.dataNasc = dataNasc;
        this.email = email;
        this.senha = senha;
        cidade = cid;
        cidade.addAluno();
    }

    //Construtor vazio
    public Aluno() {
    }

    Scanner scanner = new Scanner(System.in);

    //Métodos get e set
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        System.out.println("Altere o nome deste aluno: ");
        nome = scanner.next();
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc() {
        System.out.println("Altere a data de nascimento deste alunos: ");
        this.dataNasc = scanner.next();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.println("Altere o e-mail deste aluno: ");
        this.email = scanner.next();
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

    public void confirmaSenha() {
        System.out.println("Digite a senha ATUAL: ");
        this.senhaAtual = scanner.next();
        if (!senhaAtual.equals(senha)) {
            System.out.println("Senha INCORRETA!\n");
            int i = 1;
            while (i <= 3) {
                System.out.println(i + "º Tentativa de 3\nDigite a senha ATUAL:");
                senhaAtual1 = scanner.next();
                if (i == 2 && !senhaAtual1.equals(senha)) {
                    System.out.println("       ATENÇÃO!\nPróxima tentativa errada\n BLOQUEARÁ A SEU ACESSO\n");
                } else if (i == 3 && !senhaAtual1.equals(senha)) {

                    System.out.println("TENTATIVAS ESGOTADAS, ACESSO BLOQUEADO!\n Entre em contato com o setor de TI");
                }
                // i++;
                if (i < 3 && senha.equals(senhaAtual1)) {
                    this.alterarSenha();
                    break;
                }
                i++;
            }

        }else {
            this.modificaDadosAluno();
            this.alterarMaisAlgumDados();
        }
        if (senha.equals(senhaAtual) || senha.equals(senhaAtual1)) {
            this.exibeDados();
        }else System.out.println("     Contato TI: (51 9999.8888)\n");
    }

    public void alterarSenha () {
        System.out.println("Digite uma NOVA senha: ");
        this.novaSenha1 = scanner.next();
        System.out.println("Repita a NOVA senha: ");
        String novaSenha2 = scanner.next();
        if (novaSenha1.equals(novaSenha2)) {
            this.setSenha(novaSenha1);
            System.out.println("Senha alterada com SUCESSO!\n");
        } else {
            System.out.println("Erro ao repetir senha nova");

            int tenteNovamente = 1;

            while (tenteNovamente <= 3) {
                System.out.println(tenteNovamente + "º Tentativa de 3\nRepita a nova senha: ");
                this.novaSenha3 = scanner.next();

                if (tenteNovamente == 2 && !novaSenha1.equals(novaSenha3)) {
                    System.out.println("       ATENÇÃO!\nPróxima tentativa errada\n BLOQUEARÁ A SUA SENHA\n");
                } else if (tenteNovamente == 3 && !novaSenha1.equals(novaSenha3)) {
                    System.out.println("         TENTATIVAS ESGOTADAS, SENHA BLOQUEADA!\n Para efetuar o desbloqueio entre em contato com o setor de TI");
                }
                //tenteNovamente++;
                if (tenteNovamente < 4 && novaSenha1.equals(novaSenha3)) {
                    this.setSenha(novaSenha1);
                    System.out.println("Senha alterada com SUCESSO!\n");
                    break;
                }
                tenteNovamente++;
            }
        }
        if (senha.equals(senhaAtual) || senha.equals(senhaAtual1)) {
            System.out.println();
        }else if (senha.equals(novaSenha1) || novaSenha1.equals(novaSenha3)) {
            this.exibeDados();

        }else {
            System.out.println("     Contato TI: (51 9999.8888)\n");
        }
    }

    public void modificaDadosAluno () {
        System.out.println("=============== ESCOLHA A OPÇÃO ===============");
        System.out.println("=============== A SER ALTERADA ===============");
        System.out.println("Digite 1 para alterar NOME");
        System.out.println("Digite 2 para alterar DATA DE NASCIMENTO");
        System.out.println("Digite 3 para alterar E-MAIL");
        System.out.println("Digite 4 para alterar SENHA");
        System.out.println("==============================================");
        System.out.println("Informe a opção desejada: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                this.setNome();
                this.exibeDados();
                break;
            case 2:
                this.setDataNasc();
                this.exibeDados();
                break;
            case 3:
                this.setEmail();
                this.exibeDados();
                break;
            case 4:
                this.alterarSenha();
                break;
            default:
                System.out.println("================");
                System.out.println(" OPÇÃO INVALIDA");
                System.out.println("================");
        }
    }
    public void alterarMaisAlgumDados(){
        int resp2;
        do {
            System.out.println("Deseja alterar mais algum outro dado? 1-Sim 2-Não: ");
            resp2 = scanner.nextInt();
            if (resp2 == 1)
                this.modificaDadosAluno();

        } while (resp2 == 1);
    }

    public void apresentaDados () {
        System.out.println("================== ALUNO ==================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Cidade: " + cidade.getNomeCidade() + "/" + cidade.getUf());
        System.out.println("\n============================================");
    }

    // Método para exibir todos dados do aluno
    public void exibeDados () {
        System.out.println("================== DADOS ==================");
        System.out.println("================ATUALIZADOS ===============");

        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Senha: " + getSenha());
        System.out.println("Cidade: " + cidade.getNomeCidade() + "/" + cidade.getUf());
        System.out.println("\n============================================");
    }
}
