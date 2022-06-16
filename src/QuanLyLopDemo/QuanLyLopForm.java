/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyLopDemo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QuanLyLopForm extends javax.swing.JFrame {
    private ArrayList<Lop> list = new ArrayList<>();
    private DefaultTableModel tblModel = new DefaultTableModel();
    private String maGv;
    private IOFile file;
    /**
     * Creates new form QuanLyLopForm
     */
    public QuanLyLopForm(String maGv) {
        initComponents(); 
        
        this.maGv = maGv;
        
        txtMaGV.setText(maGv);
        
        file = new IOFile();
        
        list = file.doc("dbLop.txt");
        
        initTable();
        
        fillTable();
        
        initNganh();
        

    }

    private QuanLyLopForm() {
        
    }
    private void initNganh(){
        String[] nganh = new String[]{"CNTT","Điện tử","Du Lịch","May"};
        DefaultComboBoxModel<String> cbxModel = new DefaultComboBoxModel<>(nganh);
        
        cbxNganh.setModel(cbxModel);
    }
    private void fillTable(){
        tblModel.setRowCount(0);
        
        for(Lop lop : list){
            if(lop.getMaGiaoVien().equals(txtMaGV.getText())){
                tblModel.addRow(new Object[]{lop.getMaLop(),lop.getTenlop(),lop.getNganh(),lop.getKhoa(),lop.getSoSinhVien()});
            }
        }
        
        tblModel.fireTableDataChanged();
    }
    private void initTable(){
        String[] cot = new String[]{"Mã Lớp","Tên Lớp","Ngành","Khóa","Sĩ Số"};
        
        tblModel.setColumnIdentifiers(cot);
        
        tblLop.setModel(tblModel);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKhoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSiSo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLop = new javax.swing.JTable();
        btnXemDS = new javax.swing.JButton();
        cbxNganh = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        txtMaGV = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Lớp Học");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã lớp:");

        txtMaLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên lớp: ");

        txtTenLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLopActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ngành:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Khóa:");

        txtKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Sĩ số:");

        txtSiSo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLopMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLop);

        btnXemDS.setText("Xem Danh Sách Lớp");
        btnXemDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDSActionPerformed(evt);
            }
        });

        cbxNganh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNganhActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnNhapMoi.setText("Nhập Mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        txtMaGV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaGV.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTenLop)
                                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxNganh, 0, 177, Short.MAX_VALUE)
                                            .addComponent(txtSiSo, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(txtKhoa)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(btnBack)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(132, 132, 132)
                                .addComponent(btnCapNhat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(btnXemDS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNhapMoi)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnXoa)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack)
                    .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnNhapMoi))
                .addGap(18, 18, 18)
                .addComponent(btnXemDS)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLopMouseClicked
        int chonDong = tblLop.getSelectedRow();
        
        if(chonDong>=0){
            String maLop = (String) tblLop.getValueAt(chonDong, 0);
            
            for(Lop lop : list){
                if(maLop.equals(lop.getMaLop())){
                    txtMaLop.setText(maLop);
                    txtTenLop.setText(lop.getTenlop());
                    cbxNganh.setSelectedItem(lop.getNganh());
                    txtKhoa.setText(""+lop.getKhoa());
                    txtSiSo.setText(""+lop.getSoSinhVien());
                }
            }
        }
    }//GEN-LAST:event_tblLopMouseClicked

    private void txtTenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLopActionPerformed

    private void cbxNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNganhActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnXemDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDSActionPerformed
        // TODO add your handling code here:
        int chonCot = tblLop.getSelectedRow();
        
        if(chonCot>=0){
            String maLop = (String) tblLop.getValueAt(chonCot, 0);
            QuanLySinhVienForm frame = new QuanLySinhVienForm(maLop);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnXemDSActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if(txtMaLop.getText().equals("")){
            sb.append("Mã lớp không được để trống \n");
            txtMaLop.setBackground(Color.red);
        }else{
            txtMaLop.setBackground(Color.white);
        }
        if(txtTenLop.getText().equals("")){
            sb.append("Tên lớp không được để trống \n");
            txtTenLop.setBackground(Color.red);
        }else{
            txtTenLop.setBackground(Color.white);
        }
        if(txtKhoa.getText().equals("")){
            sb.append("Khóa không được để trống \n");
            txtKhoa.setBackground(Color.red);
        }else{
            txtKhoa.setBackground(Color.white);
        }
        if(txtSiSo.getText().equals("")){
            sb.append("Sĩ số không được để trống \n");
            txtSiSo.setBackground(Color.red);
        }else{
            txtSiSo.setBackground(Color.white);
        }
        for(Lop lop : list){
            if(txtMaLop.getText().equals(lop.getMaLop())){
                sb.append("Mã lớp đã tồn tại \n");
                txtMaLop.setBackground(Color.red);
            }
        }
        
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Lop lop = new Lop();
        try {
            lop.setMaLop(txtMaLop.getText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        lop.setTenlop(txtTenLop.getText());
        lop.setNganh(cbxNganh.getSelectedItem().toString());
        lop.setKhoa(Integer.parseInt(txtKhoa.getText()));
        lop.setSoSinhVien(Integer.parseInt(txtSiSo.getText()));
        lop.setMaGiaoVien(maGv);
        
        list.add(lop);
        
        file.ghi(list, "dbLop.txt");
        
        fillTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if(txtMaLop.getText().equals("")){
            sb.append("Mã lớp không được để trống \n");
            txtMaLop.setBackground(Color.red);
        }else{
            txtMaLop.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa thông tin không?","Hỏi",JOptionPane.YES_NO_OPTION);
        if(luaChon == JOptionPane.NO_OPTION){
            return;
        }
        for(Lop lop : list){
            if(lop.getMaLop().equals(txtMaLop.getText())){
                list.remove(lop);
                break;
            }
        }
        file.ghi(list, "dbLop.txt");
        
        fillTable();
        
        btnNhapMoiActionPerformed(evt);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if(txtMaLop.getText().equals("")){
            sb.append("Mã lớp không được để trống \n");
            txtMaLop.setBackground(Color.red);
        }else{
            txtMaLop.setBackground(Color.white);
        }
        if(txtTenLop.getText().equals("")){
            sb.append("Tên lớp không được để trống \n");
            txtTenLop.setBackground(Color.red);
        }else{
            txtTenLop.setBackground(Color.white);
        }
        if(txtKhoa.getText().equals("")){
            sb.append("Khóa không được để trống \n");
            txtKhoa.setBackground(Color.red);
        }else{
            txtKhoa.setBackground(Color.white);
        }
        if(txtSiSo.getText().equals("")){
            sb.append("Sĩ số không được để trống \n");
            txtSiSo.setBackground(Color.red);
        }else{
            txtSiSo.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật thông tin không?","Hỏi",JOptionPane.YES_NO_OPTION);
        if(luaChon == JOptionPane.NO_OPTION){
            return;
        }
        for(Lop lop : list){
            if(lop.getMaLop().equals(txtMaLop.getText())){
                lop.setTenlop(txtTenLop.getText());
                lop.setKhoa(Integer.parseInt(txtKhoa.getText()));
                lop.setNganh(cbxNganh.getSelectedItem().toString());
                lop.setSoSinhVien(Integer.parseInt(txtSiSo.getText()));
                break;
            }
        }
        file.ghi(list, "dbLop.txt");
        
        fillTable();
        
        btnNhapMoiActionPerformed(evt);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        // TODO add your handling code here:
        txtMaLop.setText("");
        txtTenLop.setText("");
        txtKhoa.setText("");
        txtSiSo.setText("");
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(QuanLyLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
    
            java.util.logging.Logger.getLogger(QuanLyLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyLopForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemDS;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblLop;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtSiSo;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
