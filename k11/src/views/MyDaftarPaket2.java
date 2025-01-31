/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.PaketController;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import utils.DatabaseUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.DaftarPaket;
import net.proteanit.sql.DbUtils;
import utils.ConstUtil;

public class MyDaftarPaket2 extends javax.swing.JFrame {
private Connection conn;
private PreparedStatement pre;
    /**
     * Creates new form MyDaftarPaket2
     */
    DefaultTableModel model;
    public MyDaftarPaket2() {
        setIcon();
        initComponents();        
        setLocationRelativeTo(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelBG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        btnTambahPaket = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        lblTag = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUbahStatus = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Cari nama:");
        panelBG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 30));

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        panelBG.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 90, 30));

        tabel.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tag", "Nama", "Tanggal Kedatangan", "Pengirim", "Deskripsi", "Detail Paket"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
            tabel.getColumnModel().getColumn(4).setResizable(false);
            tabel.getColumnModel().getColumn(5).setResizable(false);
        }

        panelBG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, 390));

        txtCari.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtCari.setPreferredSize(new java.awt.Dimension(64, 22));
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });
        panelBG.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, 30));

        btnTambahPaket.setBackground(new java.awt.Color(255, 176, 65));
        btnTambahPaket.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnTambahPaket.setText("Tambah Paket");
        btnTambahPaket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTambahPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPaketActionPerformed(evt);
            }
        });
        panelBG.add(btnTambahPaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 100, 30));

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/search.png"))); // NOI18N
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        panelBG.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 30));

        btnHapus.setBackground(new java.awt.Color(255, 176, 65));
        btnHapus.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnHapus.setText("Hapus Paket");
        btnHapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        panelBG.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, 30));

        lblTag.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblTag.setText("-");
        panelBG.add(lblTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, 20));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Selected Tag :");
        panelBG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 100, 20));

        btnUbahStatus.setBackground(new java.awt.Color(255, 176, 65));
        btnUbahStatus.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnUbahStatus.setText("Ubah Status");
        btnUbahStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUbahStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahStatusActionPerformed(evt);
            }
        });
        panelBG.add(btnUbahStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/BGBeranda1.jpg"))); // NOI18N
        panelBG.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Logout telah berhasil",
                                   "LOGOUT", JOptionPane.INFORMATION_MESSAGE);
        
        MyDaftarPaket jy2 = new MyDaftarPaket();
        jy2.show();
        
        dispose(); //Nutup si MyDaftarPaket2
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnTambahPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPaketActionPerformed
        // TODO add your handling code here:
        TambahPaket jb3 = new TambahPaket();
        jb3.show();
        
        dispose(); 
    }//GEN-LAST:event_btnTambahPaketActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_formWindowOpened
    
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_w12?user=root&password=root");
            pre = conn.prepareStatement("SELECT * FROM paket WHERE Nama = ?");
            pre.setString(1, txtCari.getText());
            ResultSet rs = pre.executeQuery();
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel) tabel.getModel();
            tableModel.setRowCount(0);
            while (rs.next()){
                
                tableModel.addRow(new Object[]{
                   rs.getString(1), rs.getString(2), rs.getString(3),
                   rs.getString(4), rs.getString(5), rs.getString(6)
                });

            }

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    PaketController pc = new PaketController();
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String Tag = lblTag.getText();
        
        if (Tag.equals("-")){
            JOptionPane.showMessageDialog(rootPane, "Pilih data yang akan dihapus", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
        if(pc.delete(Tag)){
            JOptionPane.showMessageDialog(rootPane, "Berhasil menghapus data", "Succeed",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Gagal menghapus data", "Error",JOptionPane.ERROR_MESSAGE);
        }
        updateTable();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseReleased
        // TODO add your handling code here:
        int column = 0;
        String value = "";
        try{
        int row = tabel.getSelectedRow();
            value = tabel.getModel().getValueAt(row, column).toString();
            ConstUtil.targetTag = Integer.parseInt(value);
        }catch(Exception ex){
            ConstUtil.targetTag = 0;
        }
        lblTag.setText(value);
        
    }//GEN-LAST:event_tabelMouseReleased

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_w12?user=root&password=root");
            pre = conn.prepareStatement("SELECT * FROM paket WHERE Nama = ?");
            pre.setString(1, txtCari.getText());
            ResultSet rs = pre.executeQuery();
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel) tabel.getModel();
            tableModel.setRowCount(0);
            while (rs.next()){
                
                tableModel.addRow(new Object[]{
                   rs.getString(1), rs.getString(2), rs.getString(3),
                   rs.getString(4), rs.getString(5), rs.getString(6)
                });

            }

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_txtCariKeyPressed

    private void btnUbahStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahStatusActionPerformed
        // TODO add your handling code here:
        String Tag = lblTag.getText();

        if (Tag.equals("-")){
            JOptionPane.showMessageDialog(rootPane, "Pilih terlebih dahulu data yang akan diubah statusnya", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else if(Tag != "-"){
        
        UbahStatus us = new UbahStatus();
        us.show();
        
        dispose(); 
        }

    }//GEN-LAST:event_btnUbahStatusActionPerformed
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
            java.util.logging.Logger.getLogger(MyDaftarPaket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyDaftarPaket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyDaftarPaket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyDaftarPaket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyDaftarPaket2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambahPaket;
    private javax.swing.JButton btnUbahStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTag;
    private javax.swing.JPanel panelBG;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
private void setIcon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Flimenabig.png")));
}

private void tampil(){
    DefaultTableModel dtm = new DefaultTableModel();
        tabel.removeAll();
        tabel.setModel(dtm);
        dtm.addColumn("Tag");
        dtm.addColumn("Nama");
        dtm.addColumn("Tanggal Kedatangan");
        dtm.addColumn("Pengirim");
        dtm.addColumn("Deskripsi");
        dtm.addColumn("Detail Paket");
        
        ArrayList<DaftarPaket> paket = pc.getAll();
        if (paket.size() > 0){
            
            for(DaftarPaket s : paket){
                dtm.addRow(new Object[]{    s.getTag(),
                                           s.getNama(),
                                           s.getTanggalDatang(),
                                           s.getPengirim(),
                                           s.getDeskripsi(),
                                           s.getstatusPaket()});
                tabel.setModel(dtm);
            }
        }
    }

public void updateTable(){
        tabel.removeAll();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Tag");
        dtm.addColumn("Nama");
        dtm.addColumn("Tanggal Kedatangan");
        dtm.addColumn("Pengirim");
        dtm.addColumn("Deskripsi");
        dtm.addColumn("Detail Paket");
        
        tabel.setModel(dtm);
        ArrayList<DaftarPaket> std = pc.getAll();
        for(DaftarPaket s : std){
                dtm.addRow(new Object[]{
                s.getTag(),
                s.getNama(),
                s.getTanggalDatang(),
                s.getPengirim(),
                s.getDeskripsi(),
                s.getstatusPaket()});
            }     
}
}