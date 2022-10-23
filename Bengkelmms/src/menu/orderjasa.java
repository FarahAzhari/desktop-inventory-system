package menu;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class orderjasa extends javax.swing.JFrame {
    private Connection koneksi; 
    private Statement state;
    private ResultSet rs;
    private String namajasa;
    private String namabarang;
    private String namabarang2;
    private String namabarang3;
    private int jumlah;
    private int totalharga;   
    private void listmontir() {
        listmontir.setSelectedItem(1);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
            state   = koneksi.createStatement();
            rs      = state.executeQuery("SELECT nama from statusmontir WHERE status = 'Tersedia' ORDER BY nama");
        while (rs.next()) {
            listmontir.addItem(rs.getString("nama"));
        }
        rs.last();int jumlahdata = rs.getRow(); rs.first();
        } catch (Exception e){
            }
        }
    public orderjasa() {
        initComponents();
        setLocationRelativeTo(null);
        listmontir();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        montir = new javax.swing.JLabel();
        listmontir = new javax.swing.JComboBox<>();
        total = new javax.swing.JLabel();
        listjasa = new javax.swing.JComboBox<>();
        mtr = new javax.swing.JLabel();
        nmcs = new javax.swing.JLabel();
        namacus = new javax.swing.JTextField();
        namamot = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        rincian = new javax.swing.JLabel();
        jasa = new javax.swing.JLabel();
        biayatotal = new javax.swing.JTextField();
        biaya1 = new javax.swing.JTextField();
        biaya2 = new javax.swing.JTextField();
        biaya3 = new javax.swing.JTextField();
        cetak = new javax.swing.JButton();
        rinbiaya = new javax.swing.JLabel();
        biaya4 = new javax.swing.JTextField();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        montir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        montir.setText("MONTIR");
        jPanel1.add(montir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        listmontir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listmontir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jPanel1.add(listmontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total.setText("TOTAL BIAYA");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        listjasa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listjasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servis Bulanan", "Servis 6 Bulan", "Fast Track (Isi Angin+Stel Rantai)", "Cuci Motor" }));
        listjasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listjasaActionPerformed(evt);
            }
        });
        jPanel1.add(listjasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        mtr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mtr.setText("MOTOR");
        jPanel1.add(mtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        nmcs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nmcs.setText("NAMA CUSTOMER");
        jPanel1.add(nmcs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        namacus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namacus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namacusActionPerformed(evt);
            }
        });
        jPanel1.add(namacus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 300, -1));

        namamot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(namamot, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 300, -1));

        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit Logo.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        rincian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rincian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rincian.setText("HITUNG RINCIAN");
        rincian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rincian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rincianMouseClicked(evt);
            }
        });
        jPanel1.add(rincian, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 170, 40));

        jasa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jasa.setText("JENIS JASA");
        jPanel1.add(jasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        biayatotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(biayatotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 300, -1));

        biaya1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(biaya1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 300, -1));

        biaya2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        biaya2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biaya2ActionPerformed(evt);
            }
        });
        jPanel1.add(biaya2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 300, -1));

        biaya3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(biaya3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 300, -1));

        cetak.setBackground(new java.awt.Color(0, 215, 179));
        cetak.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cetak.setForeground(new java.awt.Color(255, 255, 255));
        cetak.setText("SAVE");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        jPanel1.add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 110, 50));

        rinbiaya.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rinbiaya.setText("RINCIAN BIAYA");
        jPanel1.add(rinbiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        biaya4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(biaya4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 300, -1));

        clear.setBackground(new java.awt.Color(215, 0, 0));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 110, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namacusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namacusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namacusActionPerformed

    private void listjasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listjasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listjasaActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
    if (namajasa == "Servis Bulanan") {
                try {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                state = koneksi.createStatement();
                state.executeUpdate("update barang set qty=qty-1 where namabarang ='Oli Repsol'");
                state.executeUpdate("insert into transaksibarang values (NULL,'Oli Repsol','1','Keluar', NOW())");
                state.executeUpdate("insert into orderjasa values (NULL,'"+namacus.getText()+"','"+namamot.getText()+"','"+listmontir.getSelectedItem()+"','"+listjasa.getSelectedItem()+"','"+biayatotal.getText()+"', NOW())");
                state.executeUpdate("update statusmontir set status='Tidak Tersedia' where nama ='"
                                    +listmontir.getSelectedItem()+"'");
                JOptionPane.showMessageDialog(null, "Data berhasil di input.");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal di input."+ e);
                }
           
    } else if (namajasa == "Servis 6 Bulan") {
                try {
                 Class.forName("com.mysql.jdbc.Driver");
                 koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                 state = koneksi.createStatement();
                 state.executeUpdate("update barang set qty=qty-1 where namabarang ='Oli Repsol'");
                 state.executeUpdate("update barang set qty=qty-1 where namabarang ='Rantai'");
                 state.executeUpdate("update barang set qty=qty-1 where namabarang ='Rem'");
                 state.executeUpdate("insert into transaksibarang values (NULL,'Oli Repsol','1','Keluar', NOW())");
                 state.executeUpdate("insert into transaksibarang values (NULL,'Rantai','1','Keluar', NOW())");
                 state.executeUpdate("insert into transaksibarang values (NULL,'Rem','1','Keluar', NOW())");
                 state.executeUpdate("insert into orderjasa values (NULL,'"+namacus.getText()+"','"+namamot.getText()+"','"+listmontir.getSelectedItem()+"','"+listjasa.getSelectedItem()+"','"+biayatotal.getText()+"', NOW())");
                 state.executeUpdate("update statusmontir set status='Tidak Tersedia' where nama ='"
                                     +listmontir.getSelectedItem()+"'");
                JOptionPane.showMessageDialog(null, "Data berhasil di input.");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal di input."+ e);
                }
           
    } else if (namajasa == "Fast Track (Isi Angin+Stel Rantai)") {
                try {
                     Class.forName("com.mysql.jdbc.Driver");
                     koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                     state = koneksi.createStatement();
                     state.executeUpdate("insert into orderjasa values (NULL,'"+namacus.getText()+"','"+namamot.getText()+"','"+listmontir.getSelectedItem()+"','"+listjasa.getSelectedItem()+"','"+biayatotal.getText()+"', NOW())");
                     state.executeUpdate("update statusmontir set status='Tidak Tersedia' where nama ='"
                                         +listmontir.getSelectedItem()+"'");
                 JOptionPane.showMessageDialog(null, "Data berhasil di input.");
                 }
                 catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "Data gagal di input."+ e);
                 }
           
    } else if (namajasa == "Cuci Motor") {
                try {
                     Class.forName("com.mysql.jdbc.Driver");
                     koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                     state = koneksi.createStatement();
                     state.executeUpdate("insert into orderjasa values (NULL,'"+namacus.getText()+"','"+namamot.getText()+"','"+listmontir.getSelectedItem()+"','"+listjasa.getSelectedItem()+"','"+biayatotal.getText()+"', NOW())");
                     state.executeUpdate("update statusmontir set status='Tidak Tersedia' where nama ='"
                                         +listmontir.getSelectedItem()+"'");
                 JOptionPane.showMessageDialog(null, "Data berhasil di input.");
                 }
                 catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "Data gagal di input."+ e);
       }
   }
        orderjasa oj = new orderjasa();
        oj.setVisible(true);
        oj.pack();
        oj.setDefaultCloseOperation(Login.EXIT_ON_CLOSE); 
        this.dispose();
    }//GEN-LAST:event_cetakActionPerformed

    private void biaya2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biaya2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biaya2ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    namacus.setText("");
    namamot.setText("");
    listmontir.setSelectedItem(0);
    listjasa.setSelectedItem(0);
    biaya1.setText("");
    biaya2.setText("");
    biaya3.setText("");
    biaya4.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void rincianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rincianMouseClicked
    biaya1.setText("");
    biaya2.setText("");
    biaya3.setText("");
    namajasa = (String)listjasa.getSelectedItem();
    namabarang = null;
    namabarang2 = null;
    namabarang3 = null;
    jumlah = 0;
       if (namajasa == "Servis Bulanan") {
           biaya1.setText("Oli 50000");
           biaya2.setText("Isi Angin + Stel Rantai 10000");
           biaya3.setText("1 Set Rem 40000");
           biayatotal.setText("100000");
       } else if (namajasa == "Servis 6 Bulan") {
           biaya1.setText("Oli 50000");
           biaya2.setText("Rantai 160000");
           biaya3.setText("1 Set Rem 40000");
           biayatotal.setText("250000");
       } else if (namajasa == "Fast Track (Isi Angin+Stel Rantai)") {
           biaya1.setText("Isi Angin + Stel Rantai 10000");
           biayatotal.setText("10000");
       } else if (namajasa == "Cuci Motor") {
           biaya1.setText("Cuci Motor 15000");
           biayatotal.setText("15000");
       }
    }//GEN-LAST:event_rincianMouseClicked

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
            java.util.logging.Logger.getLogger(orderjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderjasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biaya1;
    private javax.swing.JTextField biaya2;
    private javax.swing.JTextField biaya3;
    private javax.swing.JTextField biaya4;
    private javax.swing.JTextField biayatotal;
    private javax.swing.JButton cetak;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jasa;
    private javax.swing.JComboBox<String> listjasa;
    private javax.swing.JComboBox<String> listmontir;
    private javax.swing.JLabel montir;
    private javax.swing.JLabel mtr;
    private javax.swing.JTextField namacus;
    private javax.swing.JTextField namamot;
    private javax.swing.JLabel nmcs;
    private javax.swing.JLabel rinbiaya;
    private javax.swing.JLabel rincian;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
