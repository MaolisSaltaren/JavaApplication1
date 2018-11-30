
package formularios;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import misClases.Personas;
import misClases.conexionBD;
import formularios.*;
import javax.crypto.spec.IvParameterSpec;
    

public class principalForm extends javax.swing.JFrame {
public String Valortraido;
  
    public principalForm() {
        initComponents();
        setExtendedState(MAXIMIZED_HORIZ);// maximiza la pantalla al iniciar
    }
    
    private JFrame getFrame()
    {
        return this;
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JDesktopPane();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnCiudades = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setExtendedState(getExtendedState());

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Product-32.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user-32.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Order-32.png"))); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/REPORTES.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/City-32.png"))); // NOI18N
        btnCiudades.setText("Ciudades");
        btnCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiudadesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText(" App de Gestion de pedidos de flores");

        panelEscritorio.setLayer(btnProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(btnClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(btnPedidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(btnReportes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(btnCiudades, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscritorioLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscritorioLayout.createSequentialGroup()
                        .addComponent(btnCiudades)
                        .addGap(18, 18, 18)
                        .addComponent(btnClientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnProductos)
                        .addGap(18, 18, 18)
                        .addComponent(btnPedidos)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportes)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71))))
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscritorioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCiudades)
                    .addComponent(btnProductos)
                    .addComponent(btnReportes)
                    .addComponent(btnPedidos)
                    .addComponent(btnClientes))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        productosForm prod= new productosForm(this, true);
        prod.setVisible(true);
  
        
      
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiudadesActionPerformed
        // TODO add your handling code here:
        //ciudadesForm ciud = new  ciudadesForm(this,true);
        ciudadesForm2 llamar = new ciudadesForm2(this,true);
        llamar.setVisible(true);
       
        
        
    }//GEN-LAST:event_btnCiudadesActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
         pedidosForm pedi = new pedidosForm(this, true);
        pedi.setVisible(true);
        
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
            
        clientesForm    llamar = new clientesForm(this, rootPaneCheckingEnabled);
        llamar.setVisible(true);
        
    }//GEN-LAST:event_btnClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       // crear una instancia de la clase conexionBD que tiene  todos los parametros necesarios
       //conexionBD conexion  = new conexionBD();
       //Connection conn= conexion.conectarMsql();
      
       
       
       
        /*  lanza el formulario  */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalForm().setVisible(true);
               
            }
        });
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCiudades;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDesktopPane panelEscritorio;
    // End of variables declaration//GEN-END:variables
}
