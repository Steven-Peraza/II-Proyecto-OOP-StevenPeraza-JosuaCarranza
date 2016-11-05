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
    
    private int cantidadPlatillos=0;
    private  int cantidadBebidas=0;
    private ArrayList <Plato> platos; //platos disponibles en el restaurante
    private ArrayList <Bebida> bebidas; //bebidas disponibles en el restaurante
    
    
    public Menu() {
        
    }

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

    public boolean agregarPlatillo(Plato plato){
    
    return true;
    }
    
    // se recibe un objeto bebida y se agrega a la lista si no se encuentra ya en el menu
    public boolean agregarBebida(Bebida bebida){
    
    return true;
    }
    
    public boolean eliminarPlatillo(Plato plato){
    return true;
    
    }
    
     public boolean eliminarBebida(Bebida bebida){
    return true;
    
    }
     
     public Plato buscarPlatillo(String nombre){
     
     return null;
     }
     
     public Bebida buscarBebida(String nombre){
     
     return null;
     }
     
     
     
    
    
    
    @Override
    public String toString() {
        return "Menu{" + "cantidadPlatillos=" + cantidadPlatillos + ", cantidadBebidas=" + cantidadBebidas + '}';
    }
    
    
    
    
}
