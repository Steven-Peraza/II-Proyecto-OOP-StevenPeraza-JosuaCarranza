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
    private String direccion;
    private String correo;
    private String telefono;
    
    //constructor
    public Empleado(String nombre, String cedula) {
        super(nombre, cedula);
    }

    //metodos set y get
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    

    

}
