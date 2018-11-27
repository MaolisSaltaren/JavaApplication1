
package formularios;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import misClases.Personas;
import misClases.conexionBD;
import formularios.ciudadesForm;
    

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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtidentifi = new javax.swing.JEditorPane();
        btnIr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setExtendedState(getExtendedState());

        jScrollPane1.setViewportView(txtidentifi);

        btnIr.setText("ir");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        panelEscritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelEscritorio.setLayer(btnIr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelEscritorioLayout = new javax.swing.GroupLayout(panelEscritorio);
        panelEscritorio.setLayout(panelEscritorioLayout);
        panelEscritorioLayout.setHorizontalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEscritorioLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnIr)
                .addGap(257, 257, 257))
        );
        panelEscritorioLayout.setVerticalGroup(
            panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscritorioLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(panelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIr)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "hola");  JOptionPane.showMessageDialog(null, "juan");
        ciudadesForm llamar = new ciudadesForm();
        llamar.setVisible(true);
        
    }//GEN-LAST:event_btnIrActionPerformed

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
    private javax.swing.JButton btnIr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.JEditorPane txtidentifi;
    // End of variables declaration//GEN-END:variables
}
