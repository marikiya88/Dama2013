package com.maria.dama2014.db;


// Generated 17-sep-2013 0:44:35 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Colorido generated by hbm2java
 */
public class Colorido  implements java.io.Serializable {


     private int id;
     private Modelo modelo;
     private Color color;
     private int orden;
     private Set prendas = new HashSet(0);

    public Colorido() {
    }

	
    public Colorido(int id, int orden) {
        this.id = id;
        this.orden = orden;
    }
    public Colorido(int id, Modelo modelo, Color color, int orden, Set prendas) {
       this.id = id;
       this.modelo = modelo;
       this.color = color;
       this.orden = orden;
       this.prendas = prendas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Modelo getModelo() {
        return this.modelo;
    }
    
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    public Color getColor() {
        return this.color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    public int getOrden() {
        return this.orden;
    }
    
    public void setOrden(int orden) {
        this.orden = orden;
    }
    public Set getPrendas() {
        return this.prendas;
    }
    
    public void setPrendas(Set prendas) {
        this.prendas = prendas;
    }




}


