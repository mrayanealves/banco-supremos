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
public class Conta {
	
    private int num_conta;
    private String senha;
    private float saldo;
    private String cpf_cliente;

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

   public void setSaldo(float saldo) {
	this.saldo = saldo;
   }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }
}
