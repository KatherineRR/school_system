/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ctrlAdmin;
import control.ctrlAlumnos;
import control.ctrlProfesor;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Katherine Rodriguez
 */
public class Principal extends javax.swing.JFrame {

    private JPanel jpLocali;
    private JPanel jpCaract;
    private JPanel jpInsta;
    private JPanel jpServicios;
    private JPanel jpInfo;
    private JPanel jpProyectos;
    private JPanel jPrincipal;
    
    private ctrlAlumnos ct;
    private ctrlProfesor cp;
    private ctrlAdmin cad;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.jpLocali = new jpLocalizacion();
        this.jpCaract = new jpCaracteristicas();
        this.jpInsta = new jpInstalaciones();
        this.jpServicios = new jpServicios();
        this.jpInfo = new jpInformacion();
        this.jpProyectos = new jpProyectos();
        this.jPrincipal = jpPrincipal;
        this.ct = new ctrlAlumnos();
        this.cp = new ctrlProfesor();
        this.cad = new ctrlAdmin();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jpPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnInicio = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboUsuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmLocalizacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmCaracteristicas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmInstalaciones = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmServicios = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmInformacion = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmProyectos = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmIniciar = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        btnInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInicio.setText("Iniciar sesión");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        cboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Administrador", "Alumno/Padre", "Profesor" }));
        cboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de usuario:");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel4.setText("Centro Educativo  Monte Alegre");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(61, 61, 61))))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(btnInicio))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(549, 549, 549)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(591, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(592, 592, 592)
                        .addComponent(jLabel3))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(604, 604, 604)
                        .addComponent(jLabel2))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(585, 585, 585)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio)
                .addGap(234, 234, 234))
        );

        jMenu1.setText("Localización");

        jmLocalizacion.setText("Localización");
        jmLocalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLocalizacionActionPerformed(evt);
            }
        });
        jMenu1.add(jmLocalizacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Caracteristicas");

        jmCaracteristicas.setText("Caracteristicas");
        jmCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCaracteristicasActionPerformed(evt);
            }
        });
        jMenu2.add(jmCaracteristicas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Instalaciones");

        jmInstalaciones.setText("Instalaciones");
        jmInstalaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInstalacionesActionPerformed(evt);
            }
        });
        jMenu3.add(jmInstalaciones);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Servicios");

        jmServicios.setText("Servicios");
        jmServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmServiciosActionPerformed(evt);
            }
        });
        jMenu4.add(jmServicios);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Información");

        jmInformacion.setText("Información");
        jmInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInformacionActionPerformed(evt);
            }
        });
        jMenu5.add(jmInformacion);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Proyectos de Escuela");

        jmProyectos.setText("Proyectos");
        jmProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProyectosActionPerformed(evt);
            }
        });
        jMenu6.add(jmProyectos);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Iniciar Sesión");

        jmIniciar.setText("Inicio Sesión");
        jmIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIniciarActionPerformed(evt);
            }
        });
        jMenu7.add(jmIniciar);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        int r;
        if (cboUsuario.getSelectedItem().equals("Alumno/Padre")){
            r = ct.validarLogin(txtUsuario.getText(), txtContraseña.getText());
            if (r != 0){
                this.setVisible(false);
                AlumnoPrincipal pp = new AlumnoPrincipal(r); 
                pp.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        }else if (cboUsuario.getSelectedItem().equals("Profesor")){
            r = cp.validarLogin(txtUsuario.getText(), txtContraseña.getText());
            if (r != 0){
                this.setVisible(false);
                ProfePrincipal pp = new ProfePrincipal(r); 
                pp.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        }else if (cboUsuario.getSelectedItem().equals("Administrador")){
            r = cad.validarLogin(txtUsuario.getText(), txtContraseña.getText());
            if (r != 0){
                this.setVisible(false);
                AdminPrincipal pp = new AdminPrincipal(); 
                pp.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
            
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jmLocalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLocalizacionActionPerformed

        this.jpPrincipal.setVisible(false);
        this.jpCaract.setVisible(false);
        this.jpInsta.setVisible(false);
        this.jpServicios.setVisible(false);
        this.jpInfo.setVisible(false);
        this.jpProyectos.setVisible(false);
        
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        this.getContentPane().add(this.jpLocali);
        this.jpLocali.setVisible(true);
        
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jmLocalizacionActionPerformed

    private void jmCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCaracteristicasActionPerformed

        this.jpPrincipal.setVisible(false);
        this.jpLocali.setVisible(false);
        this.jpInsta.setVisible(false);
        this.jpServicios.setVisible(false);
        this.jpInfo.setVisible(false);
        this.jpProyectos.setVisible(false);
        
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        this.getContentPane().add(this.jpCaract);
        this.jpCaract.setVisible(true);
        
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jmCaracteristicasActionPerformed

    private void jmInstalacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInstalacionesActionPerformed

        this.jpPrincipal.setVisible(false);
        this.jpLocali.setVisible(false);
        this.jpCaract.setVisible(false);
        this.jpServicios.setVisible(false);
        this.jpInfo.setVisible(false);
        this.jpProyectos.setVisible(false);
        
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        this.getContentPane().add(this.jpInsta);
        this.jpInsta.setVisible(true);
        
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jmInstalacionesActionPerformed

    private void jmServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmServiciosActionPerformed

        this.jpPrincipal.setVisible(false);
        this.jpLocali.setVisible(false);
        this.jpCaract.setVisible(false);
        this.jpInsta.setVisible(false);
        this.jpInfo.setVisible(false);
        this.jpProyectos.setVisible(false);
               
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        this.getContentPane().add(this.jpServicios);
        this.jpServicios.setVisible(true);
        
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jmServiciosActionPerformed

    private void jmInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInformacionActionPerformed

        this.jpPrincipal.setVisible(false);
        this.jpLocali.setVisible(false);
        this.jpCaract.setVisible(false);
        this.jpInsta.setVisible(false);
        this.jpServicios.setVisible(false);
        this.jpProyectos.setVisible(false);
        
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        this.getContentPane().add(this.jpInfo);
        this.jpInfo.setVisible(true);
        
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jmInformacionActionPerformed

    private void jmProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProyectosActionPerformed

        this.jpPrincipal.setVisible(false);
        this.jpLocali.setVisible(false);
        this.jpCaract.setVisible(false);
        this.jpInsta.setVisible(false);
        this.jpServicios.setVisible(false);
        this.jpInfo.setVisible(false);
        
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        this.getContentPane().add(this.jpProyectos);
        this.jpProyectos.setVisible(true);
        
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jmProyectosActionPerformed

    private void jmIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIniciarActionPerformed
        this.jPrincipal.setVisible(true);
               
        this.pack();
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jmIniciarActionPerformed

    private void cboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JComboBox<String> cboUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmCaracteristicas;
    private javax.swing.JMenuItem jmInformacion;
    private javax.swing.JMenuItem jmIniciar;
    private javax.swing.JMenuItem jmInstalaciones;
    private javax.swing.JMenuItem jmLocalizacion;
    private javax.swing.JMenuItem jmProyectos;
    private javax.swing.JMenuItem jmServicios;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}