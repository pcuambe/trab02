/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author Paulo Amosse
 */
public abstract class Pessoa {

    /**
     * SuperClasse pessoa, que possui duas outras aninhadas a ela
     *
     * @variavel idade
     * @variavel nome
     */
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Contrutor pessoa que inicializa o nome como indefinido
     */
    public Pessoa() {
        this.idade = 0;
        this.nome = "indefinido";
    }

    /**
     *Construtor pessoa que recebe como parametros a idade e o nome da pessoa
     * @param idade
     * @param nome
     */
    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa \n" + "Idade: " + idade + "\n Nome=" + nome;
    }

    
}
