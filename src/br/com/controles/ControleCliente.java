/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controles;

import br.com.classesDAO.ClienteDAO;
import br.com.models.Cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Rayane
 */
public class ControleCliente {

	/*@ spec_public @*/ ClienteDAO cli;

    /*@ requires cpf != null && !cpf.equals("");
    @ requires nome!= null && !nome.equals("");
    @ requires endereco != null && !endereco.equals("");
    @ requires sexo != null && !sexo.equals("");
    @ assignable cli;
    @ ensures cli.encontrarCliente(cpf) != null;
	@*/
    public void cadastrarCliente(String cpf, String nome, String endereco, String sexo) {
        cli = new ClienteDAO(1, "BANCO_SUPREMOS");
        Cliente c = new Cliente();
        boolean sucesso = false;

        c.setCpf_cliente(cpf);
        c.setNome(nome);
        c.setEndereco(endereco);
        c.setSexo(sexo);

        sucesso = cli.insereCliente(c);
        
        if (sucesso == true) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!\nBem-Vindo ao Banco Supremos!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }
        
        cli.FecharConexoes();
    }

    public Cliente encontrarCliente(String cpf) {
        cli = new ClienteDAO(1, "BANCO_SUPREMOS");
        Cliente c = null;

        c = cli.encontrarCliente(cpf);
        cli.FecharConexoes();
        return c;
    }

    public boolean atualizarCliente(String nome, String endereco, String cpf) {
        cli = new ClienteDAO(1, "BANCO_SUPREMOS");
        boolean sucesso = false;
        Cliente c = new Cliente();

        c.setNome(nome);
        c.setEndereco(endereco);

        sucesso = cli.updateCliente(c, cpf);
        cli.FecharConexoes();
        return sucesso;
    }

    public boolean existeCliente(String cpf_cliente) {
        cli = new ClienteDAO(1, "BANCO_SUPREMOS");
        boolean existe = false;
        Cliente c = null;

        c = cli.encontrarCliente(cpf_cliente);
        if (c != null) {
            existe = true;
        } else {
            existe = false;
        }
        cli.FecharConexoes();
        return existe;
    }
}
