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
    private int numeroMesa;
    private int cantidadBebidas ; //total de bebidas pedidas
    private int cantidadPlatos;   //total de platos
    private boolean estado;  //conocer si esta abierta o ya fue cerrada
    private Mesero mesero; //relacion con mesero
    private ArrayList <Plato> platos; //lista de platillos pedidos
    private ArrayList <Bebida> bebidas; //lista de bebidas pedidas
    private Pago pago=null; //el pago a realizar
    
    //constructor
    public Orden(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        platos=new ArrayList();
        bebidas=new ArrayList();
    }

    //metodos get y set de cada atributo

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
   
    
    
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCantidadBebidas() {
        return cantidadBebidas;
    }

    public void setCantidadBebidas(int cantidadBebidas) {
        this.cantidadBebidas = cantidadBebidas;
    }

    public int getCantidadPlatos() {
        return cantidadPlatos;
    }

    public void setCantidadPlatos(int cantidadPlatos) {
        this.cantidadPlatos = cantidadPlatos;
    }

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

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    //se agrega el plato
    public void setPlatos(Plato platos) {
        this.platos.add(platos);
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    //se agrega la bebida
    public void setBebidas(Bebida bebidas) {
        this.bebidas.add(bebidas);
    }
    
    //metodos adicionales
    
    //agrega un plato nuevo al arreglo de platos, recibe como parametro objeto tipo plato
    public void agregarPlatoNuevo(Plato plato){
    
        this.platos.add(plato);
    }

    //agrega una bebida a la orden, recibe como parametro objeto bebida
    public void agregarBebida (Bebida bebida){
        
         this.bebidas.add(bebida);
    }
    
    //agrega un plato que ya se encuentra en el menu a la orden, recibe objeto tipo plato
    public void agregarPlato(Plato plato){
    
        this.platos.add(plato);
    }

    @Override
    public String toString() {
        return "Orden{" + "numeroMesa=" + numeroMesa + ", cantidadBebidas=" + cantidadBebidas + ", cantidadPlatos=" + cantidadPlatos + ", estado=" + estado + ", mesero=" + mesero.getNombre() + ", platos=" + platos.size() + ", bebidas=" + bebidas.size() + ", pago=" + pago.getMontoTotal() + '}';
    }

    
    
}
