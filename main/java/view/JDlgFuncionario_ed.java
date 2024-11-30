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

 
public class JDlgFuncionario_ed extends javax.swing.JDialog {

    private MaskFormatter mascaraCpf;
    private MaskFormatter mascaraDataContratacao;
    /**
     * Creates new form jDglCliente
     * @param parent
     * @param modal
     */
    public JDlgFuncionario_ed(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Funcionario");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtCelular_ed, jTxtCodigo_ed, jTxtCpf, jTxtDataContratacao, 
    jTxtEndereco_ed, jTxtNome_ed, jTxtSalario_ed, jBtnCancelar_ed, 
    jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, jBtnPesquisar_ed, 
    jFmtCpf_ed, jFmtDataContratacao_ed, jCboGenero_ed);
    try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraDataContratacao = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgFuncionario_ed.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf_ed.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtDataContratacao_ed.setFormatterFactory(new DefaultFormatterFactory(mascaraDataContratacao));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jTxtCpf = new javax.swing.JTextField();
        jTxtDataContratacao = new javax.swing.JTextField();
        jTxtCodigo_ed = new javax.swing.JTextField();
        jLblCodigo = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jTxtNome_ed = new javax.swing.JTextField();
        jLblGenero = new javax.swing.JLabel();
        jCboGenero_ed = new javax.swing.JComboBox<>();
        jLblCpf = new javax.swing.JLabel();
        jLblDataContratacao = new javax.swing.JLabel();
        jLblEndereco = new javax.swing.JLabel();
        jTxtEndereco_ed = new javax.swing.JTextField();
        jLblCelular = new javax.swing.JLabel();
        jTxtCelular_ed = new javax.swing.JTextField();
        jLblSalario = new javax.swing.JLabel();
        jTxtSalario_ed = new javax.swing.JTextField();
        jFmtDataContratacao_ed = new javax.swing.JFormattedTextField();
        jFmtCpf_ed = new javax.swing.JFormattedTextField();
        jBtnCancelar_ed = new javax.swing.JButton();
        jBtnPesquisar_ed = new javax.swing.JButton();
        jBtnIncluir_ed = new javax.swing.JButton();
        jBtnAlterar_ed = new javax.swing.JButton();
        jBtnExcluir_ed = new javax.swing.JButton();
        jBtnConfirmar_ed = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField3.setText("jTextField3");

        jTxtDataContratacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDataContratacaoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblCodigo.setText("Codigo");

        jLblNome.setText("Nome");

        jLblGenero.setText("Gênero");

        jCboGenero_ed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        jCboGenero_ed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboGenero_edItemStateChanged(evt);
            }
        });
        jCboGenero_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboGenero_edActionPerformed(evt);
            }
        });
        jCboGenero_ed.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCboGenero_edPropertyChange(evt);
            }
        });

        jLblCpf.setText("CPF");

        jLblDataContratacao.setText("Data Contrataçâo");

        jLblEndereco.setText("Endereço");

        jLblCelular.setText("Celular");

        jTxtCelular_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCelular_edActionPerformed(evt);
            }
        });

        jLblSalario.setText("Salário");

        jTxtSalario_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSalario_edActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTxtEndereco_ed)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCboGenero_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLblCpf)
                                    .addGap(168, 168, 168)))
                            .addComponent(jLblGenero)
                            .addComponent(jTxtNome_ed, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jTxtCodigo_ed)
                            .addComponent(jLblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblDataContratacao)
                            .addComponent(jFmtDataContratacao_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLblCodigo)
                            .addComponent(jTxtCelular_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblCelular)
                            .addComponent(jTxtSalario_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblSalario)
                            .addComponent(jLblEndereco)
                            .addComponent(jFmtCpf_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigo_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNome)
                    .addComponent(jLblDataContratacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtDataContratacao_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboGenero_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtCpf_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEndereco_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtSalario_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCelular_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir_ed)
                    .addComponent(jBtnConfirmar_ed)
                    .addComponent(jBtnAlterar_ed)
                    .addComponent(jBtnExcluir_ed)
                    .addComponent(jBtnCancelar_ed)
                    .addComponent(jBtnPesquisar_ed))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtDataContratacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDataContratacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDataContratacaoActionPerformed

    private void jTxtCelular_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCelular_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCelular_edActionPerformed

    private void jCboGenero_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboGenero_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGenero_edActionPerformed

    private void jCboGenero_edPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCboGenero_edPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGenero_edPropertyChange

    private void jCboGenero_edItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboGenero_edItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGenero_edItemStateChanged

    private void jBtnCancelar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_edActionPerformed
      
    }//GEN-LAST:event_jBtnCancelar_edActionPerformed

    private void jBtnPesquisar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_edActionPerformed
        JDlgPesquisarFuncionario jDlgPesquisarFuncionario = new JDlgPesquisarFuncionario(null, true);
        jDlgPesquisarFuncionario.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisar_edActionPerformed

    private void jBtnIncluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_edActionPerformed
        Util.habilitar(true, jTxtCelular_ed, jTxtCodigo_ed, jTxtCpf, jTxtDataContratacao, 
    jTxtEndereco_ed, jTxtNome_ed, jTxtSalario_ed, jBtnCancelar_ed, 
    jBtnConfirmar_ed, jFmtCpf_ed, jFmtDataContratacao_ed);
        Util.habilitar(false, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnIncluir_edActionPerformed

    private void jBtnAlterar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_edActionPerformed
        Util.habilitar(false, jTxtCelular_ed, jTxtCodigo_ed, jTxtCpf, jTxtDataContratacao, 
    jTxtEndereco_ed, jTxtNome_ed, jTxtSalario_ed, jBtnCancelar_ed, 
    jBtnConfirmar_ed, jFmtCpf_ed, jFmtDataContratacao_ed, jCboGenero_ed);
        Util.habilitar(true, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnAlterar_edActionPerformed

    private void jBtnExcluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_edActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Confirme exclusão!", "Deletar registro", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Exclusão realizada");
        }
    }//GEN-LAST:event_jBtnExcluir_edActionPerformed

    private void jBtnConfirmar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_edActionPerformed
       Util.habilitar(false, jTxtCelular_ed, jTxtCodigo_ed, jTxtCpf, jTxtDataContratacao, 
    jTxtEndereco_ed, jTxtNome_ed, jTxtSalario_ed, jBtnCancelar_ed, 
    jBtnConfirmar_ed, jFmtCpf_ed, jFmtDataContratacao_ed, jCboGenero_ed);
    Util.habilitar(true, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    JOptionPane.showMessageDialog(null, "Registro Confirmado!");
    Util.limpar(jTxtCelular_ed, jTxtCodigo_ed, jTxtCpf, jTxtDataContratacao, 
    jTxtEndereco_ed, jTxtNome_ed, jTxtSalario_ed, jBtnCancelar_ed, 
    jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, jBtnPesquisar_ed, 
    jFmtCpf_ed, jFmtDataContratacao_ed, jCboGenero_ed);
    }//GEN-LAST:event_jBtnConfirmar_edActionPerformed

    private void jTxtSalario_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSalario_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSalario_edActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                JDlgFuncionario_ed dialog = new JDlgFuncionario_ed(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboGenero_ed;
    private javax.swing.JFormattedTextField jFmtCpf_ed;
    private javax.swing.JFormattedTextField jFmtDataContratacao_ed;
    private javax.swing.JLabel jLblCelular;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblCpf;
    private javax.swing.JLabel jLblDataContratacao;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblGenero;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTxtCelular_ed;
    private javax.swing.JTextField jTxtCodigo_ed;
    private javax.swing.JTextField jTxtCpf;
    private javax.swing.JTextField jTxtDataContratacao;
    private javax.swing.JTextField jTxtEndereco_ed;
    private javax.swing.JTextField jTxtNome_ed;
    private javax.swing.JTextField jTxtSalario_ed;
    // End of variables declaration//GEN-END:variables
}
