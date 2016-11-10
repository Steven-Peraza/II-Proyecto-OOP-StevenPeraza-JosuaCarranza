/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiproyecto;

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
        
        //agregacion de las mesas
        Mesa mesa = new Mesa (1,4);
        restaurante.setMesas(mesa);
        mesa = new Mesa (2,2);
        restaurante.setMesas(mesa);
        mesa = new Mesa (3,4);
        restaurante.setMesas(mesa);
        mesa = new Mesa (4,5);
        restaurante.setMesas(mesa);
        mesa = new Mesa (5,6);
        restaurante.setMesas(mesa);
        mesa = new Mesa (6,4);
        restaurante.setMesas(mesa);
        mesa = new Mesa (7,6);
        restaurante.setMesas(mesa);
        mesa = new Mesa (8,2);
        restaurante.setMesas(mesa);
        mesa = new Mesa (9,3);
        restaurante.setMesas(mesa);
        mesa = new Mesa (10,3);
        restaurante.setMesas(mesa);
        mesa = new Mesa (11,8);
        restaurante.setMesas(mesa);
        
        
        
        new VentanaPrin().setVisible(true);
        
        
        
        
    }
    
}
