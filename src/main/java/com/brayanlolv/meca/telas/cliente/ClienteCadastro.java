/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.brayanlolv.meca.telas.cliente;
import com.brayanlolv.meca.controller.ClienteController;
import com.brayanlolv.meca.model.Cliente;
import com.brayanlolv.meca.telas.MultiPage;
import com.brayanlolv.meca.telas.MultiPage;
import com.brayanlolv.meca.telas.PopUp;

/**
 *
 * @author braiu
 */
public class ClienteCadastro extends javax.swing.JPanel {

    public ClienteCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeIpt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        documentoIpt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefoneIpt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailIpt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        SalvarBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("nome");

        nomeIpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeIptActionPerformed(evt);
            }
        });

        jLabel2.setText("documento");

        documentoIpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoIptActionPerformed(evt);
            }
        });

        jLabel3.setText("telefone");

        jLabel4.setText("email");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"CPF","CNPJ" }));

        SalvarBtn.setText("Salvar!");
        SalvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarBtnActionPerformed(evt);
            }
        });

        jButton1.setText("voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailIpt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeIpt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentoIpt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefoneIpt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(SalvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeIpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentoIpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailIpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoneIpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SalvarBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void resetarCampos(){
        nomeIpt.setText("");
        emailIpt.setText("");
        documentoIpt.setText("");
        telefoneIpt.setText("");
    }
    private void SalvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarBtnActionPerformed
        try{
        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nomeIpt.getText());
        novoCliente.setEmail(emailIpt.getText());
        novoCliente.setDocumento(documentoIpt.getText());
        novoCliente.setTelefone(telefoneIpt.getText());
        
        new ClienteController().cadastrar(novoCliente);
 
        MultiPage.mudarTela("clienteHome");
        resetarCampos();
        MultiPage.telaClienteGeral.atualizar();
        MultiPage.telaClienteGeral.repaint();   
        }catch(Exception e){
            PopUp.main(e.getMessage());
        }
    }//GEN-LAST:event_SalvarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MultiPage.mudarTela("clienteHome");
        resetarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void documentoIptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoIptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoIptActionPerformed

    private void nomeIptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeIptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeIptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarBtn;
    private javax.swing.JTextField documentoIpt;
    private javax.swing.JTextField emailIpt;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeIpt;
    private javax.swing.JTextField telefoneIpt;
    // End of variables declaration//GEN-END:variables
}
