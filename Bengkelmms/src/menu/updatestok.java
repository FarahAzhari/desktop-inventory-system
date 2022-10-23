package menu;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class updatestok extends javax.swing.JFrame {
    private Connection koneksi; 
    private Statement state;
    private ResultSet   rs;
    private void listbarangG() {
        listb.setSelectedItem(1);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
            state   = koneksi.createStatement();
            rs      = state.executeQuery("SELECT namabarang from barang ORDER BY namabarang");   
        while (rs.next()) {
            listb.addItem(rs.getString("namabarang"));
        }
        rs.last();int jumlahdata = rs.getRow(); rs.first();
        } catch (Exception e){
            }
    }
    public updatestok() {
        initComponents();
        listbarangG();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        nama = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        listb = new javax.swing.JComboBox<>();
        buttonupdate = new javax.swing.JButton();
        stok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit Logo.png"))); // NOI18N
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setOpaque(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 40));

        nama.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nama.setText("NAMA BARANG");
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        status.setText("JUMLAH STOK");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        listb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbActionPerformed(evt);
            }
        });
        jPanel1.add(listb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        buttonupdate.setBackground(new java.awt.Color(215, 0, 0));
        buttonupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonupdate.setText("UPDATE");
        buttonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonupdateActionPerformed(evt);
            }
        });
        jPanel1.add(buttonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        stok.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        stok.setText(" ");
        stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokActionPerformed(evt);
            }
        });
        jPanel1.add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void listbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listbActionPerformed

    private void buttonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonupdateActionPerformed
    try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
            state = koneksi.createStatement();
            state.executeUpdate("update barang set qty=qty+"+stok.getText()+" where namabarang ='"+listb.getSelectedItem()+"'");
            state.executeUpdate("insert into transaksibarang values (NULL,'"+listb.getSelectedItem()+"','"+stok.getText()+"','Masuk', NOW())");
            JOptionPane.showMessageDialog(null, "STOK BERHASIL DITAMBAHKAN");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL!"+ e);
    }
    }//GEN-LAST:event_buttonupdateActionPerformed

    private void stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokActionPerformed
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
            java.util.logging.Logger.getLogger(updatestok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatestok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatestok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatestok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatestok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton buttonupdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listb;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel status;
    private javax.swing.JTextField stok;
    // End of variables declaration//GEN-END:variables
}
