package model;

import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable {
    private String cpf;
    private int idade;

    public PessoaFisica(int id, String name, String cpf, int idade) {
        super(id, name);
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    } 

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    @Override
    public void exibir() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }



    @Override
    public String toString() {
        return "ID: " + getId() + ", Name: " + getName() + ", CPF: " + cpf + ", Idade: " + idade;
    }

}
