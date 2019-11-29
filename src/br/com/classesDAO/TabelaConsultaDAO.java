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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rayane e Ayesha
 */
public class TabelaConsultaDAO {

    Connection conn;
    Statement st;
    ResultSet rs;
    private DefaultTableModel modelo = new DefaultTableModel();

    public TabelaConsultaDAO(int flag, String NomeBanco) {
        conn = new ConnectionFactory().getConnection(flag);
        try {
            st = conn.createStatement();
//            st.executeUpdate("USE " + NomeBanco + ";");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void popularTabela(int num, JTable tabela) {
        modelo.addColumn("Tipo de operação");
        modelo.addColumn("Data");
        modelo.addColumn("Horário");
        modelo.addColumn("Valor");

        tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(70);

        tabela.setModel(modelo);

        try {
            String sql = "SELECT o.tipo, r.dt_oper, r.horario_oper, r.valor FROM Realiza r, Operacoes o WHERE o.num_oper = r.num_oper and num_conta = "+num+"";
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            rs.first();
            do {
                modelo.addRow(new Object[]{rs.getObject("tipo"), rs.getObject("dt_oper"),
                    rs.getObject("horario_oper"), rs.getObject("valor")});

            } while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(TabelaConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limparTabela(JTable tabela) {
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");

        tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(70);

        tabela.setModel(modelo);

        modelo.addRow(new Object[]{});
    }

}
