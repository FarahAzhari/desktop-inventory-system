package menu;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
public class orderbarang extends javax.swing.JFrame {
    private Connection koneksi; 
    private Statement state;
    private ResultSet rs;
    private DefaultTableModel model;
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
    
    private void listbarang() { 
        model = new DefaultTableModel();
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah Barang");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
            state   = koneksi.createStatement();
            rs      = state.executeQuery("SELECT namabarang from barang ORDER BY namabarang");
        while (rs.next()) {
            model.addRow(new Object[]{
             rs.getString("namabarang")
                     });}
        tablebarang.setModel(model);
    
        } catch (Exception e){
            }
        }
    private void keranjang() { 
        model = new DefaultTableModel();
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Harga");
    try{
        Class.forName("com.mysql.jdbc.Driver");
        koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
        state   = koneksi.createStatement();
        rs      = state.executeQuery("SELECT namabrg, qty, harga from cart ORDER BY namabrg");
    while (rs.next()) {
        model.addRow(new Object[]{
         rs.getString("namabrg"),
         rs.getString("qty"),
         rs.getString("harga")
                 });}
    tablekeranjang.setModel(model);
    } catch (Exception e){
        }
    }
    public orderbarang() {
        initComponents();
        setLocationRelativeTo(null);
        listbarang();
        keranjang();
        listmontir();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nmcs1 = new javax.swing.JLabel();
        listbarang = new javax.swing.JLabel();
        namacus = new javax.swing.JTextField();
        montir = new javax.swing.JLabel();
        listmontir = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablekeranjang = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablebarang = new javax.swing.JTable();
        checkout = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cart = new javax.swing.JLabel();
        REFRESHTABLE = new javax.swing.JButton();
        tota = new javax.swing.JButton();
        totalharga = new javax.swing.JTextField();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(729, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nmcs1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nmcs1.setText("NAMA CUSTOMER");
        jPanel1.add(nmcs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        listbarang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listbarang.setText("LIST BARANG");
        jPanel1.add(listbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        namacus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namacus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namacusActionPerformed(evt);
            }
        });
        jPanel1.add(namacus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 300, -1));

        montir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        montir.setText("MONTIR");
        jPanel1.add(montir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        listmontir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listmontir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jPanel1.add(listmontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        tablekeranjang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablekeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablekeranjang);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 270, 320));

        clear.setBackground(new java.awt.Color(215, 0, 0));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR CART");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 130, 50));

        tablebarang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablebarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablebarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebarangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablebarangMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tablebarang);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, 320));

        checkout.setBackground(new java.awt.Color(0, 215, 179));
        checkout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkout.setText("CHECKOUT");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        jPanel1.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 130, 50));

        delete.setBackground(new java.awt.Color(215, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 130, 50));

        cart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cart.setText("KERANJANG");
        jPanel1.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, 20));

        REFRESHTABLE.setBackground(new java.awt.Color(0, 149, 215));
        REFRESHTABLE.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        REFRESHTABLE.setForeground(new java.awt.Color(255, 255, 255));
        REFRESHTABLE.setText("REFRESH");
        REFRESHTABLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHTABLEActionPerformed(evt);
            }
        });
        jPanel1.add(REFRESHTABLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        tota.setBackground(new java.awt.Color(0, 0, 0));
        tota.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tota.setForeground(new java.awt.Color(255, 255, 255));
        tota.setText("TOTAL");
        tota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaActionPerformed(evt);
            }
        });
        jPanel1.add(tota, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        totalharga.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        totalharga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalhargaActionPerformed(evt);
            }
        });
        jPanel1.add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 130, 30));

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
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namacusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namacusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namacusActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
            try {
                     Class.forName("com.mysql.jdbc.Driver");
                     koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                     state = koneksi.createStatement();
                     state.executeUpdate("TRUNCATE TABLE cart");
                 JOptionPane.showMessageDialog(null, "Keranjang berhasil dikosongkan");
                 }
                 catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "Gagal."+ e);
            }
            totalharga.setText("0");
            keranjang();
    }//GEN-LAST:event_clearActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
    String nb;
    int qt;
    int hrg;
        try {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                state = koneksi.createStatement();
                for (int i=0;i<tablekeranjang.getRowCount();i++){
                    //refresh nilai variable
                   
                    
                    nb = tablekeranjang.getValueAt(i,0).toString();
                    qt = Integer.valueOf(tablekeranjang.getValueAt(i,1).toString());
                    hrg = Integer.valueOf(tablekeranjang.getValueAt(i,2).toString());
                    
                    state.executeUpdate("update barang set qty=qty-"+qt+" where namabarang ='"+nb+"'");
                    state.executeUpdate("insert into transaksibarang values (NULL,'"+nb+"','"+qt+"','Keluar', NOW())");
                    state.executeUpdate("insert into orderbarang values (NULL,'"+namacus.getText()+"','"+listmontir.getSelectedItem()+"','"+nb+"','"+qt+"','"+hrg+"', NOW())");
                } //masukan data perbaris
                state.executeUpdate("TRUNCATE TABLE cart"); //mengosongkan cart
                JOptionPane.showMessageDialog(null, "Data berhasil di input.");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal di input."+ e);
                }
    keranjang(); listbarang();
    }//GEN-LAST:event_checkoutActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    int x = tablekeranjang.getSelectedRow();
    String namabrgcart = tablekeranjang.getValueAt (x,0).toString();  
    try {
                     Class.forName("com.mysql.jdbc.Driver");
                     koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                     state = koneksi.createStatement();
                     state.executeUpdate("delete from cart WHERE namabrg = '"+namabrgcart+"'");
                 }
    catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "Gagal."+ e);
    }
    try {
        model.removeRow(x);
        JOptionPane.showMessageDialog(null, "Barang dihapus dari keranjang");
    }
    //menghapus row
    catch (Exception e){
            }
    }//GEN-LAST:event_deleteActionPerformed

    private void tablebarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebarangMousePressed
    
    }//GEN-LAST:event_tablebarangMousePressed

    private void tablebarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebarangMouseClicked
    int r = tablebarang.getSelectedRow();
    String namabrg = tablebarang.getValueAt (r,0).toString(); //mengambil nama barang dari table barang
    int jumlah = Integer.valueOf(tablebarang.getValueAt (r,1).toString()); //mengambil jumlah dari table barang
    int harga = 0; //membuat variabel harga
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
            state   = koneksi.createStatement();
            rs      = state.executeQuery("SELECT harga from barang WHERE namabarang = '"+namabrg+"'");

            while (rs.next()) {
            harga = rs.getInt("harga"); //mengambil nilai harga dari database barang
            }
        } catch (Exception e){
            }
    int sum = jumlah * harga;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
                    state = koneksi.createStatement();
                    state.executeUpdate("insert into cart values ('"+namabrg+"','"+jumlah+"','"+sum+"')");
                    //menginput nilai ke db cart
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal di input."+ e);
                }
    keranjang();
    }//GEN-LAST:event_tablebarangMouseClicked

    private void totaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaActionPerformed
        String tothar = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bengkelmms", "root", "");
            state   = koneksi.createStatement();
            rs      = state.executeQuery("SELECT SUM(harga) AS totalprice from cart");

            while (rs.next()) {
            tothar = rs.getString("totalprice"); //mengambil total harga dari database barang
            }
        } catch (Exception e){
            }
        totalharga.setText(tothar);
    }//GEN-LAST:event_totaActionPerformed

    private void REFRESHTABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHTABLEActionPerformed
    listbarang(); keranjang();
    }//GEN-LAST:event_REFRESHTABLEActionPerformed

    private void totalhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalhargaActionPerformed
    
    }//GEN-LAST:event_totalhargaActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed
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
            java.util.logging.Logger.getLogger(orderbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REFRESHTABLE;
    private javax.swing.JLabel cart;
    private javax.swing.JButton checkout;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel listbarang;
    private javax.swing.JComboBox<String> listmontir;
    private javax.swing.JLabel montir;
    private javax.swing.JTextField namacus;
    private javax.swing.JLabel nmcs1;
    private javax.swing.JTable tablebarang;
    private javax.swing.JTable tablekeranjang;
    private javax.swing.JButton tota;
    private javax.swing.JTextField totalharga;
    // End of variables declaration//GEN-END:variables
}
