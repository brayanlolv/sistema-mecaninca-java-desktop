/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brayanlolv.meca;

import com.brayanlolv.meca.controller.*;
import com.brayanlolv.meca.dao.*;
import com.brayanlolv.meca.model.*;
public class Exemplo {
    
    public static void setar(){
            ClienteController cc = new ClienteController();
            Cliente  c ;
            OS o;
            Carro cr;
         
        try{
            //cadastrar 5 clientes
    
               CarroDAO crc = new CarroDAO();
            c = new Cliente();
            c.setNome("João Oliveira");
            c.setDocumento("48529384927");
            c.setEmail("j040.tibia@exemplo.com");
            c.setTelefone("11928463750");
            cc.cadastrar(c);
                cr = new Carro();
                cr.setCliente(c);
                cr.setAno("2002");
                cr.setCor("prata");
                cr.setModelo("astra");
                cr.setPlaca("3ir3l");
                crc.salvar(cr);
                    o = new OS();
                    o.setCarro(cr);
                    o.setData("02/04/2022");
                    o.setTitulo("troca dos amortecedores");
                    o.setValor(600);
                    o.setDescricao("foi trocado os quatros amortecedores");
                    new OSDAO().salvar(o);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{

               CarroDAO crc = new CarroDAO();
            c = new Cliente();
            c.setNome("Maria Candida");
            c.setDocumento("74820285936");
            c.setEmail("mariazinha@exemplo.com");
            c.setTelefone("22947582739W");
            cc.cadastrar(c);
                cr = new Carro();
                cr.setCliente(c);
                cr.setAno("2003");
                cr.setCor("azul");
                cr.setModelo("ford ka (sapinho)");
                cr.setPlaca("g92ld9");
                crc.salvar(cr);
                    o = new OS();
                    o.setCarro(cr);
                    o.setData("30/05/2023");
                    o.setTitulo("zetec rocan ferveu");
                    o.setValor(300);
                    o.setDescricao("troca da valvula termostatica");
                    new OSDAO().salvar(o);

      
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            
               CarroDAO crc = new CarroDAO();
            c = new Cliente();
            c.setNome("Lendro Esteves");
            c.setDocumento("946487456924");
            c.setEmail("lele@exemplo.com");
            c.setTelefone("11983656592");
            cc.cadastrar(c);
                cr = new Carro();
               cr.setCliente(c);
               cr.setAno("2004");
               cr.setCor("peugeot");
               cr.setModelo("406");
               cr.setPlaca("244xd");
               cr.setObservacoes("carro foi abandonado na oficina");
               crc.salvar(cr);
                            o = new OS();
                    o.setCarro(cr);
                    o.setData("04/04/2023");
                    o.setTitulo("abandonado");
                    o.setValor(0);
                    o.setDescricao("cliente deixou para orcamento e sumiu");
                    new OSDAO().salvar(o);
      
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
               CarroDAO crc = new CarroDAO();
            c = new Cliente();
            c.setNome("Lucas Felipe");
            c.setDocumento("357655024401");
            c.setEmail("lucasZoi@exemplo.com");
            c.setTelefone("1194837503");
            cc.cadastrar(c);
                cr = new Carro();
                 cr.setCliente(c);
                 cr.setAno("1974");
                 cr.setCor("bege");
                 cr.setModelo("fusca");
                 cr.setPlaca("v8is7u");
                 crc.salvar(cr);
                    o = new OS();
                    o.setCarro(cr);
                    o.setData("25/03/2025");
                    o.setTitulo("revisao geral");
                    o.setValor(800);
                    o.setDescricao("limpeza e regulagem do carburador, e troca do platinado e correia do alternador");
                    new OSDAO().salvar(o);





        
        
        
        
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
    
    
    
}
