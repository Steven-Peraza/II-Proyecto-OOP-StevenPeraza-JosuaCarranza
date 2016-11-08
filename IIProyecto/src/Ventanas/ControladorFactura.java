/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Restaurante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Josua
 */
public class ControladorFactura implements ActionListener{
    
    Restaurante instanciaRestaurante;
    FacturaVista factura;

    public ControladorFactura(Restaurante instanciaRestaurante, FacturaVista factura) {
        this.instanciaRestaurante = instanciaRestaurante;
        this.factura = factura;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        
    }
    
    
    
}
