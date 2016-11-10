/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Josua
 */
public class Controlador implements ActionListener{

    Factura instanciaFactura; //instancia que hace de modelo en el mvc;
    //FacturaVista Vista; // debe asociarse a una ventana 

    
    //debe tambien recibir la ventana a controlar,
    public Controlador(Factura instanciaFactura) {
        this.instanciaFactura = instanciaFactura;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        
        return "Controlador{" + "nombreRestaurante=" + instanciaFactura.getFormaPago() + '}';
    
    }
    
    
    
}
