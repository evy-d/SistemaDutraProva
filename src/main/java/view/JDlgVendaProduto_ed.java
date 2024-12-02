/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tools.Util;
/**
 *
 * @author Erickson
 */
public class JDlgVendaProduto_ed extends javax.swing.JDialog {

    /**
     * Creates new form jDglVenda
     */
    public JDlgVendaProduto_ed(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Venda Produto");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtCodigoProduto_ed, jTxtCodigoVenda_ed, jTxtQuantidade_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, jBtnPesquisar_ed);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCodigoProduto = new javax.swing.JLabel();
        jLblCodigoVenda = new javax.swing.JLabel();
        jTxtCodigoVenda_ed = new javax.swing.JTextField();
        jTxtCodigoProduto_ed = new javax.swing.JTextField();
        jLblQuantidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtQuantidade_ed = new javax.swing.JTextField();
        jLblValor = new javax.swing.JLabel();
        jTxtValor_ed = new javax.swing.JTextField();
        jBtnIncluir_ed = new javax.swing.JButton();
        jBtnAlterar_ed = new javax.swing.JButton();
        jBtnExcluir_ed = new javax.swing.JButton();
        jBtnConfirmar_ed = new javax.swing.JButton();
        jBtnCancelar_ed = new javax.swing.JButton();
        jBtnPesquisar_ed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblCodigoProduto.setText("Código Produto");

        jLblCodigoVenda.setText("Codigo Venda");

        jTxtCodigoProduto_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoProduto_edActionPerformed(evt);
            }
        });

        jLblQuantidade.setText("Quantidade");

        jLblValor.setText("Valor unidade");

        jBtnIncluir_ed.setText("Incluir");
        jBtnIncluir_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir_edActionPerformed(evt);
            }
        });

        jBtnAlterar_ed.setText("Alterar");
        jBtnAlterar_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar_edActionPerformed(evt);
            }
        });

        jBtnExcluir_ed.setText("Excluir");
        jBtnExcluir_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir_edActionPerformed(evt);
            }
        });

        jBtnConfirmar_ed.setText("Confirmar");
        jBtnConfirmar_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmar_edActionPerformed(evt);
            }
        });

        jBtnCancelar_ed.setText("Cancelar");
        jBtnCancelar_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_edActionPerformed(evt);
            }
        });

        jBtnPesquisar_ed.setText("Pesquisar");
        jBtnPesquisar_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisar_edActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLblCodigoProduto)
                                    .addGap(96, 96, 96))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTxtCodigoProduto_ed)
                                    .addGap(24, 24, 24)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblQuantidade)
                                    .addComponent(jTxtQuantidade_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblValor)
                            .addComponent(jTxtCodigoVenda_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblCodigoVenda)
                            .addComponent(jTxtValor_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnIncluir_ed)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnConfirmar_ed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnAlterar_ed)
                            .addComponent(jBtnPesquisar_ed))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnExcluir_ed)
                            .addComponent(jBtnCancelar_ed))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodigoProduto)
                    .addComponent(jLblCodigoVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCodigoProduto_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCodigoVenda_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblQuantidade)
                    .addComponent(jLblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtQuantidade_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtValor_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnIncluir_ed)
                            .addComponent(jBtnExcluir_ed)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar_ed)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnConfirmar_ed)
                            .addComponent(jBtnCancelar_ed)
                            .addComponent(jBtnPesquisar_ed))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoProduto_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoProduto_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoProduto_edActionPerformed

    private void jBtnIncluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_edActionPerformed
        Util.habilitar(true, jTxtCodigoProduto_ed, jTxtCodigoVenda_ed, jTxtQuantidade_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed);
        Util.habilitar(false, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnIncluir_edActionPerformed

    private void jBtnAlterar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_edActionPerformed
        Util.habilitar(true, jTxtCodigoProduto_ed, jTxtCodigoVenda_ed, jTxtQuantidade_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed);
        Util.habilitar(false, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnAlterar_edActionPerformed

    private void jBtnExcluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_edActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão", "Deletar Registro", JOptionPane.YES_NO_OPTION);
    if (resp == JOptionPane.YES_OPTION) {   
        Util.limpar(jTxtCodigoProduto_ed, jTxtCodigoVenda_ed, jTxtQuantidade_ed, jTxtValor_ed, 
        jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, jBtnPesquisar_ed);
    }
    }//GEN-LAST:event_jBtnExcluir_edActionPerformed

    private void jBtnConfirmar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_edActionPerformed
       Util.habilitar(false, jTxtCodigoProduto_ed, jTxtCodigoVenda_ed, jTxtQuantidade_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed);
    Util.habilitar(true, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    JOptionPane.showMessageDialog(null, "Registro Confirmado!");
    Util.limpar(jTxtCodigoProduto_ed, jTxtCodigoVenda_ed, jTxtQuantidade_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, jBtnPesquisar_ed);;
    }//GEN-LAST:event_jBtnConfirmar_edActionPerformed

    private void jBtnCancelar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_edActionPerformed
        Util.habilitar(false, jTxtCodigoProduto_ed, jTxtCodigoVenda_ed, jTxtQuantidade_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed);
    Util.habilitar(true, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnCancelar_edActionPerformed

    private void jBtnPesquisar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_edActionPerformed
        //        String resp = JOptionPane.showInputDialog(null, "Entre com o codigo");
        //        JOptionPane.showMessageDialog(null, resp);
    }//GEN-LAST:event_jBtnPesquisar_edActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendaProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendaProduto_ed dialog = new JDlgVendaProduto_ed(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar_ed;
    private javax.swing.JButton jBtnCancelar_ed;
    private javax.swing.JButton jBtnConfirmar_ed;
    private javax.swing.JButton jBtnExcluir_ed;
    private javax.swing.JButton jBtnIncluir_ed;
    private javax.swing.JButton jBtnPesquisar_ed;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblCodigoProduto;
    private javax.swing.JLabel jLblCodigoVenda;
    private javax.swing.JLabel jLblQuantidade;
    private javax.swing.JLabel jLblValor;
    private javax.swing.JTextField jTxtCodigoProduto_ed;
    private javax.swing.JTextField jTxtCodigoVenda_ed;
    private javax.swing.JTextField jTxtQuantidade_ed;
    private javax.swing.JTextField jTxtValor_ed;
    // End of variables declaration//GEN-END:variables
}
