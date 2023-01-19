
package vista;

import dao.DAOClinicas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uml.Clinicas;

/**
 * Nombre de la Clase: VistaClinicas
 * Fecha: 04/06/2021
 * Version: 1.0 
 *  @author Rene Gabriel Hernandez      Carnet: (203020)
 
 */
public class VistaClinicas extends javax.swing.JFrame {
    
    
    String []columnas={"CODIGO","EVENTO","ENCARGADO"}; 
    DefaultTableModel modelo=new DefaultTableModel(columnas, 0){
    @Override
    public boolean isCellEditable(int filas, int columnas)
    {
        if (columnas==3)
        {
            return true;
        }else
        {
            return false;
        }
    
    }
    };
    
    DAOClinicas dao= new  DAOClinicas();
    List<Clinicas> data= new ArrayList<>();
    Clinicas cli= new Clinicas();

    
    /**
     * Creates new form VistaClinicas
     */
    //LLENAMOS LA TABLA DE DIFERENTES CLINICAS
    public void cargarTabla ()
    {   TableDatos.getTableHeader().setReorderingAllowed(false); //Para evitar que se puedan mover las columnas del JTable
        this.modelo.setRowCount(0);
        data.clear();
        data= (List<Clinicas>) dao.seleccionar();
        Object[]  obj = new Object[7];
        for (Clinicas fila : data)            
        {
            obj[0]=fila.getIdClinica();
            obj[1]=fila.getNombClinica();
           /* obj[2]=fila.getEmpleados();*/
            obj[2]=fila.getEncargado();            
            this.modelo.addRow(obj);
            
        }       
        
        this.TableDatos.setModel(modelo);
    }//FIN DE LA TABLA DE CITAS AGENDADAS
    
    //METODO PARA LIMPIAR LOS CAMPOS
    public void limpiar(){
        this.txtCodigo.setText("");
        this.txtNombClinica.setText("");
       /* this.txtEmpleados.setText("");*/
        this.txtEncargado.setText("");            
    }//FIN DE METODO PARA LIMPIAR LOS CAMPOS
    
    
    
    public VistaClinicas() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Administrar Eventos");
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombClinica = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEncargado = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatos = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTASR CLINICAS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(123, 93, 68));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("EVENTOS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCodigo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de evento");

        txtNombClinica.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombClinicaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Encargado");

        txtEncargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnModificar.setBackground(new java.awt.Color(44, 112, 72));
        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar Registro");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(44, 112, 72));
        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Registro");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(44, 112, 72));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Registro");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        TableDatos.setBackground(new java.awt.Color(99, 154, 148));
        TableDatos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TableDatos.setForeground(new java.awt.Color(255, 255, 255));
        TableDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        TableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableDatos);

        btnLimpiar.setBackground(new java.awt.Color(44, 112, 72));
        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)))
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(txtNombClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(252, 252, 252))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
       
         if(txtNombClinica.getText().equals("")||/*txtEmpleados.getText().equals("")||*/txtEncargado.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "No debe dejar campos vacios");
        }else{
        
       this.cli.setNombClinica(this.txtNombClinica.getText()); 
      /* this.cli.setEmpleados(Integer.parseInt(this.txtEmpleados.getText()));*/
       this.cli.setEncargado(this.txtEncargado.getText());
       if (dao.insertar(this.cli)){
            JOptionPane.showMessageDialog(this,"Registro guardado correctamente!!");
            //refrescar la tabla
            cargarTabla(); 
            
        }else
        {
            JOptionPane.showMessageDialog(this,"Error al insertar");
        }
        
       }
        
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
       
        if(txtNombClinica.getText().equals("")/*||txtEmpleados.getText().equals("")*/||txtEncargado.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Hay campos incompletos");
        }else{  
        this.cli.setIdClinica(Integer.parseInt(this.txtCodigo.getText()));
        this.cli.setNombClinica(this.txtNombClinica.getText()); 
       /*this.cli.setEmpleados(Integer.parseInt(this.txtEmpleados.getText()));*/
       this.cli.setEncargado(this.txtEncargado.getText());
       if (dao.modificar(this.cli)){
            JOptionPane.showMessageDialog(this,"Se ha modificado con exito!!");
            //refrescar la tabla
            cargarTabla(); 
            
        }else
        {
            JOptionPane.showMessageDialog(this,"Ha ocurrido un error al modificar");
        }
       }
        
    }//GEN-LAST:event_btnModificarMouseClicked

    private void TableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDatosMouseClicked
        // TODO add your handling code here:
        
        this.txtCodigo.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),0).toString());
        this.txtNombClinica.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),1).toString());
        /*this.txtEmpleados.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),2).toString());
        */this.txtEncargado.setText(TableDatos.getValueAt(TableDatos.getSelectedRow(),2).toString());
        
    }//GEN-LAST:event_TableDatosMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        
        if(txtNombClinica.getText().equals("")/*||txtEmpleados.getText().equals("")*/||txtEncargado.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Hay campos incompletos");
        }else{ 
        this.cli.setIdClinica(Integer.parseInt(this.txtCodigo.getText()));
        this.cli.setNombClinica(this.txtNombClinica.getText()); 
       /*this.cli.setEmpleados(Integer.parseInt(this.txtEmpleados.getText()));*/
       this.cli.setEncargado(this.txtEncargado.getText());
       
       
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el registro?", "Advertencia!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp==JOptionPane.YES_OPTION)
            {
                 if (dao.eliminar(this.cli)){
                    JOptionPane.showMessageDialog(this,"El registro se ha eliminado!!");
                    //refrescar la tabla
                    cargarTabla();
                    limpiar();
        }else
        {
            JOptionPane.showMessageDialog(this,"No se ha eliminado");
        }
                
                
            }
        }
       
             
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        limpiar();
        
        
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Inicio.frmClinica=null;
    }//GEN-LAST:event_formWindowClosing

    private void txtNombClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombClinicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombClinicaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaClinicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaClinicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaClinicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaClinicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaClinicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtNombClinica;
    // End of variables declaration//GEN-END:variables
}
