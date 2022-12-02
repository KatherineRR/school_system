/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ctrlAlumnos;
import control.ctrlAsignatura;
import control.ctrlNivel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Alumno;
import model.Asignatura;
import model.Nivel;

/**
 *
 * @author Katherine Rodriguez
 */
public class ModificarFaltaAsistenciaForm extends javax.swing.JInternalFrame {

    private ctrlAsignatura ca;
    private ctrlAlumnos ct;
    private ctrlNivel cni;
    private DefaultTableModel modelo;
    private DefaultComboBoxModel model;
    private int id;
    private int nivel;
    /**
     * Creates new form ModificarFaltaAsistenciaForm
     */
    public ModificarFaltaAsistenciaForm(int id) {
        initComponents();
        modelo = new DefaultTableModel();
        ca = new ctrlAsignatura();
        ct = new ctrlAlumnos();
        this.id = id;
        cni = new ctrlNivel();
        llenarCboAsignaturas();
        llenarCboNivel();
    }
    
    void llenarCboNivel(){       
        ArrayList<Nivel> lista = cni.Listar();
        Object[] ob = new Object[lista.size()];
        for (int i = 0;i < lista.size(); i++){
            ob[i] = lista.get(i).getNivel();
        }
        model = new DefaultComboBoxModel(ob);
        cboNivel.setModel(model);
    }
    
    void llenarCboAsignaturas(){
        ArrayList<Asignatura> lista = ca.ListarAsigProfeDa(id);
        Object[] ob = new Object[lista.size()];
        for (int i = 0;i < lista.size(); i++){
            ob[i] = lista.get(i).getNombre();
        }
        model = new DefaultComboBoxModel(ob);
        cboAsignatura.setModel(model);
    }
    
    void buscar(){
        nivel = cni.buscarNivelId((String)cboNivel.getSelectedItem());
        
        if (nivel != 0 && ((String)cboAsignatura.getSelectedItem() != "") && (txtFecha.getText() != "")){
            int asignatura_id = ca.buscarAsignaturaId(id, nivel, (String)cboAsignatura.getSelectedItem());
            ArrayList<Alumno> lista = ct.buscarFaltasAsistencias(nivel, asignatura_id, txtBuscarFecha.getText());
            modelo = (DefaultTableModel)tabla.getModel();
            Object[] ob = new Object[4];
            for (int i = 0;i < lista.size(); i++){
                ob[0] = lista.get(i).getNombre();
                ob[1] = lista.get(i).getApellidos();
                ob[2] = lista.get(i).getNota();
                ob[3] = lista.get(i).getJustificada();
                modelo.addRow(ob);
            }
            tabla.setModel(modelo);
        }        
    }
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;       
        }
    }
    
    void limpiarCampos(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtAsignatura.setText("");
        txtFecha.setText("");
        txtJustificada.setText("");
    }
    
    void modificarFaltaAsistencia(){
        int alumno_id = ct.buscarAlumnoId(txtNombre.getText(), txtApellidos.getText());
        int asignatura_id = ca.buscarAsignaturaId(id, nivel, (String)cboAsignatura.getSelectedItem());
        int r = ct.modificarFaltaAsistencia(txtFecha.getText(), txtJustificada.getText(), alumno_id, asignatura_id);
        if (r != 0){
            JOptionPane.showMessageDialog(null, "Falta de asistencia modificada con exito"); 
        }else{
            JOptionPane.showMessageDialog(null, "Error, Falta de asistencia no modificada"); 
        }
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
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtJustificada = new javax.swing.JTextField();
        btnModificarFalta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboAsignatura = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarFecha = new javax.swing.JTextField();
        cboNivel = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Modificar falta de asistencia");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Nombre");

        txtNombre.setEditable(false);

        jLabel4.setText("Apellidos:");

        txtApellidos.setEditable(false);

        jLabel6.setText("Asignatura:");

        txtAsignatura.setEditable(false);

        jLabel7.setText("Fecha:");

        jLabel8.setText("Justificada:");

        btnModificarFalta.setText("Modificar falta de asistencia");
        btnModificarFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFaltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJustificada, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarFalta)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJustificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnModificarFalta))
                .addGap(4, 4, 4))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Fecha", "Justificada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Nivel:");

        jLabel2.setText("Asignatura:");

        cboAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAsignaturaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha:");

        txtBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarFecha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboNivel, 0, 162, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboAsignatura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(btnBuscar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cboAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAsignaturaActionPerformed

    private void txtBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarFechaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
        limpiarTabla();
        buscar();
        limpiarCampos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        
        if (fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila"); 
        }else{
            String nom = tabla.getValueAt(fila, 0).toString();
            String ape = tabla.getValueAt(fila, 1).toString();
            String fecha = tabla.getValueAt(fila, 2).toString();
            String just = tabla.getValueAt(fila, 3).toString();
            
            txtNombre.setText(nom);
            txtApellidos.setText(ape);  
            txtAsignatura.setText((String)cboAsignatura.getSelectedItem());
            txtFecha.setText(fecha);
            txtJustificada.setText(just);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnModificarFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFaltaActionPerformed
        modificarFaltaAsistencia();
        limpiarTabla();
        buscar();
        limpiarCampos();
    }//GEN-LAST:event_btnModificarFaltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificarFalta;
    private javax.swing.JComboBox<String> cboAsignatura;
    private javax.swing.JComboBox<String> cboNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBuscarFecha;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtJustificada;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}