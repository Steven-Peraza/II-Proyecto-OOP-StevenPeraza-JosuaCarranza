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

    private Cliente cliente;
    private Orden orden;
    private double pago;


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

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
    
    
    //se mostraria los articulos que tiene la factura
    void mostrarDetalles (){
        for (int i = 0; i < orden.getDetalles().size(); i++) {
            //falta conectarlo con la ventana, pero ya se pueden obtener los detalles desde "det"
            Detalle det = orden.getDetalles().get(i);
        }
    }

    @Override
    public String toString() {
        return "Factura{" + "fechaYHora=" + fechaYHora + ", formaPago=" + formaPago + ", cliente=" + cliente.getNombre() + '}';
    }
    
    
    
    
}
