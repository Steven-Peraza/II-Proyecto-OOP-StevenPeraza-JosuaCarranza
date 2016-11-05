/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Josua
 */
public class Restaurante {
    
    //atributos
    private String logo;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;
    private String tiposDeBebidasDisponibles; //para conocer los tipos de bebidas disponibles en el restaurante
    
    private ArrayList <Cliente> clientes; //listas de personas que existen en
    private ArrayList <Empleado> empleados; //el restaurante
    private ArrayList <Mesa> mesas; //mesas que contiene el restaurante
    private ArrayList <Factura> facturas; //se almacena copias de las facturas
    private Menu menu; //el menu del restaurante
    
    private ArrayList cola; //para almacenar temporalmente las ordenes pendientes
    //constructor

    public Restaurante(String logo, String nombre, String telefono, String direccion, String correo) {
        this.logo = logo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        //incializacion de las listas
        this.clientes=new ArrayList();
        this.facturas=new ArrayList();
        this.mesas=new ArrayList();
        this.empleados=new ArrayList();
    }
    
    //metodos get y set

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTiposDeBebidasDisponibles() {
        return tiposDeBebidasDisponibles;
    }

    public void setTiposDeBebidasDisponibles(String tiposDeBebidasDisponibles) {
        this.tiposDeBebidasDisponibles = tiposDeBebidasDisponibles;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
        //agregando clientes al arreglo
    public void setClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
        //agregando empleados al arreglo
    public void setEmpleados(Empleado empleados) {
        this.empleados.add(empleados);
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    //agregando mesas al arreglo
    public void setMesas(Mesa mesas) {
        this.mesas.add(mesas);
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

        //agregando facturas al arreglo
    public void setFacturas(Factura facturas) {
        this.facturas.add(facturas);
    }
    
    //obtener el menu del restaurante
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    //otras funciones adicionales a los metodos get y set
    
    //se pregunta si existe una mesa con la capacidad requerida
    public boolean existeMesa(int cantidadClientes){
   
        return false;
    }
    
    //conocer el estado de una mesa en especifico
    public boolean preguntarEstadoMesa(int numeroMesa){
    
    return false;
    }
    
    //colocar el estado de una mesa a ocupado
    public void ocuparMesa(int numeroMesa){
    
        
    }
    
    //colocar estado de una mesa a desocupado
    public void desocuparMesa(int numeroMesa){
    
        
    }
    
    //registra cliente, boolean para saber si se inserto con exito
    public boolean registrarCliente(Cliente cliente){
    
    return false;
    }
    
     //registra empleado, boolean para saber si se inserto con exito
    public boolean registrarEmpleado(Empleado empleado){
    
    return false;
    }
    
    //con el numero de cedula se busca y se elimina el empleado
    public boolean despedirEmpleado(int cedula){
    
        return false;
    }
    
    // se busca con el numero de cedula el cliente y se elimina
    public boolean eliminarCliente(int cedula){
    
    return false;
    }
    
    //buscar mesero del mes
    public Mesero buscarMeseroDelMes(){
    
    return null;
    }
    
    //buscar cocinero del mes
    public Cocinero buscarCocineroDelMes(){
    
    return null;
    }
   
    //se busca los platos mas consumidos
    public String obtenerPlatosMasConsumidos(){
    
    return null;
    }
    
    //se busca el cliente mas frecuente
    public Cliente obtenerClienteMasFrecuente(){
    
    
    return null;
    }
    
    //buscar a que hora esta mas lleno el restaurante
    public String restauranteHoraMasLleno(){
    
    return null;
    }
    
    //devuelve cantidad de veces que se sirvieron los platos en un mes
    public String[] totalPorPlatoServidoEnUnMes(int numeroMes){
        
        return null;
    }
 
     //devuelve cantidad de veces que se sirvieron las bebidas en un dia
    public String[] totalPorTipoBebidasServidasEnUnDia(){
        
        return null;
    }
    
    //devuelve total que se vendio por mes
    public float[] totalVendidoPorMes(){
    
    return null;
    }
    
    //devuelve la cantidad que se vendio en todo el año
    public float totalVendidoPorAño(){
    
    return 0;
    }
    
    //devuelve cantidad de clientes atendidos por mes
    public int[] totalClientesAtendidosPorMes(){
    
    return null;
    }
    
    //cantidad total de clientes atendidos por mes
    public int totalClientesAtendidosPorAño(){
    
    return 0;
    }
    
    //se alade una factura a la lista
    public void añadirFactura(Factura factura){
    
        this.facturas.add(factura);
    }
    
    //existe una cola de ordenes que controla el acceso a ellas
    public void añadirCola(Orden orden){
    
        cola.add(orden);
    }
    
    //se elimina la primera orden en la cola
    public void sacarDecola(){
    
        //se remueve lo que esta en la posicion 0; que es la primera orden
    cola.remove(0);
        
    }
    
    }
    
    

    
 
    