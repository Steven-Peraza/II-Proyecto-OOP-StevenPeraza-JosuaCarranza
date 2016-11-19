/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

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
    private ArrayList<Orden> ordenes;
    public  ArrayList<String> listaClientes = new ArrayList<String>();
    private Menu menu; //el menu del restaurante
    

    private ArrayList<Pedido> colaPedidos; //para almacenar temporalmente las ordenes pendientes
    
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
        this.colaPedidos=new ArrayList();
        this.ordenes=new ArrayList();
        
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

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public ArrayList<Pedido> getColaPedidos() {
        return colaPedidos;
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
    
    //se pregunta si existe una mesa con la capacidad requerida por los clientes
    //true si existe , false no 
    public boolean existeMesa(int cantidadClientes){
        
        for (int i=0;i<this.mesas.size();i++){
        
            //si hay mesa y no esta ocupada
            if ((this.mesas.get(i).getCapacidad()>=cantidadClientes)&&(this.mesas.get(i).getEstado()!=true)){
            
                return true; //si hay mesa
            }
        }
   
        return false;
    }
    
    //conocer el estado de una mesa en especifico
    //true si la mesa con el numero especificado esta ocupada, false si no
    public boolean preguntarEstadoMesa(int numeroMesa){
        
         for (int i=0;i<this.mesas.size();i++){
        
            //si es la mesa se devuelve su estado
            if (this.mesas.get(i).getNumero()==numeroMesa){
                 return this.mesas.get(i).getEstado(); //se retorna el estado
                     
                 }
             
                 
                 }          
    
         
         return false;
    }
      
    //colocar el estado de una mesa a ocupado
    public void ocuparMesa(int numeroMesa){
    
        
    for (int i=0;i<this.mesas.size();i++){
        
            //si es la mesa se ocupa
            if (this.mesas.get(i).getNumero()==numeroMesa){
                 
                this.mesas.get(i).setEstado(true); //se ocupa la mesa
                break;
    }
        
    }
    }
    
    //colocar estado de una mesa a desocupado
    public void desocuparMesa(int numeroMesa){
    
      for (int i=0;i<this.mesas.size();i++){
        
            //si es la mesa se ocupa
            if (this.mesas.get(i).getNumero()==numeroMesa){
                 
                this.mesas.get(i).setEstado(false); //desocupar la mesa
                break;
    }
        
    }
    }    
    
     //busca cliente a partir de la cedula
    public Cliente buscarCliente(int cedula){
        
        for (int i=0;i<this.clientes.size();i++){
            
            if (this.clientes.get(i).getCedula().equals(String.valueOf(cedula))){
                return this.clientes.get(i);
            }
        }
  
        return null;
    }
    
    
    //buscar un mesero a partir de la cedula
    public Mesero buscarMesero(int cedula){
        
         for (int i=0;i<this.empleados.size();i++){
            
            if (this.empleados.get(i).getCedula().equals(String.valueOf(cedula))&&(this.empleados.get(i) instanceof Mesero)){
                return (Mesero) this.empleados.get(i);
            }
        }
  
        return null;
    
    }
    
    //buscar un cocinero a partir de la cedula
    public Cocinero buscarCocinero(int cedula){
        
         for (int i=0;i<this.empleados.size();i++){
            
            if (this.empleados.get(i).getCedula().equals(String.valueOf(cedula))&&(this.empleados.get(i) instanceof Cocinero)){
                return  (Cocinero) this.empleados.get(i);
            }
        }
  
        return null;
    
    }
    
    
     //registra cliente, boolean para saber si se inserto con exito
    public boolean registrarCliente(Cliente cliente){
    
        for (int i=0;i<this.clientes.size();i++){
        
            if (this.clientes.get(i).getCedula().equals(cliente.getCedula())){
             return false;
            }
        }
        
    this.clientes.add(cliente); // se agrega
    return true;
    }
    
     //registra empleado, boolean para saber si se inserto con exito
    public boolean registrarEmpleado(Empleado empleado){
        
         for (int i=0;i<this.empleados.size();i++){
        
            if (this.empleados.get(i).getCedula().equals(empleado.getCedula())){
             return false;
            }
        }
        
    this.empleados.add(empleado); // se agrega
    return true;
 
    }
    
    //con el numero de cedula se busca y se elimina el empleado
    public boolean despedirEmpleado(int cedula){
         for (int i=0;i<this.empleados.size();i++){
            
            if (this.empleados.get(i).getCedula().equals(String.valueOf(cedula))){
                this.empleados.remove(i);
                return true;
            }
        }
         
        return false;
    }
    
    // se busca con el numero de cedula el cliente y se elimina
    public boolean eliminarCliente(int cedula){
        
          for (int i=0;i<this.empleados.size();i++){
            
            if (this.empleados.get(i).getCedula().equals(String.valueOf(cedula))){
                this.empleados.remove(i);
                return true;
            }
        }
            
    return false;
    }
    
    //buscar mesero del mes reporte devuelve un objeto tipo mesero
    public Mesero buscarMeseroDelMes(int mes,int anio){
        Mesero devolver=null;
        Mesero temp;
        int cuanto=0;
        for (int i = 0; i <this.empleados.size(); i++) {
            int sumador=0;
            if (this.empleados.get(i) instanceof Mesero){
            
                temp=(Mesero) this.empleados.get(i);
                
                 for (int j = 0; j < this.facturas.size(); j++) {
               
                
                if ((this.facturas.get(j).getFechaYHora().getMonth() == mes-1)&&(this.facturas.get(j).getFechaYHora().getYear()+1900 == anio)){
                    if(this.facturas.get(j).getOrden().getMesero().getCedula().equals(temp.getCedula())){
                        sumador++;
                    
                }
            }
            
        }//final for de facturas
           if (sumador>cuanto){  //si este mesero atendio mas mesas
               devolver=temp;
               cuanto=sumador;
           }      
            }   
        } //final for principal
    
    return devolver;
    }
    
    //buscar cocinero del mes, devuelve un objeto tipo cocinero
    public Cocinero buscarCocineroDelMes(){
        Cocinero devolver=null;
        Cocinero temp;
        int cuanto=0;
        for (int i = 0; i <this.empleados.size(); i++) {
            
            if (this.empleados.get(i) instanceof Cocinero){
                temp=(Cocinero) this.empleados.get(i);
                if (temp.getCantidadPedidosAtendidos()>cuanto){
                    cuanto=temp.getCantidadPedidosAtendidos();
                    devolver=temp;
                }
            }
            
        }
    
    return devolver;
   
    }
   
    //se busca los platos mas consumidos, y se devuelven en un string
    public ArrayList<Plato> obtenerPlatosMasConsumidos(){
        Plato uno = null;
        Plato dos = null;
        ArrayList<Plato> plati = new ArrayList();
        ArrayList<Plato> temp=this.menu.getPlatos(); //enlace a platos
        int vecesUno=0;
        int vecesDos=0;
        
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getVecesConsumido()>vecesUno){
                dos = uno;
                vecesDos = vecesUno;
                vecesUno=temp.get(i).getVecesConsumido();
                uno=temp.get(i);
                
            }
            
            else if ((temp.get(i).getVecesConsumido()>vecesDos)&&(temp.get(i).getVecesConsumido()<vecesUno)){
                vecesDos=temp.get(i).getVecesConsumido();
                dos=temp.get(i);
            }
            
        }
        plati.add (uno);
        plati.add (dos);
    return plati;
    }
    
    //se busca el cliente mas frecuente, devuelve un objeto tipo cliente
    public ArrayList obtenerClienteMasFrecuente(){
        ArrayList temp1 = new ArrayList();
        int cont = 1, tempCont = 0;
        String cliente = listaClientes.get(0);
        String temp = "";
        for (int i = 0; i < (listaClientes.size() - 1); i++)
        {
          temp = listaClientes.get(i);
          tempCont = 0;
          for (int j = 1; j < listaClientes.size(); j++)
          {
            if (temp.equals(listaClientes.get(j)))
              tempCont++;
          }
          if (tempCont > cont)
          {
            cliente = temp;
            cont = tempCont;
          }
        }
        temp1.add(cliente);
        temp1.add(cont);
        return temp1;
    }
    
    //buscar a que hora esta mas lleno el restaurante, devuelve un string con la hora
    public int restauranteHoraMasLleno(){
        ArrayList <Factura> fac = this.facturas;
        Date temp = null;
        Date fec = null;
        int hora = 0;
        int contFac = 0,tempCont;
        
        for (int i = 0; i < (fac.size() - 1); i++)
        {
          temp = fac.get(i).getFechaYHora();
          tempCont = 0;
          for (int j = 1; j < fac.size(); j++)
          {
            if (temp.getHours() == fac.get(j).getFechaYHora().getHours())
              tempCont++;
          }
          if (tempCont > contFac)
          {
            fec = temp;
            contFac = tempCont;
          }
        }
    return fec.getHours();
    }
    
    //devuelve cantidad de veces que se sirvieron los platos en un mes
    //devuelve un arreglo 
    public String[] totalPorPlatoServidoEnUnMes(int numeroMes){
        ArrayList<Plato> plat=this.menu.getPlatos(); //acceso a la lista de platos
        int tamano=(plat.size())*2; 
        String total[]=new String[tamano];
        for (int i=0;i<plat.size();i++){
            int num=i+i;
            total[num]=plat.get(i).getNombre(); // nombre del plato; buscar en facturas su consumo
            int consumo=0;
            for (int j = 0; j < this.facturas.size(); j++) {
               
                
                if ((this.facturas.get(j).getFechaYHora().getMonth()+1)==numeroMes){
                ArrayList<Detalle> ord=this.facturas.get(j).getOrden().getDetalles(); //obtener la orden de la factura
               
                for (int x=0;x<ord.size();x++){
                
                    if (ord.get(x).getPlato()!=null){
                        if (ord.get(x).getPlato().getNombre().equals(plat.get(i).getNombre())){ //comparacion de nombres
                            consumo+=ord.get(x).getCantidad(); //suma la cantidad que se sirvió de ese plato
                            
                        }
                    }
                }
                
                }
                
            }
            total[num+1]=String.valueOf(consumo);
        }
        
        return total;
    }
 
     //devuelve cantidad de veces que se sirvieron las bebidas en un dia en un arreglo
    public String[] totalPorTipoBebidasServidasEnUnDia(Date dia){
        
        ArrayList<Bebida> beb=this.menu.getBebidas(); //acceso a la lista de platos
        String tot[]=this.tiposDeBebidasDisponibles.split(",");
        String total[]=new String [(tot.length)*2];
        for (int i=0;i<tot.length;i++){
            int num=i+i;
            total[num]=tot[i]; // nombre del plato; buscar en facturas su consumo
            int consumo=0;
            for (int j = 0; j < this.facturas.size(); j++) {
             
                Date d = this.facturas.get(j).getFechaYHora();
                if ((d.getYear()==dia.getYear())&&(d.getMonth()==dia.getMonth())&&(d.getDay()==dia.getDay())){ //comparacion
                    ArrayList<Detalle> ord=this.facturas.get(j).getOrden().getDetalles(); //obtener la orden de la factura
                for (int x=0;x<ord.size();x++){
                
                    if (ord.get(x).getBebida()!=null){
                        if (ord.get(x).getBebida().getTipo().equals(tot[i])){ //comparacion de nombres
                            consumo+=ord.get(x).getCantidad(); //suma la cantidad que se sirvió de ese plato
                            
                        }
                    }
                }
                
                }
            }
            total[num+1]=String.valueOf(consumo);
        }
        
        return total;
        
      
    }
    
    //devuelve total que se vendio por mes en un arreglo
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
    public void añadirCola(Pedido pedido){
        for (int i = 0; i <this.colaPedidos.size(); i++) {
            
            if ((colaPedidos.get(i).getPlato()!=null)&&(pedido.getPlato()!=null)){ //si se trata de un plato que son los que pueden repetirse
            
                if (colaPedidos.get(i).getPlato().getNombre().equals(pedido.getPlato().getNombre())){
                    int x=i;
                    try{
                    
                        while((x<this.colaPedidos.size())&&(colaPedidos.get(x).getPlato().getNombre().equals(pedido.getPlato().getNombre()))){
                        
                            x++;
                        }
                        if (x<this.colaPedidos.size()){
                            this.colaPedidos.add(x, pedido);//añadir ahi el pedido
                            return;
                        }
                 
                    }
                    catch(NullPointerException e){
                    if (x<this.colaPedidos.size()){
                            this.colaPedidos.add(x, pedido);//añadir ahi el pedido
                            return;
                            }
                        else{
                        
                        }
                   
                    }
                    
                    break;
                }
                
            }
            
        }
        colaPedidos.add(pedido);

    }
    
    //se elimina la primera orden en la cola
    public void sacarDecola(){
    
        //se remueve lo que esta en la posicion 0; que es la primera orden
    colaPedidos.remove(0);
        
    }
    
    //agregar una orden al arreglo temporal
    public void agregarOrden(Orden orden){
        
        this.ordenes.add(orden);
    
    }
    
    //elimina una orden que ha quedado inactiva luego de un pago
    public void eliminarOrden(int num){
        for (int i = 0; i <this.ordenes.size(); i++) {
                            
             if (this.ordenes.get(i).getMesa().getNumero()==num){ //si es la orden de la
              
                    this.ordenes.remove(i); //eliminar la orden
              
                    }
     }
    }    
         
    
    public Orden obtenerOrden(int numRelacion){
    
       
         for (int i = 0; i <this.ordenes.size(); i++) {
                            
             if (this.ordenes.get(i).getMesa().getNumero()==numRelacion){ //si es la orden de la
              
               return this.ordenes.get(i); //retornar la orden
              
                            }
                        }
         
         return null;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "logo=" + logo + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", tiposDeBebidasDisponibles=" + tiposDeBebidasDisponibles + ", clientes=" + clientes.size() + ", empleados=" + empleados.size() + ", mesas=" + mesas.size() + ", facturas=" + facturas.size() + ", menu=" + menu.getCantidadPlatillos() + ", cola=" + colaPedidos.size() + '}';
    }
    
    
    }
    
    

    
 
    