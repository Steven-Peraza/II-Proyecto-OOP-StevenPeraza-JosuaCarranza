package Pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Bebida;
import Clases.Menu;
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
public class MenuTest {
    
    private  Menu menu;
    
    public MenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.menu=new Menu();
        
    }
    
    @After
    public void tearDown() {
        
        this.menu=null;
    }
    
    @Test
    //prueba del metodo setCantidadDaPlatillos, por medio del get
    public void testSetCantidadPlatillos(){
    
    int resultadoEsperado=8;
    this.menu.setCantidadPlatillos(8);
    int obtenido= this.menu.getCantidadPlatillos();
    assertEquals("Asignacion no exitosa",resultadoEsperado,obtenido);
        
    }
    
     @Test
     //prueba del metodo setCantidadDeBebidas, por medio dl get
    public void testSetCantidadBebidas(){
    
    int resultadoEsperado=10;
    this.menu.setCantidadBebidas(10);
    int obtenido= this.menu.getCantidadBebidas();
    assertEquals("Asignacion no exitosa",resultadoEsperado,obtenido);
        
    }
    
     @Test
    //probar metodo de insercion de un plato que debe ser exitoso
    public void testAgregarPlatilloCorrectamente(){
    
        Plato nuevo =new Plato("Arroz",2); //nombre, numero de plato
        boolean exito =this.menu.agregarPlatillo(nuevo); //agregar
        boolean esperado=true; //  si se inserto
        assertEquals("El menu ya contiene este platillo",esperado,exito);
    
    }
    
     @Test
     //probar metodo de insercion de un plato que no debe realizarse
    //pporque ya existe el plato en el menu
    public void testAgregarPlatilloIncorrectamente(){
        
        Plato nuevo =new Plato("Arroz",2); //nombre, numero de plato
        this.menu.agregarPlatillo(nuevo); //agrega sin problemas
        nuevo=new Plato("Arroz",4);  //no debe agregarlo
        boolean exito =this.menu.agregarPlatillo(nuevo); //debe retornar false el plato ya existe
        boolean esperado=false; //  no se inserto
        assertEquals("El menu ya contiene este platillo",esperado,exito);
    
    }
    
    @Test
     //probar metodo de insercion de una bebida que debe ser exitosa
     public void testAgregarBebidaCorrectamente(){
    
        Bebida nuevo =new Bebida("Gaseosa",23); //nombre, numero de plato
        boolean exito =this.menu.agregarBebida(nuevo); //agregar
        boolean esperado=true; //  si se inserto
        assertEquals("El menu ya contiene esta bebida",esperado,exito);
    
    }
    
     @Test
     //probar metodo de insercion de bebidas que no debe realizarse
    //porque ya existe el tipo de bebida en el menu
    public void testAgregarBebidaIncorrectamente(){
        
        Bebida nuevo =new Bebida("Gaseosa",23); //nombre, precio de bebida
        this.menu.agregarBebida(nuevo); //agrega sin problemas
        nuevo=new Bebida("Gaseosa",23);  //no debe agregarlo
        boolean exito =this.menu.agregarBebida(nuevo); //debe retornar false la bebida ya existe
        boolean esperado=false; //  no se inserto
        assertEquals("El menu ya contiene esta bebida",esperado,exito);
    
    }
    
    @Test
    //se va a eliminar unn plato que existe
    public void testEliminarPlatilloCorrectamente(){
     Plato nuevo =new Plato("Arroz",2); //nombre, numero de plato
     this.menu.agregarPlatillo(nuevo); //agregar
     boolean esperado= true;
     boolean obtenido=this.menu.eliminarPlatillo(nuevo);
     assertEquals("No se encontró el plato",esperado,obtenido);
     
    }
    
    @Test
     //se va a eliminar un plato que no existe
    public void testEliminarPlatilloIncorrectamente(){
     Plato nuevo =new Plato("Arroz",2); //nombre, numero de plato
     boolean esperado= false; //se espera que no lo encuentre, no lo elimine
     boolean obtenido=this.menu.eliminarPlatillo(nuevo);
     assertEquals("No se encontró el plato",esperado,obtenido);
     
    }
    
     @Test
    //se va a eliminar una bebida que existe
    public void testEliminarBebidaCorrectamente(){
     Bebida nuevo =new Bebida("Gaseosa",200); //tipo, precio
     this.menu.agregarBebida(nuevo); //agregar
     boolean esperado= true;
     boolean obtenido=this.menu.eliminarBebida(nuevo);
     assertEquals("No se encontró la bebida",esperado,obtenido);
     
    }
    
    @Test
     //se va a eliminar una bebida que no existe
    public void testEliminarBebidaIncorrectamente(){
     Bebida nuevo =new Bebida("Arroz",2); //tipo precio
     boolean esperado= false; //se espera que no la encuentre, no la elimine
     boolean obtenido=this.menu.eliminarBebida(nuevo);
     assertEquals("No se encontró la bebida",esperado,obtenido);
     
    }
    
    @Test
    //probando que se encuentre el plato
    public void testBuscarPlatilloExistente(){
     Plato nuevo =new Plato("Arroz",2); //nombre, numero de plato
     this.menu.agregarPlatillo(nuevo); //agregar
     Plato platoEncontrado=this.menu.buscarPlatillo(nuevo.getNombre());
     //si los nombres coinciden lo encontró
     assertEquals("No fue posible encontrar el plato",nuevo.getNombre(),platoEncontrado.getNombre());
     
     
    }
    
    @Test
    //probando que no se encuentre el plato
    public void testBuscarPlatilloNoExistente(){
     Plato nuevo =new Plato("Arroz",2); //nombre, numero de plato
     Plato platoEncontrado=this.menu.buscarPlatillo(nuevo.getNombre());
     Plato esperado=null;
     //es nulo si el plato no se encontró
     assertEquals("El plato si existe",esperado,platoEncontrado);
     
     
    }
    
     @Test
    //probando que se encuentre la bebida
    public void testBuscarBebidaExistente(){
     Bebida nuevo =new Bebida("Gaseosa",200); //tipo, precio
     this.menu.agregarBebida(nuevo); //agregar
     Bebida bebidaEncontrado=this.menu.buscarBebida(nuevo.getTipo(),nuevo.getPrecio());
     //si el tipo coincide, entonces ese tipo de bebida si existe en el menu
     assertEquals("La bebida no se encuentra en el menu",nuevo.getTipo(),bebidaEncontrado.getTipo());
    }
    
    @Test
    //probando que una bebida inexistente no se encuentre
    public void testBuscarBebidaNoExistente(){
     Bebida nuevo =new Bebida("Gaseosa",200); //tipo, precio
     Bebida bebidaEncontrado=this.menu.buscarBebida(nuevo.getTipo(),nuevo.getPrecio());
     Bebida esperado=null;
     //si es null bebidaEncontrado, entonces ese tipo de bebida no existe en el menu
     assertEquals("La bebida si existe ",esperado,bebidaEncontrado);
    
    }
    
    
    
    
}
