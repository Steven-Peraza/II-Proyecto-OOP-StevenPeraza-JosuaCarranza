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
public class Pago {
   
    //atributos
   private float montoTotal;
   private Factura factura;

   //constructor
    public Pago() {
    }

    //metodos set y get
    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    //calcula el impuesto de una compra
    public void calcularImpuesto(){
      
    
    }
   
    //una vez realizado el pago se desocupa la mesa a la que este asociada la orden
    public void desocuparMesa(){
    
    
    }
    
    //modalidad de pago individual
    public void pagoIndividual(){
    
        
    }
    //modalidad de pago grupal
    public void pagoGrupal(){
    
    }

    @Override
    public String toString() {
        return "Pago{" + "montoTotal=" + montoTotal + ", factura=" + factura + '}';
    }
    
    
}
