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
public class Mesero extends Empleado{
    
    //atributos
    private String idiomas;
    private int cantidadMesasAtendidas=0; //para conocer cuantas mesas ha atendido el mesero
    
    //constructor
    public Mesero(String nombre, String cedula) {
        super(nombre, cedula);
    }

    //metodos set y get
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

    //funcion para tomar orden de una mesa
    public Orden tomarOrden(int numMesa){
    
    
     return null;
    }

    @Override
    public String toString() {
        return super.toString()+ "Mesero{" + "idiomas=" + idiomas + ", cantidadMesasAtendidas=" + cantidadMesasAtendidas + '}';
    }
    
    
    
}
