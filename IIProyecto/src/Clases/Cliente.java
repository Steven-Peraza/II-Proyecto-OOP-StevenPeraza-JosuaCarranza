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
public class Cliente extends Persona {
    
    private int visitasRealizadas =0; //variable para conocer la frecuencia con que asiste el cliente
    
    public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
        
    }

    // se obtiene la cantidad de visitas que ha hecho
    public int getVisitasRealizadas() {
        return visitasRealizadas;
    }

    public void setVisitasRealizadas(int visitasRealizadas) {
        this.visitasRealizadas = visitasRealizadas;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "visitasRealizadas=" + visitasRealizadas + '}';
    }
    
    
    
}
