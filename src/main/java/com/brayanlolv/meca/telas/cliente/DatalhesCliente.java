package com.brayanlolv.meca.telas.cliente;
import com.brayanlolv.meca.model.Cliente;
import com.brayanlolv.meca.controller.ClienteController;
import com.brayanlolv.meca.telas.MultiPage;
/* Click nbfs://nbhost/SystemFileSyst
em/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author braiu
 */
public class DatalhesCliente extends javax.swing.JPanel {

    public  String clienteCpf = "";
    private Cliente cliente;
    
    public void atualizar(){
        cliente = new ClienteController().pegarClientePor("documento", clienteCpf);
        nomeTxt.setText(cliente.getNome());
        emailTxt.setText(cliente.getEmail());
        cpfTxt.setText(cliente.getDocumento());
        telefoneTxt.setText(cliente.getTelefone());
        editarTgl.setSelected(false);
        setEdicoesAtivas();
    }
    
    public DatalhesCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeTxt = new javax.swing.JTextField();
        cpfTxt = new javax.swing.JTextField();
        telefoneTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editarTgl = new javax.swing.JToggleButton();
        excluirBtn = new javax.swing.JButton();
        SalvarBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        jLabel1.setText("nome");

        jLabel2.setText("cpf");

        jLabel3.setText("email");

        jLabel4.setText("telefone");

        editarTgl.setText("Editar");
        editarTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTglActionPerformed(evt);
            }
        });

        excluirBtn.setText("Excluir");
        excluirBtn.setVisible(false);
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        SalvarBtn.setText("Salvar");
        SalvarBtn.setEnabled(true
        );
        SalvarBtn.setVisible(false);
        SalvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarBtnActionPerformed(evt);
            }
        });

        voltarBtn.setText("voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeTxt)
                    .addComponent(cpfTxt)
                    .addComponent(telefoneTxt)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SalvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(voltarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(voltarBtn)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarTgl))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SalvarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(excluirBtn)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setEdicoesAtivas(){
        excluirBtn.setVisible(editarTgl.isSelected());
        SalvarBtn.setVisible(editarTgl.isSelected());
        nomeTxt.setEnabled(editarTgl.isSelected());
        cpfTxt.setEnabled(editarTgl.isSelected());
        emailTxt.setEnabled(editarTgl.isSelected());
        telefoneTxt.setEnabled(editarTgl.isSelected());
    }
    
    private void editarTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTglActionPerformed
        setEdicoesAtivas();
    }//GEN-LAST:event_editarTglActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        MultiPage.mudarTela("clienteHome");
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void SalvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarBtnActionPerformed
        cliente.setNome(nomeTxt.getText());
        cliente.setDocumento(cpfTxt.getText());
        cliente.setEmail(emailTxt.getText());
        cliente.setTelefone(telefoneTxt.getText());
        new ClienteController().modificar(cliente);
        atualizar();
        MultiPage.telaClienteGeral.atualizar();
        MultiPage.mudarTela("clienteHome");
    }//GEN-LAST:event_SalvarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        new ClienteController().apagar(cliente.getId());
        MultiPage.mudarTela("clienteHome");
        MultiPage.telaClienteGeral.atualizar();
    }//GEN-LAST:event_excluirBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarBtn;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JToggleButton editarTgl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField telefoneTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
