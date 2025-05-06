package com.brayanlolv.meca.model;
import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Carro implements Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   
   @Column(nullable = false)
   private String modelo; 


   @Column(nullable = false)
   private String placa;
   @Column(nullable = false)
   private String ano;
   @Column(nullable = false)
   private String cor;
   @Column(nullable = false)
   private String observacoes;
   
    @ManyToOne
    private Cliente cliente;
    // private int cliente_id;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

//
//    public int getCliente_id() {
//        return cliente_id;
//    }
//
//    public void setCliente_id(int cliente_id) {
//        this.cliente_id = cliente_id;
//    }
    
   
}
