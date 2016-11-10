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
 
    private String tipo;
    private int precio;
    private float miliLitros;
    
    private int vecesConsumido;

    //constructor
    public Bebida(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    

    //metodos set y get    
   
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

    @Override
    public String toString() {
        return "Bebida{"+" tipo=" + tipo + ", precio=" + precio + ", miliLitros=" + miliLitros + ", vecesConsumido=" + vecesConsumido + '}';
    }

    
    
    
    
}
