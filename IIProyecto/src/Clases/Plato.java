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
public class Plato {
    
     //atributos
    private String nombre;
    private int numero;
    private int precio;
    private int calorias;
    private int vecesConsumido;
    private String ingredientes[]; //un arreglo que contiene ingredentes del plato
    private String estado; //conocer si esta listo o no

    //constructor
    public Plato(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }
    //se asigna un numero al plato
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getVecesConsumido() {
        return vecesConsumido;
    }

    public void setVecesConsumido(int vecesConsumido) {
        this.vecesConsumido = vecesConsumido;
    }

    //retorna el arreglo que contiene los ingreddientes del plato
    public String[] getIngredientes() {
        return ingredientes;
    }

    // establece los ingredientes del plato
    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    //obtener estado del platillo
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre=" + nombre + ", numero=" + numero + ", precio=" + precio + ", calorias=" + calorias + ", vecesConsumido=" + vecesConsumido + ", ingredientes=" + ingredientes.length + ", estado=" + estado + '}';
    }
    
    
    
}
