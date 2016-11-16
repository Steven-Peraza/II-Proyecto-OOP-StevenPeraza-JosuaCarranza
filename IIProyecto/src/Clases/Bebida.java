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
public class Bebida {
    
     //atributos
<<<<<<< HEAD
=======
 
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
    private String nombre;
    private String tipo;
    private int precio;
    private float miliLitros;
    private int numero;
    private String estado;
    
    private int vecesConsumido;

    //constructor
<<<<<<< HEAD
    public Bebida(String nombre, String tipo, int precio) {
        this.nombre = nombre;
=======
    public Bebida(String tipo, int precio,String nombre,int numero) {
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
        this.tipo = tipo;
        this.precio = precio;
        this.nombre=nombre;
        this.numero=numero;
        this.estado="espera";
    }
    
    //metodos set y get
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {    
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    // se obtiene el tipo de bebida
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getMiliLitros() {
        return miliLitros;
    }

    public void setMiliLitros(float miliLitros) {
        this.miliLitros = miliLitros;
    }

    public int getVecesConsumido() {
        return vecesConsumido;
    }

    public void setVecesConsumido(int vecesConsumido) {
        this.vecesConsumido = vecesConsumido;
    }
    
      //clonando un objeto
    public Bebida clone(){
    
      Bebida clon = new Bebida(this.tipo,this.precio,this.nombre,this.numero);
      clon.setTipo(this.tipo);
      return clon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Bebida{"+" tipo=" + tipo + ", precio=" + precio + ", miliLitros=" + miliLitros + ", vecesConsumido=" + vecesConsumido + '}';
    }

    
    
    
    
}
