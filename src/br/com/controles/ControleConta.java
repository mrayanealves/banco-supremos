/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controles;

import br.com.classesDAO.ContaDAO;
import br.com.models.Conta;

import javax.swing.JOptionPane;

/**
 *
 * @author Rayane
 */
public class ControleConta {

    ContaDAO conta;

    public void cadastrarConta(String senha, String saldo, String cpf_cliente) {
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        Conta c = new Conta();
        boolean sucesso = false;

        float sal =  Float.parseFloat(saldo);
        c.setSenha(senha);
        c.setSaldo(sal);
        c.setCpf_cliente(cpf_cliente);

        sucesso = conta.insereConta(c);
        if (sucesso == true) {
            int cod;
            cod = conta.encontrarCodigoConta(senha);
            JOptionPane.showMessageDialog(null, "Conta cadastrada!\nO código da sua conta é " + cod + " .");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }
        conta.FecharConexoes();
    }

    public int recuperarCodigoConta(String senha) {
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        int cod;

        cod = conta.encontrarCodigoConta(senha);
        conta.FecharConexoes();
        return cod;
    }

    public Conta obterConta(String num) {
        int num_conta = Integer.parseInt(num);
        Conta c = null;
        conta = new ContaDAO(1, "BANCO_SUPREMOS");

        c = conta.encontrarConta(num_conta);
        conta.FecharConexoes();
        return c;
    }

    public boolean atualizarConta(Conta c, String num_conta) {
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        int num = Integer.parseInt(num_conta);
        boolean sucesso = conta.updateConta(c, num);

        return sucesso;
    }

    public boolean existeSenha(String senha) {
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        boolean existe;

        int cod;
        cod = conta.encontrarCodigoConta(senha);

        if (cod == 0) {
            existe = false;
        } else {
            existe = true;
        }

        return existe;
    }

    public boolean existeConta(String num) {
        int num_conta = Integer.parseInt(num);
        boolean existe = false;
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        Conta c = null;

        c = conta.encontrarConta(num_conta);

        if (c != null) {
            existe = true;
        } else {
            existe = false;
        }
        conta.FecharConexoes();
        return existe;
    }

    public boolean senhaValida(String num, String senha) {
        int num_conta = Integer.parseInt(num);
        boolean valida = false;
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        Conta c = null;

        c = conta.encontrarConta(num_conta);

        if (c.getSenha().equals(senha)) {
            valida = true;
        } else {
            valida = false;
        }
        conta.FecharConexoes();
        return valida;
    }

    public double pegarSaldo(String num) {
        int numero = Integer.parseInt(num);
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        
        double saldo = 0;
        saldo = conta.encontrarSaldo(numero);
        
        return saldo;
    }

    public boolean valorValido(String num, String valor) {
        int num_conta = Integer.parseInt(num);
        double valorSaque = Double.parseDouble(valor);
        boolean valida = false;
        conta = new ContaDAO(1, "BANCO_SUPREMOS");
        double c = 0;
        int num2 = Integer.parseInt(num);
        c = conta.encontrarSaldo(num2);

        if (c > valorSaque) {
            valida = true;
        } else {
            valida = false;
        }
        conta.FecharConexoes();
        return valida;
    }

}
