package com.brayanlolv.meca.telas.cliente;
import com.brayanlolv.meca.controller.ClienteController;
import com.brayanlolv.meca.model.Cliente;
import com.brayanlolv.meca.telas.MultiPage;


public class ClienteGeral extends javax.swing.JPanel {

   String selectOpcoes [] ={"documento","telefone"};
    
    private  String [][] dados;
    private Cliente clienteBusca;
    public  void atualizar(){
        dados = new ClienteController().getJTableMatrix();
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            dados,
            new String [] {
                "nome", "telefone"
            }
        ));
        
    }
    
    public ClienteGeral() {
        initComponents();
        atualizar();
        painelBusca.setVisible(false);
        painelFiltro.setVisible(false);
   
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
        tabelaClientes = new javax.swing.JTable();
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

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clientes");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 165, 40));

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            dados,
            new String [] {
                "nome", "telefone"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 355, 115));

        cadastrarBtn.setText("cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });
        add(cadastrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 30));
        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -10, -1, -1));

        PesquisarTgl.setText("Pesquisar Cliente");
        PesquisarTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarTglActionPerformed(evt);
            }
        });
        add(PesquisarTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 170, 30));

        filtrosTabelaTgl.setText("Filtros Tabela");
        filtrosTabelaTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosTabelaTglActionPerformed(evt);
            }
        });
        add(filtrosTabelaTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 30));

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
        campoSlct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSlct1ActionPerformed(evt);
            }
        });
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
        jScrollPane4.setBounds(90, 100, 210, 80);

        add(painelBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 500, 290));

        painelFiltro.setLayout(null);
        painelFiltro.add(filtroTxtIpt);
        filtroTxtIpt.setBounds(40, 10, 180, 22);

        filtroSlct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        painelFiltro.add(filtroSlct);
        filtroSlct.setBounds(280, 10, 72, 22);

        add(painelFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 440, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
      MultiPage.mudarTela("clienteCadastro");
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void campoSlct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSlct1ActionPerformed
     
    }//GEN-LAST:event_campoSlct1ActionPerformed

    private void procurarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarBtn1ActionPerformed
        
        //codigo abaixo so para debug
        System.out.println(PesquisarTgl.isSelected());
        
        /*
        
            
        tabelaClientes.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = tabelaClientes.rowAtPoint(e.getPoint());
                    if (row >= 0) {
                        // Handle the row click event
                        System.out.println("Row " + row + " clicked.");
                    }
                }
            });
        
        
        
        debugar isso mais tarde
        clienteBuscadoList1.setModel(
                new javax.swing.AbstractListModel<String>() {
                    String[] clienteDados = new ClienteController()
                        .procurarPor(campoSlct1.getSelectedItem().toString(),campoBuscaIpt1.getText());
                    public int getSize() { return clienteDados.length; }
                    public String getElementAt(int i){
                        return clienteDados[i]; 
                    }
                }
        );
        */
    }//GEN-LAST:event_procurarBtn1ActionPerformed

    private void PesquisarTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarTglActionPerformed
        painelBusca.setVisible(PesquisarTgl.isSelected());
    }//GEN-LAST:event_PesquisarTglActionPerformed

    private void filtrosTabelaTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosTabelaTglActionPerformed
       painelFiltro.setVisible(filtrosTabelaTgl.isSelected());
    }//GEN-LAST:event_filtrosTabelaTglActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
          //System.out.println(c.getSelectedRow());
         //System.out.println(tabelaClientes.isCellEditable(3, 1));
         
        MultiPage.telaDetalhesCliente.clienteCpf = dados[tabelaClientes.getSelectedRow()][3];
        MultiPage.mudarTela("clienteDetalhes");
        MultiPage.telaDetalhesCliente.atualizar();

        
    }//GEN-LAST:event_tabelaClientesMouseClicked


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
    private javax.swing.JPanel painelBusca;
    private javax.swing.JPanel painelFiltro;
    private javax.swing.JButton procurarBtn1;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
