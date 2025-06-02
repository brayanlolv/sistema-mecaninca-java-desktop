package com.brayanlolv.meca.controller;

import com.brayanlolv.meca.model.OS;
import com.brayanlolv.meca.model.Carro;
import com.brayanlolv.meca.dao.OSDAO;
import java.util.List;

public class OSController {
    
     Carro carro;
     
    private void checarCampo(String campo)  throws Exception{
        if (campo == null || campo.isBlank()){
           throw new Exception("Campos vazios!!!");
        }
    }
    
    public void cadastrar(OS os,String placaCarro) throws Exception{
        
        try{
            carro = new CarroController().pegarCarroPor("placa", placaCarro);
        }catch(Exception e){
             throw new Exception("carro nao encontrado, certifique dele estar cadastrado \n e a placa estar certa");
        }
        
        checarCampo(os.getData());
        checarCampo(os.getTitulo());
        checarCampo(os.getDescricao());
        
        
        if(carro == null){throw new Exception("carro não encontrado, certifique se dele estar cadastrado ou da sua placa estar certa");}
        os.setCarro(carro);
        new OSDAO().salvar(os);
    }
    
      public OS pegarOrdemPor(String campo, String valor){
            return new OSDAO().findByParam(campo, valor);
        
    }
    
    public OS pegarPorId( String valor){
        return  new OSDAO().findByParam("id",Integer.parseInt(valor));
        
    }
      
    
    
    
    public String[] procurarPor(String campo, String valor){
        OS os = new OSDAO().findByParam(campo, valor);
        if(os == null){
            return new String[4];
        }
        return toStringArray(os);
    }
    
    public String[][] getJTableMatrix(){
        List<OS> ordens = new OSDAO().listar();
        String[][] dados = new String[ordens.size()][]  ;
        int i = 0;
        for(OS cliente: ordens){
            dados[i] = toStringArray(cliente);
            i++;
        }
        return dados;  
    }
    
    public void modificar(OS os){
        new OSDAO().alterar(os);
    }
    
    public void apagar(int id){
        OSDAO cDAO = new OSDAO(); 
        OS c = cDAO.findByParam("id",id);
        cDAO.apagar(c);
    }
   
    private String[] toStringArray(OS os){
        String[] dados = {
            os.getTitulo(),
            os.getDescricao(),
            os.getData(),
            Integer.toString(os.getId())
        };
        //{cliente.getNome(),cliente.getEmail(),cliente.getTelefone(),cliente.getDocumento()};
        return dados;
    }
    
}
