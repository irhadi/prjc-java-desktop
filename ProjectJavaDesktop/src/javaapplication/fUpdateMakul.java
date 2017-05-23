/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane.*;
/**
 *
 * @author student
 */
public final class fUpdateMakul extends javax.swing.JFrame {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    /**
     * Creates new form Praktik1
     */
    public fUpdateMakul() {
        initComponents();
        setKosongkan();
        
        koneksi("localhost","sin_praktikum","root","");
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
    
    void setKosongkan(){
        jTxtKdMakul.setText(null);
        jTxtNamaMakul.setText(null);
        jTxtSks.setText(null);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtKdMakul = new javax.swing.JTextField();
        jTxtNamaMakul = new javax.swing.JTextField();
        jTxtSks = new javax.swing.JTextField();
        jBtnUpdateMakul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPpesan = new javax.swing.JTextPane();
        jbtnCariMakul = new javax.swing.JButton();
        jBtnHapusMakul = new javax.swing.JButton();
        jBtnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Matakuliah");

        jLabel2.setText("Nama Matakuliah");

        jLabel3.setText("Jumlah SKS");

        jBtnUpdateMakul.setText("Update");
        jBtnUpdateMakul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnUpdateMakulMouseClicked(evt);
            }
        });
        jBtnUpdateMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateMakulActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTPpesan);

        jbtnCariMakul.setText("Cari");
        jbtnCariMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCariMakulActionPerformed(evt);
            }
        });

        jBtnHapusMakul.setText("Hapus");
        jBtnHapusMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHapusMakulActionPerformed(evt);
            }
        });

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
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnUpdateMakul)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtKdMakul, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jTxtNamaMakul)
                            .addComponent(jTxtSks))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnCariMakul))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnHapusMakul)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnBatal)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtKdMakul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCariMakul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNamaMakul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUpdateMakul)
                    .addComponent(jBtnHapusMakul)
                    .addComponent(jBtnBatal))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnUpdateMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateMakulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUpdateMakulActionPerformed

    private void jBtnUpdateMakulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnUpdateMakulMouseClicked
        // TODO add your handling code here:
        String sql="UPDATE tbl_matakuliah "+
                   "SET nama_makul='"+jTxtNamaMakul.getText()+ "', " +
                   "jml_sks="+jTxtSks.getText()+ 
                   " WHERE kode_makul='"+jTxtKdMakul.getText()+"';";
                     
        try {
            st = conn.createStatement();
            st.execute(sql); //menjalankan query
        }catch (SQLException e){
            System.err.println("SQLException");
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this,"Data  gagal diupdate");
            setKosongkan();
            jTxtKdMakul.requestFocus();
            return;
        } 
            
            
        JOptionPane.showMessageDialog(this,"Data berhasil diupdate");
        setKosongkan();
        jTxtKdMakul.requestFocus();
                    
    }//GEN-LAST:event_jBtnUpdateMakulMouseClicked

    private void jbtnCariMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCariMakulActionPerformed
        // TODO add your handling code here:
        String sql="SELECT * FROM tbl_matakuliah WHERE kode_Makul='"+jTxtKdMakul.getText()+"'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex){
            System.out.printf("Kesalahan Query" + sql);
        }
        
        int size = 0;
        try{
            while (rs.next()){
                size++;
                jTxtNamaMakul.setText(rs.getString("nama_makul").toString());
                jTxtSks.setText(rs.getString("jml_sks").toString());
            }
            if(size==0){
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
                return;
            }
            rs.close();
            st.close();
        } catch(SQLException ex){
        
        }
    }//GEN-LAST:event_jbtnCariMakulActionPerformed

    private void jBtnHapusMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHapusMakulActionPerformed
        // TODO add your handling code here:
        String sql="DELETE FROM tbl_matakuliah WHERE kode_makul='"+jTxtKdMakul.getText()+"'";
        try {
            st = conn.createStatement();
            st.execute(sql); //menjalankan query
            
        } catch (SQLException e){ //jika gagal menghapus
            JOptionPane.showMessageDialog(this, "Penghapusan Gagal");
            setKosongkan();
            jTxtKdMakul.requestFocus();
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
        setKosongkan();
        jTxtKdMakul.requestFocus();
    }//GEN-LAST:event_jBtnHapusMakulActionPerformed

    private void jBtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBatalActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(fUpdateMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fUpdateMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fUpdateMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fUpdateMakul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new fUpdateMakul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBatal;
    private javax.swing.JButton jBtnHapusMakul;
    private javax.swing.JButton jBtnUpdateMakul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTPpesan;
    private javax.swing.JTextField jTxtKdMakul;
    private javax.swing.JTextField jTxtNamaMakul;
    private javax.swing.JTextField jTxtSks;
    private javax.swing.JButton jbtnCariMakul;
    // End of variables declaration//GEN-END:variables
}