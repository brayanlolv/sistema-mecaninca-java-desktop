/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brayanlolv.meca.controller;
import com.brayanlolv.meca.model.Cliente;
import com.brayanlolv.meca.dao.ClienteDAO;
import java.util.List;

public class ClienteController {
    
    public void cadastrar(Cliente cliente){
        new ClienteDAO().salvar(cliente);
    }
    
      public Cliente pegarClientePor(String campo, String valor){
            return new ClienteDAO().findByParam(campo, valor);
        
    }
    
    public String[] procurarPor(String campo, String valor){
        Cliente cliente = new ClienteDAO().findByParam(campo, valor);
        if(cliente == null){
            return new String[4];
        }
        return toStringArray(cliente);
    }
    
    public String[][] getJTableMatrix(){
        List<Cliente> clientes = new ClienteDAO().findAll();
        String[][] dados = new String[clientes.size()][]  ;
        int i = 0;
        for(Cliente cliente: clientes){
            dados[i] = toStringArray(cliente);
            i++;
        }
        return dados;
        
    }
    
    public void Modificar(Cliente cliente){
        new ClienteDAO().alterar(cliente);
    }
    
    public void apagar(int id){
        new ClienteDAO().excluir(id);
    }
   
    /*public void apagar(Cliente cliente){
        new ClienteDAO().excluir(cliente);
    }*/
    private String[] toStringArray(Cliente cliente){
        String[] dados = {cliente.getNome(),cliente.getEmail(),cliente.getTelefone(),cliente.getDocumento()};
        return dados;
    }
    
}
