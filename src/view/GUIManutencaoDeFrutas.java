//PROJECT NAME: prjBruno-quitanda
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fruta;
import services.FrutaServices;
import services.FactoryServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:02
 * @version 1.0 beta
 */
public class GUIManutencaoDeFrutas extends javax.swing.JInternalFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Valor", "Quantidade"});

    public GUIManutencaoDeFrutas() {
        initComponents();
        select();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFrutas = new javax.swing.JTable();
        jbLimpar = new javax.swing.JButton();
        jbDeletarCoisa = new javax.swing.JButton();
        jlpAlteracaoDeFruta = new javax.swing.JLayeredPane();
        jtIdFruta = new javax.swing.JTextField();
        jtNomeFruta = new javax.swing.JTextField();
        jtValorFruta = new javax.swing.JTextField();
        jtQuantidadeFruta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbAtualizaCoisas = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jtPesq = new javax.swing.JTextField();
        jComboFiltro = new javax.swing.JComboBox<>();
        jButtonCloseSysten = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manutenção Tabela de Frutas");

        jTableFrutas.setBorder(new javax.swing.border.MatteBorder(null));
        jTableFrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Quantidade"
            }
        ));
        jTableFrutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFrutasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFrutas);
        if (jTableFrutas.getColumnModel().getColumnCount() > 0) {
            jTableFrutas.getColumnModel().getColumn(0).setResizable(false);
            jTableFrutas.getColumnModel().getColumn(1).setResizable(false);
            jTableFrutas.getColumnModel().getColumn(2).setResizable(false);
            jTableFrutas.getColumnModel().getColumn(3).setResizable(false);
        }

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletarCoisa.setText("Deletar");
        jbDeletarCoisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarCoisaActionPerformed(evt);
            }
        });

        jlpAlteracaoDeFruta.setBorder(new javax.swing.border.MatteBorder(null));

        jtIdFruta.setEnabled(false);

        jLabel1.setText("Código");

        jLabel2.setText("Preço");

        jLabel3.setText("Nome");

        jLabel4.setText("Quantidade");

        jlpAlteracaoDeFruta.setLayer(jtIdFruta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlteracaoDeFruta.setLayer(jtNomeFruta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlteracaoDeFruta.setLayer(jtValorFruta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlteracaoDeFruta.setLayer(jtQuantidadeFruta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlteracaoDeFruta.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlteracaoDeFruta.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlteracaoDeFruta.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAlteracaoDeFruta.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAlteracaoDeFrutaLayout = new javax.swing.GroupLayout(jlpAlteracaoDeFruta);
        jlpAlteracaoDeFruta.setLayout(jlpAlteracaoDeFrutaLayout);
        jlpAlteracaoDeFrutaLayout.setHorizontalGroup(
            jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlteracaoDeFrutaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtIdFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jtNomeFruta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtQuantidadeFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jtValorFruta))
                .addContainerGap())
            .addGroup(jlpAlteracaoDeFrutaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(78, 78, 78))
            .addGroup(jlpAlteracaoDeFrutaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(79, 79, 79))
        );
        jlpAlteracaoDeFrutaLayout.setVerticalGroup(
            jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAlteracaoDeFrutaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtValorFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jlpAlteracaoDeFrutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNomeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtQuantidadeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jbAtualizaCoisas.setText("Atualizar");
        jbAtualizaCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizaCoisasActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLayeredPane2.setBorder(new javax.swing.border.MatteBorder(null));

        jtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqKeyReleased(evt);
            }
        });

        jComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Valor", "Quantidade" }));
        jComboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboFiltroItemStateChanged(evt);
            }
        });
        jComboFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboFiltroKeyReleased(evt);
            }
        });

        jLayeredPane2.setLayer(jtPesq, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jComboFiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButtonCloseSysten.setText("Desligar");
        jButtonCloseSysten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSystenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlpAlteracaoDeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jbLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbAtualizaCoisas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbDeletarCoisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCloseSysten)))
                        .addGap(199, 199, 199))))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jlpAlteracaoDeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpar)
                    .addComponent(jbDeletarCoisa)
                    .addComponent(jbAtualizaCoisas)
                    .addComponent(jbAlterar)
                    .addComponent(jButtonCloseSysten))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbDeletarCoisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarCoisaActionPerformed
        delete();
        clear();
        select();
    }//GEN-LAST:event_jbDeletarCoisaActionPerformed

    private void jbAtualizaCoisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizaCoisasActionPerformed
        clear();
        select();
    }//GEN-LAST:event_jbAtualizaCoisasActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        update();
        clear();
        select();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jTableFrutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFrutasMouseClicked
        updateTable();
    }//GEN-LAST:event_jTableFrutasMouseClicked

    private void jComboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboFiltroItemStateChanged
        clear();
        filter();
    }//GEN-LAST:event_jComboFiltroItemStateChanged

    private void jComboFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboFiltroKeyReleased
        clear();
        filter();
    }//GEN-LAST:event_jComboFiltroKeyReleased

    private void jtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqKeyReleased
        clear();
        filter();
    }//GEN-LAST:event_jtPesqKeyReleased

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed

    private void select() {
        try {

            FrutaServices frutaServices = FactoryServices.getFrutasServices();

            ArrayList<Fruta> listaFrutas = new ArrayList<>();

            listaFrutas = frutaServices.select();

            for (int i = 0; i < listaFrutas.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(listaFrutas.get(i).getIdFruta()),
                    String.valueOf(listaFrutas.get(i).getNome()),
                    String.valueOf(listaFrutas.get(i).getValorCusto()),
                    String.valueOf(listaFrutas.get(i).getQuantidade())
                });
            }
            jTableFrutas.setModel(defaultTableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdFruta.setText(null);
    }

    private void clear() {
        defaultTableModel.setNumRows(0);
        jtIdFruta.setText(null);
        jtNomeFruta.setText(null);
        jtQuantidadeFruta.setText(null);
        jtValorFruta.setText(null);
    }

    private void delete() {
        try {
            int linha = jTableFrutas.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione Uma Linha");
            } else {
                String id = jTableFrutas.getValueAt(linha, 0).toString();
                
                FrutaServices frutaServices = FactoryServices.getFrutasServices();
                
                frutaServices.delete(Long.parseLong(id));

                JOptionPane.showMessageDialog(this, "Fruta Deletado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdFruta.setText(null);
    }

    private void updateTable() {
        try {
            int linha = jTableFrutas.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(this, "Selecione uma Linha!");
            } else {
                String id = jTableFrutas.getValueAt(linha, 0).toString();
                String nome = jTableFrutas.getValueAt(linha, 1).toString();
                String valorCusto = jTableFrutas.getValueAt(linha, 2).toString();
                String qtd = jTableFrutas.getValueAt(linha, 3).toString();

                jtIdFruta.setText(id);
                jtNomeFruta.setText(nome);
                jtValorFruta.setText(valorCusto);
                jtQuantidadeFruta.setText(qtd);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void update() {
        try {
            Fruta fruta = new Fruta();
            
            fruta.setIdFruta(Long.parseLong(jtIdFruta.getText()));
            fruta.setNome(jtNomeFruta.getText());
            fruta.setValorCusto(Float.parseFloat(jtValorFruta.getText()));
            fruta.setQuantidade(Integer.parseInt(jtQuantidadeFruta.getText()));

            FrutaServices frutaServices = services.FactoryServices.getFrutasServices();

            frutaServices.update(fruta);

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Fruta Alterado Com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdFruta.setText(null);
    }

    private void filter() {
        try {
            if (jtPesq.getText().isEmpty()) {
                select();
            } else {
                String pesquisa = jtPesq.getText();
                String filtro = jComboFiltro.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Nome")) {
                    query = "WHERE nome LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("Código")) {
                    query = "WHERE id_fruta = " + pesquisa;
                } else if (filtro.equalsIgnoreCase("Valor")) {
                    query = "WHERE valor = " + pesquisa;
                } else if (filtro.equalsIgnoreCase("Quantidade")) {
                    query = "WHERE quantidade = " + pesquisa;
                }
                FrutaServices frutaServices = FactoryServices.getFrutasServices();
                
                ArrayList<Fruta> listaFrutas = frutaServices.filter(query);

                for (int i = 0; i < listaFrutas.size(); i++) {
                    defaultTableModel.addRow(new String[]{
                        String.valueOf(listaFrutas.get(i).getIdFruta()),
                        listaFrutas.get(i).getNome(),
                        String.valueOf(listaFrutas.get(i).getValorCusto()),
                        String.valueOf(listaFrutas.get(i).getQuantidade()),});
                }
                jTableFrutas.setModel(defaultTableModel);
            }

        } catch (Exception e) {
            jtPesq.setText(null);
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JComboBox<String> jComboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFrutas;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizaCoisas;
    private javax.swing.JButton jbDeletarCoisa;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLayeredPane jlpAlteracaoDeFruta;
    private javax.swing.JTextField jtIdFruta;
    private javax.swing.JTextField jtNomeFruta;
    private javax.swing.JTextField jtPesq;
    private javax.swing.JTextField jtQuantidadeFruta;
    private javax.swing.JTextField jtValorFruta;
    // End of variables declaration//GEN-END:variables
}
