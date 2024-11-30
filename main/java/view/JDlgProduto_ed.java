/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author bispo
 */
public class JDlgProduto_ed extends javax.swing.JDialog {

 private MaskFormatter MascaraDataC, MascaraDataV;

    /**
     * Creates new form jDlgUsuario
     */
    public JDlgProduto_ed(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Produto");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtCodigo_ed, jTxtEstoque_ed, jTxtNome_ed, jTxtValor_ed, 
        jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, 
        jBtnPesquisar_ed, jFmtDataChegada_ed, jFmtDataValidade_ed, jCboCategoria_ed);
        try {
            MascaraDataC = new MaskFormatter("##/##/####");
            MascaraDataV = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgCliente_ed.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtDataChegada_ed.setFormatterFactory(new DefaultFormatterFactory(MascaraDataC));
        jFmtDataValidade_ed.setFormatterFactory(new DefaultFormatterFactory(MascaraDataV));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCodigo = new javax.swing.JLabel();
        JLblCategoria = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        JLblDataChegada = new javax.swing.JLabel();
        JLblDataValidade = new javax.swing.JLabel();
        jLblValor = new javax.swing.JLabel();
        jLblEstoque = new javax.swing.JLabel();
        jTxtCodigo_ed = new javax.swing.JTextField();
        jTxtNome_ed = new javax.swing.JTextField();
        jTxtValor_ed = new javax.swing.JTextField();
        jTxtEstoque_ed = new javax.swing.JTextField();
        jFmtDataChegada_ed = new javax.swing.JFormattedTextField();
        jFmtDataValidade_ed = new javax.swing.JFormattedTextField();
        jCboCategoria_ed = new javax.swing.JComboBox<>();
        jBtnIncluir_ed = new javax.swing.JButton();
        jBtnAlterar_ed = new javax.swing.JButton();
        jBtnExcluir_ed = new javax.swing.JButton();
        jBtnConfirmar_ed = new javax.swing.JButton();
        jBtnCancelar_ed = new javax.swing.JButton();
        jBtnPesquisar_ed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        jLblCodigo.setText("Código");

        JLblCategoria.setText("Categoria");

        jLblNome.setText("Nome");

        JLblDataChegada.setText("Data de Chegada");

        JLblDataValidade.setText("Data de Validade");

        jLblValor.setText("Valor");

        jLblEstoque.setText("Estoque");

        jCboCategoria_ed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCodigo)
                    .addComponent(jTxtCodigo_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir_ed)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAlterar_ed)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir_ed)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConfirmar_ed)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar_ed)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar_ed))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLblDataChegada)
                                    .addComponent(jFmtDataChegada_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLblDataValidade)
                                .addGap(136, 136, 136))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblNome)
                                    .addComponent(jTxtNome_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jFmtDataValidade_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtValor_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblValor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEstoque_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblEstoque)))
                            .addComponent(jCboCategoria_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLblCategoria))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigo_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboCategoria_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLblDataChegada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtDataChegada_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLblDataValidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtDataValidade_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblValor)
                            .addComponent(jLblEstoque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtValor_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtEstoque_ed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir_ed)
                    .addComponent(jBtnConfirmar_ed)
                    .addComponent(jBtnAlterar_ed)
                    .addComponent(jBtnExcluir_ed)
                    .addComponent(jBtnCancelar_ed)
                    .addComponent(jBtnPesquisar_ed))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_edActionPerformed
        Util.habilitar(true, jTxtCodigo_ed, jTxtEstoque_ed, jTxtNome_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtDataChegada_ed, jFmtDataValidade_ed, 
    jCboCategoria_ed);
        Util.habilitar(false, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnIncluir_edActionPerformed

    private void jBtnAlterar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_edActionPerformed
        Util.habilitar(true, jTxtCodigo_ed, jTxtEstoque_ed, jTxtNome_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtDataChegada_ed, jFmtDataValidade_ed, 
    jCboCategoria_ed);
        Util.habilitar(false, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnAlterar_edActionPerformed

    private void jBtnExcluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_edActionPerformed
       int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão", "Deletar Registro", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {   
            Util.limpar(jTxtCodigo_ed, jTxtEstoque_ed, jTxtNome_ed, jTxtValor_ed, 
            jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, 
            jBtnPesquisar_ed, jFmtDataChegada_ed, jFmtDataValidade_ed, jCboCategoria_ed);
        }
    }//GEN-LAST:event_jBtnExcluir_edActionPerformed

    private void jBtnConfirmar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_edActionPerformed
        Util.habilitar(false, jTxtCodigo_ed, jTxtEstoque_ed, jTxtNome_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtDataChegada_ed, jFmtDataValidade_ed, 
    jCboCategoria_ed);
        Util.habilitar(true, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    JOptionPane.showMessageDialog(null, "Registro Confirmado!");
        Util.limpar(jTxtCodigo_ed, jTxtEstoque_ed, jTxtNome_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, 
    jBtnPesquisar_ed, jFmtDataChegada_ed, jFmtDataValidade_ed, jCboCategoria_ed);
    }//GEN-LAST:event_jBtnConfirmar_edActionPerformed

    private void jBtnCancelar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_edActionPerformed
        Util.habilitar(false, jTxtCodigo_ed, jTxtEstoque_ed, jTxtNome_ed, jTxtValor_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtDataChegada_ed, jFmtDataValidade_ed, 
    jCboCategoria_ed);
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
            java.util.logging.Logger.getLogger(JDlgProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProduto_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                JDlgProduto_ed dialog = new JDlgProduto_ed(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLblCategoria;
    private javax.swing.JLabel JLblDataChegada;
    private javax.swing.JLabel JLblDataValidade;
    private javax.swing.JButton jBtnAlterar_ed;
    private javax.swing.JButton jBtnCancelar_ed;
    private javax.swing.JButton jBtnConfirmar_ed;
    private javax.swing.JButton jBtnExcluir_ed;
    private javax.swing.JButton jBtnIncluir_ed;
    private javax.swing.JButton jBtnPesquisar_ed;
    private javax.swing.JComboBox<String> jCboCategoria_ed;
    private javax.swing.JFormattedTextField jFmtDataChegada_ed;
    private javax.swing.JFormattedTextField jFmtDataValidade_ed;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblEstoque;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblValor;
    private javax.swing.JTextField jTxtCodigo_ed;
    private javax.swing.JTextField jTxtEstoque_ed;
    private javax.swing.JTextField jTxtNome_ed;
    private javax.swing.JTextField jTxtValor_ed;
    // End of variables declaration//GEN-END:variables
}
