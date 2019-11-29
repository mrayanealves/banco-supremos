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

import br.com.models.Realiza;

/**
 *
 * @author Rayane
 */
public class RealizaDAO {
    Connection conn;
    Statement st;
    ResultSet rs;

    public RealizaDAO(int flag, String NomeBanco) {
        conn = new ConnectionFactory().getConnection(flag);
        try {
            st = conn.createStatement();
//            st.executeUpdate("USE " + NomeBanco + ";");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean insereRealizacao(Realiza f) {
        try {
            String sql = "INSERT INTO REALIZA VALUES (" + f.getNum_conta() + ", " + f.getNum_oper() + ", " + f.getValor() + ", '" + f.getDt_oper()
                    + "', '" + f.getHorario() + "')";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Realiza pesquisarRealizacoes(int num_conta) {
        Realiza f = null;
        try {
            String sql = "SELECT * FROM Realiza "
                    + "WHERE num_conta = " + num_conta + " ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                f = new Realiza();
                f.setNum_conta(num_conta);
                int num = Integer.parseInt(rs.getString(2));
                f.setNum_oper(num);
                float valor = Float.parseFloat(rs.getString(3));
                f.setValor(valor);
                f.setDt_oper(rs.getString(4));
                f.setHorario(rs.getString(5));
            }
            return f;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return f;
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
