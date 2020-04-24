package com.lab_I;

public class Cidade {
    //Atributos:

    private int codigo;
    private String descricao;
    private String uf;
    private int totAlunos;
/*Crie os seguintes métodos na classe Cidade:
Construtor que receba como parâmetro os valores dos atributos:
Código, Descrição e UF
Métodos de acesso (GET) para os atributos:
Código, Descrição e UF
Métodos de configuração (SET) para os atributos:
Descrição e UF
Método adicionaNovoEstudante que deverá somar +1 estudante no atributo que representa a quantidade de estudantes, toda vez que o método for executado.
Método exibeDados para apresentar os dados da classe.
*/

    public Cidade(int cod, String descr, String uf) {
        this.codigo = cod;
        this.descricao = descr;
        this.uf = uf;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    public void addAluno() {
        totAlunos ++;
    }

    public void exibeDados(){
        System.out.println("================== CIDADE ==================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("UF: " + getUf());
        System.out.println("Total de Alunos: " + totAlunos);
        System.out.println("\n============================================");
    }
}
