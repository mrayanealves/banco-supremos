/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.auxilio;

import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Rayane
 */
public class LimparCampos {
    
    public void limparCamposDeTexto(JTextField... campo){
        for (int i = 0; i < campo.length; i++) {
            campo[i].setText("");
        }
    }
    public void limparCamposDeSenha(JPasswordField... senhas){
        for (int i = 0; i < senhas.length; i++) {
            senhas[i].setText("");
        }       
    }
    
    public void limparCamposFormatados(JFormattedTextField... formatados){
        for (int i = 0; i < formatados.length; i++) {
            formatados[i].setText("");
        }
    }
    public void desmarcarRadios(JRadioButton... radios){
        for (int i = 0; i < radios.length; i++) {
            radios[i].setSelected(false);
        }
    }
    public void desmarcarGrudoDeBotao(ButtonGroup... grupo){
        for (int i = 0; i < grupo.length; i++) {
            grupo[i].clearSelection();
        }
    }
}
