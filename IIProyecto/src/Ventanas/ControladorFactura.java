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
    VentanaPrin factura;
    
    double montoTotal;
    double impuesto=3; //impuesto de venta y servicio
    double  vuelto;  //variables para gestionar el pago del usuario
    double pagoUsuario; 

    public ControladorFactura(Restaurante instanciaRestaurante, VentanaPrin factura) {
        this.instanciaRestaurante = instanciaRestaurante;
        this.factura = factura;
        agregarTextos();
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        //si se ingreso una cedula
        if (evento.getActionCommand().equals(VentanaPrin.botonCedula.getActionCommand())){
            
            if (!VentanaPrin.cedula.getText().equals("")){
                
                try{ //intertar conversion a entero
                    int cedula=Integer.parseInt(VentanaPrin.cedula.getText());
                    VentanaPrin.cliente.setText(instanciaRestaurante.buscarCliente(cedula).getNombre());
                }
                
                catch(NumberFormatException e){
                    
                    JOptionPane.showMessageDialog(factura," Recuerde que la cédula es númerica " ," Alerta de Sistema ", 0);
                }
                
                //limpiar el campo de texto
                finally{
                    VentanaPrin.cedula.setText("");
                }
            }
            
            //si no digito un numero de cedula
            else{
                //mostrar mensaje respectivo
                JOptionPane.showMessageDialog(factura," Olvidó ingresar un número de cedula " ," Alerta de Sistema ", 0);
            }
            
        }
        
        else if (evento.getActionCommand().equals(VentanaPrin.combo.getActionCommand())){ //si se selecciono el pago
            
            if (VentanaPrin.combo.getSelectedIndex()==0){ //se asigna al label segun la seleccion
            
                VentanaPrin.pago.setText(" Pago Individual");
                
            }
            
            else{
                VentanaPrin.pago.setText(" Pago Grupal");
            }
            
        }
        
        //si hay que agregar un articulo
        else if (evento.getActionCommand().equals(VentanaPrin.botonPlato.getActionCommand())){
        
            if ((!VentanaPrin.nombrePlato.getText().equals(""))&&((!VentanaPrin.cantidad.getText().equals("")))){
                
                Object datos[]={"llego","llego","llego","llego","llego"};
                VentanaPrin.tabla.addRow(datos);
                
                //limpiar
                limpiar();
                
            }
            
            else{
                JOptionPane.showMessageDialog(factura," No debe haber apartados en blanco " ," Alerta de Sistema ", 0);
                limpiar();
            }
        }
        
        else if(evento.getActionCommand().equals(VentanaPrin.botonBebida.getActionCommand())){
            
             if ((!VentanaPrin.tipoBebida.getText().equals(""))&&((!VentanaPrin.cantidad2.getText().equals("")))){
                
                Object datos[]={"llego","llego","llego","llego","llego"};
                VentanaPrin.tabla.addRow(datos);
                
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
        VentanaPrin.cantidad.setText("");
        VentanaPrin.cantidad2.setText("");
        VentanaPrin.nombrePlato.setText("");
        VentanaPrin.tipoBebida.setText("");
    
    }
    
    public void agregarTextos(){
    
        VentanaPrin.NombreRestaurante.setText(instanciaRestaurante.getNombre());
        VentanaPrin.direccion.setText(instanciaRestaurante.getDireccion());
        VentanaPrin.telefono.setText(instanciaRestaurante.getTelefono());
    
    }
    
    
}
