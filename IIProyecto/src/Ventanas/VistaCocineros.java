/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Clases.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Josua
 */
public class VistaCocineros extends javax.swing.JFrame {

    /**
     * Creates new form VistaCocineros
     */
    
    ArrayList<Pedido> pedidos;
    Restaurante enlace=iiproyecto.main.restaurante;
    DefaultTableModel model;
    ArrayList<Cocinero> cocineros=new ArrayList();
    int indice=0;
    int primero=0;
    public VistaCocineros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(50,200,220));
        model=(DefaultTableModel)elementos.getModel(); //accceder a modificacion de la tabla
        llenarArreglo();
        asignarValores();
        escribirEnTabla();
        
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        elementos = new javax.swing.JTable();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        cocinar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VISTA COCINEROS");
        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Nombre del cocinero");

        nombre.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        elementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Plato", "Estado"
            }
        ));
        jScrollPane1.setViewportView(elementos);

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        cocinar.setText("Cocinar Platillos");
        cocinar.setToolTipText("Colocar a listos los platos");
        cocinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(siguiente)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cocinar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(anterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(cocinar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //se escribe en la tabla
    public void escribirEnTabla(){
   if (pedidos.size()!=0){
           
        for (int i = 0; i < pedidos.size(); i++) {
            try{
            Object datos[]={pedidos.get(i).getBebida().getNombre(),pedidos.get(i).getBebida().getEstado()};
            model.addRow(datos);
                    }
            
            catch(NullPointerException e){
            Object datos[]={pedidos.get(i).getPlato().getNombre(),pedidos.get(i).getPlato().getEstado()};
            model.addRow(datos);
            }
        }
    }
  /* else {
      JOptionPane.showMessageDialog(this, " Actualmente el cocinero no se encuentra preparando ningún plato","Alerta de Sistema", 0);

        }*/
    }
    
    //formar la lista de cocineros
    private void llenarArreglo(){
    
        ArrayList<Empleado>temp=enlace.getEmpleados();
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) instanceof Cocinero){
            
                cocineros.add((Cocinero) temp.get(i));
            }
            
        }
    }
    
    public boolean asignarValores(){
        
        if ((indice<cocineros.size())&&(indice==0)){
      
        pedidos=cocineros.get(indice).getListaPedidos();
        nombre.setText(cocineros.get(indice).getNombre());
        
        return true;
                
        }
        
        else if (indice<cocineros.size()){
            //limpiar tabla
            for (int i = 0; i <pedidos.size(); i++) {
               model.removeRow(0);
            }
            pedidos=cocineros.get(indice).getListaPedidos();
            nombre.setText(cocineros.get(indice).getNombre());
            return true;
        }
        
        else{
    
        return false;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        iiproyecto.main.ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        if (indice>0){
          for (int i = 0; i <pedidos.size(); i++) {
               model.removeRow(0);  //eliminar columnas
            }
        indice--;
        asignarValores();
        escribirEnTabla();
        }
        
        else{
        JOptionPane.showMessageDialog(this, " No puede salirse del rango","Alerta de Sistema", 0);
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        if (indice<cocineros.size()-1){
        indice++;
        asignarValores();
        escribirEnTabla();
        }
        
        else{
        JOptionPane.showMessageDialog(this, " No puede salirse del rango","Alerta de Sistema", 0);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void cocinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocinarActionPerformed
        // TODO add your handling code here:
        if (pedidos.size()>0){
        for (int i = 0; i < pedidos.size(); i++) {
            
            cocineros.get(indice).cocinarPlatillo(pedidos.get(i));
            try{
            
            model.setValueAt(pedidos.get(i).getBebida().getEstado(), i,1); //modificar vista en 
            }
            catch(NullPointerException e){
            model.setValueAt(pedidos.get(i).getPlato().getEstado(), i,1); //modificar vista en tabla
            }
        }
        JOptionPane.showMessageDialog(this, " Los platos han sido preparados "," Notificación", 1);
        for (int i = 0; i <pedidos.size(); i++) {
               model.removeRow(0);
            }
        cocineros.get(indice).limpiarPedidos();
        }
        
        else{
          JOptionPane.showMessageDialog(this, " Actualmente el cocinero no se encuentra preparando ningún plato","Alerta de Sistema", 0);
        }
    }//GEN-LAST:event_cocinarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCocineros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCocineros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCocineros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCocineros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCocineros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton cocinar;
    private javax.swing.JTable elementos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
