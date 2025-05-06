
package com.brayanlolv.meca.controller;
import com.brayanlolv.meca.dao.CarroDAO;
import com.brayanlolv.meca.model.Carro;
import com.brayanlolv.meca.model.Cliente;

import java.util.List;
public class CarroController {
        
    public void cadastrar(Carro carro,String documento){;
    Cliente cliente = new ClienteController().pegarClientePor("documento", documento);
    carro.setCliente(cliente);
    new CarroDAO().salvar(carro);
    }
//    
     public Carro pegarCarroPor(String campo, String valor){
            return new CarroDAO().findByParam(campo, valor);
    }
//     
    public List<Carro> listar(){
        return new CarroDAO().listar();    
    } 
//    
    public String[][] getJTableMatrix(){;
        List<Carro> carros = listar();
        String[][] dados = new String[carros.size()][]  ;
        int i = 0;
        for(Carro carro: carros){
            dados[i] = toStringArray(carro);
            i++;
        }
        return dados;
        
    }
    
     private String[] toStringArray(Carro carro){
        String[] dados = {carro.getModelo(),carro.getPlaca(),carro.getCor(),
            carro.getObservacoes()
        };
        return dados;
    }
//    
//    
     public void modificar(Carro carro){
         new CarroDAO().alterar(carro);
     };
     
        public void apagar(int id){
        CarroDAO cDAO = new CarroDAO(); 
        Carro c = cDAO.findByParam("id",id);
        cDAO.apagar(c);
    }
   
}
