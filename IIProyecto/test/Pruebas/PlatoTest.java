/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Clases.Plato;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Clases.*;
import org.junit.Ignore;

/**
 *
 * @author Josua
 */
public class PlatoTest {
    
    Plato plato;
    
    public PlatoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        plato =new Plato("arroz",3);
    }
    
    @After
    public void tearDown() {
    
    plato=null;
        
    }

    /**
     * Test of getNombre method, of class Plato.
     */
    @Test
    public void testGetNombre() {
        String esperado="Frijoles";
        this.plato.setNombre(esperado);
        String obtenido=this.plato.getNombre();
        assertEquals("Asignacion del nombre fallida",esperado,obtenido);
    }

    /**
     * Test of setNombre method, of class Plato.
     */
    @Test
    public void testSetNombre() {
        
        String esperado="Frijoles";
        this.plato.setNombre(esperado);
        String obtenido=this.plato.getNombre();
        assertEquals("Asignacion del nombre fallida",esperado,obtenido);
    }

    /**
     * Test of getNumero method, of class Plato.
     */
    @Test
    public void testGetNumero() {
        int esperado=2;
        this.plato.setNumero(esperado);
        int obtenido=this.plato.getNumero();
        assertEquals("Fallo en la obtencion del numero",esperado,obtenido);
    }

    /**
     * Test of setNumero method, of class Plato.
     */
    @Test
    public void testSetNumero() {
        
        int esperado=2;
        this.plato.setNumero(esperado);
        int obtenido=this.plato.getNumero();
        assertEquals("Fallo en la asignacion del numero",esperado,obtenido);
    }

    /**
     * Test of getPrecio method, of class Plato.
     */
    @Test
    public void testGetPrecio() {
        
        int esperado =1000;
        this.plato.setPrecio(esperado);
        int obtenido=this.plato.getPrecio();
        assertEquals("Fallo en la obtencion del precio",esperado,obtenido);
        
    }

    /**
     * Test of setPrecio method, of class Plato.
     */
    @Test
    public void testSetPrecio() {
       
         
        int esperado =1000;
        this.plato.setPrecio(esperado);
        int obtenido=this.plato.getPrecio();
        assertEquals("Fallo en la asignacion del precio",esperado,obtenido);
        
    }

    /**
     * Test of getCalorias method, of class Plato.
     */
    @Test
    public void testGetCalorias() {
        
        int esperado=20;
        this.plato.setCalorias(esperado);
        int obtenido= this.plato.getCalorias();
        assertEquals("Fallo al obtener las calorias",esperado,obtenido);
        
    }

    /**
     * Test of setCalorias method, of class Plato.
     */
    @Test
    public void testSetCalorias() {
       
        int esperado=20;
        this.plato.setCalorias(esperado);
        int obtenido= this.plato.getCalorias();
        assertEquals("Fallo al asinar las calorias",esperado,obtenido);
    }

    /**
     * Test of getVecesConsumido method, of class Plato.
     */
    @Test
    public void testGetVecesConsumido() {
        
        int esperado=4;
        this.plato.setVecesConsumido(esperado);
        int obtenido=this.plato.getVecesConsumido();
        assertEquals("Fallo en la obtencion de vecesConsumido",esperado,obtenido);
       
    }

    /**
     * Test of setVecesConsumido method, of class Plato.
     */
    @Test
    public void testSetVecesConsumido() {
        int esperado=4;
        this.plato.setVecesConsumido(esperado);
        int obtenido=this.plato.getVecesConsumido();
        assertEquals("Fallo en la asignacion de vecesConsumido",esperado,obtenido);
        
    }

    /**
     * Test of getIngredientes method, of class Plato.
     */
    @Test
    public void testGetIngredientes() {
        String [] esperado={"Arroz","Platano","Frijoles","Natilla"};
        this.plato.setIngredientes(esperado);
        String [] obtenido=this.plato.getIngredientes();
        String esp=esperado.toString();
        String obt=obtenido.toString();
        assertEquals("Fallo al obtener ingredientes",esp,obt);
    }

    /**
     * Test of setIngredientes method, of class Plato.
     */
    @Test
    public void testSetIngredientes() {
        String [] esperado={"Arroz","Platano","Frijoles","Natilla"};
        this.plato.setIngredientes(esperado);
        String [] obtenido=this.plato.getIngredientes();
        String esp=esperado.toString();
        String obt=obtenido.toString();
        assertEquals("Fallo al asignar ingredientes",esp,obt);
    }

    /**
     * Test of getEstado method, of class Plato.
     */
    @Test
    public void testGetEstado() {
        
        String esperado="listo";
        this.plato.setEstado(esperado);
        String obtenido=this.plato.getEstado();
        assertEquals("Error al obtener el estado",esperado,obtenido);
    }

    /**
     * Test of setEstado method, of class Plato.
     */
    @Test
    public void testSetEstadoListo() {
      
        String esperado="listo";
        this.plato.setEstado(esperado);
        String obtenido=this.plato.getEstado();
        assertEquals("Error al asignar el estado",esperado,obtenido);
    }

    //probando plato en espera
    @Test
    public void testSetEstadoEspera() {
      
        String esperado="espera";
        this.plato.setEstado(esperado);
        String obtenido=this.plato.getEstado();
        assertEquals("Error al asignar el estado",esperado,obtenido);
    }
    
    //probando palto en preparacion
    @Test
    public void testSetEstadoPreparacion() {
      
        String esperado="preparacion";
        this.plato.setEstado(esperado);
        String obtenido=this.plato.getEstado();
        assertEquals("Error al obtener el estado",esperado,obtenido);
    }
    
}
