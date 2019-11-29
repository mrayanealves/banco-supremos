/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.models.Funcionario;

/**
 *
 * @author Rayane
 */
public class FuncionarioDAO {

    Connection conn;
    Statement st;
    ResultSet rs;

    public FuncionarioDAO(int flag, String NomeBanco) {
        conn = new ConnectionFactory().getConnection(flag);
        try {
            st = conn.createStatement();
//            st.executeUpdate("USE " + NomeBanco + ";");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean insereFuncionario(Funcionario f) {
        try {
            String sql = "INSERT INTO FUNCIONARIO (cpf_funcionario, nome, endereco, sexo, salario, cargaH, login, senha) VALUES ('" + f.getCpf_funcionario() + "', '" + f.getNome() + "', '" + f.getEndereco()
                    + "', '" + f.getSexo() + "', " + f.getSalario() + ", " + f.getCargaH() + ", '" + f.getLogin() + "', '" + f.getSenha() + "')";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeFuncionario(int cod_func) {
        try {
            String sql = "DELETE FROM FUNCIONARIO "
                    + "WHERE cod_func = " + cod_func + " ";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateFuncionario(Funcionario f, int cod_func) {
        try {
            String sql = "UPDATE FUNCIONARIO "
                    + "SET nome = '" + f.getNome() + "', endereco = '" + f.getEndereco()
                    + "', salario = " + f.getSalario()
                    + ", cargaH = " + f.getCargaH()
                    + " "
                    + "WHERE cod_func = " + cod_func + " ";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Funcionario pesquisarFucionario(int cod_func) {
        Funcionario f = null;
        try {
            String sql = "SELECT * FROM FUNCIONARIO "
                    + "WHERE cod_func = " + cod_func + " ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                f = new Funcionario();
                f.setCod_func(cod_func);
                f.setCpf_funcionario(rs.getString(2));
                f.setNome(rs.getString(3));
                f.setEndereco(rs.getString(4));
                f.setSexo(rs.getString(5));
                float salario = Float.parseFloat(rs.getString(6));
                f.setSalario(salario);
                int ch = Integer.parseInt(rs.getString(7));
                f.setCargaH(ch);
                f.setLogin(rs.getString(8));
            }
            return f;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return f;
    }

    public int pesquisarCodigoFucionario(String cpf) {
        Funcionario f = null;
        int cd = 0;
        try {
            String sql = "SELECT * FROM FUNCIONARIO "
                    + "WHERE cpf_funcionario = '" + cpf + "' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                f = new Funcionario();
                cd = Integer.parseInt(rs.getString(1));
            }
            return cd;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cd;
    }

    public boolean pesquisarLoginFucionario(String login, String senha) {
        Funcionario f = null;
        boolean sucesso = false;
        try {
            String sql = "SELECT * FROM FUNCIONARIO "
                    + "WHERE login = '" + login + "' and senha = '" + senha + "' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                f = new Funcionario();
                sucesso = true;
            }
            return sucesso;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sucesso;
    }

    public int pesquisarCodigoFucionarioLogado(String login) {
        Funcionario f = null;
        int cd = 0;
        try {
            String sql = "SELECT * FROM FUNCIONARIO "
                    + "WHERE login = '" + login + "' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                f = new Funcionario();
                cd = Integer.parseInt(rs.getString(1));
            }
            return cd;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cd;
    }

    public void FecharConexoes() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        rs = null;
        st = null;
        conn = null;
    }
}
