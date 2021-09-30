//PROJECT NAME: prjBruno-quitanda
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import services.ClienteServices;
import services.FactoryServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:03
 * @version 1.0 beta
 */
public class GUIManutencaoDeCliente extends javax.swing.JInternalFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "CPF", "Idade"});

    public GUIManutencaoDeCliente() {
        initComponents();
        select();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtPesqCliente = new javax.swing.JTextField();
        jComboCliete = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliete = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbAtualizarCliete = new javax.swing.JButton();
        jbLimparCliete = new javax.swing.JButton();
        jbAlterarCliete = new javax.swing.JButton();
        jbDeletarCliete = new javax.swing.JButton();
        jButtonCloseSisten = new javax.swing.JButton();
        jButtonCloseSysten = new javax.swing.JButton();
        jtIdCliente = new javax.swing.JTextField();
        jtNomeCliente = new javax.swing.JTextField();
        jtCPF = new javax.swing.JTextField();
        jtIdadeCliente = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção de Cliente");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtPesqCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqClienteKeyReleased(evt);
            }
        });

        jComboCliete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Cpf", "Idade" }));
        jComboCliete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboClieteItemStateChanged(evt);
            }
        });
        jComboCliete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboClieteKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jtPesqCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jComboCliete, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCliete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTableCliete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClieteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliete);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAtualizarCliete.setText("Atualizar");
        jbAtualizarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarClieteActionPerformed(evt);
            }
        });

        jbLimparCliete.setText("Limpar");
        jbLimparCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparClieteActionPerformed(evt);
            }
        });

        jbAlterarCliete.setText("Alterar");
        jbAlterarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarClieteActionPerformed(evt);
            }
        });

        jbDeletarCliete.setText("Deletar");
        jbDeletarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarClieteActionPerformed(evt);
            }
        });

        jButtonCloseSisten.setText("Desligar");
        jButtonCloseSisten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSistenActionPerformed(evt);
            }
        });

        jButtonCloseSysten.setText("Desligar");
        jButtonCloseSysten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSystenActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jbAtualizarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimparCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbAlterarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbDeletarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButtonCloseSisten, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButtonCloseSysten, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jbAtualizarCliete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterarCliete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCloseSisten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDeletarCliete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbLimparCliete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCloseSysten)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizarCliete)
                    .addComponent(jbLimparCliete)
                    .addComponent(jbAlterarCliete)
                    .addComponent(jbDeletarCliete)
                    .addComponent(jButtonCloseSisten)
                    .addComponent(jButtonCloseSysten))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jtIdCliente.setEnabled(false);

        jLabelID.setText("Código");

        jLabelNome.setText("Nome");

        jLabelCPF.setText("cpf");

        jLabelIdade.setText("Idade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jtNomeCliente))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtIdadeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jtCPF))))
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabelID)
                        .addGap(178, 178, 178)
                        .addComponent(jLabelCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabelNome)
                        .addGap(203, 203, 203)
                        .addComponent(jLabelIdade)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear() {
        defaultTableModel.setNumRows(0);
        jtNomeCliente.setText(null);
        jtCPF.setText(null);
        jtIdadeCliente.setText(null);
    }

    private void select() {
        try {

            ClienteServices clienteServices = FactoryServices.getClieteServices();

            ArrayList<Cliente> listaClientes = new ArrayList<>();

            listaClientes = clienteServices.select();

            for (int i = 0; i < listaClientes.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(listaClientes.get(i).getIdCliente()),
                    String.valueOf(listaClientes.get(i).getNome()),
                    String.valueOf(listaClientes.get(i).getCpf()),
                    String.valueOf(listaClientes.get(i).getIdade()),});
            }
            jTableCliete.setModel(defaultTableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdCliente.setText(null);
    }

    private void delete() {
        try {
            int linha = jTableCliete.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione Uma Linha");
            } else {
                String id = jTableCliete.getValueAt(linha, 0).toString();
                
                ClienteServices clienteServices = FactoryServices.getClieteServices();
                
                clienteServices.delete(Long.parseLong(id));

                JOptionPane.showMessageDialog(null, "Cliente Deletado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdCliente.setText(null);
    }

    private void filter() {
        try {
            if (jtPesqCliente.getText().isEmpty()) {
                select();
            } else {
                String pesquisa = jtPesqCliente.getText();
                String filtro = jComboCliete.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Código")) {
                    query = "WHERE id_cliente = " + pesquisa;
                } else if (filtro.equalsIgnoreCase("Nome")) {
                    query = "WHERE nome LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("CPF")) {
                    query = "WHERE cpf LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("Idade")) {
                    query = "WHERE idade = " + pesquisa;
                }

                ClienteServices clienteServices = FactoryServices.getClieteServices();
                
                ArrayList<Cliente> listaClientes = clienteServices.filter(query);

                for (int i = 0; i < listaClientes.size(); i++) {
                    defaultTableModel.addRow(new String[]{
                        String.valueOf(listaClientes.get(i).getIdCliente()),
                        listaClientes.get(i).getNome(),
                        listaClientes.get(i).getCpf(),
                        String.valueOf(listaClientes.get(i).getIdade()),});
                }
                jTableCliete.setModel(defaultTableModel);
            }

        } catch (Exception e) {
            jtPesqCliente.setText(null);
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alter() {
        try {
            int linha = jTableCliete.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");
            } else {
                String id = jTableCliete.getValueAt(linha, 0).toString();
                String nome = jTableCliete.getValueAt(linha, 1).toString();
                String cpf = jTableCliete.getValueAt(linha, 2).toString();
                String idade = jTableCliete.getValueAt(linha, 3).toString();

                jtIdCliente.setText(id);
                jtNomeCliente.setText(nome);
                jtCPF.setText(cpf);
                jtIdadeCliente.setText(idade);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void confirmAlter() {
        try {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(Long.parseLong(jtIdCliente.getText()));
            cliente.setNome(jtNomeCliente.getText());
            cliente.setCpf(jtCPF.getText());
            cliente.setIdade(Integer.parseInt(jtIdadeCliente.getText()));

            ClienteServices clienteServices = services.FactoryServices.getClieteServices();

            clienteServices.alter(cliente);

            JOptionPane.showMessageDialog(rootPane, "Cliente Alterado Com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdCliente.setText(null);
    }

    private void jbLimparClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparClieteActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparClieteActionPerformed

    private void jbAtualizarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarClieteActionPerformed
        clear();
        select();
    }//GEN-LAST:event_jbAtualizarClieteActionPerformed

    private void jtPesqClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqClienteKeyReleased
        clear();
        filter();
    }//GEN-LAST:event_jtPesqClienteKeyReleased

    private void jComboClieteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboClieteItemStateChanged
        clear();
        filter();
    }//GEN-LAST:event_jComboClieteItemStateChanged

    private void jComboClieteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboClieteKeyReleased
        clear();
        filter();
    }//GEN-LAST:event_jComboClieteKeyReleased

    private void jbDeletarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarClieteActionPerformed
        delete();
        clear();
        select();
    }//GEN-LAST:event_jbDeletarClieteActionPerformed

    private void jbAlterarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarClieteActionPerformed
        confirmAlter();
        clear();
        select();
    }//GEN-LAST:event_jbAlterarClieteActionPerformed

    private void jTableClieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClieteMouseClicked
        alter();
    }//GEN-LAST:event_jTableClieteMouseClicked

    private void jButtonCloseSistenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSistenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSistenActionPerformed

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSisten;
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JComboBox<String> jComboCliete;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliete;
    private javax.swing.JButton jbAlterarCliete;
    private javax.swing.JButton jbAtualizarCliete;
    private javax.swing.JButton jbDeletarCliete;
    private javax.swing.JButton jbLimparCliete;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtIdadeCliente;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JTextField jtPesqCliente;
    // End of variables declaration//GEN-END:variables
}
