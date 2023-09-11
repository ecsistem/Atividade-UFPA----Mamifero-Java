/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamiferos;

/**
 *
 * @author edson
 */
public class Mamifero {
    private String nome, raça;
    private int idade;

    public String comer() {
        return(nome + " está comendo.");
    }

    public String dormir() {
        return(nome + " está dormindo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
}

