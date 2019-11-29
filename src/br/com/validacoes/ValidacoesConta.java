/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.validacoes;

import br.com.controles.ControleConta;
import br.com.auxilio.LimparCampos;
import br.com.verificacao.VerificacaoCampos;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rayane
 */
public class ValidacoesConta {

    public boolean validarCamposCadastro(JFormattedTextField campoCpfClienteConta, JPasswordField campoSenhaConta) {

        VerificacaoCampos c = new VerificacaoCampos();
        LimparCampos l = new LimparCampos();
        boolean vazioFormatado = false;
        boolean vazioSenha = false;
        boolean sucesso = false;

        vazioFormatado = c.verificarCamposFormatados(campoCpfClienteConta);
        vazioSenha = c.verificarCamposSenha(campoSenhaConta);
        if (vazioSenha == false && vazioFormatado == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }

        return sucesso;
    }

    public void cadastrarConta(JFormattedTextField campoCpfClienteConta, JPasswordField campoSenhaConta) {

        ControleConta v = new ControleConta();
        boolean existe;

        existe = v.existeSenha(campoSenhaConta.getText());

        if (existe == true) {
            JOptionPane.showMessageDialog(null, "Essa senha ja existe!\nEscolha outra senha!");
        } else {
            boolean sucesso = false;

            String cpf = campoCpfClienteConta.getText();
            String senha = campoSenhaConta.getText();

            v.cadastrarConta(senha, "0", cpf);
        }
    }
}
