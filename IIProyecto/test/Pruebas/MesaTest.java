package Pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Cliente;
import Clases.Factoria;
import Clases.Mesa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;

/**
 *
 * @author Josua
 */
public class MesaTest extends TestCase {
    
    private Mesa mesa;
    
    public MesaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        this.mesa=new Mesa(3,4); //mesa numero 3, capacidad 4
    }
        
    @After
    public void tearDown() {
        this.mesa=null;
    }
    
    //se prueba funcionamiento del set numero mesa por medio del get
    @Test
    public void testSetNumeroMesa(){
        int resultadoEsperado=7;
        this.mesa.setNumero(resultadoEsperado);
        int resultadoObtenido=this.mesa.getNumero();
        //si exite error muestra el siguiente mensaje
        assertEquals("Error en la asignacion",resultadoEsperado,resultadoObtenido);
        
    }
    
    //se prueba que se asigne correctamente la capacidad de la mesa usando el get
    @Test
     public void testSetCapacidad(){
        int capacidad=7;
        this.mesa.setCapacidad(capacidad);
        int resultadoObtenido=this.mesa.getCapacidad();
        //si exite error muestra el siguiente mensaje
        assertEquals("Error en la asignacion",capacidad,resultadoObtenido);
        
    }
     
     //se prueba que funcione el metodo para colocar mesa ocupada o desocupada
     @Test
     public void testSetEstadoOcupado(){
        boolean estate=false;
        this.mesa.setEstado(estate);
        boolean resultadoObtenido=this.mesa.getEstado();
        //si exite error muestra el siguiente mensaje
        assertEquals("Error en la asignacion",estate,resultadoObtenido);
        
    }
       
    
    
}
