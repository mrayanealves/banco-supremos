/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.verificacao;

import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rayane
 */
public class VerificacaoCampos{
    private /*@ spec_public @*/boolean vazio;
    
    /*@ requires campos != null;
    @ assignable vazio;
	@*/
    public boolean verificarCamposTexto(JTextField... campos){
        for (int i = 0; i < campos.length; i++) {
            if (campos[i].getText().equals("")) {
                vazio = true;
                break;
            } else {
                vazio = false;
            }
        }       
        return vazio;
    }
    
    /*@ requires senhas != null;
    @ assignable vazio;
	@*/
    public boolean verificarCamposSenha(JPasswordField... senhas){
        boolean vazio = false;
        
        for (int i = 0; i < senhas.length; i++) {
            if (senhas[i].getText().trim().length() == 0) {
                vazio = true;
            } else {
                vazio = false;
            }
        }       
        return vazio;
    }
    
    /*@ requires campos != null;
    @ assignable vazio;
	@*/
    public boolean verificarCamposFormatados(JFormattedTextField... campos){
        boolean vazio = false;
        
        for (int i = 0; i < campos.length; i++) {
            if (campos[i].getText().trim().length() == 14) {
                vazio = false;
            } else {
                vazio = true;
            }
        }       
        return vazio;
    }
}
