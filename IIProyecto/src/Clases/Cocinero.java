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
public class Cocinero extends Empleado{

      //atributos
    private String especialidad;
    private int cantidadPlatilosCocinados=0;
    private int cantidadBebidasPreparadas=0;
    
    private ArrayList<Pedido> listaPedidos;
    
    
    //constructor
    public Cocinero(String nombre, String cedula) {
        super(nombre, cedula);
        listaPedidos=new ArrayList();    
    }
   
    //metodos set y get
    
   //se obtiene la especialidad, del cocinero 
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //se obtiene el total de platos que ha cocinado
    public int getCantidadPlatilosCocinados() {
        return cantidadPlatilosCocinados;
    }

    public void setCantidadPlatilosCocinados(int cantidadPlatilosCocinados) {
        this.cantidadPlatilosCocinados = cantidadPlatilosCocinados;
    }

    //se obtiene el total de bebidas preparadas por él
    public int getCantidadBebidasPreparadas() {
        return cantidadBebidasPreparadas;
    }

    public void setCantidadBebidasPreparadas(int cantidadBebidasPreparadas) {
        this.cantidadBebidasPreparadas = cantidadBebidasPreparadas;
    }

    //pone el estado del platillo en listo, y lo elimina de la lista del cocinero
    public void cocinarPlatillo(Pedido pedido){
        
        
        
    }
    
    //funcion con la que el cocinero visualiza las ordenes
    public void verOrdenes(Orden orden){
    
    }
    
    @Override
    public String toString() {
        return super.toString()+"Cocinero{" + "especialidad=" + especialidad + ", cantidadPlatilosCocinados=" + cantidadPlatilosCocinados + ", cantidadBebidasPreparadas=" + cantidadBebidasPreparadas + '}';
    }
    
  
    
}
