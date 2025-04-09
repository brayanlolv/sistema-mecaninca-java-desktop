/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.brayanlolv.meca;
import com.brayanlolv.meca.telas.MultiPage;
import com.brayanlolv.meca.dao.ClienteDAO;
import com.brayanlolv.meca.model.Cliente;
import com.brayanlolv.meca.controller.ClienteController;
import java.util.List;
public class Meca {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MultiPage.main();
        
  
        /*
        List<Cliente> clientes =  new ClienteDAO().findAll();;
        new ClienteController().getJTableMatrix();
        Cliente cliente1 = clientes.getFirst();
        System.out.print(cliente1.getNome());
        System.out.print("fim");*/
    }
        
}
        /*
        Cliente cliente = new Cliente();
        cliente.setCpf("123");
        cliente.setEmail("algum email");
        cliente.setNome("nome");
        cliente.setTelefone("34234234");
        new ClienteDAO().salvar(cliente);
        */
        //System.out.print(new ClienteDAO().findAll());