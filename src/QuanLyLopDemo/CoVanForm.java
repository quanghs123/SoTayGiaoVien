/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyLopDemo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class CoVanForm extends javax.swing.JFrame {
    private ArrayList<CoVan> list = new ArrayList<>();
    private ArrayList<Lop> listLop = new ArrayList<>();
    private String maGv;
    private IOFile file;
    private DefaultTableModel tblModel = new DefaultTableModel();
    /**
     * Creates new form CoVanForm
     */
    public CoVanForm(String maGv) {
        initComponents();
        
        this.maGv = maGv;
        
        file = new IOFile();
        listLop = file.doc("dbLop.txt");
        
        initTable();
        fillTable();
    }

    private CoVanForm() {
        
    }

    private void fillTable(){
        tblModel.setRowCount(0);
        
        list = file.doc("dbCoVan.txt");
        
        for(CoVan cv : list){
            if(cv.getMaGv().equals(maGv)){
                tblModel.addRow(new Object[]{cv.getMaCv(),cv.getMaLop(),cv.getNoiDung(),});
            }
        }
        
        
        tblModel.fireTableDataChanged();
    }
    private void initTable(){
        String[] cot = new String[]{"Mã Cố Vấn","Mã Lớp","Nội dung"};
        
        tblModel.setColumnIdentifiers(cot);
        
        tblCv.setModel(tblModel);
    }
    private int check(String maLop){
        int dem = 0;
        for(Lop lop : listLop){
            if(lop.getMaLop().equals(maLop)&&lop.getMaGiaoVien().equals(maGv)){
                dem++;
            }
        }
        if(dem==0){
            return 0;
        }else return 1;
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
        btnBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtNoiDung = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCv = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        btnThêm = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMalop = new javax.swing.JTextField();

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
        jLabel1.setText("Công tác cố vấn");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã cố vấn:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nội dung: ");

        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNoiDung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblCv.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCv);

        btnThêm.setText("Thêm");
        btnThêm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThêmActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mã Lớp: ");

        txtMalop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNhapMoi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMalop, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThêm)
                                .addGap(54, 54, 54)
                                .addComponent(btnXoa)
                                .addGap(41, 41, 41)
                                .addComponent(btnCapNhat)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThêm)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnNhapMoi))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblCvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCvMouseClicked
        // TODO add your handling code here:
        int chonDong = tblCv.getSelectedRow();
        
        if(chonDong>=0){
            String maCv = (String) tblCv.getValueAt(chonDong, 0);
            
            for(CoVan tb : list){
                if(maCv.equals(tb.getMaCv())){
                    txtMa.setText(tb.getMaCv());
                    txtNoiDung.setText(tb.getNoiDung());
                    txtMalop.setText(tb.getMaLop());
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblCvMouseClicked

    private void btnThêmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThêmActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if(txtMa.getText().equals("")){
            sb.append("Mã thông không được để trống \n");
            txtMa.setBackground(Color.red);
        }else{
            txtMa.setBackground(Color.white);
        }
        if(txtMalop.getText().equals("")){
            sb.append("Mã lớp không được để trống \n");
            txtMalop.setBackground(Color.red);
        }else{
            txtMalop.setBackground(Color.white);
        }
        if(txtNoiDung.getText().equals("")){
            sb.append("Nội dung thông không được để trống \n");
            txtNoiDung.setBackground(Color.red);
        }else{
            txtNoiDung.setBackground(Color.white);
        }
        for(CoVan tb : list){
            if(txtMa.getText().equals(tb.getMaCv())){
                sb.append("Mã thông báo đã tồn tại \n");
                txtMa.setBackground(Color.red);
            }
        }
        if(check(txtMalop.getText())==0){
            sb.append("Lớp không thuộc quản lý của bạn \n");
            txtMalop.setBackground(Color.red);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        CoVan tb = new CoVan();
        try {
            tb.setMaCv(txtMa.getText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        tb.setNoiDung(txtNoiDung.getText());
        tb.setMaLop(txtMalop.getText());
        tb.setMaGv(maGv);
        
        list.add(tb);
        
        file.ghi(list, "dbCoVan.txt");
        
        fillTable();
    }//GEN-LAST:event_btnThêmActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        // TODO add your handling code here:
        txtMa.setText("");
        txtNoiDung.setText("");
        txtMalop.setText("");
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         StringBuilder sb = new StringBuilder();
        if(txtMa.getText().equals("")){
            sb.append("Mã thông báo không được để trống \n");
            txtMa.setBackground(Color.red);
        }else{
            txtMa.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa thông tin không?","Hỏi",JOptionPane.YES_NO_OPTION);
        if(luaChon == JOptionPane.NO_OPTION){
            return;
        }
        for(CoVan tb : list){
            if(tb.getMaCv().equals(txtMa.getText())){
                list.remove(tb);
                break;
            }
        }
        file.ghi(list, "dbCoVan.txt");
        
        fillTable();
        
        btnNhapMoiActionPerformed(evt);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
         StringBuilder sb = new StringBuilder();
        if(txtMa.getText().equals("")){
            sb.append("Mã thông báo không được để trống \n");
            txtMa.setBackground(Color.red);
        }else{
            txtMa.setBackground(Color.white);
        }
        if(txtMalop.getText().equals("")){
            sb.append("Mã lớp không được để trống \n");
            txtMalop.setBackground(Color.red);
        }else{
            txtMalop.setBackground(Color.white);
        }
        if(txtNoiDung.getText().equals("")){
            sb.append("Nội dung thông không được để trống \n");
            txtNoiDung.setBackground(Color.red);
        }else{
            txtNoiDung.setBackground(Color.white);
        }
        if(check(txtMalop.getText())==0){
            sb.append("Lớp không thuộc quản lý của bạn \n");
            txtMalop.setBackground(Color.red);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật thông tin không?","Hỏi",JOptionPane.YES_NO_OPTION);
        if(luaChon == JOptionPane.NO_OPTION){
            return;
        }
        for(CoVan tb : list){
            if(tb.getMaCv().equals(txtMa.getText())){
                tb.setNoiDung(txtNoiDung.getText());
                tb.setMaLop(txtMalop.getText());
                break;
            }
        }
        file.ghi(list, "dbCoVan.txt");
        
        fillTable();
        
        btnNhapMoiActionPerformed(evt);
    }//GEN-LAST:event_btnCapNhatActionPerformed

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
            java.util.logging.Logger.getLogger(CoVanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoVanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoVanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoVanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoVanForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnThêm;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCv;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMalop;
    private javax.swing.JTextField txtNoiDung;
    // End of variables declaration//GEN-END:variables
}