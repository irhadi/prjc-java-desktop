/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.sql.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pradnya
 */
public class fLihatNilai extends javax.swing.JFrame {
    public Connection conn;
    public Statement st;
    /**
     * Creates new form fTampilMakul
     */
    public fLihatNilai() {
        initComponents();
        TampilData();
        
    }
    
    void koneksi(String server, String db, String user, String passwd){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            //System.out.print("Driver tidak bisa di load\n");
            jTPpesan.setText("Driver tidak bisa di load");
            e.printStackTrace();
            return;
        }
            //System.out.print("Driver berhasil di load\n");
            jTPpesan.setText("Driver berhasil di load");
            conn=null;
            try {
                conn=DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+db,user,passwd);    
            } catch (SQLException s){
                //System.out.print("Tidak Berhasil koneksi\n");
                jTPpesan.setText("Tidak Berhasil koneksi");
                s.printStackTrace();
                return;
            }
            //System.out.print("Driver di Load dan Koneksi berhasil\n");
            jTPpesan.setText("Driver di Load dan Koneksi berhasil");
    }
     
    public void TampilData (){
      DefaultTableModel TableData = new DefaultTableModel();
        TableData.addColumn("ID Nilai");
        TableData.addColumn("NIM");
        TableData.addColumn("Kelas");
        TableData.addColumn("Asisten");
        TableData.addColumn("Dosen");
        TableData.addColumn("Lp 1");
        TableData.addColumn("Lp 2");
        TableData.addColumn("Lp 3");
        TableData.addColumn("Lp 4");
        TableData.addColumn("Lp 5");
        TableData.addColumn("Lp 6");
        TableData.addColumn("Lp 7");
        TableData.addColumn("Lp 8");
        TableData.addColumn("Lp 9");
        TableData.addColumn("Lp 10");
        TableData.addColumn("Lp 11");
        TableData.addColumn("Lp 12");
        TableData.addColumn("Lp 13");
        TableData.addColumn("Lp 14");
        TableData.addColumn("Responsi");
       
        try {
            koneksi("localhost","sin_praktikum","root","");
            String sql = "select * from tbl_nilai WHERE nim="+jTxtNim.getText()+";";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql); //menjalankan query
            while (rs.next()) {
                TableData.addRow(new Object[]{rs.getString(1),rs.getString(2),
                rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),
                rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),
                rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),
                rs.getString(19),rs.getString(20)});
            }
           jTblNilai.setModel(TableData);
        } catch (Exception e) {
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblNilai = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPpesan = new javax.swing.JTextPane();
        jBtnTutup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtNim = new javax.swing.JTextField();
        jBtnLihat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LIHAT NILAI");

        jTblNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Nilai", "NIM", "Kelas", "Asisten", "Dosen", "Lp 1", "Lp 2", "Lp 3", "Lp 4", "Lp 5", "Lp 6", "Lp 7", "Lp 8", "Lp 9", "Lp 10", "Lp 11", "Lp 12", "Lp 13", "Lp 14", "Responsi"
            }
        ));
        jScrollPane1.setViewportView(jTblNilai);

        jScrollPane2.setViewportView(jTPpesan);

        jBtnTutup.setText("Tutup");
        jBtnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTutupActionPerformed(evt);
            }
        });

        jLabel2.setText("Masukan NIM");

        jBtnLihat.setText("Lihat");
        jBtnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLihatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnTutup))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(508, 508, 508)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnLihat)))
                        .addGap(0, 520, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnTutup))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnLihat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTutupActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnTutupActionPerformed

    private void jBtnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLihatActionPerformed
        // TODO add your handling code here:
        TampilData();
    }//GEN-LAST:event_jBtnLihatActionPerformed

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
            java.util.logging.Logger.getLogger(fLihatNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fLihatNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fLihatNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fLihatNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fLihatNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLihat;
    private javax.swing.JButton jBtnTutup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTPpesan;
    private javax.swing.JTable jTblNilai;
    private javax.swing.JTextField jTxtNim;
    // End of variables declaration//GEN-END:variables
}