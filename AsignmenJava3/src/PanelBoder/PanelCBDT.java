
package PanelBoder;

import Swing.TableCustom;
import database.StudentDao;
import static database.StudentDao.Remove;
import static database.StudentDao.Update;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Students;

/**
 *
 * @author Vinh
 */
public class PanelCBDT extends javax.swing.JPanel {

    DefaultTableModel tblModel = new DefaultTableModel();
    ArrayList<Students> arrlist;
    public PanelCBDT() {
        initComponents();
        initTable();
        setOpaque(false);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        Filltable();
        setVisible(true);
        ImageIcon upload = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\AsignmenJava3\\src\\icon\\icons8-upload-26 (1).png");
        btnUpLoad.setIcon(upload);
    }
   public void showavt(String img) {
    try {
        if (img == null || img.isEmpty()) {
            ImageAVT.setIcon(null);
        } else {
            Image image = ImageIO.read(new File(img));
            Image resizedImage = image.getScaledInstance(193, 164, Image.SCALE_SMOOTH);
            ImageAVT.setIcon(new ImageIcon(resizedImage));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public void initTable() {
        tblModel.setColumnIdentifiers(new String[]{"ID", "Name", "Email", "Số Điện Thoại", "Giới Tính", "Địa Chỉ","Hình"});
        table.setModel(tblModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelDashboash = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        btnNew = new Swing.Button();
        btnSave = new Swing.Button();
        jPanel2 = new javax.swing.JPanel();
        ImageAVT = new javax.swing.JLabel();
        btnUpLoad = new Swing.Button();
        jLabel10 = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        btnDelete = new Swing.Button();
        btnUpdate = new Swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        imgavt = new javax.swing.JLabel();

        PanelDashboash.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Địa Chỉ");

        txtDiaChi.setBackground(new java.awt.Color(240, 239, 239));
        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtID.setBackground(new java.awt.Color(240, 239, 239));
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ID:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Name:");

        txtName.setBackground(new java.awt.Color(240, 239, 239));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Số Điện Thoại");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Email");

        txtEmail.setBackground(new java.awt.Color(240, 239, 239));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtSoDienThoai.setBackground(new java.awt.Color(240, 239, 239));
        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnNew.setBackground(new java.awt.Color(0, 153, 0));
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("New");
        btnNew.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 0));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnUpLoad.setBackground(new java.awt.Color(0, 51, 51));
        btnUpLoad.setForeground(new java.awt.Color(255, 255, 255));
        btnUpLoad.setText("Upload");
        btnUpLoad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpLoadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpLoadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpLoadMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpLoadMouseReleased(evt);
            }
        });
        btnUpLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(ImageAVT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnUpLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageAVT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Sex: ");

        buttonGroup1.add(rdbMale);
        rdbMale.setText("Male");

        buttonGroup1.add(rdbFemale);
        rdbFemale.setText("Female");

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateMouseReleased(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDashboashLayout = new javax.swing.GroupLayout(PanelDashboash);
        PanelDashboash.setLayout(PanelDashboashLayout);
        PanelDashboashLayout.setHorizontalGroup(
            PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboashLayout.createSequentialGroup()
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdbMale)
                        .addGap(18, 18, 18)
                        .addComponent(rdbFemale))
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        PanelDashboashLayout.setVerticalGroup(
            PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboashLayout.createSequentialGroup()
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(19, 19, 19)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(rdbMale)
                            .addComponent(rdbFemale))
                        .addGap(31, 31, 31)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(322, Short.MAX_VALUE))
        );

        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgavt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelDashboash, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgavt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelDashboash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        btnNew.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btnNewMouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
        btnNew.setBackground(new Color(0, 152, 0));
    }//GEN-LAST:event_btnNewMouseExited

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtID.setText(null);
        txtName.setText(null);
        txtEmail.setText(null);
        txtDiaChi.setText(null);
        txtSoDienThoai.setText(null);
         table.setRowSelectionInterval(0, 0);
    }//GEN-LAST:event_btnNewActionPerformed
    public boolean checkmail(String email){
          String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
          if (!Pattern.matches(regex, email)){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ email hợp lệ!");
            return false;}
          else {
              return true;
          }
    }
    public boolean Validate(){
        if(txtID.getText().isEmpty()|| txtName.getText().isEmpty()||txtDiaChi.getText().isEmpty()||txtEmail.getText().isEmpty()||txtSoDienThoai.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tất cả các trường!");
            return false;
        }
        else {
            if(checkmail(txtEmail.getText())){
                return true;
            }
            else {
                return false;
            }
        }
    }
    public void Filltable(){
         tblModel.setRowCount(0);
         arrlist = StudentDao.ViewDatabase();
        for(Students std : arrlist){
            String gt;
            if(std.getGioiTinh() ==1){
                gt = "Nam";
            }
            else {
                gt = "Nữ";
            }
            Object[] rows = new Object[]{std.getMaSV(), std.getHoTen(), std.getEmail(), std.getSoDT(),gt,std.getDiaChi(),std.getHinh()};
            tblModel.addRow(rows);
        }
    }
    public void filForm(int index){
        txtID.setText(arrlist.get(index).getMaSV());
        txtName.setText(arrlist.get(index).getHoTen());
        txtDiaChi.setText(arrlist.get(index).getDiaChi());
        txtEmail.setText(arrlist.get(index).getEmail());
        txtSoDienThoai.setText(arrlist.get(index).getSoDT());
        if(arrlist.get(index).getGioiTinh()==1){
            rdbMale.setSelected(true);
        }
        else {
            rdbFemale.setSelected(true);
        }
        showavt(arrlist.get(index).getHinh());
    }
    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(new Color(0, 152, 0));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed

    }//GEN-LAST:event_btnSaveMousePressed

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased

    }//GEN-LAST:event_btnSaveMouseReleased

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(153, 0, 0));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            String Masv = txtID.getText();
            if (Remove(Masv)) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    Filltable();
        }
            else {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi!!!");
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(0, 152, 0));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMousePressed

    private void btnUpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseReleased

    private void btnUpLoadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpLoadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpLoadMouseEntered

    private void btnUpLoadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpLoadMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpLoadMouseExited

    private void btnUpLoadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpLoadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpLoadMousePressed

    private void btnUpLoadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpLoadMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpLoadMouseReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String gt;
        if(rdbMale.isSelected()){
                gt ="Nam";
            }
        else {
                gt ="Nữ";
            }
        if (Validate()) {
            if(StudentDao.SaveInfo(txtID.getText(), txtName.getText(), txtEmail.getText(), txtSoDienThoai.getText(), gt, txtDiaChi.getText(),btnUpload()))
            {
                 JOptionPane.showMessageDialog(this, "Thêm sinh viên mới thành công!");
            Filltable();
            }
            else {
                JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại!");
            }
           
            
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String gioitinh;
        if(rdbMale.isSelected()){
            gioitinh = "Nam";
        }
        else {
            gioitinh = "Nữ";
        }
        if(Validate()){
            String id = txtID.getText();
        String Hoten = txtName.getText();
        String Email = txtEmail.getText();
        String sdt = txtSoDienThoai.getText();
        String DiaChi = txtDiaChi.getText();
        Update(id,Hoten,Email,sdt,gioitinh,DiaChi);
        Filltable();
        }        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
        filForm(index);
    }//GEN-LAST:event_tableMouseClicked
    public String btnUpload(){
        JFileChooser filechoose = new JFileChooser();
        String file = null;
        filechoose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = filechoose.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedfile = filechoose.getSelectedFile();
            file = selectedfile.getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hình ảnh!");
        }
        return file;
    }
  
    private void btnUpLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpLoadActionPerformed
        int index = table.getSelectedRow();
        if (index == -1) {
           btnUpload();
           return ;
        } else {
            StudentDao.updateIMG(txtID.getText(), btnUpload());
            Filltable();
            return;
        }

    }//GEN-LAST:event_btnUpLoadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageAVT;
    private javax.swing.JPanel PanelDashboash;
    private Swing.Button btnDelete;
    private Swing.Button btnNew;
    private Swing.Button btnSave;
    private Swing.Button btnUpLoad;
    private Swing.Button btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgavt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
