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
public class Gerente {
    private int cod_func;
    private float bonificacao;

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public int getCod_func() {
        return cod_func;
    }
    
    
}
