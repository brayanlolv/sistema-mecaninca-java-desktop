
package com.brayanlolv.meca.controller;
import com.brayanlolv.meca.dao.CarroDAO;
import com.brayanlolv.meca.model.Carro;
import com.brayanlolv.meca.model.Cliente;

import java.util.List;
public class CarroController {
        
    
        Cliente cliente;
    
    private void checarCampo(String campo)  throws Exception{
        if (campo == null || campo.isBlank()){
           throw new Exception("Campos vazios!!!");
        }
    }
    
    
    
    public void cadastrar(Carro carro,String documento)throws Exception {

        try{
            cliente = new ClienteController().pegarClientePor("documento", documento);
        }catch(Exception e){
             throw new Exception("cliente nao encontrado,certifique se dele estar cadastrado");
        }
        if (cliente == null ){ throw new Exception("cliente nao encontrado,certifique  dele estar cadastrado ou do cpf estar correto");}
        
        carro.setCliente(cliente);
        
        checarCampo(carro.getPlaca());
        checarCampo(carro.getAno());
        checarCampo(carro.getModelo());
        checarCampo(carro.getCor());
        
        new CarroDAO().salvar(carro);
    
    
    }
//    
     public Carro pegarCarroPor(String campo, String valor){
            return new CarroDAO().findByParam(campo, valor);
    }
         public String[] procurarPor(String campo, String valor){
        Carro carro  = new CarroDAO().findByParam(campo, valor);
        if(carro == null){
            return new String[4];
        }
        return toStringArray(carro);
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
