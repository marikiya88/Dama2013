package com.maria.dama2014.db;


// Generated 17-sep-2013 0:44:35 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Talla generated by hbm2java
 */
public class Talla  implements java.io.Serializable {


     private int id;
     private TipoTalla tipoTalla;
     private int orden;
     private String valor;
     private Set tallajes = new HashSet(0);

    public Talla() {
    }

	
    public Talla(int id, int orden, String valor) {
        this.id = id;
        this.orden = orden;
        this.valor = valor;
    }
    public Talla(int id, TipoTalla tipoTalla, int orden, String valor, Set tallajes) {
       this.id = id;
       this.tipoTalla = tipoTalla;
       this.orden = orden;
       this.valor = valor;
       this.tallajes = tallajes;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public TipoTalla getTipoTalla() {
        return this.tipoTalla;
    }
    
    public void setTipoTalla(TipoTalla tipoTalla) {
        this.tipoTalla = tipoTalla;
    }
    public int getOrden() {
        return this.orden;
    }
    
    public void setOrden(int orden) {
        this.orden = orden;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Set getTallajes() {
        return this.tallajes;
    }
    
    public void setTallajes(Set tallajes) {
        this.tallajes = tallajes;
    }




}

