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

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(Pedido Pedidos) {
        
        if (this.listaPedidos.size()==0){
        this.listaPedidos.add(Pedidos);
        }
        
        else{
            if (this.listaPedidos.get(0).getPlato()!=null){
                if (listaPedidos.get(0).getPlato().getNombre().equals(Pedidos.getPlato().getNombre())){
                this.listaPedidos.add(Pedidos);
                
                }
            }
            
            else{
                if (listaPedidos.get(0).getBebida().getNombre().equals(Pedidos.getBebida().getNombre())){
                this.listaPedidos.add(Pedidos);
                
                }
            }
        }
    }
    
    

    //pone el estado del platillo en listo, y lo elimina de la lista del cocinero
    public void cocinarPlatillo(Pedido pedido){
        
        try{
        pedido.getBebida().setEstado("listo");       
        }
        
        catch(NullPointerException e){
        pedido.getPlato().setEstado("listo");
        
        }
        
    }
    
    //funcion con la que el cocinero visualiza las ordenes
    public void verOrdenes(Orden orden){
    
    }
    
    public String obtenerProductoPreparando(){
       if (this.listaPedidos.size()==0){
      
           return "";
          }
       
       else if (this.listaPedidos.get(0).getBebida()!=null){
           
           return this.listaPedidos.get(0).getBebida().getNombre();
        }
       
       else{
           
            return this.listaPedidos.get(0).getPlato().getNombre();
       }
      
    }
    
    public void limpiarPedidos(){
    
    this.listaPedidos.clear(); // se eliminan los platos que ya hizo
    }
    
    @Override
    public String toString() {
        return super.toString()+"Cocinero{" + "especialidad=" + especialidad + ", cantidadPlatilosCocinados=" + cantidadPlatilosCocinados + ", cantidadBebidasPreparadas=" + cantidadBebidasPreparadas + '}';
    }
    
  
    
}
