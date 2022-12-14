/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ctrlAsignatura;
import control.ctrlNivel;
import control.ctrlProfesor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Asignatura;
import model.Nivel;
import model.Profesor;

/**
 *
 * @author Katherine Rodriguez
 */
public class RegistrarAsignaturaForm extends javax.swing.JInternalFrame {

    private ctrlAsignatura ca;
    private ctrlProfesor cp;
    private Asignatura as;
    private ctrlNivel cni;
    private DefaultComboBoxModel model;
    
    public RegistrarAsignaturaForm() {
        initComponents();
        ca = new ctrlAsignatura();
        as = new Asignatura();
        cp = new ctrlProfesor();
        cni = new ctrlNivel();
        llenarCboNivel();
        llenarCboProfesores();
        
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
    
    void llenarCboProfesores(){       
        ArrayList<Profesor> lista = cp.ListarNombres();
        Object[] ob = new Object[lista.size()];
        for (int i = 0;i < lista.size(); i++){
            ob[i] = lista.get(i).getNombre();
        }
        model = new DefaultComboBoxModel(ob);
        cboProfesor.setModel(model);
    }   
    
    void agregar(){
        int nivel = cni.buscarNivelId((String)cboNivel.getSelectedItem());          
        int profesor = cp.buscarProfeId((String)cboProfesor.getSelectedItem());
        String nom = txtNombre.getText();
        Object[] ob = new Object[5];
        ob[0] = nivel;
        ob[1] = profesor;
        ob[2] = nom;
        int r = ca.add(ob);
        if (r != 0){
            JOptionPane.showMessageDialog(null, "Asignatura registrada correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error, asignatura no registrada");
        }
        
    }
    void limpiarCampos(){
        txtNombre.setText(""); 
        cboNivel.setSelectedItem("SELECCIONAR");
        cboProfesor.setSelectedItem("SELECCIONAR");
        
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
        jLabel3 = new javax.swing.JLabel();
        cboNivel = new javax.swing.JComboBox<>();
        cboProfesor = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registrar asignatura");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nivel:");

        jLabel2.setText("Profesor:");

        jLabel3.setText("Nombre:");

        cboProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProfesorActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        agregar();
        limpiarCampos();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cboProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProfesorActionPerformed
       
    }//GEN-LAST:event_cboProfesorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboNivel;
    private javax.swing.JComboBox<String> cboProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
