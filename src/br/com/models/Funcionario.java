/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.models;

/**
 *
 * @author Rayane
 */
public class Funcionario {
	
    private int cod_func;
    private String cpf_funcionario;
    private String nome;
    private String endereco;
    private String sexo;
    private float salario;
    private int cargaH;
    private String login;
    private String senha;

    public int getCod_func() {
        return cod_func;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }

    public void setCargaH(int cargaH) {
        this.cargaH = cargaH;
    }

    public void setCpf_funcionario(String cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
		this.salario = salario;
	}

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCargaH() {
        return cargaH;
    }

    public String getCpf_funcionario() {
        return cpf_funcionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String getSenha() {
        return senha;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Nome: " +nome+ "\nCPF: " +cpf_funcionario +"\nEndereco: " +endereco+ "\nLogin: " +login+ "\nCarga horaria: " +cargaH; 
    }
    
}
