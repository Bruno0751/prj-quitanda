//PROJECT NAME: prjBruno-quitanda
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.Cliente;
import services.ClienteServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:05
 * @version 1.0 beta
 */
public class GUICadastroDeCliente extends javax.swing.JInternalFrame {

    public GUICadastroDeCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpDadosCliente = new javax.swing.JLayeredPane();
        jlIdadeCliente = new javax.swing.JLabel();
        jlNomeCliente = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jtNomeCliente = new javax.swing.JTextField();
        jtCPF = new javax.swing.JTextField();
        jtIdadeCliente = new javax.swing.JTextField();
        jlpAcoesDoCliente = new javax.swing.JLayeredPane();
        jbLimparCliente = new javax.swing.JButton();
        jbCadatrarCliente = new javax.swing.JButton();
        jButtonCloseSysten = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cliente");

        jlpDadosCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlIdadeCliente.setText("Idade");

        jlNomeCliente.setText("Nome Do Cliente");

        jlCPF.setText("cpf");

        jtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeClienteKeyPressed(evt);
            }
        });

        jtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCPFKeyPressed(evt);
            }
        });

        jtIdadeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIdadeClienteKeyPressed(evt);
            }
        });

        jlpDadosCliente.setLayer(jlIdadeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jlNomeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jlCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jtNomeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jtCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jtIdadeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosClienteLayout = new javax.swing.GroupLayout(jlpDadosCliente);
        jlpDadosCliente.setLayout(jlpDadosClienteLayout);
        jlpDadosClienteLayout.setHorizontalGroup(
            jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosClienteLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCPF)
                    .addComponent(jlNomeCliente)
                    .addComponent(jlIdadeCliente))
                .addGap(33, 33, 33)
                .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNomeCliente)
                    .addComponent(jtCPF)
                    .addComponent(jtIdadeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpDadosClienteLayout.setVerticalGroup(
            jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jlpDadosClienteLayout.createSequentialGroup()
                        .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNomeCliente))
                        .addGap(65, 65, 65))
                    .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCPF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdadeCliente))
                .addGap(58, 58, 58))
        );

        jlpAcoesDoCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbLimparCliente.setText("Limpar");
        jbLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparClienteActionPerformed(evt);
            }
        });

        jbCadatrarCliente.setText("Cadatrar");
        jbCadatrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadatrarClienteActionPerformed(evt);
            }
        });
        jbCadatrarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadatrarClienteKeyPressed(evt);
            }
        });

        jButtonCloseSysten.setText("Desligar");
        jButtonCloseSysten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSystenActionPerformed(evt);
            }
        });

        jlpAcoesDoCliente.setLayer(jbLimparCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoesDoCliente.setLayer(jbCadatrarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoesDoCliente.setLayer(jButtonCloseSysten, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesDoClienteLayout = new javax.swing.GroupLayout(jlpAcoesDoCliente);
        jlpAcoesDoCliente.setLayout(jlpAcoesDoClienteLayout);
        jlpAcoesDoClienteLayout.setHorizontalGroup(
            jlpAcoesDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesDoClienteLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jbLimparCliente)
                .addGap(46, 46, 46)
                .addComponent(jButtonCloseSysten)
                .addGap(45, 45, 45)
                .addComponent(jbCadatrarCliente)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jlpAcoesDoClienteLayout.setVerticalGroup(
            jlpAcoesDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesDoClienteLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jlpAcoesDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimparCliente)
                    .addComponent(jbCadatrarCliente)
                    .addComponent(jButtonCloseSysten))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpAcoesDoCliente)
                    .addComponent(jlpDadosCliente))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlpAcoesDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparClienteActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparClienteActionPerformed

    private void jbCadatrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadatrarClienteActionPerformed
        insert();
    }//GEN-LAST:event_jbCadatrarClienteActionPerformed

    private void jtNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtCPF.grabFocus();
        }
    }//GEN-LAST:event_jtNomeClienteKeyPressed

    private void jtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCPFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtIdadeCliente.grabFocus();
        }
    }//GEN-LAST:event_jtCPFKeyPressed

    private void jtIdadeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdadeClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCadatrarCliente.grabFocus();
        }
    }//GEN-LAST:event_jtIdadeClienteKeyPressed

    private void jbCadatrarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadatrarClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            insert();
        }
    }//GEN-LAST:event_jbCadatrarClienteKeyPressed

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed

    private void insert() {
        try {
            Cliente cliente = new Cliente();

            cliente.setNome(jtNomeCliente.getText());
            cliente.setCpf(jtCPF.getText());
            cliente.setIdade(Integer.parseInt(jtIdadeCliente.getText()));

            ClienteServices clienteService = services.FactoryServices.getClieteServices();

            clienteService.insert(cliente);

            JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado");
            clear();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clear() {
        jtNomeCliente.setText(null);
        jtCPF.setText(null);
        jtIdadeCliente.setText(null);
        jtNomeCliente.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JButton jbCadatrarCliente;
    private javax.swing.JButton jbLimparCliente;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlIdadeCliente;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLayeredPane jlpAcoesDoCliente;
    private javax.swing.JLayeredPane jlpDadosCliente;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtIdadeCliente;
    private javax.swing.JTextField jtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
