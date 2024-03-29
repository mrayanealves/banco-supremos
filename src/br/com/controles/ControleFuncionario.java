/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controles;

import br.com.classesDAO.FuncionarioDAO;
import br.com.models.Funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author Rayane
 */
public class ControleFuncionario {

    FuncionarioDAO func;

    public void cadastrarFuncionario(String cpf_cliente, String nome, String endereco, String sexo, String salario, String cargaH, String login, String senha) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        Funcionario f = new Funcionario();
        boolean sucesso = false;

        float sal = Float.parseFloat(salario);
        int cH = Integer.parseInt(cargaH);

        f.setCpf_funcionario(cpf_cliente);
        f.setNome(nome);
        f.setEndereco(endereco);
        f.setSexo(sexo);
        f.setSalario(sal);
        f.setCargaH(cH);
        f.setLogin(login);
        f.setSenha(senha);

        sucesso = func.insereFuncionario(f);
        if (sucesso == true) {
            int cod;
            cod = func.pesquisarCodigoFucionario(cpf_cliente);
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!\nSeu código de funcionário é " + cod + "\nPor favor nao perca esse código!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }

        func.FecharConexoes();
    }

    public int recuperarCodigoFuncionario(String cpf) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        int cod;

        cod = func.pesquisarCodigoFucionario(cpf);
        func.FecharConexoes();
        return cod;
    }

    public Funcionario vizualizarFuncionario(String cod) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        Funcionario f = null;
        int c = Integer.parseInt(cod);
        f = func.pesquisarFucionario(c);
        func.FecharConexoes();
        return f;
    }

    public boolean atualizarFuncionario(String cod_func, String nome, String endereco, String salario, String cargaH) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        boolean sucesso = false;
        Funcionario fun = new Funcionario();

        fun.setNome(nome);
        fun.setEndereco(endereco);

        float sal = Float.parseFloat(salario);
        int carga = Integer.parseInt(cargaH);

        fun.setSalario(sal);
        fun.setCargaH(carga);

        int cod = Integer.parseInt(cod_func);
        sucesso = func.updateFuncionario(fun, cod);
        func.FecharConexoes();
        return sucesso;
    }

    public boolean deletarFuncionario(String cod) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        int cod_func = Integer.parseInt(cod);
        boolean sucesso = false;

        sucesso = func.removeFuncionario(cod_func);
        func.FecharConexoes();
        return sucesso;
    }

    public int recuperarCodLogado(String login) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        int cod = 0;

        cod = func.pesquisarCodigoFucionarioLogado(login);
        func.FecharConexoes();
        return cod;
    }

    public boolean existeCodFuncionario(String cod) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        int c = Integer.parseInt(cod);
        boolean existe = false;
        Funcionario f = null;

        f = func.pesquisarFucionario(c);
        if (f != null) {
            existe = true;
        } else {
            existe = false;
        }
        func.FecharConexoes();
        return existe;
    }

    public boolean existeFuncionario(String cpf) {
        func = new FuncionarioDAO(1, "BANCO_SUPREMOS");
        boolean existe = false;
        int f = 0;

        f = func.pesquisarCodigoFucionario(cpf);
        if (f != 0) {
            existe = true;
        } else {
            existe = false;
        }
        func.FecharConexoes();
        return existe;
    }
}
