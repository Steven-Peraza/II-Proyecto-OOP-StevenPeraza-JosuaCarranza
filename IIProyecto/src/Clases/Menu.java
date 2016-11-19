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
public class Menu {
    
    //atributos
    private int cantidadPlatillos=0;
    private  int cantidadBebidas=0;
    private ArrayList <Plato> platos; //platos disponibles en el restaurante
    private ArrayList <Bebida> bebidas; //bebidas disponibles en el restaurante
    
    //constructor
    public Menu() {
        platos=new ArrayList();
        bebidas=new ArrayList();
        
    }

    //metodos set y get
    public int getCantidadPlatillos() {
        return cantidadPlatillos;
    }

    public void setCantidadPlatillos(int cantidadPlatillos) {
        this.cantidadPlatillos = cantidadPlatillos;
    }

    public int getCantidadBebidas() {
        return cantidadBebidas;
    }

    public void setCantidadBebidas(int cantidadBebidas) {
        this.cantidadBebidas = cantidadBebidas;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(Plato platos) {
        this.platos.add(platos);
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida bebidas) {
        this.bebidas.add(bebidas);
    }
    
    //metodos adicionales
    
    //agrega un plato a la lista , recibe un objeto tipo plato
    public boolean agregarPlatillo(Plato plato){
        
        for (int i=0;i<this.platos.size();i++){
        
            if (this.platos.get(i).getNombre().equals(plato.getNombre())){ //si el platillo ya existe
                return false; //insercion no exitosa
                
            }
            
        }
        
        this.platos.add(plato); //se agrega el plato
        return true;
    }
    
    // se recibe un objeto bebida y se agrega a la lista si no se encuentra ya en el menu
    public boolean agregarBebida(Bebida bebida){
        
         for (int i=0;i<this.bebidas.size();i++){
        
            if (this.bebidas.get(i).getNombre().equals(bebida.getNombre())){ //si el tipo de bebida ya existe
               
                return false; //ya hay bebidas de ese tipo
                
            }
            
        }
        
        
        this.bebidas.add(bebida); //se agrega bebida,
        return true;
    }
    
    //recibe el plato a eliminar del menu como parametro
    public boolean eliminarPlatillo(Plato plato){
        
         for (int i=0;i<this.platos.size();i++){
        
            if (this.platos.get(i).getNombre().equals(plato.getNombre())){ //si es el platillo
                this.platos.remove(i); //se elimina
                return true;  //eliminar exitoso
                
            }
            
        }
   
        return false; // no se elimino
       
    }
    
    //recibe la bebida a eliminar como parametro
     public boolean eliminarBebida(Bebida bebida){
         
         
          for (int i=0;i<this.bebidas.size();i++){
        
            if (this.bebidas.get(i).getNombre().equals(bebida.getNombre())){ //si el platillo ya existe
               this.bebidas.remove(i);
                return true; //eliminar exitosa
                
            }
            
        }
        
        return false; //no se elimino
   
    
    }
     
     //busca un platillo a partir del nombre,
     // y lo devuelve
     public Plato buscarPlatillo(int numero){
         
           for (int i=0;i<this.platos.size();i++){
        
            if (this.platos.get(i).getNumero()==numero){ //si el platillo ya existe
                return this.platos.get(i); // se retorna el plato
                
            }
            
        }
        
        return null;

     }
     
     //busca una bebida, recibe el tipo de bebida y su precio como parametro
     public Bebida buscarBebida(int numero){
         
                  for (int i=0;i<this.bebidas.size();i++){
        
            if (this.bebidas.get(i).getNumero()==numero){//si la bebida existe
                return this.bebidas.get(i); // se retorna el plato
                
            }
            
        }
        
        return null;
     
     }

    @Override
    public String toString() {
        return "Menu{" + "cantidadPlatillos=" + cantidadPlatillos + ", cantidadBebidas=" + cantidadBebidas + ", platos=" + platos.size() + ", bebidas=" + bebidas.size() + '}';
    }
     
    
}
