/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.telas;

import br.com.controles.ControleConta;
import br.com.controles.ControleRealizaOperacoes;
import br.com.auxilio.LimparCampos;
import br.com.validacoes.ValidacoesOperacoes;
import br.com.verificacao.VerificacaoCampos;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo Melo
 */
public class Transferencia extends javax.swing.JDialog {

    /**
     * Creates new form Transferencia
     */
    public Transferencia() {
        initComponents();
        this.setModal(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelRealizarTranferencia = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoContaRemetente = new javax.swing.JTextField();
        campoSenhaRemetente = new javax.swing.JPasswordField();
        campoContaDestino = new javax.swing.JTextField();
        valorTransferencia = new javax.swing.JTextField();
        botaoTransferir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(502, 379));

        painelRealizarTranferencia.setBackground(new java.awt.Color(255, 255, 255));
        painelRealizarTranferencia.setMaximumSize(new java.awt.Dimension(502, 379));
        painelRealizarTranferencia.setMinimumSize(new java.awt.Dimension(502, 379));

        jLabel1.setText("Número da conta remetente: ");

        jLabel2.setText("Número da conta de destino:");

        jLabel3.setText("Senha da conta:");

        jLabel4.setText("Valor da tranferência: ");

        botaoTransferir.setBackground(new java.awt.Color(255, 255, 255));
        //botaoTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/botoes/Transferência.png"))); // NOI18N
        botaoTransferir.setBorder(null);
        botaoTransferir.setText("Transferir");
        botaoTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTransferirActionPerformed(evt);
            }
        });

        //jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/logoRodape.png"))); // NOI18N

        //jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/fundos/menuInicialOperacoes.png"))); // NOI18N
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout painelRealizarTranferenciaLayout = new javax.swing.GroupLayout(painelRealizarTranferencia);
        painelRealizarTranferencia.setLayout(painelRealizarTranferenciaLayout);
        painelRealizarTranferenciaLayout.setHorizontalGroup(
            painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRealizarTranferenciaLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRealizarTranferenciaLayout.createSequentialGroup()
                        .addComponent(campoContaRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(painelRealizarTranferenciaLayout.createSequentialGroup()
                        .addGroup(painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(valorTransferencia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoContaDestino)
                            .addComponent(campoSenhaRemetente, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRealizarTranferenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoTransferir)
                .addGap(36, 36, 36))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        painelRealizarTranferenciaLayout.setVerticalGroup(
            painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRealizarTranferenciaLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoContaRemetente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenhaRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelRealizarTranferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoTransferir)
                .addGap(18, 18, 18)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRealizarTranferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRealizarTranferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTransferirActionPerformed
        ValidacoesOperacoes v = new ValidacoesOperacoes();
        LimparCampos l = new LimparCampos();
        boolean preenchido = v.validarCamposOperacoes(campoContaRemetente, campoContaDestino, campoSenhaRemetente, campoContaDestino);
        String destinatario = campoContaRemetente.getText();
        String destino = campoContaDestino.getText();
        String senha = campoSenhaRemetente.getText();
        String valor = valorTransferencia.getText();
        
        if (preenchido == true) {
            v.realizarTransferencia(destinatario, destino, senha, valor);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }

        //l.limparCamposDeSenha(campoSenhaConta);
        //l.limparCamposDeTexto(campoNumConta, campoValorSaque);F        
    }//GEN-LAST:event_botaoTransferirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoTransferir;
    private javax.swing.JTextField campoContaDestino;
    private javax.swing.JTextField campoContaRemetente;
    private javax.swing.JPasswordField campoSenhaRemetente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painelRealizarTranferencia;
    private javax.swing.JTextField valorTransferencia;
    // End of variables declaration//GEN-END:variables
}
