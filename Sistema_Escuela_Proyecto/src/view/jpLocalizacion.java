/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.SwingConstants;

/**
 *
 * @author Katherine Rodriguez
 */
public class jpLocalizacion extends javax.swing.JPanel {

    /**
     * Creates new form jmLocalizacion
     */
    public jpLocalizacion() {
        initComponents();
        this.texto.setHorizontalAlignment(SwingConstants.CENTER);
        this.texto.setVerticalAlignment(SwingConstants.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal3 = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        texto.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        texto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto.setText("Estamos ubicados 200 metros oeste y 150 metros sur del Colegio de Licenciados y Profesores. Calle La Claudia, Desamparados de Alajuela.");
        texto.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mapa.png"))); // NOI18N

        javax.swing.GroupLayout jpPrincipal3Layout = new javax.swing.GroupLayout(jpPrincipal3);
        jpPrincipal3.setLayout(jpPrincipal3Layout);
        jpPrincipal3Layout.setHorizontalGroup(
            jpPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipal3Layout.createSequentialGroup()
                .addGroup(jpPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipal3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 1349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipal3Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jpPrincipal3Layout.setVerticalGroup(
            jpPrincipal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipal3Layout.createSequentialGroup()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 306, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpPrincipal3;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}