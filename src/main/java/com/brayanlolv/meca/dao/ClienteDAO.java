/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brayanlolv.meca.dao;
import com.brayanlolv.meca.model.Cliente;
/**
 *
 * @author braiu
 */
//tavez tirar  seriazable possa dar merda
public class ClienteDAO extends GenericDao<Cliente> {

    public void procurar(){
    }
    
    public void salvar(Cliente cliente) {
        save(cliente);
    }

    public void alterar(Cliente cliente) {
        update(cliente);
    }
    
    public Cliente procurarPor(String campo,String valor){
        return findByParam(campo,valor);
    }
    
    public void excluir(String id) {
        Cliente c = findByParam("id",id);
        delete(c);
    }
}
