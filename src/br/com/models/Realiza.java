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
public class Realiza {
	
    private int num_conta;
    private int num_oper;
    private float valor;
    private String dt_oper;
    private String horario;

    public void setDt_oper(String dt_oper) {
        this.dt_oper = dt_oper;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public void setNum_oper(int num_oper) {
        this.num_oper = num_oper;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDt_oper() {
        return dt_oper;
    }

    public String getHorario() {
        return horario;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public int getNum_oper() {
        return num_oper;
    }

    public float getValor() {
        return valor;
    }
}
