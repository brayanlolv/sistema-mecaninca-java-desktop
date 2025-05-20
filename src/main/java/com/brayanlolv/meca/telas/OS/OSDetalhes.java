package com.brayanlolv.meca.telas.OS;

import com.brayanlolv.meca.model.Carro;
import com.brayanlolv.meca.model.OS;
import com.brayanlolv.meca.controller.OSController;
import com.brayanlolv.meca.controller.CarroController;
import com.brayanlolv.meca.telas.MultiPage;

public class OSDetalhes extends javax.swing.JPanel {

    private Carro carro;
    private OS os;

    
    
    public void atualizar(String id){
        os = new OSController().pegarPorId(id);
        System.out.println("ndjfghsjdhgkjdfhgjkdf");
        System.out.println(os.getId());
        tituloTxt.setText(os.getTitulo());
        descricaoTxt.setText(os.getDescricao());
        dataTxt.setText(os.getData());
        valorTxt.setText(Double.toString(os.getValor()));
        //placaTxt.setText(carro.getObservacoes());
        
        editarTgl.setSelected(false);
        setEditavel();
    }
    
    public OSDetalhes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloTxt = new javax.swing.JTextField();
        descricaoTxt = new javax.swing.JTextField();
        dataTxt = new javax.swing.JTextField();
        valorTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editarTgl = new javax.swing.JToggleButton();
        excluirBtn = new javax.swing.JButton();
        SalvarBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        placaTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("titulo");

        jLabel2.setText("descricao");

        jLabel3.setText("valor");

        jLabel4.setText("data");

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

        jLabel5.setText("placa carro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(voltarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tituloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(descricaoTxt)
                                    .addComponent(dataTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(excluirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SalvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(voltarBtn)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarTgl))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(descricaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SalvarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(excluirBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setEditavel(){
        excluirBtn.setVisible(editarTgl.isSelected());
        SalvarBtn.setVisible(editarTgl.isSelected());
        tituloTxt.setEnabled(editarTgl.isSelected());
        descricaoTxt.setEnabled(editarTgl.isSelected());
        valorTxt.setEnabled(editarTgl.isSelected());
        dataTxt.setEnabled(editarTgl.isSelected());
    }
    
    private void editarTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTglActionPerformed
       setEditavel();
    }//GEN-LAST:event_editarTglActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        MultiPage.mudarTela("ordemHome");
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void SalvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarBtnActionPerformed
           os.setTitulo(tituloTxt.getText());
           os.setDescricao(descricaoTxt.getText());
           os.setData(dataTxt.getText());
           os.setValor(Float.parseFloat(valorTxt.getText()));
           
        
          new CarroController().modificar(carro);
          atualizar(Integer.toString(os.getId()));
          MultiPage.telaCarrosGeral.atualizar();
//        MultiPage.mudarTela("carroGeral");
    }//GEN-LAST:event_SalvarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        new CarroController().apagar(carro.getId());
        MultiPage.mudarTela("ordemHome");
        MultiPage.telaCarrosGeral.atualizar();
    }//GEN-LAST:event_excluirBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarBtn;
    private javax.swing.JTextField dataTxt;
    private javax.swing.JTextField descricaoTxt;
    private javax.swing.JToggleButton editarTgl;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField placaTxt;
    private javax.swing.JTextField tituloTxt;
    private javax.swing.JTextField valorTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
