package view;

public class JFrmPrincipal_ed extends javax.swing.JFrame {

    public JFrmPrincipal_ed() {
        initComponents();
        setTitle("Sistema Vinhos");
        setExtendedState(MAXIMIZED_BOTH); 
        
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
        } 
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblFundo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuUsuario = new javax.swing.JMenuItem();
        jMnuProduto = new javax.swing.JMenuItem();
        jMnuCliente = new javax.swing.JMenuItem();
        jMnuFuncionario = new javax.swing.JMenuItem();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimentos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblFundo.setBackground(new java.awt.Color(204, 255, 0));
        jLblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vinho_fundo3.jpg"))); // NOI18N

        jMnuCadastros.setMnemonic('C');
        jMnuCadastros.setText("Cadastros");

        jMnuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuUsuario.setText("Usuario");
        jMnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuarioActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuario);

        jMnuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuProduto.setText("Produto");
        jMnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutoActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuProduto);

        jMnuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente 16px.png"))); // NOI18N
        jMnuCliente.setText("Cliente");
        jMnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClienteActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuCliente);

        jMnuFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMnuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carteira-de-identidade 16px.png"))); // NOI18N
        jMnuFuncionario.setText("Funcionario");
        jMnuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionarioActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuFuncionario);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuSair);

        jMenuBar.add(jMnuCadastros);

        jMnuMovimentos.setMnemonic('M');
        jMnuMovimentos.setText("Movimentos");
        jMenuBar.add(jMnuMovimentos);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionarioActionPerformed
        // TODO add your handling code here:
        JDlgFuncionario_ed jDlgF = new JDlgFuncionario_ed(null, true);
        jDlgF.setVisible(true);
    }//GEN-LAST:event_jMnuFuncionarioActionPerformed

    private void jMnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClienteActionPerformed
        // TODO add your handling code here:
        JDlgCliente_ed jDlgC = new JDlgCliente_ed(null, true);
        jDlgC.setVisible(true);
    }//GEN-LAST:event_jMnuClienteActionPerformed

    private void jMnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutoActionPerformed
        JDlgProduto_ed jDlgP = new JDlgProduto_ed(null, true);
        jDlgP.setVisible(true);
    }//GEN-LAST:event_jMnuProdutoActionPerformed

    private void jMnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuarioActionPerformed
        JDlgUsuario_ed jDlgU = new JDlgUsuario_ed(null, true);
        jDlgU.setVisible(true);
    }//GEN-LAST:event_jMnuUsuarioActionPerformed
 
   public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                ///// MUDANÇA TEMA
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal_ed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        java.awt.EventQueue.invokeLater(() -> {
            new JFrmPrincipal_ed().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblFundo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenuItem jMnuCliente;
    private javax.swing.JMenuItem jMnuFuncionario;
    private javax.swing.JMenu jMnuMovimentos;
    private javax.swing.JMenuItem jMnuProduto;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuario;
    // End of variables declaration//GEN-END:variables
}
