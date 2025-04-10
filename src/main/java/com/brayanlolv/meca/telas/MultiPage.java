/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brayanlolv.meca.telas;

/**
 *
 * @author braiu
 */
import com.brayanlolv.meca.telas.cliente.*;
import javax.swing.*;
import java.awt.*;
import com.brayanlolv.meca.telas.*;

public class MultiPage {
    private static  JFrame frame;
    private static JPanel mainPanel;
    private static CardLayout cardLayout;
    
    public CardLayout getCardInstance(){
        return cardLayout;
    }
  
    public static ClienteGeral telaClienteGeral = new ClienteGeral() ;
    public static DatalhesCliente telaDetalhesCliente = new DatalhesCliente();
    
    public MultiPage() {
        frame = new JFrame("Sistema mecanica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 720);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        // Add pages to the main panel
        mainPanel.add(new Inicial(), "home");
        mainPanel.add(telaClienteGeral, "clienteHome");
        mainPanel.add(new ClienteCadastro(), "clienteCadastro");
        mainPanel.add(telaDetalhesCliente, "clienteDetalhes");
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    
    public static void mudarTela(String tela){
        //mainPanel.getName()
        cardLayout.show(mainPanel,tela);
    }
    
    public static void mudarTela(Integer numero){
        //mainPanel.getName()
        mainPanel.getComponent(numero).repaint();
        
        cardLayout.show(mainPanel,mainPanel.getComponent(numero).getName());
    }
  
    public static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MultiPage();
            }
        });
    }
}