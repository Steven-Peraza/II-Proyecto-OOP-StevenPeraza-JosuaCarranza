/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Restaurante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Josua
 */
public class ControladorFactura implements ActionListener{
    
    Restaurante instanciaRestaurante;
    FacturaVista factura;
    
    double montoTotal;
    double impuesto=3; //impuesto de venta y servicio
    double  vuelto;  //variables para gestionar el pago del usuario
    double pagoUsuario; 

    public ControladorFactura(Restaurante instanciaRestaurante, FacturaVista factura) {
        this.instanciaRestaurante = instanciaRestaurante;
        this.factura = factura;
        agregarTextos();
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        //si se ingreso una cedula
        if (evento.getActionCommand().equals(FacturaVista.botonCedula.getActionCommand())){
            
            if (!FacturaVista.cedula.getText().equals("")){
                
                try{ //intertar conversion a entero
                    int cedula=Integer.parseInt(FacturaVista.cedula.getText());
                    FacturaVista.cliente.setText(instanciaRestaurante.buscarCliente(cedula).getNombre());
                }
                
                catch(NumberFormatException e){
                    
                    JOptionPane.showMessageDialog(factura," Recuerde que la cédula es númerica " ," Alerta de Sistema ", 0);
                }
                
                //limpiar el campo de texto
                finally{
                    FacturaVista.cedula.setText("");
                }
            }
            
            //si no digito un numero de cedula
            else{
                //mostrar mensaje respectivo
                JOptionPane.showMessageDialog(factura," Olvidó ingresar un número de cedula " ," Alerta de Sistema ", 0);
            }
            
        }
        
        else if (evento.getActionCommand().equals(FacturaVista.combo.getActionCommand())){ //si se selecciono el pago
            
            if (FacturaVista.combo.getSelectedIndex()==0){ //se asigna al label segun la seleccion
            
                FacturaVista.pago.setText(" Pago Individual");
                
            }
            
            else{
                FacturaVista.pago.setText(" Pago Grupal");
            }
            
        }
        
        //si hay que agregar un articulo
        else if (evento.getActionCommand().equals(FacturaVista.botonPlato.getActionCommand())){
        
            if ((!FacturaVista.nombrePlato.getText().equals(""))&&((!FacturaVista.cantidad.getText().equals("")))){
                
                Object datos[]={"llego","llego","llego","llego","llego"};
                FacturaVista.tabla.addRow(datos);
                
                //limpiar
                limpiar();
                
            }
            
            else{
                JOptionPane.showMessageDialog(factura," No debe haber apartados en blanco " ," Alerta de Sistema ", 0);
                limpiar();
            }
        }
        
        else if(evento.getActionCommand().equals(FacturaVista.botonBebida.getActionCommand())){
            
             if ((!FacturaVista.tipoBebida.getText().equals(""))&&((!FacturaVista.cantidad2.getText().equals("")))){
                
                Object datos[]={"llego","llego","llego","llego","llego"};
                FacturaVista.tabla.addRow(datos);
                
                //limpiar
                limpiar();
            }
             else{
                JOptionPane.showMessageDialog(factura," No debe haber apartados en blanco " ," Alerta de Sistema ", 0);
                limpiar();
             }
            
        }
        
    }
    
    //limpia los textfield de donde se recibe la informacion
    public void limpiar(){
    FacturaVista.cantidad.setText("");
    FacturaVista.cantidad2.setText("");
    FacturaVista.nombrePlato.setText("");
    FacturaVista.tipoBebida.setText("");
    
    }
    
    public void agregarTextos(){
    
        FacturaVista.NombreRestaurante.setText(instanciaRestaurante.getNombre());
        FacturaVista.direccion.setText(instanciaRestaurante.getDireccion());
        FacturaVista.telefono.setText(instanciaRestaurante.getTelefono());
    
    }
    
    
}
