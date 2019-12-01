/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.validacoes;

import br.com.controles.ControleCliente;
import br.com.verificacao.VerificacaoCampos;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rayane
 */
public class ValidacoesCliente {

	 /*@ requires cpf != null && !cpf.equals("");
    @ requires nome!= null && !nome.equals("");
    @ requires endereco != null && !endereco.equals("");
    @ requires sexo != null && !sexo.equals("");
	@*/
    public void cadastrarCliente(String cpf, String nome, String endereco, String sexo) {
        ControleCliente cc = new ControleCliente();
        boolean existe;

        existe = cc.existeCliente(cpf);
        if (existe == true) {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado no sistema!");
        } else {
            boolean sucesso = false;
            cc.cadastrarCliente(cpf, nome, endereco, sexo);
        }
    }

    /*@ requires campoNomeCliente != null;
    @ requires campoEnderecoCliente != null;
    @ requires campoCpfCliente != null;
	@*/
    public boolean verificarCamposCadastro(JTextField campoNomeCliente, JTextField campoEnderecoCliente, JFormattedTextField campoCpfCliente) {
        VerificacaoCampos c = new VerificacaoCampos();
        boolean vazioTexto = false;
        boolean vazioFormatado = false;
        boolean vazio = false;

        boolean sucesso = false;
        vazioTexto = c.verificarCamposTexto(campoNomeCliente, campoEnderecoCliente);
        vazioFormatado = c.verificarCamposFormatados(campoCpfCliente);
        if (vazioTexto == false && vazioFormatado == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }
        return sucesso;
    }

    /*@ requires campoCpfCliente != null;
	@*/
    public boolean verificarCampoCpf(JFormattedTextField campoCpfCliente) {
        VerificacaoCampos c = new VerificacaoCampos();
        boolean vazio = c.verificarCamposFormatados(campoCpfCliente);
        return vazio;
    }

    /*@ requires nome!= null && !nome.equals("");
    @ requires endereco != null && !endereco.equals("");
    @ requires cpf != null && !cpf.equals("");
	@*/
    public void atualizarCiente(String nome, String endereco, String cpf) {
        ControleCliente cli = new ControleCliente();
        boolean sucesso = cli.atualizarCliente(nome, endereco, cpf);

        if (sucesso == true) {
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não alterado!");
        }
    }
    
}
