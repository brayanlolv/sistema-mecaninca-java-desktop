package com.brayanlolv.meca.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cliente implements Serializable{ 

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   
   //@Column(nullable = false)
   private String nome, email, documento, telefone;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
    
    
}


