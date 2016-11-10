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
public class Orden {
    
    //atributos
    
    private boolean estado;  //conocer si esta abierta o ya fue cerrada
    private Mesero mesero; //relacion con mesero
    private ArrayList<Detalle> detalles;
    private Mesa mesa;
    //constructor
    public Orden() {
      this.detalles=new ArrayList();
    }

    //metodos get y set de cada atributo
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Detalle detalles) {
        this.detalles.add(detalles);
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    
   
    //metodos adicionales
    
    //agrega un plato nuevo al arreglo de platos, recibe como parametro objeto tipo plato
    public void agregarPlatoNuevo(Plato plato,int cantidad){
        Detalle det=new Detalle(cantidad);
        det.setPlato(plato);
        this.detalles.add(det);
    }

    //agrega una bebida a la orden, recibe como parametro objeto bebida
    public void agregarBebida (Bebida bebida,int cantidad){
        Detalle det=new Detalle(cantidad);
        det.setBebida(bebida);
        this.detalles.add(det);
    }
    
    //agrega un plato que ya se encuentra en el menu a la orden, recibe objeto tipo plato
    public void agregarPlato(Plato plato,int cantidad){
        Detalle det=new Detalle(cantidad);
        det.setPlato(plato);
        this.detalles.add(det);
        
    }

    //funcion para desocupar la mesa luego del uso
    public void desocuparMesa(){
    
        this.mesa.setEstado(false);
    
    }
    
    //para verificar cuando ya todo lo consummido se ha pagado
    public boolean revisarDetalles(){
     
        return true;
    }
    
    @Override
    public String toString() {
        return "Orden{" + "estado=" + estado + ", mesero=" + mesero.getNombre() + ", detalles=" + detalles.size() + ", mesa=" + mesa.getNumero() + '}';
    }

   

    
    
}
