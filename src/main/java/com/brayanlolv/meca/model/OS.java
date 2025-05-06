 package com.brayanlolv.meca.model;
import javax.persistence.*;
import java.io.Serializable;


@Entity
public class OS implements Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   
   @Column(nullable = false)
   private String titulo; 
   

   @Column(nullable = false)
   private String descricao;
   
   @Column(nullable = false)
   private String data;
   
   @Column(nullable = false)
   private double valor;

   @ManyToOne
//    @Column(nullable = false)
   private Carro carro;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
  
   
   
//   @Column(nullable = false)
//   private int carro_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

//    public int getCarro_id() {
//        return carro_id;
//    }
//
//    public void setCarro_id(int carro_id) {
//        this.carro_id = carro_id;
//    }

   
    
   
}
