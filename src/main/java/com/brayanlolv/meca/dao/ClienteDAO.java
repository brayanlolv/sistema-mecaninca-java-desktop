/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brayanlolv.meca.dao;
import com.brayanlolv.meca.model.Cliente;

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
    
    public void excluir(Cliente cliente) {
        delete(cliente);
    }
    
    public void excluir(int id) {
        Cliente c = findByParam("id",id);
        delete(c);
    }
}
