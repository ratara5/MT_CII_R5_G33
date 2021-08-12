package view;


public class VistaReqS_GUI extends javax.swing.JFrame {

    public VistaReqS_GUI() {
        initComponents();
        setLocationRelativeTo(null);
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
        btnReq2 = new javax.swing.JButton();
        btnReq3 = new javax.swing.JButton();
        btnReq1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnReq2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReq2.setText("Requerimiento 2");
        btnReq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReq2ActionPerformed(evt);
            }
        });

        btnReq3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReq3.setText("Requerimiento 3");
        btnReq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReq3ActionPerformed(evt);
            }
        });

        btnReq1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReq1.setText("Requerimiento 1");
        btnReq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReq1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReq1)
                    .addComponent(btnReq3)
                    .addComponent(btnReq2))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReq2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReq3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReq1ActionPerformed
        // TODO add your handling code here:
        VistaReq1_GUI vr = new VistaReq1_GUI();
        vr.setVisible(true);
    }//GEN-LAST:event_btnReq1ActionPerformed

    private void btnReq3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReq3ActionPerformed
        // TODO add your handling code here:
        VistaReq3_GUI vr = new VistaReq3_GUI();
        vr.setVisible(true);
    }//GEN-LAST:event_btnReq3ActionPerformed

    private void btnReq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReq2ActionPerformed
        // TODO add your handling code here:
        VistaReq2_GUI vr = new VistaReq2_GUI();
        vr.setVisible(true);
    }//GEN-LAST:event_btnReq2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaReqS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaReqS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaReqS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaReqS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaReqS_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReq1;
    private javax.swing.JButton btnReq2;
    private javax.swing.JButton btnReq3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
