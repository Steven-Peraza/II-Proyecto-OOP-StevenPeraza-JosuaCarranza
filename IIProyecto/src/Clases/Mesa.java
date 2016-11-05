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
    }

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //busca un cliente en la mesa
    public Cliente buscarCliente(int cedula){
    
    return null;
    }
    
    //elimina los clientes qye existan en la lista
    public void limpiarMesa(){
    
    }
    
    // agrega un cliente a la lista de la mesa
    public void agregarCliente(Cliente cliente){
    
    
    }
    
    
    }
   
    
    

