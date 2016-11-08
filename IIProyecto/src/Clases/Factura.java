/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Josua
 */
public class Factura {
    
    //atributos
    private Date fechaYHora;
    private String formaPago;
    public Cliente cliente;

    //constructor
    public Factura(Date fechaYHora, String formaPago) {
        this.fechaYHora = fechaYHora;
        this.formaPago = formaPago;
    }
    
    //metodos get y set
    public Date getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //se mostraria los articulos que tiene la factura
    void mostrarDetalles (){
        
    }

    @Override
    public String toString() {
        return "Factura{" + "fechaYHora=" + fechaYHora + ", formaPago=" + formaPago + ", cliente=" + cliente.getNombre() + '}';
    }
    
    
    
    
}
