/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

<<<<<<< HEAD
import Clases.*;
=======
import Clases.Mesa;
import Clases.Mesero;
import Clases.Orden;
import Clases.Restaurante;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
=======
import java.util.ArrayList;
import iiproyecto.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Steven
 */
public class VentanaPrin extends javax.swing.JFrame {
    
    //static para poder accederla desde el controlador
    public  static DefaultTableModel tabla; //necesario para modificar la tabla
    Restaurante restaurant;
<<<<<<< HEAD
    private int mes;
    private int anio;
    private Date dia;
=======
    JButton []array=new JButton [11]; //arreglo para dominar botones
    int tab=0; //manejar el numero de mesa recien ocupado
    boolean botonOrden=false;
    boolean asignacionMesero; // para controlar si se asigno un mesero  al cliente
    boolean asignacionMesa;  //controlar el acceso a las mesas del restaurante
    boolean botonVerOrdenes=false;
    boolean botonVerPedidos=false;
    boolean botonPagar =false;
    int tipoPago=0;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf

    public VentanaPrin() {
        initComponents();
        this.setResizable(false);
        this.restaurant= iiproyecto.main.restaurante; //asignar la del main
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);    //color a la ventana
        this.setForeground(Color.yellow);
        jTabbedPane1.setBackground(Color.yellow);
        array[0]=ButtonMesa1;
        array[1]=ButtonMesa2;
        array[2]=ButtonMesa3;
        array[3]=ButtonMesa4;
        array[4]=ButtonMesa5;
        array[5]=ButtonMesa6;
        array[6]=ButtonMesa7;
        array[7]=ButtonMesa8;
        array[8]=ButtonMesa9;
        array[9]=ButtonMesa10;
        array[10]=ButtonMesa11;
        
        //colocando texto a las columnas
        String textosCol[]={"Descripción","Cantidad","Precio Unitario","Impuesto","Total" };
        String filas [][]={}; //necesario para un agregado de filas mas ordenado
        tabla= new DefaultTableModel(filas,textosCol);  //inicializacion de la tabla con los arreglos de fila y columna
        table.setModel(tabla); //se manda a la tabla visual el modelo 
        panelRep.setVisible(true);
        panelRep2.setVisible(true);
        panelTotClientes.setVisible(false);
        panelTotVendido.setVisible(false);
        panelBebRep.setVisible(false);
        panelPlatillos.setVisible(false);
        
      //  asignaEventos(new ControladorFactura(this.restaurant,this)); //ceder control al controlador
        
        mesa1.setText("Cap: " + String.valueOf(restaurant.getMesas().get(0).getCapacidad()));                                       
        mesa2.setText("Cap: " + String.valueOf(restaurant.getMesas().get(1).getCapacidad()));                                   
        mesa3.setText("Cap: " + String.valueOf(restaurant.getMesas().get(2).getCapacidad()));                                      
        mesa4.setText("Cap: " + String.valueOf(restaurant.getMesas().get(3).getCapacidad()));                                         
        mesa5.setText("Cap: " + String.valueOf(restaurant.getMesas().get(4).getCapacidad()));                                           
        mesa6.setText("Cap: " + String.valueOf(restaurant.getMesas().get(5).getCapacidad()));                                         
        mesa7.setText("Cap: " + String.valueOf(restaurant.getMesas().get(6).getCapacidad()));                                         
        mesa8.setText("Cap: " + String.valueOf(restaurant.getMesas().get(7).getCapacidad()));                                     
        mesa9.setText("Cap: " + String.valueOf(restaurant.getMesas().get(8).getCapacidad()));                                       
        mesa10.setText("Cap: " + String.valueOf(restaurant.getMesas().get(9).getCapacidad()));                                   
        mesa11.setText("Cap: " + String.valueOf(restaurant.getMesas().get(10).getCapacidad()));
         ImageIcon imag;
        imag = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        Image photo = imag.getImage();
        Image nueva= photo.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
        ImageIcon icono= new ImageIcon(nueva);
        logo.setIcon(icono);
        logo.setSize(155, 200);
        
        nombre.setText(iiproyecto.main.restaurante.getNombre());
        
    }
    
/*    public void asignaEventos(ControladorFactura controlador){
    
            botonPlato.addActionListener((ActionListener) controlador);
            botonCedula.addActionListener((ActionListener) controlador);
            combo.addActionListener((ActionListener)controlador);
            botonBebida.addActionListener((ActionListener) controlador);
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ButtonMesa1 = new javax.swing.JButton();
        ButtonMesa2 = new javax.swing.JButton();
        ButtonMesa3 = new javax.swing.JButton();
        ButtonMesa4 = new javax.swing.JButton();
        ButtonMesa7 = new javax.swing.JButton();
        ButtonMesa6 = new javax.swing.JButton();
        ButtonMesa5 = new javax.swing.JButton();
        ButtonMesa8 = new javax.swing.JButton();
        ButtonMesa9 = new javax.swing.JButton();
        ButtonMesa10 = new javax.swing.JButton();
        ButtonMesa11 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        mesa1 = new javax.swing.JLabel();
        mesa2 = new javax.swing.JLabel();
        mesa3 = new javax.swing.JLabel();
        mesa4 = new javax.swing.JLabel();
        mesa5 = new javax.swing.JLabel();
        mesa6 = new javax.swing.JLabel();
        mesa7 = new javax.swing.JLabel();
        mesa8 = new javax.swing.JLabel();
        mesa9 = new javax.swing.JLabel();
        mesa10 = new javax.swing.JLabel();
        mesa11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ordena = new javax.swing.JButton();
        ordenes = new javax.swing.JButton();
        pedidos = new javax.swing.JButton();
        botonCocineros = new javax.swing.JButton();
        pag = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        clientes = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        asignar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pago = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonPlato = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonBebida = new javax.swing.JButton();
        direccion = new javax.swing.JLabel();
        nombrePlato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tipoBebida = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        cantidad2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        botonCedula = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NombreRestaurante = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        opcionesRep = new javax.swing.JComboBox<>();
        panelRep = new javax.swing.JPanel();
        panelPlatillos = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaTotPlatillos1 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        mesPlatillos = new javax.swing.JComboBox<>();
        BotonTotPlatillos = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        panelBebRep = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        BotonTotBebidas = new javax.swing.JButton();
        fechaBeb = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaTotDebidas1 = new javax.swing.JTable();
        panelRep2 = new javax.swing.JPanel();
        panelTotClientes = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaTotClientes = new javax.swing.JTable();
        botonClientes = new javax.swing.JButton();
        anioClientes = new javax.swing.JComboBox<>();
        mesClientes = new javax.swing.JComboBox<>();
        panelTotVendido = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaTotVendido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA PRINCIPAL");

        jTabbedPane1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        ButtonMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa1ActionPerformed(evt);
            }
        });

        ButtonMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa2ActionPerformed(evt);
            }
        });

        ButtonMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa3ActionPerformed(evt);
            }
        });

        ButtonMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa4ActionPerformed(evt);
            }
        });

        ButtonMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa7ActionPerformed(evt);
            }
        });

        ButtonMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa6ActionPerformed(evt);
            }
        });

        ButtonMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa5ActionPerformed(evt);
            }
        });

        ButtonMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa8ActionPerformed(evt);
            }
        });

        ButtonMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa9ActionPerformed(evt);
            }
        });

        ButtonMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa10ActionPerformed(evt);
            }
        });

        ButtonMesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"))); // NOI18N
        ButtonMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMesa11ActionPerformed(evt);
            }
        });

        jLabel13.setText("Mesa 1");

        jLabel14.setText("Mesa 2");

        jLabel15.setText("Mesa 3");

        jLabel16.setText("Mesa 4");

        jLabel17.setText("Mesa 5");

        jLabel18.setText("Mesa 6");

        jLabel19.setText("Mesa 7");

        jLabel20.setText("Mesa 8");

        jLabel21.setText("Mesa 9");

        jLabel22.setText("Mesa 10");

        jLabel23.setText("Mesa 11");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Mesas y Cupos Disponibles");

        ordena.setText("Ordenar");
        ordena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenaActionPerformed(evt);
            }
        });

        ordenes.setText("Ver Ordenes");
        ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenesActionPerformed(evt);
            }
        });

        pedidos.setText("Ver Pedidos");
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });

        botonCocineros.setText("Vista Cocineros");
        botonCocineros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCocinerosActionPerformed(evt);
            }
        });

        pag.setText("Pagar");
        pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ButtonMesa8)
                                        .addGap(46, 46, 46)
                                        .addComponent(ButtonMesa9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesa9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ButtonMesa10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ButtonMesa11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34))
=======
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(ButtonMesa5)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesa9, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addGap(406, 406, 406))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(ButtonMesa6))))
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mesa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(ButtonMesa1))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(ButtonMesa2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonMesa3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButtonMesa4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ButtonMesa11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesa11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(ButtonMesa7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonMesa8)
                                .addGap(46, 46, 46)
                                .addComponent(ButtonMesa9)
                                .addGap(36, 36, 36)
                                .addComponent(ButtonMesa10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ordena, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(ordenes)
                                .addGap(18, 18, 18)
                                .addComponent(pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(botonCocineros, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pag)))
                        .addContainerGap(190, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel24)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15))
                    .addComponent(mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonMesa4)
                    .addComponent(ButtonMesa3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ButtonMesa2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ButtonMesa1)))
<<<<<<< HEAD
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17))
                    .addComponent(mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
=======
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mesa5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mesa7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mesa6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonMesa6)
                    .addComponent(ButtonMesa7)
                    .addComponent(ButtonMesa5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23))
                            .addComponent(mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mesa8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mesa9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mesa10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonMesa8)
                            .addComponent(ButtonMesa9)
                            .addComponent(ButtonMesa10)
                            .addComponent(ButtonMesa11)))
                    .addComponent(mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addContainerGap(117, Short.MAX_VALUE))
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordena)
                    .addComponent(ordenes)
                    .addComponent(pedidos)
                    .addComponent(botonCocineros)
                    .addComponent(pag))
                .addGap(35, 35, 35))
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
        );

        jTabbedPane1.addTab("Mesas", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel25.setText("Cantidad de Clientes");

        jLabel26.setText("Verificar si existe mesa con requerimentos");

        buscar.setText("Verificar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel27.setText("Asignar Mesero");

        jLabel28.setText("Identificación");

        asignar.setText("Asignar");
        asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarActionPerformed(evt);
            }
        });

        jButton3.setText("Ir a mesa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        logo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGap(0, 683, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
=======
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asignar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asignar))
                        .addGap(39, 39, 39)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap(160, Short.MAX_VALUE))
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
        );

        jTabbedPane1.addTab("Llegada de Cliente", jPanel2);

        jLabel6.setText("Tipo de Pago");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Grupal" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText(" Productos Consumidos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Añadido de bebidas y platos");

        botonPlato.setText("Ingresar Plato");

        jLabel9.setText("Nombre del plato");

        jLabel10.setText("Cantidad Consumida");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Descripción", "Cantidad", "Precio Unitario", "Impuesto", "Total"
            }
        ));
        jScrollPane2.setViewportView(table);

        jLabel11.setText("Tipo de la bebida");

        jLabel12.setText("Cantidad Consumida");

        jLabel1.setText("Dirección :");

        botonBebida.setText("Ingresar Bebida");

        jLabel2.setText("Telefono :");

        jLabel3.setText("Cliente :");

        jLabel4.setText("Numero de cédula del cliente");

        botonCedula.setText("Ingresar Numero");

        jLabel5.setText("Tipo de pago :");

        NombreRestaurante.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(0, 361, Short.MAX_VALUE)
=======
                .addGap(0, 516, Short.MAX_VALUE)
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
                .addComponent(NombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(botonCedula)))
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(botonPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(173, 173, 173)
                                                .addComponent(botonBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(89, 89, 89)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
<<<<<<< HEAD
                    .addContainerGap(74, Short.MAX_VALUE)))
=======
                    .addContainerGap(229, Short.MAX_VALUE)))
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(NombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 530, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCedula)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel8)
                    .addGap(26, 26, 26)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonPlato)
                        .addComponent(botonBebida))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Facturas", jPanel3);

        opcionesRep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total Platillos por Mes", "Total Bebidas por Mes", "Total Vendido por Mes/Año", "Total Clientes Atendidos por Mes/Año" }));
        opcionesRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesRepActionPerformed(evt);
            }
        });

        panelRep.setLayout(new javax.swing.OverlayLayout(panelRep));

        panelPlatillos.setLayout(null);

        tablaTotPlatillos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Platillo", "Cantidad"
            }
        ));
        jScrollPane4.setViewportView(tablaTotPlatillos1);

        panelPlatillos.add(jScrollPane4);
        jScrollPane4.setBounds(68, 78, 452, 92);

        jLabel29.setText("Total de Platillos por Mes");
        panelPlatillos.add(jLabel29);
        jLabel29.setBounds(68, 30, 160, 14);

        mesPlatillos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesPlatillosActionPerformed(evt);
            }
        });
        panelPlatillos.add(mesPlatillos);
        mesPlatillos.setBounds(422, 47, 79, 20);

        BotonTotPlatillos.setText("Buscar Total");
        BotonTotPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTotPlatillosActionPerformed(evt);
            }
        });
        panelPlatillos.add(BotonTotPlatillos);
        BotonTotPlatillos.setBounds(68, 181, 110, 23);

        jLabel30.setText("Digite el mes deseado:");
        panelPlatillos.add(jLabel30);
        jLabel30.setBounds(412, 30, 140, 14);

        panelRep.add(panelPlatillos);

        jLabel31.setText("Total de Bebidas por Dìa");

        BotonTotBebidas.setText("Buscar Total");
        BotonTotBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTotBebidasActionPerformed(evt);
            }
        });

        try {
            fechaBeb.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fechaBeb.setToolTipText("Dia/Mes/Año");
        fechaBeb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel32.setText("Digite el dìa deseado:");

        tablaTotDebidas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Platillo", "Cantidad"
            }
        ));
        jScrollPane5.setViewportView(tablaTotDebidas1);

        javax.swing.GroupLayout panelBebRepLayout = new javax.swing.GroupLayout(panelBebRep);
        panelBebRep.setLayout(panelBebRepLayout);
        panelBebRepLayout.setHorizontalGroup(
            panelBebRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(panelBebRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBebRepLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(panelBebRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelBebRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonTotBebidas))
                        .addComponent(jLabel32)
                        .addComponent(fechaBeb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        panelBebRepLayout.setVerticalGroup(
            panelBebRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
            .addGroup(panelBebRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBebRepLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelBebRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32))
                    .addGap(5, 5, 5)
                    .addComponent(fechaBeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(BotonTotBebidas)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelRep.add(panelBebRep);

        panelRep2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTotClientes.setLayout(null);

        jLabel26.setText("Total Cliente por Mes/Año");
        panelTotClientes.add(jLabel26);
        jLabel26.setBounds(38, 21, 124, 14);

        tablaTotClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mes", "Clientes"
            }
        ));
        jScrollPane7.setViewportView(tablaTotClientes);

        panelTotClientes.add(jScrollPane7);
        jScrollPane7.setBounds(24, 37, 452, 92);

        botonClientes.setText("Mostrar Clientes");
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });
        panelTotClientes.add(botonClientes);
        botonClientes.setBounds(20, 140, 130, 23);

        anioClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        anioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioClientesActionPerformed(evt);
            }
        });
        panelTotClientes.add(anioClientes);
        anioClientes.setBounds(390, 10, 70, 20);

        mesClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesClientesActionPerformed(evt);
            }
        });
        panelTotClientes.add(mesClientes);
        mesClientes.setBounds(300, 10, 79, 20);

        panelRep2.add(panelTotClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 500, 167));

        panelTotVendido.setLayout(null);

        jLabel25.setText("Total Vendido por Mes/Año");
        panelTotVendido.add(jLabel25);
        jLabel25.setBounds(38, 21, 129, 14);

        tablaTotVendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mes", "Cantidad"
            }
        ));
        jScrollPane6.setViewportView(tablaTotVendido);

        panelTotVendido.add(jScrollPane6);
        jScrollPane6.setBounds(24, 37, 452, 92);

        panelRep2.add(panelTotVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, 553, 183));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(opcionesRep, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(panelRep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(opcionesRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reportes", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void mesPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesPlatillosActionPerformed
        int opcion = mesPlatillos.getSelectedIndex();
        switch (opcion) {
            case 0:
                mes = 1;
                break;
            case 1:
                mes = 2;
                break;
            case 2:
                mes = 3;
                break;
            case 3:
                mes = 4;
                break;
            case 4:
                mes = 5;
                break;
            case 5:
                mes = 6;
                break;
            case 6:
                mes = 7;
                break;
            case 7:
                mes = 8;
                break;
            case 8:
                mes = 9;
                break;
            case 9:
                mes = 10;
                break;
            case 10:
                mes = 11;
                break;
            case 11:
                mes = 12;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_mesPlatillosActionPerformed

    private void ButtonMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa11ActionPerformed

    }//GEN-LAST:event_ButtonMesa11ActionPerformed

    private void ButtonMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa10ActionPerformed

    }//GEN-LAST:event_ButtonMesa10ActionPerformed

    private void ButtonMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa9ActionPerformed

    }//GEN-LAST:event_ButtonMesa9ActionPerformed

    private void ButtonMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa8ActionPerformed

    }//GEN-LAST:event_ButtonMesa8ActionPerformed

    private void ButtonMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa5ActionPerformed

    }//GEN-LAST:event_ButtonMesa5ActionPerformed

    private void ButtonMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa6ActionPerformed

    }//GEN-LAST:event_ButtonMesa6ActionPerformed

    private void ButtonMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa7ActionPerformed

    }//GEN-LAST:event_ButtonMesa7ActionPerformed

    private void ButtonMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa4ActionPerformed

    }//GEN-LAST:event_ButtonMesa4ActionPerformed

    private void ButtonMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa3ActionPerformed

    }//GEN-LAST:event_ButtonMesa3ActionPerformed

    private void ButtonMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa2ActionPerformed

    }//GEN-LAST:event_ButtonMesa2ActionPerformed

    private void ButtonMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa1ActionPerformed

    }//GEN-LAST:event_ButtonMesa1ActionPerformed

    private void opcionesRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesRepActionPerformed
        int opcion = opcionesRep.getSelectedIndex();
        
        switch (opcion) {
            case 0:
                panelBebRep.setVisible(false);
                panelTotVendido.setVisible(false);
                panelTotClientes.setVisible(false);
                panelPlatillos.setVisible(true);
                break;
            case 1:
                panelPlatillos.setVisible(false);
                panelTotVendido.setVisible(false);
                panelTotClientes.setVisible(false);
                panelBebRep.setVisible(true);
                break;
            case 2:
                panelBebRep.setVisible(false);
                panelPlatillos.setVisible(false);
                panelTotClientes.setVisible(false);
                panelTotVendido.setVisible(true);
                break;
            case 3:
                panelBebRep.setVisible(false);
                panelPlatillos.setVisible(false);
                panelTotVendido.setVisible(false);
                panelTotClientes.setVisible(true);
                break;
            default:
                break;
        }

    }//GEN-LAST:event_opcionesRepActionPerformed

    private void BotonTotPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTotPlatillosActionPerformed
        ArrayList <Factura> factu =restaurant.getFacturas();
        ArrayList <Detalle> det;
        ArrayList <Plato> plat = null;
        int cant = 0;
      
        for (int i=0;i<factu.size();i++){
        
            if (factu.get(i).getFechaYHora().getMonth() == mes){
            
                det= factu.get(i).getOrden().getDetalles();
                for (int j = 0; j < det.size(); j++) {
                    for (int k = 0; k < plat.size(); k++) {
                        if (det.get(j).getPlato().getNombre().equals(plat.get(j).getNombre())){
                            cant = det.get(j).getCantidad();
                            plat.get(k).setVecesConsumido(cant);
                        }
                        else{
                            cant = det.get(j).getCantidad();
                            det.get(j).getPlato().setVecesConsumido(cant);
                            plat.add(det.get(j).getPlato());
                        }
                    }      
                }
            }     
        }
        
        DefaultTableModel model = (DefaultTableModel) tablaTotPlatillos1.getModel();
        for (int i = 0; i < plat.size(); i++) {
            if (plat.get(i).getVecesConsumido()!=0)
                model.addRow(new Object[]{plat.get(i).getNombre(), String.valueOf(plat.get(i).getVecesConsumido())});         
        }
    }//GEN-LAST:event_BotonTotPlatillosActionPerformed

    private void BotonTotBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTotBebidasActionPerformed
        ArrayList <Factura> factu =restaurant.getFacturas();
        ArrayList <Detalle> det;
        ArrayList <Bebida> beb = null;
        int cant = 0;
        String string = fechaBeb.getText();
        if ("  /  /    ".equals(string))
            JOptionPane.showMessageDialog(this," Ingrese una fecha por favor. " ," Alerta de Sistema ", 0);
        else{
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            try {
                dia = format.parse(string);
            } catch (ParseException ex) {
                Logger.getLogger(VentanaPrin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for (int i=0;i<factu.size();i++){
        
            if (factu.get(i).getFechaYHora() == dia){
            
                det= factu.get(i).getOrden().getDetalles();
                for (int j = 0; j < det.size(); j++) {
                    for (int k = 0; k < beb.size(); k++) {
                        if (det.get(j).getBebida().getNombre().equals(beb.get(j).getNombre())){
                            cant = det.get(j).getCantidad();
                            beb.get(k).setVecesConsumido(cant);
                        }
                        else{
                            cant = det.get(j).getCantidad();
                            det.get(j).getBebida().setVecesConsumido(cant);
                            beb.add(det.get(j).getBebida());
                        }
                    }      
                }
            }     
        }
        
        DefaultTableModel model = (DefaultTableModel) tablaTotDebidas1.getModel();
        for (int i = 0; i < beb.size(); i++) {
            if (beb.get(i).getVecesConsumido()!=0)
                model.addRow(new Object[]{beb.get(i).getNombre(), String.valueOf(beb.get(i).getVecesConsumido())});         
        }
        
    }//GEN-LAST:event_BotonTotBebidasActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        ArrayList <Factura> factu =restaurant.getFacturas();
        int clixmes = 0;
        
        /*for (int i=0;i<factu.size();i++){
            if (factu.get(i).getFechaYHora().getMonth() == mes-1){
                clixmes++; 
            }
        }*/

        for (int i=0;i<factu.size();i++){;
            if (factu.get(i).getFechaYHora().getYear()+1900 == anio){
                clixmes++; 
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) tablaTotClientes.getModel();
        model.addRow(new Object[]{String.valueOf(anio), String.valueOf(clixmes)});
    }//GEN-LAST:event_botonClientesActionPerformed

    private void anioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioClientesActionPerformed
        int opcion = anioClientes.getSelectedIndex();
        switch (opcion) {
            case 0:
                anio = 2006;
                break;
            case 1:
                anio = 2007;
                break;
            case 2:
                anio = 2008;
                break;
            case 3:
                anio = 2009;
                break;
            case 4:
                anio = 2010;
                break;
            case 5:
                anio = 2011;
                break;
            case 6:
                anio = 2012;
                break;
            case 7:
                anio = 2013;
                break;
            case 8:
                anio = 2014;
                break;
            case 9:
                anio = 2015;
                break;
            case 10:
                anio = 2016;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_anioClientesActionPerformed

    private void mesClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesClientesActionPerformed
        int opcion = mesClientes.getSelectedIndex();
        switch (opcion) {
            case 0:
                mes = 1;
                break;
            case 1:
                mes = 2;
                break;
            case 2:
                mes = 3;
                break;
            case 3:
                mes = 4;
                break;
            case 4:
                mes = 5;
                break;
            case 5:
                mes = 6;
                break;
            case 6:
                mes = 7;
                break;
            case 7:
                mes = 8;
                break;
            case 8:
                mes = 9;
                break;
            case 9:
                mes = 10;
                break;
            case 10:
                mes = 11;
                break;
            case 11:
                mes = 12;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_mesClientesActionPerformed
=======
    //recibe el numero de mesa a manejar
    public void manejoMesas(int num){
       
         if ((botonOrden==true)&&(restaurant.preguntarEstadoMesa(num)==true)){ //si el boton de ordenar fue presionado y la mesa esta ocupada
        botonOrden =false; //se coloca en false el boton para inhabilitarlo
        Orden temporal=restaurant.obtenerOrden(num);
        
        if (temporal.getEstado()!=false){ //si la orden esta abierta
        this.setVisible(false);
        new Ventanas.Menu(temporal).setVisible(true); //se pasa como parametro la orden a la que se relaciona la mesa
        }
        
        else{
         JOptionPane.showMessageDialog(this," Esta orden ya ha sido cerrada  " ," Notificación ", 1);
        }
        
        }
        
        else if((botonVerOrdenes==true)&&(restaurant.preguntarEstadoMesa(num)==true)){
        
        botonVerOrdenes=false; //deshabilitar boton
        Orden temporal=restaurant.obtenerOrden(num); //obtener la orden asociada
        
        if (temporal.getEstado()!=false){ //si la orden esta abierta
        this.setVisible(false);
        new Ventanas.VistaOrden(temporal).setVisible(true); //se pasa como parametro la orden a la que se relaciona la mesa
        }
        
        
        
        else{
         JOptionPane.showMessageDialog(this," Esta orden ya ha sido cerrada  " ," Notificación ", 1);
        }
       
        }
         
        else if((botonPagar==true)&&(restaurant.preguntarEstadoMesa(num)==true)){
        
        botonPagar=false; //deshabilitar boton
        Orden temporal=restaurant.obtenerOrden(num); //obtener la orden asociada
        
        if (temporal.getEstado()!=false){ //si la orden esta abierta
        this.setVisible(false);
        new Ventanas.VistaFactura(temporal.getMesa().getNumero(),tipoPago).setVisible(true); //se pasa como parametro la orden a la que se relaciona la mesa
        }
        
        
        
        else{
         JOptionPane.showMessageDialog(this," Esta orden ya ha sido cerrada  " ," Notificación ", 1);
        }
            
        }
        
        
    }
    
    
    private void ButtonMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa1ActionPerformed
        int num=1; //el numero de mesa
        manejoMesas(num);               
        
    }//GEN-LAST:event_ButtonMesa1ActionPerformed

    private void ButtonMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa2ActionPerformed
       int num=2; //el numero de mesa
       manejoMesas(num); 
        
    }//GEN-LAST:event_ButtonMesa2ActionPerformed

    private void ButtonMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa3ActionPerformed
       int num=3; //el numero de mesa
       manejoMesas(num);  
        
         
    }//GEN-LAST:event_ButtonMesa3ActionPerformed

    private void ButtonMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa4ActionPerformed
        int num=4; //el numero de mesa
        manejoMesas(num); 
        
        
    }//GEN-LAST:event_ButtonMesa4ActionPerformed

    private void ButtonMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa5ActionPerformed
        int num=5; //el numero de mesa
        manejoMesas(num); 
       
    }//GEN-LAST:event_ButtonMesa5ActionPerformed

    private void ButtonMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa6ActionPerformed
       int num=6; //el numero de mesa
       manejoMesas(num);  
       
    }//GEN-LAST:event_ButtonMesa6ActionPerformed

    private void ButtonMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa7ActionPerformed
       int num=7; //el numero de mesa
       manejoMesas(num);   
       
    }//GEN-LAST:event_ButtonMesa7ActionPerformed

    private void ButtonMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa8ActionPerformed
       int num=8; //el numero de mesa
       manejoMesas(num);  
       
    }//GEN-LAST:event_ButtonMesa8ActionPerformed

    private void ButtonMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa9ActionPerformed
        int num=9; //el numero de mesa
        manejoMesas(num); 
    }//GEN-LAST:event_ButtonMesa9ActionPerformed

    private void ButtonMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa10ActionPerformed
      int num=10; //el numero de mesa
      manejoMesas(num); 
          
    }//GEN-LAST:event_ButtonMesa10ActionPerformed

    private void ButtonMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMesa11ActionPerformed
        int num=11; //el numero de mesa
        manejoMesas(num); 
    }//GEN-LAST:event_ButtonMesa11ActionPerformed
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
          if (!clientes.getText().equals("")){ //que no este vacia
            
             try{ //intentar conversion a entero
                    int cantidad=Integer.parseInt(clientes.getText());
                    
                    if (restaurant.existeMesa(cantidad)==true){
                        
                        JOptionPane.showMessageDialog(this," Si existe una mesa con los requerimentos " ," Notificacion ", 1); //1 ,simbolo de notificacion
                        int tam=iiproyecto.main.restaurante.getMesas().size();
                        //acceder al arreglo de mesas
                        ArrayList <Mesa> table=iiproyecto.main.restaurante.getMesas();
                        int numeroMesa=0;
                        
                        for (int i = 0; i < tam; i++) {
                            
                            if ((table.get(i).getEstado()!=true)&&(table.get(i).getCapacidad()==cantidad)){
                            
                                numeroMesa=table.get(i).getNumero();
                                iiproyecto.main.restaurante.ocuparMesa(numeroMesa); //se ocupa la mesa
                                cambiarImagenOcupada(numeroMesa-1);
                                Orden orden=new Orden();     //se hace una nueva orden para el cliente;
                                orden.setMesa(table.get(i)); //se relaciona con una mesa
                                main.restaurante.agregarOrden(orden); //se agrega la orden
                                tab=numeroMesa;
                                asignacionMesa=true;
                                break;
                            }
                        }
                    }
                    else{
                         JOptionPane.showMessageDialog(this," No existe una mesa con los requerimentos " ," Notificacion ", 0);
                    }
                    
                }
                
                catch(NumberFormatException e){
                    
                    JOptionPane.showMessageDialog(this," El dato ingresado no es un número" ," Alerta de Sistema ", 0);
                }
                
                //limpiar el campo de texto
                finally{
                      clientes.setText("");
                }
        
      
          }
    
    }//GEN-LAST:event_buscarActionPerformed

    
    public void cambiarImagenOcupada(int num){
    ImageIcon imag;
    imag = new ImageIcon(getClass().getResource("/Imagenes/MesaOcupada.fw.png"));
    Image photo = imag.getImage();
    Image nueva= photo.getScaledInstance(80,80, java.awt.Image.SCALE_SMOOTH);
    ImageIcon icono= new ImageIcon(nueva);
    array[num].setIcon(icono); //se cambia imagen al boton
    
    }
    
     public void cambiarImagenDesocupada(int num){
    ImageIcon imag;
    imag = new ImageIcon(getClass().getResource("/Imagenes/MesaDescupada.fw.png"));
    Image photo = imag.getImage();
    Image nueva= photo.getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
    ImageIcon icono= new ImageIcon(nueva);
    array[num].setIcon(icono); //se cambia imagen al boton

    
    }
    
    private void asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarActionPerformed
        // TODO add your handling code here:
         if (!id.getText().equals("")){ //que no este vacia
            
             try{ //intentar conversion a entero
                    int cedula=Integer.parseInt(id.getText());
                    
                    if (restaurant.buscarMesero(cedula)!=null){
                        //realizar accion
                        Mesero mesero=restaurant.buscarMesero(cedula);
                        JOptionPane.showMessageDialog(this,mesero.getNombre()+" fue asignado para la atención de la mesa " ," Notificacion ", 1);
                        
                        Orden orden=restaurant.obtenerOrden(tab); //obtener la orden del numero de mesa especificado
                        orden.setMesero(mesero); //se asigna el mesero
                        mesero.setCantidadMesasAtendidas(mesero.getCantidadMesasAtendidas()+1); //se aumenta las mesas atendidas por el mesero
                        asignacionMesero=true;
                    }
                    else{
                         JOptionPane.showMessageDialog(this," El numero ingresado no corresponde a ningún mesero " ," Notificacion ", 0);
                    }
                    
                }
                
                catch(NumberFormatException e){
                    
                    JOptionPane.showMessageDialog(this," El dato ingresado no es un número" ," Alerta de Sistema ", 0);
                }
                
                //limpiar el campo de texto
                finally{
                      id.setText("");
                }
        
            
        }
        
    }//GEN-LAST:event_asignarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if ((asignacionMesa==true)&&(asignacionMesero==true)){
             
           JOptionPane.showMessageDialog(this," Gracias por preferirnos, esperamos la pase bien" ," Bienvenida ", 1);
           asignacionMesero=false;
           asignacionMesa=false; //reestablecer estados
        }
        
        else{
          JOptionPane.showMessageDialog(this,"Recuerde asignar un mesero a su mesa, y verifcar que existan mesas disponibles" ," Alerta de sistema ", 0);

        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ordenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenaActionPerformed
        // TODO add your handling code here:
        botonOrden=true;
    }//GEN-LAST:event_ordenaActionPerformed

    private void ordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenesActionPerformed
        // TODO add your handling code here:
        botonVerOrdenes=true; //habilitar accion
    }//GEN-LAST:event_ordenesActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        // TODO add your handling code here:
        //habilitar boton
        if (restaurant.getColaPedidos().size()>0){
 
       
        this.setVisible(false);
        new Ventanas.VistaPedidos().setVisible(true); //se pasa como parametro la orden a la que se relaciona la mesa
        }
       
        else{
         JOptionPane.showMessageDialog(this," No existen pedidos pendientes  " ," Notificación ", 1);
        }
        
    }//GEN-LAST:event_pedidosActionPerformed

    private void botonCocinerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCocinerosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new VistaCocineros().setVisible(true);
    }//GEN-LAST:event_botonCocinerosActionPerformed

    private void pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagActionPerformed
        // TODO add your handling code here:
        
        botonPagar=true;
        Object [] botones = {" Individual", " Grupal"};
            int otra = JOptionPane.showOptionDialog(null," Le pedimos seleccione el tipo de pago","Pregunta de Sistema", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);
            if (otra == 0){
                
                tipoPago=1; //normal
                
            }
            
            else{
                tipoPago=2; //grupal
            }
        
    }//GEN-LAST:event_pagActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonTotBebidas;
    private javax.swing.JButton BotonTotPlatillos;
    private javax.swing.JButton ButtonMesa1;
    private javax.swing.JButton ButtonMesa10;
    private javax.swing.JButton ButtonMesa11;
    private javax.swing.JButton ButtonMesa2;
    private javax.swing.JButton ButtonMesa3;
    private javax.swing.JButton ButtonMesa4;
    private javax.swing.JButton ButtonMesa5;
    private javax.swing.JButton ButtonMesa6;
    private javax.swing.JButton ButtonMesa7;
    private javax.swing.JButton ButtonMesa8;
    private javax.swing.JButton ButtonMesa9;
    public static javax.swing.JLabel NombreRestaurante;
<<<<<<< HEAD
    private javax.swing.JComboBox<String> anioClientes;
    public static javax.swing.JButton botonBebida;
    public static javax.swing.JButton botonCedula;
    private javax.swing.JButton botonClientes;
=======
    private javax.swing.JButton asignar;
    public static javax.swing.JButton botonBebida;
    public static javax.swing.JButton botonCedula;
    private javax.swing.JButton botonCocineros;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
    public static javax.swing.JButton botonPlato;
    private javax.swing.JButton buscar;
    public static javax.swing.JTextField cantidad;
    public static javax.swing.JTextField cantidad2;
    public static javax.swing.JTextField cedula;
    public static javax.swing.JLabel cliente;
    private javax.swing.JTextField clientes;
    public static javax.swing.JComboBox<String> combo;
    public static javax.swing.JLabel direccion;
<<<<<<< HEAD
    private javax.swing.JFormattedTextField fechaBeb;
=======
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel29;
=======
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
<<<<<<< HEAD
    private javax.swing.JComboBox<String> mesClientes;
    private javax.swing.JComboBox<String> mesPlatillos;
=======
    private javax.swing.JLabel logo;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
    private javax.swing.JLabel mesa1;
    private javax.swing.JLabel mesa10;
    private javax.swing.JLabel mesa11;
    private javax.swing.JLabel mesa2;
    private javax.swing.JLabel mesa3;
    private javax.swing.JLabel mesa4;
    private javax.swing.JLabel mesa5;
    private javax.swing.JLabel mesa6;
    private javax.swing.JLabel mesa7;
    private javax.swing.JLabel mesa8;
    private javax.swing.JLabel mesa9;
    private javax.swing.JLabel nombre;
    public static javax.swing.JTextField nombrePlato;
<<<<<<< HEAD
    private javax.swing.JComboBox<String> opcionesRep;
    public static javax.swing.JLabel pago;
    private javax.swing.JPanel panelBebRep;
    private javax.swing.JPanel panelPlatillos;
    private javax.swing.JPanel panelRep;
    private javax.swing.JPanel panelRep2;
    private javax.swing.JPanel panelTotClientes;
    private javax.swing.JPanel panelTotVendido;
    private javax.swing.JTable tablaTotClientes;
    private javax.swing.JTable tablaTotDebidas1;
    private javax.swing.JTable tablaTotPlatillos1;
    private javax.swing.JTable tablaTotVendido;
=======
    private javax.swing.JButton ordena;
    private javax.swing.JButton ordenes;
    private javax.swing.JButton pag;
    public static javax.swing.JLabel pago;
    private javax.swing.JButton pedidos;
>>>>>>> 67d318ae8adb17fb4ca049a18642ccfcccef0daf
    private javax.swing.JTable table;
    public static javax.swing.JLabel telefono;
    public static javax.swing.JTextField tipoBebida;
    // End of variables declaration//GEN-END:variables
}
