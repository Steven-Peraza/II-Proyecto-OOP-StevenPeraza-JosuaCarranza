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
public class Empleado extends Persona{
    
    //atributos
    
    private String idiomas;
    private int cantidadMesasAtendidas=0; //para conocer cuantas mesas ha atendido el mesero
    
    public Empleado(String nombre, String cedula) {
        super(nombre, cedula);
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public int getCantidadMesasAtendidas() {
        return cantidadMesasAtendidas;
    }

    public void setCantidadMesasAtendidas(int cantidadMesasAtendidas) {
        this.cantidadMesasAtendidas = cantidadMesasAtendidas;
    }

    public Orden tomarOrden(int numMesa){
    
    
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "idiomas=" + idiomas + ", cantidadMesasAtendidas=" + cantidadMesasAtendidas + '}';
    }

  
    
    
    
    
}
