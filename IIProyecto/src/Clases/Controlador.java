/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Ventanas.VistaFactura;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Josua
 */
//implementa observer
public class Controlador implements ActionListener,Observer{

    Factura instanciaFactura; //instancia que hace de modelo en el mvc;
    VistaFactura vista; // debe asociarse a una ventana 
    double total=0;

    
    //debe tambien recibir la ventana a controlar,
    public Controlador(VistaFactura vista) {
        this.instanciaFactura=new Factura(VistaFactura.fecha," ");
        this.vista=vista;
        this.total=0;
        this.instanciaFactura.setOrden(VistaFactura.temp); //se agrega una orden
        setearTipoPago();
        colocarDatos();
        colocarComoObservador();
        inicio();
    }
    
    //colocar como observador de todos los detalles
    public void colocarComoObservador(){
    
        ArrayList <Detalle> tempo=VistaFactura.orden.getDetalles();
        for (int i = 0; i <tempo.size() ; i++) {
            tempo.get(i).setObservador(this);
        }
    
    }
    
    //ver si se muestra la ventana de orden o no
    public void inicio(){
    
        if (VistaFactura.tipoPa==2){ //paga todo junto uno
             VistaFactura.cantidad.setEditable(false);
             VistaFactura.agregar.setEnabled(false);
            for (int i = 0; i <VistaFactura.detalles.size(); i++) {
                Detalle temporal=VistaFactura.detalles.get(i);
                
                try{
                Object datos[]={temporal.getBebida().getNombre(),temporal.getCantidad(),temporal.getBebida().getPrecio(),(temporal.getBebida().getPrecio())*(temporal.getCantidad())+" Colones"};
                //agregando el detale a la orden de la factura
                this.instanciaFactura.getOrden().agregarBebida(temporal.getBebida(),temporal.getCantidad() );
    //     VistaFactura.total+=((temporal.getBebida().getPrecio())*temporal.getCantidad());
            
           this.total+=((temporal.getBebida().getPrecio())*temporal.getCantidad());
                VistaFactura.tabla.addRow(datos);
                temporal.setCantidad(0);
            }
                
                catch(NullPointerException e){
                Object datos[]={temporal.getPlato().getNombre(),temporal.getCantidad(),temporal.getPlato().getPrecio(),(temporal.getPlato().getPrecio())*(temporal.getCantidad())+" Colones"};
               // VistaFactura.total+=((temporal.getPlato().getPrecio())*temporal.getCantidad());
               this.total+=((temporal.getPlato().getPrecio())*temporal.getCantidad());
                VistaFactura.tabla.addRow(datos);
                //agregando el detalle a la orden de la factura
                this.instanciaFactura.getOrden().agregarPlato(temporal.getPlato(),temporal.getCantidad() );
                temporal.setCantidad(0);
                }
                        
                        }
            
        }
        else{
            VistaFactura.producto.setEditable(false);
            new Ventanas.VistaOrden(VistaFactura.orden).setVisible(true);
            
        }
        
    
    }
    
    public void setearTipoPago(){
    
        if(VistaFactura.tipoPa==1){
            this.instanciaFactura.setFormaPago("Individual");
            VistaFactura.tipo.setText("Individual");
            
        }
        
        else{
        this.instanciaFactura.setFormaPago("Grupal");
         VistaFactura.tipo.setText("Grupal");
        }
    
    }
    
    public void colocarDatos(){
    VistaFactura.vuelto.setEditable(false);
    Date d=this.instanciaFactura.getFechaYHora();
    String dia=String.valueOf(d.getDay());
    
    VistaFactura.nombre.setText(VistaFactura.restaurant.getNombre());
    VistaFactura.direccion.setText(VistaFactura.restaurant.getDireccion());
    VistaFactura.fec.setText(String.valueOf(d.getDay())+" / "+String.valueOf(d.getMonth())+" / "+String.valueOf(d.getYear()));
    VistaFactura.hora.setText(String.valueOf(d.getHours())+":"+String.valueOf(d.getMinutes())+":"+String.valueOf(d.getSeconds()));
    VistaFactura.tel.setText(VistaFactura.restaurant.getTelefono());
   
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
            if (evento.getActionCommand().equals(VistaFactura.asignar.getActionCommand())){
                if (!VistaFactura.nomCliente.getText().equals("")){
                
                    VistaFactura.client.setText(VistaFactura.nomCliente.getText());
                    VistaFactura.nomCliente.setText("");
                }
                else{
                JOptionPane.showMessageDialog(vista," No se ingresó ningún numero"," Alerta de Sistema", 0);

                }
                
                }
            
            else if (evento.getActionCommand().equals(VistaFactura.pagar.getActionCommand())){
            
                if ((!VistaFactura.monCliente.getText().equals(""))&&(!VistaFactura.client.getText().equals(""))){
                
                    try{
                        double paga=Integer.parseInt(VistaFactura.monCliente.getText());
                        
                        if (paga>=this.total){
                            double vueltos=paga-this.total;
                            VistaFactura.vuelto.setText(String.valueOf(vueltos));
                            iiproyecto.main.restaurante.añadirFactura(this.instanciaFactura); //agregando la factura
                            if (VistaFactura.orden.revisarDetalles()==true){ //si todo lo de la orden se cancelo se libera mesa
                                iiproyecto.main.restaurante.desocuparMesa(VistaFactura.orden.getMesa().getNumero()); //desocupando mesa
                                iiproyecto.main.ventana.cambiarImagenDesocupada(VistaFactura.orden.getMesa().getNumero()-1);
                                iiproyecto.main.restaurante.eliminarOrden(VistaFactura.orden.getMesa().getNumero()); //eliminar esa orden
                            }
                            JOptionPane.showMessageDialog(vista," Se ha cancelado la factura, el vuelto del cliente es de "+(String.valueOf(vueltos))," Notificación de Sistema", 1);
 
                        }
                        
                        else{
                     JOptionPane.showMessageDialog(vista," El monto ingresado no es el requerido para cancelar la cuenta"," Alerta de Sistema", 0);
                            
                        }
                        
                    
                    }
                    catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(vista," Alguno de los datos no es númerico"," Alerta de Sistema", 0);
                    VistaFactura.monCliente.setText("");
                    VistaFactura.vuelto.setText("");
                    }
                    
                    finally{
                    
                    VistaFactura.monCliente.setText("");
                    }
                    
                  
                }
                
                else{
                
                    JOptionPane.showMessageDialog(vista," Revise los datos, existen datos faltantes"," Alerta de Sistema", 0);
                }
            }
            
            else if (evento.getActionCommand().equals(VistaFactura.exit.getActionCommand())){
            vista.dispose();
            iiproyecto.main.ventana.setVisible(true);
           
            }
            
            else  if (evento.getActionCommand().equals(VistaFactura.agregar.getActionCommand())){
            
                if (!VistaFactura.cantidad.getText().equals("")){ //que no este vacio el campo de cantidad
                   
                    try{
                    
                    int num=Integer.parseInt(VistaFactura.cantidad.getText());
                    int sum=((VistaFactura.dish.getPrecio())*num);
                    this.total+=sum;
                    VistaFactura.det.setCantidad(VistaFactura.det.getCantidad()-num); //modificando la orden
                    // VistaFactura.total+=sum;
                    Object datos[]={VistaFactura.dish.getNombre(),num,VistaFactura.dish.getPrecio(),((VistaFactura.dish.getPrecio())*num)+" Colones"};
                  //  VistaFactura.total+=((VistaFactura.dish.getPrecio())*num);
                        System.out.println(VistaFactura.total);
                    VistaFactura.tabla.addRow(datos);
                    this.instanciaFactura.getOrden().agregarPlato(VistaFactura.dish, num);
                    
                    }catch(NullPointerException e){
                    int num=Integer.parseInt(VistaFactura.cantidad.getText());
                    int sum=((VistaFactura.beverage.getPrecio())*num);
                    this.total+=sum;
                    // VistaFactura.total+=sum;
                    Object datos[]={VistaFactura.beverage.getNombre(),num,VistaFactura.beverage.getPrecio(),((VistaFactura.beverage.getPrecio())*num)+" Colones"};
                    VistaFactura.tabla.addRow(datos);  
                    //VistaFactura.total+=((VistaFactura.beverage.getPrecio())*num);
                     System.out.println(VistaFactura.total);
                    this.instanciaFactura.getOrden().agregarBebida(VistaFactura.beverage, num);
                    VistaFactura.det.setCantidad(VistaFactura.det.getCantidad()-num); //modificando la orden
                    }                           
                    catch(NumberFormatException es){
                    JOptionPane.showMessageDialog(vista," La cantidad debe ser un dato númerico"," Alerta de Sistema", 0);
               
                    }
                    finally{
                    VistaFactura.dish=null;
                    VistaFactura.beverage=null;
                    }
                    
                    VistaFactura.cantidad.setText("");
                    VistaFactura.producto.setText("");
                }
                
                
                
                else{
                JOptionPane.showMessageDialog(vista," No digitó una cantidad para el producto"," Alerta de Sistema ", 0);
                }
                 }
                
            else{
               VistaFactura.total=this.total;
               double impuesto=((VistaFactura.total/100)*6); //un impuesto del 6 por ciento
                System.out.println(impuesto);
                this.total+=impuesto;
            //  VistaFactura.total+=impuesto;
                System.out.println(VistaFactura.total);
                  Object datos[]={"Impuesto","6%","Monto Total",this.total+" Colones"};
            //   Object datos[]={"Impuesto","6%","Monto Total",VistaFactura.total+" Colones"};
            //this.total=0;
               VistaFactura.tabla.addRow(datos);
            }
    }
    
    
    @Override
    public String toString() {
        
        return "Controlador{" + "nombreRestaurante=" + instanciaFactura.getFormaPago() + '}';
    
    }

   public void exponer(String nombre){
       VistaFactura.producto.setText(nombre);
   
   }

    @Override
    public void update(Observable var, Object o1) {
            VistaFactura.det=(Detalle) var;  //convirtiendo a detalle
            System.out.println("Notificacion");
            try{
             VistaFactura.beverage=VistaFactura.det.getBebida();
             exponer(VistaFactura.beverage.getNombre());
            }
            
            catch(NullPointerException e){
            VistaFactura.dish=VistaFactura.det.getPlato();
            exponer(VistaFactura.dish.getNombre());
            VistaFactura.total=0;
            
            }
    
    }
    
    
    
}
