package com.brayanlolv.meca.telas.carro;
import com.brayanlolv.meca.telas.cliente.*;
import com.brayanlolv.meca.model.Carro;
import com.brayanlolv.meca.controller.CarroController;
import com.brayanlolv.meca.telas.MultiPage;

public class DatalhesCarro extends javax.swing.JPanel {

    public  String carroPlaca = "";
    private Carro carro;
    
    public void atualizar(){
       carro = new CarroController().pegarCarroPor("placa",carroPlaca);
//        System.out.print("carro pego"+ carro);
        modeloTxt.setText(carro.getModelo());
        placaTxt.setText(carro.getPlaca());
        corTxt.setText(carro.getCor());
        anoTxt.setText(carro.getAno());
        observacoesTxt.setText(carro.getObservacoes());
//        System.out.println(carroPlaca);
//        System.out.print(carro == null);
        editarTgl.setSelected(false);
        setEditavel();
    }
    
    public DatalhesCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modeloTxt = new javax.swing.JTextField();
        placaTxt = new javax.swing.JTextField();
        corTxt = new javax.swing.JTextField();
        anoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editarTgl = new javax.swing.JToggleButton();
        excluirBtn = new javax.swing.JButton();
        SalvarBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        observacoesTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("modelo");

        jLabel2.setText("placa");

        jLabel3.setText("ano");

        jLabel4.setText("cor");

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

        jLabel5.setText("observacoes");

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
                        .addComponent(observacoesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modeloTxt)
                            .addComponent(placaTxt)
                            .addComponent(corTxt)
                            .addComponent(anoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
                        .addComponent(modeloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarTgl))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(placaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SalvarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(excluirBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(observacoesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setEditavel(){
        excluirBtn.setVisible(editarTgl.isSelected());
        SalvarBtn.setVisible(editarTgl.isSelected());
        modeloTxt.setEnabled(editarTgl.isSelected());
        placaTxt.setEnabled(editarTgl.isSelected());
        anoTxt.setEnabled(editarTgl.isSelected());
        corTxt.setEnabled(editarTgl.isSelected());
        observacoesTxt.setEnabled(editarTgl.isSelected());
    }
    
    private void editarTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTglActionPerformed
       setEditavel();
    }//GEN-LAST:event_editarTglActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        MultiPage.mudarTela("carroHome");
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void SalvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarBtnActionPerformed
          carro.setModelo(modeloTxt.getText());
          carro.setPlaca(placaTxt.getText());
          carro.setCor(corTxt.getText());
          carro.setAno(anoTxt.getText());
          carro.setObservacoes(observacoesTxt.getText());
          new CarroController().modificar(carro);
          atualizar();
          MultiPage.telaCarrosGeral.atualizar();
//          MultiPage.mudarTela("carroGeral");
    }//GEN-LAST:event_SalvarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        new CarroController().apagar(carro.getId());
        MultiPage.mudarTela("carroHome");
        MultiPage.telaCarrosGeral.atualizar();
    }//GEN-LAST:event_excluirBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarBtn;
    private javax.swing.JTextField anoTxt;
    private javax.swing.JTextField corTxt;
    private javax.swing.JToggleButton editarTgl;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JTextField observacoesTxt;
    private javax.swing.JTextField placaTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
