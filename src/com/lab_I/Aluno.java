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

    /*Crie os seguintes métodos na classe Estudante:
Construtor que receba como parâmetro os valores dos atributos:
Código
Nome
Data de nascimento
Email
Senha
Cidade
(o método construtor deve fazer uso também do método adicionaNovoEstudante da classe Cidade, para que, a cada novo estudante cadastrado para um determinado curso (associação simples entre classes), seja calculada e armazenada a quantidade de estudantes para a cidade selecionada)
Métodos de acesso (GET) para todos os atributos
Métodos de configuração (SET) para todos os atributos
Método exibeDados para apresentar todos os dados da classe
*/

    public Aluno(int cod, String name, String nasc, String email, String senha, Cidade cidade) {
        this.codigo = cod;
        this.nome = name;
        this.dataNasc = nasc;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;

        cidade.addAluno();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void alterarSenha() {
        System.out.println("Digite a senha atual: ");
        String senhaAtual = scanner.nextLine();
        if (senhaAtual.equals(senha)){
            System.out.println("Digite uma nova senha: ");
            String novaSenha1 = scanner.nextLine();
            System.out.println("Repita a nova senha: ");
            String novaSenha2 = scanner.nextLine();
            if (novaSenha1.equals(novaSenha2)) {
                this.setSenha(novaSenha1);
                System.out.println("Senha alterada com sucesso!");
            } else {
                System.out.println("Erro ao repetir senha nova");
            }
        }else{
            System.out.println("Senha INCORRETA!");
        }
    }

    public void exibeDados() {
        System.out.println("================== ALUNO ==================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Cidade: " + cidade.getDescricao() + "/" + cidade.getUf());
        System.out.println("\n============================================");
    }
}
