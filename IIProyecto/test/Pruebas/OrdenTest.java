package Pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Bebida;
import Clases.Orden;
import Clases.Pago;
import Clases.Plato;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josua
 */
public class OrdenTest {
    
    private Orden orden;
    
    public OrdenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        orden=new Orden(5);
    }
    
    @After
    public void tearDown() {
        
        orden=null;
    }

    // se prueba que se asigne correctamente el numero de mesa
    @Test
    public void testSetNumeroMesa(){
    int resultadoEsperado=8;
    this.orden.setNumeroMesa(resultadoEsperado);
    assertEquals("No fue posible la asignacion",resultadoEsperado,this.orden.getNumeroMesa());
        
    }
    
    // se prueba que se asigne correctamente la cantidad de bebidas
     @Test
    public void testSetCantidadebidas(){
    
    int resultadoEsperado=14;
    this.orden.setCantidadBebidas(resultadoEsperado);
    assertEquals("No fue posible la asignacion",resultadoEsperado,this.orden.getCantidadBebidas());
        
    }
    
    // se prueba que se asigne correctamente la cantidad de platos 
    @Test
    public void testSetCantidadPlatos(){
    int resultadoEsperado=10;
    this.orden.setCantidadPlatos(resultadoEsperado);
    assertEquals("No fue posible la asignacion",resultadoEsperado,this.orden.getCantidadPlatos());
        
    }
    
    //se prueba que se asigne el estado correctamente
    @Test
    public void testSetEstado(){
    
    boolean resultadoEsperado=true;
    this.orden.setEstado(resultadoEsperado);
    assertEquals("No fue posible la asignacion",resultadoEsperado,this.orden.getEstado());
        
    }
    
    //se prueba que se agregue un plato correctamente
    @Test
    public void testAgregarPlato(){
    
    Plato plato=new Plato("Arroz",4);
    int resultadoEsperado=1;
    this.orden.agregarPlato(plato);
    assertEquals("No fue posible agregar el plato",resultadoEsperado,this.orden.getPlatos().size());
        
    }
    
    //se prueba que se agregue una bebida correctamente
    @Test
    public void testAgregarBebida(){
    
    Bebida bebida=new Bebida("Gaseosa",3000,25,0);
    int resultadoEsperado=1;
    this.orden.agregarBebida(bebida);
    assertEquals("No fue posible agregar la bebida",resultadoEsperado,this.orden.getBebidas().size());
        
    }
    
    //se prueba que se asigne correctamente el pago
    @Test
    public void testSetPago(){
    
    Pago pago= new Pago();
    float resultadoEsperado= 100;
    pago.setMontoTotal(resultadoEsperado);
    this.orden.setPago(pago); 
    assertEquals("Error al asignar el monto total",resultadoEsperado,this.orden.getPago().getMontoTotal(),3);//necesita un parametro mas
    
    }
    
    
}
