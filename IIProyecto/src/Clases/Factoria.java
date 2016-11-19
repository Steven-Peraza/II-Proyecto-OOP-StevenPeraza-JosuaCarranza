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
public class Factoria {

    //constructor por defecto
    public Factoria(){
    
    }
    
    //retorna instancia tipo cliente, 
    public Cliente fabricarCliente(String nombre,String cedula){
    
        return new Cliente(nombre,cedula); // se retorna una instancia de cliente
    }
    
     //retorna instancia tipo cocinero
    public  Cocinero fabricarCocinero(String nombre,String cedula){
    
        return new Cocinero(nombre,cedula); // se retorna una instancia de cocinero con los datos recibidos
    }
   
     //retorna instancia tipo mesero
    public  Mesero fabricarMesero(String nombre,String cedula){
    
        return new Mesero(nombre,cedula); // se retorna una instancia de mesero con los datos recibidos
    }

    @Override
    public String toString() {
        return "Factoria{" + '}';
    }
    
    
    
    
}
