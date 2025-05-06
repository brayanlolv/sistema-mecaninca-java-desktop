package com.brayanlolv.meca.telas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PopUp{
  public static void main(String menssagem){
    JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame,menssagem);
  }
}