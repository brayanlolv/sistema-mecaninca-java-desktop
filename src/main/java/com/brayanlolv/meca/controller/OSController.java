package com.brayanlolv.meca.controller;
import com.brayanlolv.meca.model.OS;
import com.brayanlolv.meca.dao.OSDAO;
import java.util.List;

public class OSController {
    
    public void cadastrar(OS cliente){
        new OSDAO().salvar(cliente);
    }
    
      public OS pegarOrdemPor(String campo, String valor){
            return new OSDAO().findByParam(campo, valor);
        
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
   
  
    private String[] toStringArray(OS cliente){
        String[] dados ={}; //{cliente.getNome(),cliente.getEmail(),cliente.getTelefone(),cliente.getDocumento()};
        return dados;
    }
    
}
