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
    int obtenido=this.orden.getNumeroMesa();
    assertEquals("No fue posible la asignacion",resultadoEsperado,obtenido);
        
    }
    
    // se prueba que se asigne correctamente la cantidad de bebidas
     @Test
    public void testSetCantidadebidas(){
    
    int resultadoEsperado=14;
    this.orden.setCantidadBebidas(resultadoEsperado);
    int obtenido=this.orden.getCantidadBebidas();
    assertEquals("No fue posible la asignacion",resultadoEsperado,obtenido);
        
    }
    
    // se prueba que se asigne correctamente la cantidad de platos 
    @Test
    public void testSetCantidadPlatos(){
    int resultadoEsperado=10;
    this.orden.setCantidadPlatos(resultadoEsperado);
   int obtenido= this.orden.getCantidadPlatos();
    assertEquals("No fue posible la asignacion",resultadoEsperado,obtenido);
        
    }
    
    //se prueba que se asigne el estado correctamente
    @Test
    public void testSetEstado(){
    
    boolean resultadoEsperado=true;
    this.orden.setEstado(resultadoEsperado);
    boolean obtenido=this.orden.getEstado();
    assertEquals("No fue posible la asignacion",resultadoEsperado,obtenido);
        
    }
    
    //se prueba que se agregue un plato correctamente
    @Test
    public void testAgregarPlato(){
    
    Plato plato=new Plato("Arroz",4);
    int resultadoEsperado=1;
    this.orden.agregarPlato(plato);
    int obtenido=this.orden.getPlatos().size();
    assertEquals("No fue posible agregar el plato",resultadoEsperado,obtenido);
        
    }
    
    //se prueba que se agregue una bebida correctamente
    @Test
    public void testAgregarBebida(){
    
    Bebida bebida=new Bebida("Gaeosa",445);
    int resultadoEsperado=1;
    this.orden.agregarBebida(bebida);
    int obtenido=this.orden.getBebidas().size();
    assertEquals("No fue posible agregar la bebida",resultadoEsperado,obtenido);
        
    }
    
    //se prueba que se asigne correctamente el pago
    @Test
    public void testSetPago(){
    
    Pago pago= new Pago();
    float resultadoEsperado= 100;
    pago.setMontoTotal(resultadoEsperado);
    this.orden.setPago(pago); 
    float obtenido=this.orden.getPago().getMontoTotal();
    assertEquals("Error al asignar el monto total",resultadoEsperado,obtenido,3);//necesita un parametro mas
    
    }
    
    
}
