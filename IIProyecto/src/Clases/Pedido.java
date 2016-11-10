/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Josua
 */
public class Pedido {
    
    //atributos 
    private String  estado; //estado del pedido listo o no
    private Plato plato;
    private Bebida bebida;

    //constructor

    public Pedido(String estado) {
        this.estado = estado;
        plato=null;
        bebida=null;
    }
  
   // metodos set y get 

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
   
    
}
