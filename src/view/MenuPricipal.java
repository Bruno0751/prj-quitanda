//PROJECT NAME: prjBruno-quitanda
package view;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import persistence.ConexaoBanco;
import persistence.GUIConexaoMysql;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:00
 * @version 1.0 beta
 */
public class MenuPricipal extends javax.swing.JFrame {

    public MenuPricipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadastroCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroFruta = new javax.swing.JMenuItem();
        jMenuItemCadsatroQuitanda = new javax.swing.JMenuItem();
        jMenuManutencao = new javax.swing.JMenu();
        jMenuItemManutencaoClientes = new javax.swing.JMenuItem();
        jMenuItemManutencaoFruta = new javax.swing.JMenuItem();
        jMenuItemManutencaoQuitandas = new javax.swing.JMenuItem();
        jMenuConexao = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bem Vindo - Area De Trabalho");

        jAreaDeTrabalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jAreaDeTrabalho);
        jAreaDeTrabalho.setLayout(jAreaDeTrabalhoLayout);
        jAreaDeTrabalhoLayout.setHorizontalGroup(
            jAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jAreaDeTrabalhoLayout.setVerticalGroup(
            jAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemCadastroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadastroCliente.setText("Clientes");
        jMenuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastroCliente);

        jMenuItemCadastroFruta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadastroFruta.setText("Frutas");
        jMenuItemCadastroFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFrutaActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastroFruta);

        jMenuItemCadsatroQuitanda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadsatroQuitanda.setText("Quitandas");
        jMenuItemCadsatroQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadsatroQuitandaActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadsatroQuitanda);

        jMenuBarPrincipal.add(jMenuCadastrar);

        jMenuManutencao.setText("Manutençao");
        jMenuManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManutencaoActionPerformed(evt);
            }
        });

        jMenuItemManutencaoClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemManutencaoClientes.setText("Clietes");
        jMenuItemManutencaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoClientesActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemManutencaoClientes);

        jMenuItemManutencaoFruta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemManutencaoFruta.setText("Frutas");
        jMenuItemManutencaoFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoFrutaActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemManutencaoFruta);

        jMenuItemManutencaoQuitandas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemManutencaoQuitandas.setText("Quintas");
        jMenuItemManutencaoQuitandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoQuitandasActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemManutencaoQuitandas);

        jMenuBarPrincipal.add(jMenuManutencao);

        jMenuConexao.setText("Conexao");
        jMenuConexao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConexaoMouseClicked(evt);
            }
        });
        jMenuBarPrincipal.add(jMenuConexao);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaDeTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaDeTrabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManutencaoActionPerformed
        //abriManutençaoFrutas();
    }//GEN-LAST:event_jMenuManutencaoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadsatroQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadsatroQuitandaActionPerformed
        abrirCadastroDeQuitanda();
    }//GEN-LAST:event_jMenuItemCadsatroQuitandaActionPerformed

    private void jMenuItemManutencaoFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoFrutaActionPerformed
        abrirManutencaoDeFrutas();
    }//GEN-LAST:event_jMenuItemManutencaoFrutaActionPerformed

    private void jMenuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteActionPerformed
        abrirCadastroDeCliente();
    }//GEN-LAST:event_jMenuItemCadastroClienteActionPerformed

    private void jMenuItemManutencaoQuitandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoQuitandasActionPerformed
        abrirManutencaoDeQuitanda();
    }//GEN-LAST:event_jMenuItemManutencaoQuitandasActionPerformed

    private void jMenuItemManutencaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoClientesActionPerformed
        abrirManutencaoDeCliente();
    }//GEN-LAST:event_jMenuItemManutencaoClientesActionPerformed

    private void jMenuItemCadastroFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFrutaActionPerformed
        abrirCadastroDeFrutas();
    }//GEN-LAST:event_jMenuItemCadastroFrutaActionPerformed

    private void jMenuConexaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConexaoMouseClicked
        new GUIConexaoMysql().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuConexaoMouseClicked

    private void abrirCadastroDeFrutas(){
        GUICadastroDeFrutas gcc = new GUICadastroDeFrutas();
        jAreaDeTrabalho.add(gcc);
        gcc.setVisible(true);    
    }
    
    private void abrirCadastroDeQuitanda(){
        GUICadastroDeQuitanda gcq = new GUICadastroDeQuitanda();
        jAreaDeTrabalho.add(gcq);
        gcq.setVisible(true);
    }
    
    private void abrirCadastroDeCliente(){
        GUICadastroDeCliente gccl = new GUICadastroDeCliente();
        jAreaDeTrabalho.add(gccl);
        gccl.setVisible(true);        
    }
    
    private void abrirManutencaoDeFrutas(){
        GUIManutencaoDeFrutas gmf = new GUIManutencaoDeFrutas();
        jAreaDeTrabalho.add(gmf);
        gmf.setVisible(true);    
    }

    private void abrirManutencaoDeQuitanda(){
        GUIManutencaoDeQuitanda gmq = new GUIManutencaoDeQuitanda();
        jAreaDeTrabalho.add(gmq);
        gmq.setVisible(true); 
    }

    
    private void abrirManutencaoDeCliente(){
        GUIManutencaoDeCliente gmcl = new GUIManutencaoDeCliente();
        jAreaDeTrabalho.add(gmcl);
        gmcl.setVisible(true); 
    }

    public static void main(String args[]) {
        ConexaoBanco c = null;
        try {
          UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao abrir software\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        try {
            c.getConexao();
        } catch (Exception e) {
            
        } finally {
            
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jAreaDeTrabalho;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenu jMenuConexao;
    private javax.swing.JMenuItem jMenuItemCadastroCliente;
    private javax.swing.JMenuItem jMenuItemCadastroFruta;
    private javax.swing.JMenuItem jMenuItemCadsatroQuitanda;
    private javax.swing.JMenuItem jMenuItemManutencaoClientes;
    private javax.swing.JMenuItem jMenuItemManutencaoFruta;
    private javax.swing.JMenuItem jMenuItemManutencaoQuitandas;
    private javax.swing.JMenu jMenuManutencao;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}//fecha classe menuPrincipal
