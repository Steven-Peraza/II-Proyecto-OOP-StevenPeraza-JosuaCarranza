/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Josua
 */
public class Mesa {
    
   //atributos
   private int numero;
   private int capacidad;
   private boolean estado;
   
   private Orden orden;
   private ArrayList <Cliente> lista;

   //constructor
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        lista=new ArrayList(); //inicializar arreglo
    }

    //metodos set y get
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //se obtiene cuantos espacios tiene la mesa
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(Cliente client) {
        this.lista.add(client); //agregar cliente
    }
    
    
    
    //busca un cliente en la mesa
    public Cliente buscarCliente(int cedula){
    
        for(int i=0;i<this.lista.size();i++){
            int ced=Integer.parseInt(this.lista.get(i).getCedula());
            if (ced==cedula){
                return this.lista.get(i); //se retorna el cliente
            }
        }
        
        return null; //se retorna null si no esta
    
    }
    
    //elimina los clientes qye existan en la lista
    public void limpiarMesa(){
        
        this.lista.clear(); //se reestablece la lista en blanco
    
    }
    
    // agrega un cliente a la lista de la mesa
    public void agregarCliente(Cliente cliente){
        
        this.lista.add(cliente); //se agrega el cliente
    
    }
    
    
    }
   
    
    

