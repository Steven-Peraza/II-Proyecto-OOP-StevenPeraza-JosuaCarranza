/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Josua
 */
public class Detalle extends Observable {
    
    //atributos
    Observer observador;
    Observer observ;
    private Plato plato;
    private Bebida bebida;
    private boolean estado;
    private int cantidad; //cantidad de platos o bebidas que se pidieron de ese tipo
    
    //constructor

 
    public Detalle(int cantidad) {
        this.cantidad = cantidad;
        this.plato=null;
        this.bebida=null;
        estado=false;
    }

    //metodo set y get
    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
       
    }

    public Observer getObservador() {
        return observador;
    }

    public void setObservador(Observer observador) {
        this.observador = observador;
    }

    public Observer getObserv() {
        return observ;
    }

    public void setObserv(Observer observ) {
        this.observ = observ;
    }
    
    
    
    public void notifyOrden(){  //util para actualizar la ventana
        if (observ!=null){
        
            this.observ.update(this, this);
        
        }
    
    }
    
    public void notifyObservers(){
    
        if (observador!=null){
            
                this.observador.update(this, this);
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
       if (this.estado!=true){
        this.estado = estado;
       }
       
       else{
           notifyObservers(); //notificar observador
       }
        
    }

    
    
    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public int getCantidad() {
        return cantidad;
    }
//notificar al observador en caso de cambios
    public void setCantidad(int cantidad) {
        if (cantidad<0){
            this.cantidad=0;
        }
        else{
        this.cantidad = cantidad;
        }
        notifyOrden();  //se tiene un notificar diferente para cada observador
            }
        
        
        
    
    
}
