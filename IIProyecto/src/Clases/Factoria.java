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

    // un numero se asocia a un tipo de persona a generar
    public Factoria(int numero,String nombre,String cedula) {
       
        // un uno representa a cliente
        if (numero==1){
            
            fabricarCliente(nombre,cedula);
        }
        
        //un dos a mesero
        else if (numero==2){
            
            fabricarMesero(nombre,cedula);
        
        }
        
        //si no se fabrica un nuevo cocinero
        else{
            
            fabricarCocinero(nombre,cedula);
        }
        
    }
    
    //retorna instancia tipo cliente, accedida sin hacer una instancia
    public static Cliente fabricarCliente(String nombre,String cedula){
    
        return new Cliente(nombre,cedula); // se retorna una instancia de cliente
    }
    
     //retorna instancia tipo cocinero
    public static Cocinero fabricarCocinero(String nombre,String cedula){
    
        return new Cocinero(nombre,cedula); // se retorna una instancia de cocinero con los datos recibidos
    }
   
     //retorna instancia tipo mesero
    public static Mesero fabricarMesero(String nombre,String cedula){
    
        return new Mesero(nombre,cedula); // se retorna una instancia de mesero con los datos recibidos
    }
    
    
}
