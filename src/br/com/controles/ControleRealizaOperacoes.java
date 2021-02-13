/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controles;

import br.com.auxilio.ObterDataHorario;
import br.com.classesDAO.RealizaDAO;
import br.com.classesDAO.TabelaConsultaDAO;
import br.com.models.Conta;
import br.com.models.Operacoes;
import br.com.models.Realiza;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rayane
 */
public class ControleRealizaOperacoes {

	/*@ spec_public @*/RealizaDAO real;
    private /*@ spec_public @*/int num_oper;

    /*@ requires valor != null && !valor.equals("");
    @ requires num!= null && !num.equals("");
    @ assignable num_oper, real;
	@*/
    public void realizarSaque(String valor, String num) {
        int num_conta = Integer.parseInt(num);
        float valorSaque = Float.parseFloat(valor);
        num_oper = 1;
        Realiza r = new Realiza();
        ControleConta cont = new ControleConta();
        Conta c = null;

        boolean sucesso = false;

        real = new RealizaDAO(1, "BANCO_SUPREMOS");
        ObterDataHorario data_horario = new ObterDataHorario();
        String data = data_horario.obeterData();
        String horario = data_horario.oberHorario();

        r.setNum_oper(num_oper);
        r.setNum_conta(num_conta);
        r.setDt_oper(data);
        r.setHorario(horario);
        r.setValor(valorSaque);

        c = cont.obterConta(num);
        c.setSaldo(c.getSaldo() - valorSaque);

        sucesso = cont.atualizarConta(c, num);

        sucesso = real.insereRealizacao(r);
        if (sucesso == true) {
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao sacar!");
        }
        real.FecharConexoes();
    }

    /*@ requires valor != null && !valor.equals("");
    @ requires num!= null && !num.equals("");
    @ assignable num_oper, real;
	@*/
    public void realizaDeposito(String valor, String num) {
        int num_conta = Integer.parseInt(num);
        float valorDeposito =  Float.parseFloat(valor);
        num_oper = 2;
        Realiza r = new Realiza();
        ControleConta cont = new ControleConta();
        Conta c = null;

        boolean sucesso = false;

        real = new RealizaDAO(1, "BANCO_SUPREMOS");
        ObterDataHorario data_horario = new ObterDataHorario();
        String data = data_horario.obeterData();
        String horario = data_horario.oberHorario();

        r.setNum_oper(num_oper);
        r.setNum_conta(num_conta);
        r.setDt_oper(data);
        r.setHorario(horario);
        r.setValor(valorDeposito);

        c = cont.obterConta(num);
        c.setSaldo(c.getSaldo() + valorDeposito);

        sucesso = cont.atualizarConta(c, num);

        sucesso = real.insereRealizacao(r);
        if (sucesso == true) {
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao depositar!");
        }
        real.FecharConexoes();
    }

    /*@ requires numDestinatario != null && !numDestinatario.equals("");
    @ requires numDestino!= null && !numDestino.equals("");
    @ requires valor!= null && !valor.equals("");
    @ assignable num_oper, real;
	@*/
    public void realizaTransferencia(String numDestinatario, String numDestino, String valor) {
        int conta_destinatario = Integer.parseInt(numDestinatario);
        int conta_destino = Integer.parseInt(numDestino);
        float valorTransferencia =  Float.parseFloat(valor);;
        num_oper = 3;
        Realiza r = new Realiza();
        ControleConta cont = new ControleConta();
        Conta c = null;
        Conta d = null;

        boolean sucesso = false;

        real = new RealizaDAO(1, "BANCO_SUPREMOS");
        ObterDataHorario data_horario = new ObterDataHorario();
        String data = data_horario.obeterData();
        String horario = data_horario.oberHorario();

        r.setNum_oper(num_oper);
        r.setNum_conta(conta_destinatario);
        r.setDt_oper(data);
        r.setHorario(horario);
        r.setValor(valorTransferencia);

        c = cont.obterConta(numDestinatario);
        c.setSaldo(c.getSaldo() - valorTransferencia);

        d = cont.obterConta(numDestino);
        d.setSaldo(d.getSaldo() + valorTransferencia);

        if (cont.atualizarConta(c, numDestinatario) == true && cont.atualizarConta(d, numDestino) == true) {
            JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao transferir!");
        }

        sucesso = real.insereRealizacao(r);
        real.FecharConexoes();
    }
    
    /*@ spec_public @*/TabelaConsultaDAO tb;

    /*@ requires num != null && !num.equals("");
    @ requires tabela!= null;
    @ assignable tb;
	@*/
    public void realizarExtrato(String num, JTable tabela) {
        int numero = Integer.parseInt(num);
        tb = new TabelaConsultaDAO(1, "BANCO_SUPREMOS");
        tb.popularTabela(numero, tabela);
    }

}
