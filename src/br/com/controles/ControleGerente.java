/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controles;

import br.com.classesDAO.GerenteDAO;
import br.com.models.Gerente;

/**
 *
 * @author Rayane
 */
public class ControleGerente {

/*@ spec_public @*/ GerenteDAO ger;

    /*@ requires cod_func > 0;
      @ requires valor != null && !valor.equals("");
      @ assignable ger;
    @*/
    public void cadastrarGerente(int cod_func, String valor) {
        ger = new GerenteDAO(1, "BANCO_SUPREMOS");
        Gerente g = new Gerente();
        boolean sucesso = false;

        float valor_bon = Float.parseFloat(valor);
        g.setCod_func(cod_func);
        g.setBonificacao(valor_bon);

        sucesso = ger.insereGerente(g);
        ger.FecharConexoes();
    }

    /*@ requires cod_func > 0;
    @ assignable ger;
	  @*/
    public boolean ehGerente(int cod_func) {
        ger = new GerenteDAO(1, "BANCO_SUPREMOS");
        Gerente g = null;
        boolean gerente = false;
        g = ger.encontrarGerente(cod_func);

        if (g == null) {
            gerente = false;
        } else {
            gerente = true;
        }

        ger.FecharConexoes();
        return gerente;
    }
}
