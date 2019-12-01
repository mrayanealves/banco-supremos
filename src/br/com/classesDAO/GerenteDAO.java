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
import br.com.models.Gerente;

/**
 *
 * @author Rayane
 */
public class GerenteDAO {

	/*@ spec_public @*/Connection conn;
	/*@ spec_public @*/Statement st;
	/*@ spec_public @*/ResultSet rs;

	/*@ requires flag == 1;
    @ requires nomeBanco != null && nomeBanco.equals("BANCO_SUPREMO");
	@*/
    public GerenteDAO(int flag, String nomeBanco) {
        conn = new ConnectionFactory().getConnection(flag);
        try {
            st = conn.createStatement();
//            st.executeUpdate("USE " + NomeBanco + ";");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean insereGerente(Gerente g) {
        try {
            String sql = "INSERT INTO GERENTE VALUES(" + g.getCod_func() + ", " + g.getBonificacao() + ")";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeGerente(int cod_func) {
        try {
            String sql = "DELETE FROM GERENTE "
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

    public boolean updateGerente(Gerente g, int cod_func) {
        try {
            String sql = "UPDATE GERENTE "
                    + "SET bonificacao = " + g.getBonificacao() + " "
                    + "WHERE cod_func ='" + cod_func + "' ";
            st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Gerente encontrarGerente(int cod_func) {
        Gerente g = null;
        try {
            String sql = "SELECT * FROM GERENTE "
                    + "WHERE cod_func = " + cod_func + " ";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                g = new Gerente();
                g.setCod_func(cod_func);
                float bon = Float.parseFloat(rs.getString(2));
                g.setBonificacao(bon);
            }
            return g;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return g;
    }

    public void MostrarGerente() {
        Gerente g = null;

        try {
            String sql = "SELECT * FROM GERENTE";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                g = new Gerente();              
                int cod = Integer.parseInt(rs.getString(1));
                g.setCod_func(cod);
                float bon = Float.parseFloat(rs.getString(2));
                g.setBonificacao(bon);
                
                System.out.println("Código do gerente: " + g.getCod_func() + " Valor da bonificação: " + g.getBonificacao());
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
