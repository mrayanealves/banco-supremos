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

import br.com.models.Cliente;

/**
 *
 * @author Rayane
 */
public class ClienteDAO {

    Connection conn;
    Statement st;
    ResultSet rs;

    public /*@ pure @*/ ClienteDAO(int flag, String NomeBanco) {
        conn = new ConnectionFactory().getConnection(flag);
        try {
            st = conn.createStatement();
//            st.executeUpdate("USE " + NomeBanco + ";");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public /*@ pure @*/ boolean insereCliente(Cliente c) {
        try {
            String sql = "INSERT INTO CLIENTE VALUES('" + c.getCpf_cliente() + "', '" + c.getNome() + "', '" 
                         + c.getEndereco() +  "','" + c.getSexo() + "')";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public /*@ pure @*/ boolean updateCliente(Cliente c, String cpf_cliente) {
        try {
            String sql = "UPDATE CLIENTE "
                    + "SET nome = '" + c.getNome() + "', endereco = '" + c.getEndereco() +"' "
                    + "WHERE cpf_cliente ='" + cpf_cliente + "' ";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public /*@ pure @*/ Cliente encontrarCliente(String cpf_cliente) {
        Cliente c = null;
        try {
            String sql = "SELECT * FROM CLIENTE "
                    + "WHERE cpf_cliente ='" + cpf_cliente + "' ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                c = new Cliente();
                c.setCpf_cliente(cpf_cliente);
                c.setNome(rs.getString(2));
                c.setEndereco(rs.getString(3));
                c.setSexo(rs.getString(4));
            }
            return c;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return c;
    }

    public /*@ pure @*/ void MostrarClientes() {
        Cliente c = null;

        try {
            String sql = "SELECT * FROM CLIENTE";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                c = new Cliente();
                c.setCpf_cliente(rs.getString(1));
                c.setNome(rs.getString(2));
                c.setEndereco(rs.getString(3));
                c.setSexo(rs.getString(4));
                System.out.println("CPF: " + c.getCpf_cliente() + " Nome: " + c.getNome() + " Endereço: " + c.getEndereco() + " Sexo: " +c.getSexo());
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public /*@ pure @*/ void FecharConexoes() {
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
