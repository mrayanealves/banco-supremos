/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.verificacao;

import br.com.classesDAO.FuncionarioDAO;

/**
 *
 * @author Rayane
 */
public class VerificacaoLogin {
	/*@ spec_public @*/FuncionarioDAO func;
    
	/*@ requires login != null && !login.equals("");
    @ requires senha!= null && !senha.equals("");
    @ assignable func;
	@*/
    public boolean verificarLogin(String login, String senha){
        boolean logado = false;
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        
        logado = func.pesquisarLoginFucionario(login, senha);
        func.FecharConexoes();        
        return logado;
    }
}
