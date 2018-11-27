
package formularios;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import misClases.Personas;
import misClases.conexionBD;
    

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
        btnConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtidentifi = new javax.swing.JEditorPane();
        btnIrPedidos = new javax.swing.JButton();
        llamar = new javax.swing.JButton();
        btnTraeValor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setExtendedState(getExtendedState());

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtidentifi);

        btnIrPedidos.setText("Mostrar Pedidos");
        btnIrPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPedidosActionPerformed(evt);
            }
        });

        llamar.setText("llaar a ejemplo");
        llamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llamarActionPerformed(evt);
            }
        });

        btnTraeValor.setText("traer valor de otraventana");
        btnTraeValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraeValorActionPerformed(evt);
            }
        });

        panelEscritorio.setLayer(btnConectar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(btnIrPedidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(llamar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(btnTraeValor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscritorioLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIrPedidos)
                    .addComponent(btnConectar))
                .addGap(355, 355, 355))
            .addGroup(panelEscritorioLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(llamar)
                .addGap(122, 122, 122)
                .addComponent(btnTraeValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscritorioLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConectar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnIrPedidos)
                .addGap(18, 18, 18)
                .addGroup(panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llamar)
                    .addComponent(btnTraeValor))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEscritorio)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEscritorio)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        conexionBD conexion = new conexionBD();
        Connection con = conexion.getConexion();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnIrPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrPedidosActionPerformed
        // TODO add your handling code here:
      //  new pedidosForm(this,true).setVisible(true);
       // new PersonasForm().setVisible(true);
     //  clientesForm clientes = new clientesForm(this, rootPaneCheckingEnabled);
      //  clientes.setVisible(true);
    }//GEN-LAST:event_btnIrPedidosActionPerformed

    private void llamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llamarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_llamarActionPerformed

    private void btnTraeValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraeValorActionPerformed
        // TODO add your handling code here:
        Personas pers = new Personas();
        
        JOptionPane.showMessageDialog(null," identificacio="+ Valortraido);
        
    }//GEN-LAST:event_btnTraeValorActionPerformed

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
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnIrPedidos;
    private javax.swing.JButton btnTraeValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton llamar;
    private javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.JEditorPane txtidentifi;
    // End of variables declaration//GEN-END:variables
}
