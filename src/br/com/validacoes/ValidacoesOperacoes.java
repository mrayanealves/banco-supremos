/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.validacoes;

import br.com.auxilio.LimparCampos;
import br.com.controles.ControleConta;
import br.com.controles.ControleRealizaOperacoes;
import br.com.verificacao.VerificacaoCampos;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Rayane
 */
public class ValidacoesOperacoes {

    public boolean validarCamposOperacoes(JTextField campoNumConta) {
        VerificacaoCampos v = new VerificacaoCampos();
        LimparCampos l = new LimparCampos();
        boolean vazioTexto = false;
        boolean sucesso;
        vazioTexto = v.verificarCamposTexto(campoNumConta);

        if (vazioTexto == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }

        return sucesso;
    }

    public boolean validarCamposOperacoes(JTextField campoNumConta, JPasswordField campoSenhaConta, JTextField campoValorSaque) {
        VerificacaoCampos v = new VerificacaoCampos();
        LimparCampos l = new LimparCampos();
        boolean vazioTexto = false;
        boolean vazioSenha = false;
        boolean sucesso = false;

        vazioTexto = v.verificarCamposTexto(campoNumConta, campoValorSaque);
        vazioSenha = v.verificarCamposSenha(campoSenhaConta);

        vazioSenha = v.verificarCamposSenha(campoSenhaConta);
        if (vazioSenha == false && vazioTexto == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }

        return sucesso;
    }

    public boolean validarCamposOperacoes(JTextField campoNumConta, JTextField campoNumConta2, JPasswordField campoSenhaConta, JTextField campoValorSaque) {
        VerificacaoCampos v = new VerificacaoCampos();
        LimparCampos l = new LimparCampos();
        boolean vazioTexto = false;
        boolean vazioSenha = false;
        boolean sucesso = false;

        vazioTexto = v.verificarCamposTexto(campoNumConta, campoValorSaque, campoNumConta2);
        vazioSenha = v.verificarCamposSenha(campoSenhaConta);

        vazioSenha = v.verificarCamposSenha(campoSenhaConta);
        if (vazioSenha == false && vazioTexto == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }

        return sucesso;
    }

    public boolean validarCamposOperacoes(JTextField campoNumConta, JTextField campoValor) {
        VerificacaoCampos v = new VerificacaoCampos();
        LimparCampos l = new LimparCampos();
        boolean vazioTexto = false;
        boolean sucesso = false;

        vazioTexto = v.verificarCamposTexto(campoNumConta, campoValor);
        if (vazioTexto == false) {
            sucesso = true;
        } else {
            sucesso = false;
        }

        return sucesso;
    }

    public void realizarSaque(String num, String senha, String valor) {
        ControleConta c = new ControleConta();
        boolean existe;
        existe = c.existeConta(num);
        if (existe == true) {
            boolean validaSenha;
            validaSenha = c.senhaValida(num, senha);
            if (validaSenha == true) {
                boolean saldoValido;
                saldoValido = c.valorValido(num, valor);
                if (saldoValido == true) {
                    ControleRealizaOperacoes r = new ControleRealizaOperacoes();
                    r.realizarSaque(valor, num);

                } else {
                    JOptionPane.showMessageDialog(null, "O valor que deseja sacar é acima do valor que possui na sua conta.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta não existente!");
        }
    }

    public void realizarDeposito(String num, String valor) {
        ControleConta c = new ControleConta();
        boolean existe;
        existe = c.existeConta(num);
        if (existe == true) {
            ControleRealizaOperacoes r = new ControleRealizaOperacoes();
            r.realizaDeposito(valor, num);
        } else {
            JOptionPane.showMessageDialog(null, "Conta não existente!");
        }
    }

    public void realizarTransferencia(String numDestinatario, String numDestino, String senhaDestinatario, String valor) {
        ControleConta conta = new ControleConta();
        ControleRealizaOperacoes c = new ControleRealizaOperacoes();
        boolean existeDestino;
        boolean existeDestinatario;

        existeDestino = conta.existeConta(numDestino);
        existeDestinatario = conta.existeConta(numDestinatario);
        if (existeDestino == true) {
            if (existeDestinatario == true) {
                boolean existeSenha = conta.senhaValida(numDestinatario, senhaDestinatario);
                if (existeSenha == true) {
                    boolean valorValido = conta.valorValido(numDestinatario, valor);
                    if (valorValido == true) {
                        c.realizaTransferencia(numDestinatario, numDestino, valor);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "A conta de destino não existe!\nVerifique o código digitado e tente novamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Essa conta não existe!\nVerifique o código digitado e tente novamente.");
        }
    }

    public void realizarExtrato(String num, JTable tabela) {
        ControleConta conta = new ControleConta();
        ControleRealizaOperacoes c = new ControleRealizaOperacoes();
        boolean existe;
        existe = conta.existeConta(num);
        if (existe == true) {
            c.realizarExtrato(num, tabela);
        } else {
            JOptionPane.showMessageDialog(null, "Conta não existente!");
        }
    }

}
