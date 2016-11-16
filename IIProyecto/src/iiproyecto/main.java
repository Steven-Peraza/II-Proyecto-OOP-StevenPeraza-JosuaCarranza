/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiproyecto;

import Clases.*;
import Ventanas.*;
import java.util.Date;

/**
 *
 * @author Josua
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static Restaurante restaurante;
     public static VentanaPrin ventana;
     public static Factoria fabrica=new Factoria();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente uno=fabrica.fabricarCliente("Andrey","232");
        
        restaurante =new Restaurante(" "," Mi restaurante","23233434","Cerca del colegio","Mirestaurante@gmail.com");
        restaurante.registrarCliente(uno);
        uno=fabrica.fabricarCliente("Ian Fabricio","123");
        restaurante.registrarCliente(uno);
        Date fec = new Date();
        Factura ff = new Factura(fec,"Fiado");
        Orden or = new Orden();
        Detalle detalles = new Detalle(4);
        Plato plato = new Plato("Pinto",1);
        detalles.setPlato(plato);
        or.setDetalles(detalles);
        ff.setOrden(or);
        restaurante.añadirFactura(ff);
        
        Mesero mesero=fabrica.fabricarMesero("Juan","423");   
        restaurante.registrarEmpleado(mesero);
        mesero=fabrica.fabricarMesero("Carlos","323");
        restaurante.registrarEmpleado(mesero);
        Cocinero cocinero= fabrica.fabricarCocinero("Jorge","233");
        restaurante.registrarEmpleado(cocinero);
        cocinero=fabrica.fabricarCocinero("Isabel","333");
        restaurante.registrarEmpleado(cocinero);
        
        //agregacion de las mesas
        Mesa mesa = new Mesa (1,4);
        restaurante.setMesas(mesa);
        mesa = new Mesa (2,2);
        restaurante.setMesas(mesa);
        mesa = new Mesa (3,4);
        restaurante.setMesas(mesa);
        mesa = new Mesa (4,5);
        restaurante.setMesas(mesa);
        mesa = new Mesa (5,6);
        restaurante.setMesas(mesa);
        mesa = new Mesa (6,4);
        restaurante.setMesas(mesa);
        mesa = new Mesa (7,6);
        restaurante.setMesas(mesa);
        mesa = new Mesa (8,2);
        restaurante.setMesas(mesa);
        mesa = new Mesa (9,3);
        restaurante.setMesas(mesa);
        mesa = new Mesa (10,3);
        restaurante.setMesas(mesa);
        mesa = new Mesa (11,8);
        restaurante.setMesas(mesa);
        
        Clases.Menu menu=new Clases.Menu();
        Plato plato=new Plato("Arroz blanco",1);
        plato.setCalorias(7);
        plato.setPrecio(300);
        menu.agregarPlatillo(plato);
        plato=new Plato("Frijoles",2);
        plato.setPrecio(400);
        plato.setCalorias(4);
        menu.agregarPlatillo(plato);
        plato=new Plato("Porcion de pollo",3);
        plato.setPrecio(1000);
        plato.setCalorias(13);
        menu.agregarPlatillo(plato);
        plato=new Plato("Ensalada Rusa",4);
        plato.setPrecio(700);
        plato.setCalorias(5);
        menu.agregarPlatillo(plato);
        plato=new Plato("Ceviche de Pescado",5);
        plato.setPrecio(2500);
        plato.setCalorias(4);
        menu.agregarPlatillo(plato);
        plato=new Plato("Casado",6);
        plato.setCalorias(8);
        plato.setPrecio(2700);
        String ing[]={"Arroz","Platano","Frijoles","Huevo"};
        plato.setIngredientes(ing);
        menu.agregarPlatillo(plato);
        
        Bebida bebida =new Bebida("Gaseosa",500,"Coca Cola",7);
        bebida.setMiliLitros(300);
        menu.agregarBebida(bebida);
        bebida=new Bebida("Gaseosa",500,"Fanta",8);
        bebida.setMiliLitros(300);
        menu.agregarBebida(bebida);
        bebida=new Bebida("Refresco",1100,"Tropical de Frutas",9);
        bebida.setMiliLitros(800);
        menu.agregarBebida(bebida);
        bebida=new Bebida("Refresco",1200,"Tropical de Cas",10);
        bebida.setMiliLitros(800);
        menu.agregarBebida(bebida);
        bebida=new Bebida("Jugo",300,"Fresco Leche",11);
        bebida.setMiliLitros(150);
        menu.agregarBebida(bebida);
        
        Orden orden= new Orden();
        Plato p=new Plato("Arroz blanco",2);
        orden.agregarPlato(p,2);
        p=new Plato("Frijoles",3);
        orden.agregarPlato(p,3);
        restaurante.setMenu(menu); //se agrega el menu al restaurante
        restaurante.setTiposDeBebidasDisponibles("Gaseosa,Refresco,Jugo,Licor");
        Factura fac=new Factura("16/11/2016/9/26/57","Grupal");
        fac.setOrden(orden);
        restaurante.añadirFactura(fac);
        orden= new Orden();
        p=new Plato("Ceviche de Pescado",2);
        orden.agregarPlato(p,4);
        p=new Plato("Casado",3);
        orden.agregarPlato(p,3);
        fac=new Factura("16/11/2016/9/26/57","Grupal");
        fac.setOrden(orden);
        restaurante.añadirFactura(fac);
        
        String t[]=restaurante.totalPorPlatoServidoEnUnMes(11);
        for (int i = 0; i < t.length; i++) {
           if (t[i]!=null){
            System.out.println(t[i]);
           }
        }
        ventana=new VentanaPrin();
        ventana.setVisible(true);
        
        
        
        
    }
    
}
