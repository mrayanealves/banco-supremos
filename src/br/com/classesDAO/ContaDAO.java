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

import br.com.models.Conta;

/**
 *
 * @author Rayane
 */
public class ContaDAO {

    Connection conn;
    Statement st;
    ResultSet rs;

    public ContaDAO(int flag, String NomeBanco) {
        conn = new ConnectionFactory().getConnection(flag);
        try {
            st = conn.createStatement();
//            st.executeUpdate("USE " + NomeBanco + ";");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean insereConta(Conta g) {
        try {
            String sql = "INSERT INTO CONTA (senha, saldo, cpf_cliente) VALUES('" + g.getSenha() + "', " + g.getSaldo() + ", '" + g.getCpf_cliente() + "')";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeConta(int num_conta) {
        try {
            String sql = "DELETE FROM CONTA "
                    + "WHERE num_conta = " + num_conta + " ";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateConta(Conta g, int num_conta) {
        try {
            String sql = "UPDATE CONTA "
                    + "SET saldo = " + g.getSaldo() + ", senha = " + g.getSenha() + " "
                    + "WHERE num_conta =" + num_conta + " ";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Conta encontrarConta(int num_conta) {
        Conta g = null;
        try {
            String sql = "SELECT * FROM CONTA "
                    + "WHERE num_conta = " + num_conta + " ";
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                g = new Conta();
                g.setNum_conta(num_conta);
                g.setSenha(rs.getString(2));                
                float saldo = Float.parseFloat(rs.getString(3));
                g.setSaldo(saldo);
                g.setCpf_cliente(rs.getString(4));
            }
            return g;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return g;
    }

    public double encontrarSaldo(int num_conta) {
        double saldo = 0;
        try {
            String sql = "SELECT saldo FROM CONTA "
                    + "WHERE num_conta = " + num_conta + " ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                saldo = Double.parseDouble(rs.getString(1));
            }
            return saldo;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return saldo;
    }

    public int encontrarCodigoConta(String senha) {
        Conta c;
        int cod = 0;
        try {
            String sql = "SELECT num_conta FROM CONTA "
                    + "WHERE senha = '" + senha + "' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                c = new Conta();
                cod = Integer.parseInt(rs.getString(1));
            }
            return cod;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cod;
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
