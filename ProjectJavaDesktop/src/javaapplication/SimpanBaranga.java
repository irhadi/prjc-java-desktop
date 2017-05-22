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
public final class SimpanBaranga extends javax.swing.JFrame {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    /**
     * Creates new form Praktik1
     */
    public SimpanBaranga() {
        initComponents();
        setKosongkan();
        
        koneksi("localhost","penjualan","root","");
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
        jTxtKode.setText(null);
        jTxtNmBarang.setText(null);
        jTxtSatuan.setText(null);
        jTxtHarga.setText(null);
        jTxtStok.setText(null);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtKode = new javax.swing.JTextField();
        jTxtNmBarang = new javax.swing.JTextField();
        jTxtSatuan = new javax.swing.JTextField();
        jTxtHarga = new javax.swing.JTextField();
        jTxtStok = new javax.swing.JTextField();
        jBtnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPpesan = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Satuan");

        jLabel4.setText("Harga");

        jLabel5.setText("Stok");

        jBtnSimpan.setText("Simpan");
        jBtnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnSimpanMouseClicked(evt);
            }
        });
        jBtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSimpanActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTPpesan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSimpan)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTxtKode)
                        .addComponent(jTxtNmBarang)
                        .addComponent(jTxtSatuan)
                        .addComponent(jTxtHarga)
                        .addComponent(jTxtStok, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNmBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTxtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jBtnSimpan)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSimpanActionPerformed

    private void jBtnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSimpanMouseClicked
        // TODO add your handling code here:
        String sql="INSERT into barang (kd_brg, nm_brg, satuan, harga, stok)VALUE('"+ 
                jTxtKode.getText()+"','"+
                jTxtNmBarang.getText()+"','"+
                jTxtSatuan.getText()+"',"+
                jTxtHarga.getText()+","+
                jTxtStok.getText()+");";
                     
        try {
            st = conn.createStatement();
            st.execute(sql); //menjalankan query
        } catch (SQLException e){
            setKosongkan();
            jTxtKode.requestFocus();
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Data berhasil disimpan");
        setKosongkan();
        jTxtKode.requestFocus();
                    
    }//GEN-LAST:event_jBtnSimpanMouseClicked

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
            java.util.logging.Logger.getLogger(SimpanBaranga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpanBaranga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpanBaranga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpanBaranga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new SimpanBaranga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTPpesan;
    private javax.swing.JTextField jTxtHarga;
    private javax.swing.JTextField jTxtKode;
    private javax.swing.JTextField jTxtNmBarang;
    private javax.swing.JTextField jTxtSatuan;
    private javax.swing.JTextField jTxtStok;
    // End of variables declaration//GEN-END:variables
}
