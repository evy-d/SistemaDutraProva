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
 * @author Erickson
 */
public class JDlgCliente_ed extends javax.swing.JDialog {
    private MaskFormatter mascaraCpf, mascaraRg, mascaraData, mascaraCep;
    /**
     * Creates new form jDglCliente
     * @param parent
     * @param modal
     */
    public JDlgCliente_ed(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Cliente");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtBairro_ed, jTxtCelular_ed, jTxtCidade_ed, jTxtCodigo_ed, jTxtComplemento_ed, jTxtEmail_ed, jTxtEndereco_ed, jTxtNome_ed, jTxtNumero_ed, jBtnAlterar_ed, jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed, jBtnIncluir_ed, jBtnPesquisar_ed, jFmtCPF_ed, jFmtCep_ed, jFmtDataNasc_ed, jFmtRg_ed, jCboEstado_ed, jCboGenero_ed);
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraRg = new MaskFormatter("#.###.###");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCep = new MaskFormatter("#####-###");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgCliente_ed.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCPF_ed.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtDataNasc_ed.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        jFmtRg_ed.setFormatterFactory(new DefaultFormatterFactory(mascaraRg));
        jFmtCep_ed.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCboGenero_ed = new javax.swing.JComboBox<>();
        jLblBairro = new javax.swing.JLabel();
        jTxtBairro_ed = new javax.swing.JTextField();
        jLblEmail = new javax.swing.JLabel();
        jLblDataNasc = new javax.swing.JLabel();
        jLblEndereco = new javax.swing.JLabel();
        jFmtDataNasc_ed = new javax.swing.JFormattedTextField();
        jTxtEmail_ed = new javax.swing.JTextField();
        jLblNumero = new javax.swing.JLabel();
        jTxtCidade_ed = new javax.swing.JTextField();
        jTxtCodigo_ed = new javax.swing.JTextField();
        jLblCpf = new javax.swing.JLabel();
        jLblCelular = new javax.swing.JLabel();
        jLblComplemento = new javax.swing.JLabel();
        jTxtCelular_ed = new javax.swing.JTextField();
        jLblCodigo = new javax.swing.JLabel();
        jTxtEndereco_ed = new javax.swing.JTextField();
        jLblRg = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jTxtNumero_ed = new javax.swing.JTextField();
        jTxtNome_ed = new javax.swing.JTextField();
        jTxtComplemento_ed = new javax.swing.JTextField();
        jFmtCPF_ed = new javax.swing.JFormattedTextField();
        jFmtRg_ed = new javax.swing.JFormattedTextField();
        jLblEstado = new javax.swing.JLabel();
        jLblCidade = new javax.swing.JLabel();
        jCboEstado_ed = new javax.swing.JComboBox<>();
        jFmtCep_ed = new javax.swing.JFormattedTextField();
        jLblGenero = new javax.swing.JLabel();
        jLblCep = new javax.swing.JLabel();
        jBtnIncluir_ed = new javax.swing.JButton();
        jBtnAlterar_ed = new javax.swing.JButton();
        jBtnExcluir_ed = new javax.swing.JButton();
        jBtnConfirmar_ed = new javax.swing.JButton();
        jBtnCancelar_ed = new javax.swing.JButton();
        jBtnPesquisar_ed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLblBairro.setText("Bairro");

        jLblEmail.setText("Email");

        jLblDataNasc.setText("Data Nascimento");

        jLblEndereco.setText("Endereço");

        jLblNumero.setText("Número");

        jTxtCidade_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidade_edActionPerformed(evt);
            }
        });

        jLblCpf.setText("CPF:");

        jLblCelular.setText("Celular");

        jLblComplemento.setText("Complemento");

        jTxtCelular_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCelular_edActionPerformed(evt);
            }
        });

        jLblCodigo.setText("Codigo");

        jLblRg.setText("RG:");

        jLblNome.setText("Nome");

        jLblEstado.setText("Estado");

        jLblCidade.setText("Cidade");

        jCboEstado_ed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jCboEstado_ed.setToolTipText("");
        jCboEstado_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboEstado_edActionPerformed(evt);
            }
        });

        jLblGenero.setText("Gênero");

        jLblCep.setText("CEP:");

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblCidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jCboGenero_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLblEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCboEstado_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLblEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEndereco_ed, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCidade_ed, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblGenero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtNome_ed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jTxtCodigo_ed, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtComplemento_ed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLblCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFmtCPF_ed)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblCep, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblRg, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblDataNasc)
                            .addComponent(jLblBairro)
                            .addComponent(jLblNumero)
                            .addComponent(jTxtNumero_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtDataNasc_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtRg_ed, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jFmtCep_ed)
                            .addComponent(jTxtBairro_ed))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCelular)
                            .addComponent(jLblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtEmail_ed, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblComplemento)
                            .addComponent(jLblCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTxtCelular_ed, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnIncluir_ed)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnAlterar_ed)))
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExcluir_ed)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnConfirmar_ed)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCancelar_ed)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnPesquisar_ed)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtCodigo_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboGenero_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblCpf)
                            .addComponent(jFmtCPF_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboEstado_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCidade_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEndereco_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtDataNasc_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblRg)
                            .addComponent(jFmtRg_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtCep_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtBairro_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNumero_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jLblComplemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtComplemento_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEmail_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCelular_ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir_ed)
                    .addComponent(jBtnConfirmar_ed)
                    .addComponent(jBtnAlterar_ed)
                    .addComponent(jBtnExcluir_ed)
                    .addComponent(jBtnCancelar_ed)
                    .addComponent(jBtnPesquisar_ed))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboGenero_edItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboGenero_edItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGenero_edItemStateChanged

    private void jCboGenero_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboGenero_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGenero_edActionPerformed

    private void jCboGenero_edPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCboGenero_edPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGenero_edPropertyChange

    private void jTxtCidade_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidade_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidade_edActionPerformed

    private void jTxtCelular_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCelular_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCelular_edActionPerformed

    private void jCboEstado_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboEstado_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboEstado_edActionPerformed

    private void jBtnIncluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir_edActionPerformed
        Util.habilitar(true, jTxtBairro_ed, jTxtCelular_ed, jTxtCidade_ed, jTxtCodigo_ed, 
    jTxtComplemento_ed, jTxtEmail_ed, jTxtEndereco_ed, jTxtNome_ed, jTxtNumero_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtCPF_ed,
    jFmtCep_ed, jFmtDataNasc_ed, jFmtRg_ed, jCboEstado_ed, jCboGenero_ed);
        Util.habilitar(false, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnIncluir_edActionPerformed

    private void jBtnAlterar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar_edActionPerformed
        Util.habilitar(true, jTxtBairro_ed, jTxtCelular_ed, jTxtCidade_ed, jTxtCodigo_ed, 
    jTxtComplemento_ed, jTxtEmail_ed, jTxtEndereco_ed, jTxtNome_ed, jTxtNumero_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtCPF_ed,
    jFmtCep_ed, jFmtDataNasc_ed, jFmtRg_ed, jCboEstado_ed, jCboGenero_ed);
        Util.habilitar(false, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnAlterar_edActionPerformed

    private void jBtnExcluir_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir_edActionPerformed
      int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão", "Deletar Registro", JOptionPane.YES_NO_OPTION);
       if (resp == JOptionPane.YES_OPTION){   
           Util.limpar(jTxtBairro_ed, jTxtCelular_ed, jTxtCidade_ed, jTxtCodigo_ed, jTxtComplemento_ed, jTxtEmail_ed,
 jTxtEndereco_ed, jTxtNome_ed, jTxtNumero_ed, jBtnAlterar_ed, jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed,
 jBtnIncluir_ed, jBtnPesquisar_ed, jFmtCPF_ed, jFmtCep_ed, jFmtDataNasc_ed, jFmtRg_ed, jCboEstado_ed, jCboGenero_ed);
       }
    }//GEN-LAST:event_jBtnExcluir_edActionPerformed

    private void jBtnConfirmar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmar_edActionPerformed
        Util.habilitar(false, jTxtBairro_ed, jTxtCelular_ed, jTxtCidade_ed, jTxtCodigo_ed, 
    jTxtComplemento_ed, jTxtEmail_ed, jTxtEndereco_ed, jTxtNome_ed, jTxtNumero_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtCPF_ed,
    jFmtCep_ed, jFmtDataNasc_ed, jFmtRg_ed, jCboEstado_ed, jCboGenero_ed);
        Util.habilitar(true, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
        Util.limpar(jTxtBairro_ed, jTxtCelular_ed, jTxtCidade_ed, jTxtCodigo_ed, jTxtComplemento_ed, jTxtEmail_ed,
 jTxtEndereco_ed, jTxtNome_ed, jTxtNumero_ed, jBtnAlterar_ed, jBtnCancelar_ed, jBtnConfirmar_ed, jBtnExcluir_ed,
 jBtnIncluir_ed, jBtnPesquisar_ed, jFmtCPF_ed, jFmtCep_ed, jFmtDataNasc_ed, jFmtRg_ed, jCboEstado_ed, jCboGenero_ed);
    }//GEN-LAST:event_jBtnConfirmar_edActionPerformed

    private void jBtnCancelar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_edActionPerformed
        Util.habilitar(false, jTxtBairro_ed, jTxtCelular_ed, jTxtCidade_ed, jTxtCodigo_ed, 
    jTxtComplemento_ed, jTxtEmail_ed, jTxtEndereco_ed, jTxtNome_ed, jTxtNumero_ed, 
    jBtnCancelar_ed, jBtnConfirmar_ed, jFmtCPF_ed,
    jFmtCep_ed, jFmtDataNasc_ed, jFmtRg_ed, jCboEstado_ed, jCboGenero_ed);
        Util.habilitar(true, jBtnIncluir_ed, jBtnAlterar_ed, jBtnExcluir_ed, jBtnPesquisar_ed);
    }//GEN-LAST:event_jBtnCancelar_edActionPerformed

    private void jBtnPesquisar_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisar_edActionPerformed
        JDlgPesquisarCliente jDlgPesquisarCliente = new JDlgPesquisarCliente(null, true);
        jDlgPesquisarCliente.setVisible(true);
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
            java.util.logging.Logger.getLogger(JDlgCliente_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente_ed dialog = new JDlgCliente_ed(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboEstado_ed;
    private javax.swing.JComboBox<String> jCboGenero_ed;
    private javax.swing.JFormattedTextField jFmtCPF_ed;
    private javax.swing.JFormattedTextField jFmtCep_ed;
    private javax.swing.JFormattedTextField jFmtDataNasc_ed;
    private javax.swing.JFormattedTextField jFmtRg_ed;
    private javax.swing.JLabel jLblBairro;
    private javax.swing.JLabel jLblCelular;
    private javax.swing.JLabel jLblCep;
    private javax.swing.JLabel jLblCidade;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblComplemento;
    private javax.swing.JLabel jLblCpf;
    private javax.swing.JLabel jLblDataNasc;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblGenero;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblNumero;
    private javax.swing.JLabel jLblRg;
    private javax.swing.JTextField jTxtBairro_ed;
    private javax.swing.JTextField jTxtCelular_ed;
    private javax.swing.JTextField jTxtCidade_ed;
    private javax.swing.JTextField jTxtCodigo_ed;
    private javax.swing.JTextField jTxtComplemento_ed;
    private javax.swing.JTextField jTxtEmail_ed;
    private javax.swing.JTextField jTxtEndereco_ed;
    private javax.swing.JTextField jTxtNome_ed;
    private javax.swing.JTextField jTxtNumero_ed;
    // End of variables declaration//GEN-END:variables
}
