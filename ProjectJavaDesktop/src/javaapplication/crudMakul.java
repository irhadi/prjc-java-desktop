/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Pradnya
 */
public class crudMakul extends javax.swing.JFrame {

    /**
     * Creates new form crudMhs
     */
    public crudMakul() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnTambahMakul = new javax.swing.JButton();
        jBtnTampilMakul = new javax.swing.JButton();
        jBtnUpdateMakul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnTambahMakul.setText("Tambah");
        jBtnTambahMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTambahMakulActionPerformed(evt);
            }
        });

        jBtnTampilMakul.setText("Tampil");
        jBtnTampilMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTampilMakulActionPerformed(evt);
            }
        });

        jBtnUpdateMakul.setText("Update");
        jBtnUpdateMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateMakulActionPerformed(evt);
            }
        });

        jLabel1.setText("MENU MATAKULIAH");

        jBtnBatal.setText("Batal");
        jBtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jBtnTambahMakul)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnTampilMakul)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnUpdateMakul)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnBatal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTambahMakul)
                    .addComponent(jBtnUpdateMakul)
                    .addComponent(jBtnTampilMakul)
                    .addComponent(jBtnBatal))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnTampilMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTampilMakulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnTampilMakulActionPerformed

    private void jBtnTambahMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTambahMakulActionPerformed
        // TODO add your handling code here:
        fTambahMakul ftm = new fTambahMakul();
        ftm.setVisible(true);
    }//GEN-LAST:event_jBtnTambahMakulActionPerformed

    private void jBtnUpdateMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateMakulActionPerformed
        // TODO add your handling code here:
        fUpdateMakul ftm = new fUpdateMakul();
        ftm.setVisible(true);
    }//GEN-LAST:event_jBtnUpdateMakulActionPerformed

    private void jBtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBatalActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(crudMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudMakul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBatal;
    private javax.swing.JButton jBtnTambahMakul;
    private javax.swing.JButton jBtnTampilMakul;
    private javax.swing.JButton jBtnUpdateMakul;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
