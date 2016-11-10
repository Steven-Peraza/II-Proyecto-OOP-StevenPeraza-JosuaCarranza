package Pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Bebida;
import Clases.Mesa;
import Clases.Mesero;
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
    
    //se prueba que se obtenga el estado correctamente
    @Test
    public void testGetEstado(){
    
    boolean resultadoEsperado=true;
    this.orden.setEstado(resultadoEsperado);
    boolean obtenido=this.orden.getEstado();
    assertEquals("No fue posible la asignacion",resultadoEsperado,obtenido);
        
    }
    
    @Test
    //probando asignacion de mesero
    public void testSetMesero()
    {
    
        Mesero nuevo=new Mesero("Jorge","3233");
        this.orden.setMesero(nuevo);
        Mesero obtenido= this.orden.getMesero();
        assertSame("Asingnacion del mesero incorrecta",nuevo,obtenido);
       
    }  
    
    //probando el get mesero
    @Test
    public void TestGetMesero(){
        Mesero nuevo=new Mesero("Jorge","3233");
        this.orden.setMesero(nuevo);
        Mesero obtenido= this.orden.getMesero();
        assertSame("Asingnacion del mesero incorrecta",nuevo,obtenido);
    }
    
    //prueba de asignar mesa
    @Test
    public void testSetMesa(){
    
        Mesa mesa=new Mesa(3,4);
        this.orden.setMesa(mesa);
        Mesa obtenida=this.orden.getMesa();
        assertSame("Error en la asignacion de mesa",mesa,obtenida);
    
    }
    
    //prueba del getmesa
    @Test 
    public void testGetMesa(){
    
        Mesa mesa=new Mesa(3,4);
        this.orden.setMesa(mesa);
        Mesa obtenida=this.orden.getMesa();
        assertSame("Error en la asignacion de mesa",mesa,obtenida);
    
    }
    
    //prueba agregar plato nuevo
    @Test
    public void testAgregarPlatoNuevo(){
    
        Plato plato=new Plato("Arroz",3);
        this.orden.agregarPlatoNuevo(plato, 2);
        int esperado=1;
        int obtenido=this.orden.getDetalles().size();
        assertSame("No se agregó el plato",esperado,obtenido);
    }
       
    //se prueba que se agregue un plato correctamente
    @Test
    public void testAgregarPlato(){
        
        Plato plato=new Plato("Arroz",3);
        this.orden.agregarPlatoNuevo(plato, 2);
        int esperado=1;
        int obtenido=this.orden.getDetalles().size();
        assertSame("No se agregó el plato",esperado,obtenido);
    
        
    }
    
    //se prueba que se agregue una bebida correctamente
    @Test
    public void testAgregarBebida(){
    
    Bebida bebida=new Bebida("Gaseosa",445);
    int resultadoEsperado=1;
    this.orden.agregarBebida(bebida,1);
    int obtenido=this.orden.getDetalles().size();
    assertEquals("No fue posible agregar la bebida",resultadoEsperado,obtenido);
        
    }
    
    //prueba del metodo desocupar mesa
    @Test
    
    public void testDesocuparMesa(){
    
        Mesa mesa=new Mesa(3,1);
        this.orden.setMesa(mesa);
        boolean esperado=false;
        this.orden.desocuparMesa();
        boolean obtenido=this.orden.getMesa().getEstado(); //obtener estado de mesa
        assertSame("No pudo desocuparse la mesa",esperado,obtenido);
    
    }
    
    //prueba de verificar detalles, en caso de que ya todos los platos pedidos esten pagados
    @Test
    public void testRevisarDetallesTrue(){
    
        Plato plato=new Plato("Arroz",3);
        this.orden.agregarPlato(plato, 0); //para que lo reconozca como listo
        boolean esperado=true;
        boolean obtenido=this.orden.revisarDetalles();
        assertSame("Verificacion no exitosa",esperado,obtenido);
    }
    
     //prueba de verificar detalles, en caso de que algun plato pedido no este pagado
    @Test
    public void testRevisarDetallesFalse(){
    
        Plato plato=new Plato("Arroz",3);
        this.orden.agregarPlato(plato, 2); //para que lo reconozca como que falta por pagar
        boolean esperado=false;
        boolean obtenido=this.orden.revisarDetalles();
        assertSame("Verificacion no exitosa",esperado,obtenido);
    }
    
}
