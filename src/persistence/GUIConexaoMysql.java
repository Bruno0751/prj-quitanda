/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import view.MenuPricipal;

/**
 *
 * @author bruno.silveira
 */
public class GUIConexaoMysql extends javax.swing.JFrame {

    /**
     * Creates new form GUIConexaoMysql
     */
    public GUIConexaoMysql() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelURL = new javax.swing.JLabel();
        jTextFieldURL = new javax.swing.JTextField();
        jLabelUSER = new javax.swing.JLabel();
        jTextFieldUSER = new javax.swing.JTextField();
        jLabelPASSWORD = new javax.swing.JLabel();
        jTextFieldPASSWORD = new javax.swing.JTextField();
        jButtonTestarConexao = new javax.swing.JButton();
        jMenuBarConexao = new javax.swing.JMenuBar();
        jMenuVoltar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelURL.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelURL.setText("URL:");
        jLabelURL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelURL.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabelUSER.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelUSER.setText("User:");

        jLabelPASSWORD.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelPASSWORD.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUSER)
                            .addComponent(jLabelURL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldURL)
                            .addComponent(jTextFieldUSER)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPASSWORD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPASSWORD)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelURL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUSER)
                    .addComponent(jTextFieldUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPASSWORD)
                    .addComponent(jTextFieldPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonTestarConexao.setText("Testar Conexão");
        jButtonTestarConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestarConexaoActionPerformed(evt);
            }
        });

        jMenuVoltar.setText("Voltar");
        jMenuVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVoltarMouseClicked(evt);
            }
        });
        jMenuBarConexao.add(jMenuVoltar);

        setJMenuBar(jMenuBarConexao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButtonTestarConexao)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButtonTestarConexao)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVoltarMouseClicked
        new MenuPricipal().setAlwaysOnTop(true);
        this.dispose();
    }//GEN-LAST:event_jMenuVoltarMouseClicked

    private void jButtonTestarConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestarConexaoActionPerformed
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        
    }//GEN-LAST:event_jButtonTestarConexaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTestarConexao;
    private javax.swing.JLabel jLabelPASSWORD;
    private javax.swing.JLabel jLabelURL;
    private javax.swing.JLabel jLabelUSER;
    private javax.swing.JMenuBar jMenuBarConexao;
    private javax.swing.JMenu jMenuVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldPASSWORD;
    private javax.swing.JTextField jTextFieldURL;
    private javax.swing.JTextField jTextFieldUSER;
    // End of variables declaration//GEN-END:variables
}
