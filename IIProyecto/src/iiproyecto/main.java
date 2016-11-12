/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiproyecto;

import Clases.Cliente;
import Clases.Factoria;
import Clases.Mesero;
import Clases.Restaurante;
import Clases.*;
import Ventanas.*;

/**
 *
 * @author Josua
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static Restaurante restaurante;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente uno=new Cliente("Andrey","232");
        
        restaurante =new Restaurante(" "," Mi restaurante","23233434","Cerca del colegio","Mirestaurante@gmail.com");
        restaurante.registrarCliente(uno);
        uno=new Cliente("Ian Fabricio","123");
        restaurante.registrarCliente(uno);
         Mesero mesero=new Mesero("Juan","423");   
        restaurante.registrarEmpleado(mesero);
        mesero=new Mesero("Carlos","323");
        restaurante.registrarEmpleado(mesero);
        
        new VentanaPrin().setVisible(true);
        
        
        
        
    }
    
}
