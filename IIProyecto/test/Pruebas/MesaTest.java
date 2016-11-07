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
        
        this.mesa=new Mesa(3,4); //mesa 3, capacidad 4
    }
        
    @After
    public void tearDown() {
        this.mesa=null;
    }
    
    //se prueba funcionamiento del set numero mesa por medio del get
    @Test
    public void testSetNumeroMesa(){
        int numeroMesa=7;
        this.mesa.setNumero(numeroMesa);
        int resultadoObtenido=this.mesa.getNumero();
        //si exite error muestra el siguiente mensaje
        assertEquals("Error en la asignacion",numeroMesa,resultadoObtenido);
        
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
     
    @Test
    public void testAgregarCliente(){
    
        String name="Carla";
        String cedula="1234";
        Cliente client;
        int resultadoEsperado=1; //tiene que haber un cliente en la lista luego de la insercion
        //se fabrica un objeto tipo cliente
        client= Factoria.fabricarCliente(name, cedula);
        this.mesa.agregarCliente(client);
        //se compara con el tamaño del arreglo
        assertEquals("Error no pudo agregarse el cliente",resultadoEsperado,this.mesa.getLista().size());
        
    
    }
    
    //probando metodo de buscar cliente
     @Test
    public void testBuscarCliente(){
    
        String name="Carla";
        String cedula="1234";
        Cliente client;
        Cliente client2;
        //se fabrica un objeto tipo cliente
        client= Factoria.fabricarCliente(name, cedula);
        //se agrega a la lista
        this.mesa.agregarCliente(client);
        client2=this.mesa.buscarCliente(1234); //se busca el cliente
        //se compara si las dos cedulas coinciden para validar una busqueda exitosa
        assertEquals("Error no se encontro el cliente",client.getCedula(),client2.getCedula());
        
    
    }
     
      //probando que el arreglo se limpie correctamente, quede en cero
     @Test
    public void testLimpiarMesa(){
    
        String name="Carla";
        String cedula="1234";
        Cliente client;
        int resultadoEsperado=0; //se espera que el arreglo quede en cero, sin clientes
        //se fabrica un objeto tipo cliente
        client= Factoria.fabricarCliente(name, cedula);
        //se agrega a la lista
        this.mesa.agregarCliente(client);
        this.mesa.limpiarMesa(); //se limpia la mesa
       
        //se compara que el tamaño de la lista sea igual a cero
        assertEquals("Error no se pudo limpiar el arreglo",resultadoEsperado,this.mesa.getLista().size());
        
    
    }
    
}
