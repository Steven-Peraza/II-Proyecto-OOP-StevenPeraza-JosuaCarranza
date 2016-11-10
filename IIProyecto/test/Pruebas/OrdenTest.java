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
        
        orden=new Orden();
    }
    
    @After
    public void tearDown() {
        
        orden=null;
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
    this.orden.agregarPlato(plato,1);
    int obtenido=this.orden.getDetalles().size();
    assertEquals("No fue posible agregar el plato",resultadoEsperado,obtenido);
        
    }
    
    //se prueba que se agregue una bebida correctamente
    @Test
    public void testAgregarBebida(){
    
    Bebida bebida=new Bebida("Gaeosa",445);
    int resultadoEsperado=1;
    this.orden.agregarBebida(bebida,1);
    int obtenido=this.orden.getDetalles().size();
    assertEquals("No fue posible agregar la bebida",resultadoEsperado,obtenido);
        
    }
    
    
    
}
