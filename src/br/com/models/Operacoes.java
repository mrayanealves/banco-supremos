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
public class Operacoes {
	
    private int num_oper;
    private boolean saque;
    private boolean deposito;
    private boolean extrato;
    private boolean transferencia;
    private boolean emprestimo;

    public void setNum_oper(int num_oper) {
        this.num_oper = num_oper;
    }

    public void setDeposito(boolean deposito) {
        this.deposito = deposito;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void setExtrato(boolean extrato) {
        this.extrato = extrato;
    }

    public void setSaque(boolean saque) {
        this.saque = saque;
    }

    public void setTransferencia(boolean transferencia) {
        this.transferencia = transferencia;
    }

    public int getNum_oper() {
        return num_oper;
    }

    public boolean isDeposito() {
        return deposito;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public boolean isExtrato() {
        return extrato;
    }

    public boolean isSaque() {
        return saque;
    }

    public boolean isTransferencia() {
        return transferencia;
    }
}
