package com.brayanlolv.meca.telas.OS;

import com.brayanlolv.meca.controller.CarroController;
import com.brayanlolv.meca.controller.OSController;
import com.brayanlolv.meca.model.OS;
import com.brayanlolv.meca.telas.MultiPage;


public class OSGeral extends javax.swing.JPanel {

   String selectOpcoes [] ={"titulo","valor"};
    
    private  String [][] dados;
    
    private OS ordemServico;
    
    public  void atualizar(){
        dados = new OSController().getJTableMatrix();
        tabelaServicos.setModel(new javax.swing.table.DefaultTableModel(
            dados,
            new String [] {
                "titulo", "descricao"
            }
        ));
        
    }
    
    public OSGeral() {
        initComponents();
        atualizar();
        painelBusca.setVisible(false);
        painelFiltro.setVisible(false);
        PesquisarTgl.setVisible(false);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaServicos = new javax.swing.JTable();
        cadastrarBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PesquisarTgl = new javax.swing.JToggleButton();
        filtrosTabelaTgl = new javax.swing.JToggleButton();
        painelBusca = new javax.swing.JPanel();
        procurarBtn1 = new javax.swing.JButton();
        campoSlct1 = new javax.swing.JComboBox<>();
        campoBuscaIpt1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        clienteBuscadoList1 = new javax.swing.JList<>();
        painelFiltro = new javax.swing.JPanel();
        filtroTxtIpt = new javax.swing.JTextField();
        filtroSlct = new javax.swing.JComboBox<>();
        menuInical = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ordens de Serviço");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 240, 40));

        tabelaServicos.setModel(new javax.swing.table.DefaultTableModel(
            dados,
            new String [] {
                "nome", "telefone"
            }
        ));
        tabelaServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaServicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaServicos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 570, 160));

        cadastrarBtn.setText("cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });
        add(cadastrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, 30));
        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -10, -1, -1));

        PesquisarTgl.setText("pesquisar carros");
        PesquisarTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarTglActionPerformed(evt);
            }
        });
        add(PesquisarTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 170, 30));

        filtrosTabelaTgl.setText("Filtros Tabela");
        filtrosTabelaTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosTabelaTglActionPerformed(evt);
            }
        });
        add(filtrosTabelaTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 30));

        painelBusca.setLayout(null);

        procurarBtn1.setText("buscar por");
        procurarBtn1.setToolTipText("");
        procurarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarBtn1ActionPerformed(evt);
            }
        });
        painelBusca.add(procurarBtn1);
        procurarBtn1.setBounds(110, 20, 86, 23);

        campoSlct1.setModel(new javax.swing.DefaultComboBoxModel<>(selectOpcoes));
        painelBusca.add(campoSlct1);
        campoSlct1.setBounds(240, 20, 72, 22);
        painelBusca.add(campoBuscaIpt1);
        campoBuscaIpt1.setBounds(100, 60, 220, 22);

        clienteBuscadoList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(clienteBuscadoList1);

        painelBusca.add(jScrollPane4);
        jScrollPane4.setBounds(110, 90, 210, 80);

        add(painelBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 440, 220));

        painelFiltro.setLayout(null);
        painelFiltro.add(filtroTxtIpt);
        filtroTxtIpt.setBounds(40, 10, 180, 22);

        filtroSlct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        painelFiltro.add(filtroSlct);
        filtroSlct.setBounds(280, 10, 72, 22);

        add(painelFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 440, 40));

        menuInical.setText("Menu Inicial");
        menuInical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicalActionPerformed(evt);
            }
        });
        add(menuInical, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
      MultiPage.mudarTela("ordemCadastro");
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void procurarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarBtn1ActionPerformed
             clienteBuscadoList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = new OSController().procurarPor("titulo", campoBuscaIpt1.getText());
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i];}
        }); 
    }//GEN-LAST:event_procurarBtn1ActionPerformed

    private void PesquisarTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarTglActionPerformed
        painelBusca.setVisible(PesquisarTgl.isSelected());
    }//GEN-LAST:event_PesquisarTglActionPerformed

    private void filtrosTabelaTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosTabelaTglActionPerformed
       painelFiltro.setVisible(filtrosTabelaTgl.isSelected());
    }//GEN-LAST:event_filtrosTabelaTglActionPerformed

    private void tabelaServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaServicosMouseClicked
        MultiPage.telaOrdemDetalhes.atualizar(dados[tabelaServicos.getSelectedRow()][3]);
        MultiPage.mudarTela("ordemDetalhes");
    }//GEN-LAST:event_tabelaServicosMouseClicked

    private void menuInicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicalActionPerformed
        MultiPage.mudarTela("home");
    }//GEN-LAST:event_menuInicalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton PesquisarTgl;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JTextField campoBuscaIpt1;
    private javax.swing.JComboBox<String> campoSlct1;
    private javax.swing.JList<String> clienteBuscadoList1;
    private javax.swing.JComboBox<String> filtroSlct;
    private javax.swing.JTextField filtroTxtIpt;
    private javax.swing.JToggleButton filtrosTabelaTgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton menuInical;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JPanel painelFiltro;
    private javax.swing.JButton procurarBtn1;
    private javax.swing.JTable tabelaServicos;
    // End of variables declaration//GEN-END:variables
}
