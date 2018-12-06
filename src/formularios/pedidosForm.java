/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

//librerias necesarias para el acceso a datos en servidor mysql 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.*;
import misClases.conexionBD;

/*
 * @JUAN_PC
 */
public class pedidosForm extends javax.swing.JDialog {

    /**
     * Creates new form pedidosForm
     */
    public pedidosForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        // carga los pedidos en un jtable al iniciar la aplicacion
        initComponents();

        // busca el ultimo pedido guardado y genera un consecutuvo
        selectMax("call pedidosMax()");
        
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popopMenu = new javax.swing.JPopupMenu();
        popopModificarCantidad = new javax.swing.JMenuItem();
        popopEliminarItem = new javax.swing.JMenuItem();
        popopEliminarTodo = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        labelMaxPedido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIr = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        txtNombreCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        panelClientes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarClientes = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListadoClientes = new javax.swing.JTable();
        btnBuscarClientes = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtStok = new javax.swing.JTextField();
        txtIdproducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnombreProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtVrTotal = new javax.swing.JTextField();
        txtVrUnitario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAddProducto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListadoProductos = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtTotalFactura = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jpanelProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBuscarProductos = new javax.swing.JTable();
        txtBuscarProductos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnBuscarProductos = new javax.swing.JButton();

        popopModificarCantidad.setText("Modificar Cantidad");
        popopModificarCantidad.setName("dsdsd"); // NOI18N
        popopModificarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popopModificarCantidadActionPerformed(evt);
            }
        });
        popopMenu.add(popopModificarCantidad);

        popopEliminarItem.setText("EliminarProducto");
        popopEliminarItem.setToolTipText("");
        popopEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popopEliminarItemActionPerformed(evt);
            }
        });
        popopMenu.add(popopEliminarItem);

        popopEliminarTodo.setText("Eliminar Todos los item");
        popopMenu.add(popopEliminarTodo);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Order-32.png"))); // NOI18N
        jLabel1.setText("Pedidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel3.setText("Pedido N°: ");

        labelMaxPedido.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMaxPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMaxPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.setName("Infomeaico"); // NOI18N

        jLabel2.setText("Informacion del cliente");

        jLabel4.setText("Id  del cliente:");

        jLabel5.setText("Cliente:");

        btnIr.setText("Ir");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo");

        txtNombreCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNombreCliente.setText("Nobre del cliente");
        txtNombreCliente.setEnabled(false);

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(btnIr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoCliente)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIr)
                    .addComponent(btnBuscarCliente)
                    .addComponent(btnNuevoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel6.setText("Busqueda de Clientes");

        tableListadoClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableListadoClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListadoClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableListadoClientes);

        btnBuscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel4.setName("Infomeaico"); // NOI18N

        jLabel7.setText("Ingreso de productos");

        jLabel8.setText("Id");

        jLabel9.setText("Cantidad:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtStok.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtStok.setEnabled(false);

        txtIdproducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtIdproducto.setEnabled(false);

        jLabel10.setText("Nombre:");

        txtnombreProducto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtnombreProducto.setEnabled(false);

        jLabel11.setText("Existencia:");

        jLabel12.setText("Vr Total");

        txtVrTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtVrTotal.setEnabled(false);

        txtVrUnitario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtVrUnitario.setEnabled(false);

        jLabel13.setText("Vr Unitario:");

        btnAddProducto.setText("+");
        btnAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductoActionPerformed(evt);
            }
        });

        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtIdproducto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVrTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAddProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(btnBuscar)))
                    .addComponent(jLabel7))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVrUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVrTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProducto)
                    .addComponent(jButton1))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        tableListadoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ));
        tableListadoProductos.setComponentPopupMenu(popopMenu);
        jScrollPane1.setViewportView(tableListadoProductos);
        tableListadoProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton4.setText("Finalizar Venta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("Total a  pagar ");

        jButton6.setText("Salir");

        jButton7.setText("Guardar");

        jButton8.setText("cancelar");

        txtTotalFactura.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(txtTotalFactura))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 255));
        jPanel7.setForeground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tableBuscarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBuscarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBuscarProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableBuscarProductos);

        jLabel15.setText("Busqueda de productos ");

        btnBuscarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnBuscarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelProductosLayout = new javax.swing.GroupLayout(jpanelProductos);
        jpanelProductos.setLayout(jpanelProductosLayout);
        jpanelProductosLayout.setHorizontalGroup(
            jpanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelProductosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelProductosLayout.setVerticalGroup(
            jpanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelProductosLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jpanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(btnBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpanelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        // TODO add your handling code here
        searchNombreCliente(" select PERS_NOMBRE from tbl_personas where PERS_IDENTIFICACION = '" + txtIdCliente.getText() + "';");
    }//GEN-LAST:event_btnIrActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        mostrarClientes("call personasBusqueda('')");
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
        // TODO add your handling code here:
        mostrarClientes("call personasBusqueda('" + txtBuscarClientes.getText().toString() + "');");
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void tableListadoClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListadoClientesMouseClicked
        
        int seleccion = tableListadoClientes.getSelectedRow();

        //pasa los  datos de la jtable a los campos de texto de acuerdo al indice de la columna   
        txtIdCliente.setText(String.valueOf(tableListadoClientes.getValueAt(seleccion, 0)));
        txtNombreCliente.setText(String.valueOf(tableListadoClientes.getValueAt(seleccion, 1)));        
    }//GEN-LAST:event_tableListadoClientesMouseClicked

    private void tableBuscarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBuscarProductosMouseClicked
        // TODO add your handling code here:
        int seleccion = tableBuscarProductos.getSelectedRow();

        //pasa los  datos de la jtable a los campos de texto de acuerdo al indice de la columna
        txtIdproducto.setText(String.valueOf(tableBuscarProductos.getValueAt(seleccion, 0)));
        txtnombreProducto.setText(String.valueOf(tableBuscarProductos.getValueAt(seleccion, 1)));
        txtStok.setText(String.valueOf(tableBuscarProductos.getValueAt(seleccion, 2)));
        txtVrUnitario.setText(String.valueOf(tableBuscarProductos.getValueAt(seleccion, 3)));
     
    
        

    }//GEN-LAST:event_tableBuscarProductosMouseClicked

    private void btnBuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductosActionPerformed
        // TODO add your handling code here:
        mostrarProductos("call productosBusqueda('" + txtBuscarProductos.getText().toString() + "');");
    }//GEN-LAST:event_btnBuscarProductosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        mostrarProductos("call productosBusqueda('');");
    }//GEN-LAST:event_btnBuscarActionPerformed
   double sumaTotalProd=0;
    private void btnAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductoActionPerformed
        //bandera 
        int bandera = 0;
         

        // captura el id del producto de la caja de texto esto para validar que no se ingresen dos productos iguales
        String idProducto;
        idProducto = txtIdproducto.getText();

        // captura los  datos introducidos en  cantidad y exixtencia
        double cantidad;
        double existencia;
        
        if(txtIdproducto.getText().isEmpty() )
        
            JOptionPane.showMessageDialog(null, "Por favor seleccione un  producto de la lista  ");
        else if(txtCantidad.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad a vender");
        else{
            
        cantidad = Double.valueOf(txtCantidad.getText());
        existencia = Double.valueOf(txtStok.getText());
        
        if (cantidad > existencia) {
            JOptionPane.showMessageDialog(null, "  la cantidad a vender no  puede exceder  del stok en bodega");
        } else {

                    if(this.tableListadoProductos.getRowCount()==0 && this.tableListadoProductos.getSelectedRow()==-1){

                             //JOptionPane.showMessageDialog(null, " table esta vacia ");
                             insertartable();
                             sumaTotalesProd();
                          
                    }
                    else{

                            for (int i = 0; i < tableListadoProductos.getRowCount(); i++) 
                            {
                                // valida que no se repitan nos productos con el mismo id
                                String val = tableListadoProductos.getValueAt(i, 0).toString().trim();
  
                                
                                if (idProducto.equals(val)) {
                                    //JOptionPane.showMessageDialog(null, " elento agregado juan  ");
                                    bandera = 1;

                                }

                            }
                            // valida si el elemento a ingresar ya esta en la lista
                            if (bandera == 1) {
                                JOptionPane.showMessageDialog(null, "el elemento ya se encuentra en la lista ");

                            } else {
                                insertartable();
                                bandera = 0;      
                                sumaTotalesProd();
                             
                            }
                   
               }
       
        }
        }
        

    }//GEN-LAST:event_btnAddProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               //pone el foco en la el vr unitario 
        txtVrUnitario.requestFocus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      // con este metodo se obtiene el total de la factura 
        sumaTotalesProd();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void popopModificarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popopModificarCantidadActionPerformed
        // TODO add your handling code here:
        //1. se establece la celda seleccionada 
        int fila = tableListadoProductos.getSelectedRow();
        double vrUnit= Double.valueOf( tableListadoProductos.getValueAt(fila, 4).toString().trim());
        double valstok= Double.valueOf( tableListadoProductos.getValueAt(fila, 3).toString().trim());      
        
         //2. muestra un menu  input para digitar la cantidad a ingresar
         double valorInput=Double.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad a modificar menor a stock="+valstok));
         //3. se valida que la cantidad no sea cero y que no supere el stok 
         if(valorInput != 0 && valstok!=0 && valorInput<= valstok)
         {
             //3.1 se agregan los valores y se hace un recalculo de los valores en la table
         tableListadoProductos.setValueAt(valorInput, fila, 2);
         tableListadoProductos.setValueAt(valorInput*vrUnit, fila, 5);
         sumaTotalesProd();
         }
         else{
             JOptionPane.showMessageDialog(null , "La cantidad ingresada supera el valor en stock ");}
             
  
    }//GEN-LAST:event_popopModificarCantidadActionPerformed

    private void popopEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popopEliminarItemActionPerformed
      int fila = tableListadoProductos.getSelectedRow();
        double id= Double.valueOf( tableListadoProductos.getValueAt(fila, 0).toString().trim());


    try
    {
                   DefaultTableModel dtm = (DefaultTableModel) tableListadoProductos.getModel(); //TableProducto es el nombre de mi tabla ;) 
dtm.removeRow(tableListadoProductos.getSelectedRow()); 
            
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "no se pudo eliminar la fila"+e.toString());
        
    }
   
       
      
       sumaTotalesProd();
       JOptionPane.showMessageDialog(null , " clic en eliminar roducto");
      
    }//GEN-LAST:event_popopEliminarItemActionPerformed

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
            java.util.logging.Logger.getLogger(pedidosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedidosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedidosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedidosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pedidosForm dialog = new pedidosForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    //------------------------------------------------------------------------------------
    //metodo que agarra el ultimo pedido y le suma 1 para luego mostrarlo en el label de contador 
    String maxPedido;

    public void selectMax(String cosulta) {        
        Connection cn = conexionBD.getConexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cosulta);
            if (rs.first()) {
                maxPedido = rs.getString("maxPedido");
                // JOptionPane.showMessageDialog(null," "+maxPedido);  
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());            
        }        
        labelMaxPedido.setText(String.valueOf(maxPedido));        
    }
    //----------------------------------------------------------------------------------
    //metodo que busca un cliente por id 
    
    public void searchNombreCliente(String cosulta) {        
        
        Connection cn = conexionBD.getConexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cosulta);
            if (rs.first()) {
              
                txtNombreCliente.setText(String.valueOf(rs.getString("PERS_NOMBRE")));                
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());            
        }        
    }

    //------------------------------------------------------------------------------
    //listado de clientes
    private void mostrarClientes(String consulta) {
        
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexionBD.getTabla(consulta);
        modelo.setColumnIdentifiers(new Object[]{
            "Id", "NOMBRE", "TELEFONO"});
        
        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("PERS_IDENTIFICACION"),
                    rs.getString("PERS_NOMBRE"),
                    rs.getString("PERS_TELEFONO")
                
                });
            }
            tableListadoClientes.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }        
    }
    //--------------------------------------------------------------------------------

    // metodo que muestra en  el jtable espeficicado el todos los productos 
    private void mostrarProductos(String consulta) {
        
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = conexionBD.getTabla(consulta);
        modelo.setColumnIdentifiers(new Object[]{
            "Id", "NOMBRE", "STOCK", "PRECIO"});
        
        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("PROD_ID"),
                    rs.getString("PROD_NOMBRE"),
                    rs.getString("PROD_STOK"),
                    rs.getString("PROD_PRECIO")
                
                });
            }
            tableBuscarProductos.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }        
    }
    //----------------------------------------------------------------------------------
   // metdo que inserta  filas en  un jtable
    public void insertartable() {
        double totalventa;
   
        
        totalventa =Double.valueOf(txtCantidad.getText())* Double.valueOf(txtVrUnitario.getText());
         
        DefaultTableModel modeloProductos = (DefaultTableModel) tableListadoProductos.getModel();
        modeloProductos.setColumnIdentifiers(new Object[]{
            "Id", "NOMBRE", "CANTIDAD", "STOCK", "VR. UNITARIO", "VR. TOTAL"});
        
        modeloProductos.addRow(new Object[]{
            txtIdproducto.getText(),
            txtnombreProducto.getText(),
            txtCantidad.getText(),
            txtStok.getText(),
            txtVrUnitario.getText(),
            String.valueOf(totalventa)
    
        });
    }
    
    double valor=0;     
    double vrTotal =0;
    // suma los valores totales de los productos agregados
    public  void sumaTotalesProd()
    {
     
      vrTotal=0;
      valor=0;
       try  
       {
            for(int i =0 ; i<tableListadoProductos.getRowCount();i++)
            {
                valor = Double.valueOf(tableListadoProductos.getValueAt(i, 5).toString().trim());
                vrTotal= vrTotal+ valor;
                //JOptionPane.showMessageDialog(null, vrTotal);
            }
            txtTotalFactura.setText(String.valueOf(vrTotal));
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error"+e.toString());
           
       }
        
       
    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProducto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarClientes;
    private javax.swing.JButton btnBuscarProductos;
    private javax.swing.JButton btnIr;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpanelProductos;
    private javax.swing.JLabel labelMaxPedido;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JMenuItem popopEliminarItem;
    private javax.swing.JMenuItem popopEliminarTodo;
    private javax.swing.JPopupMenu popopMenu;
    private javax.swing.JMenuItem popopModificarCantidad;
    private javax.swing.JTable tableBuscarProductos;
    private javax.swing.JTable tableListadoClientes;
    private javax.swing.JTable tableListadoProductos;
    private javax.swing.JTextField txtBuscarClientes;
    private javax.swing.JTextField txtBuscarProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdproducto;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtStok;
    private javax.swing.JLabel txtTotalFactura;
    private javax.swing.JTextField txtVrTotal;
    private javax.swing.JTextField txtVrUnitario;
    private javax.swing.JTextField txtnombreProducto;
    // End of variables declaration//GEN-END:variables

    
}
